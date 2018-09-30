package edu.kit.ipd.sdq.kamp4is.core;

import static edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup.lookUpMarkedObjectsOfAType;

import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.subsystem.SubSystem;

import thesis.KampXtendTest;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry;
import edu.kit.ipd.sdq.kamp.ruledsl.support.DefaultConfiguration;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IConfiguration;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRuleProvider;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageFacade;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageFacade.KampLanguageService;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;

/**
 * The change propagation analysis of KAMP
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * 
 * @author stammel
 *
 */
public class ISChangePropagationAnalysis extends AbstractISChangePropagationAnalysis<ISArchitectureVersion, ISChangePropagationDueToDataDependencies> {
	
	private IProject project;
	
	/**
	 * Creates a new instance of ISChangePropagationAnalysis which is aware of the location it is run.
	 * @param project the project in which the change propagation analysis is run
	 */
	public ISChangePropagationAnalysis(IProject project) {
		super();
		this.project = project;
	}
	
	@Override
	public void runChangePropagationAnalysis(ISArchitectureVersion version) {
		System.err.println("TEST:");
		for(CompositeComponent obj : lookUpMarkedObjectsOfAType(version, CompositeComponent.class)) {
			KampXtendTest.evaluateRule(Stream.of(new CausingEntityMapping<CompositeComponent, EObject>(obj)), version.getECrossReferenceAdapter()).forEach(c -> {
				System.err.println(((RepositoryComponent) c.getAffectedElement()).getEntityName());
				for(EObject causingEntity : c.getCausingEntities()) {
					System.err.println("-" + ((AssemblyContext) causingEntity).getEntityName());
				}
			});
		}
		
		// TODO: check if this setup is appropriate!
		this.setChangePropagationDueToDataDependencies(ISModificationmarksFactory.eINSTANCE.createISChangePropagationDueToDataDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps().add(this.getChangePropagationDueToDataDependencies());
		
		// this is the standard behavior if no custom rules are registered
		boolean runPreconfiguredRules = true;
		
		try(KampLanguageService<IRuleProvider> languageService = KampRuleLanguageFacade.getInstance(this.project.getName(), IRuleProvider.class)) {
			IRuleProvider provider = languageService.getService();
			IConfiguration config = provider.getConfiguration();
			if(config == null) {
				config = new DefaultConfiguration();
			}
			
			// read configuration
			runPreconfiguredRules = config.areKampStandardRulesEnabled();
			
			// specify the ChangePropagationSteps which will be passed to the ruledsl engine
			ChangePropagationStepRegistry registry = KampRuleLanguageFacade.createChangePropagationStepRegistry();
			
			version.getModificationMarkRepository().getChangePropagationSteps().stream().forEach(s -> registry.register(s));
			
			if(config.isKampDslEnabled()) {
				provider.applyAllRules(version, registry);
			}
		} catch (Exception e) {
			// should be only thrown if service is not available or bundle could not be installed
			e.printStackTrace();
		};

		if(runPreconfiguredRules) {
			// I. DataType -> Signature -> Interface 		
			calculateAndMarkToInterfacePropagation(version);
			
			// FIXME: is this a workaround?
			if (!this.getChangePropagationDueToDataDependencies().eContents().isEmpty()) {	
				version.getModificationMarkRepository().getChangePropagationSteps().add(this.getChangePropagationDueToDataDependencies());	
			}
			
			//All other steps
			this.calculateInterfaceAndComponentPropagation(version);
		}	
	}

}
