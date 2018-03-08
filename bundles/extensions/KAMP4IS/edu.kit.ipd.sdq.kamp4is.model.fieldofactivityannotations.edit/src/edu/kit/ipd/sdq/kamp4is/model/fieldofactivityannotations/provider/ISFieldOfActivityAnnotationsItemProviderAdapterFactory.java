/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.provider;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.util.ISFieldOfActivityAnnotationsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ISFieldOfActivityAnnotationsItemProviderAdapterFactory extends ISFieldOfActivityAnnotationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISFieldOfActivityAnnotationsRepositoryItemProvider isFieldOfActivityAnnotationsRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISFieldOfActivityAnnotationsRepositoryAdapter() {
		if (isFieldOfActivityAnnotationsRepositoryItemProvider == null) {
			isFieldOfActivityAnnotationsRepositoryItemProvider = new ISFieldOfActivityAnnotationsRepositoryItemProvider(this);
		}

		return isFieldOfActivityAnnotationsRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDevelopmentArtefactSpecificationItemProvider isDevelopmentArtefactSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISDevelopmentArtefactSpecificationAdapter() {
		if (isDevelopmentArtefactSpecificationItemProvider == null) {
			isDevelopmentArtefactSpecificationItemProvider = new ISDevelopmentArtefactSpecificationItemProvider(this);
		}

		return isDevelopmentArtefactSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISSourceFileItemProvider isSourceFileItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISSourceFileAdapter() {
		if (isSourceFileItemProvider == null) {
			isSourceFileItemProvider = new ISSourceFileItemProvider(this);
		}

		return isSourceFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISSourceFileAggregationItemProvider isSourceFileAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISSourceFileAggregationAdapter() {
		if (isSourceFileAggregationItemProvider == null) {
			isSourceFileAggregationItemProvider = new ISSourceFileAggregationItemProvider(this);
		}

		return isSourceFileAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISMetadataFileItemProvider isMetadataFileItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISMetadataFileAdapter() {
		if (isMetadataFileItemProvider == null) {
			isMetadataFileItemProvider = new ISMetadataFileItemProvider(this);
		}

		return isMetadataFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISMetadataFileAggregationItemProvider isMetadataFileAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISMetadataFileAggregationAdapter() {
		if (isMetadataFileAggregationItemProvider == null) {
			isMetadataFileAggregationItemProvider = new ISMetadataFileAggregationItemProvider(this);
		}

		return isMetadataFileAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISBuildSpecificationItemProvider isBuildSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISBuildSpecificationAdapter() {
		if (isBuildSpecificationItemProvider == null) {
			isBuildSpecificationItemProvider = new ISBuildSpecificationItemProvider(this);
		}

		return isBuildSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISBuildConfigurationItemProvider isBuildConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISBuildConfigurationAdapter() {
		if (isBuildConfigurationItemProvider == null) {
			isBuildConfigurationItemProvider = new ISBuildConfigurationItemProvider(this);
		}

		return isBuildConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISThirdPartyComponentOrLibraryItemProvider isThirdPartyComponentOrLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISThirdPartyComponentOrLibraryAdapter() {
		if (isThirdPartyComponentOrLibraryItemProvider == null) {
			isThirdPartyComponentOrLibraryItemProvider = new ISThirdPartyComponentOrLibraryItemProvider(this);
		}

		return isThirdPartyComponentOrLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTestSpecificationItemProvider isTestSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISTestSpecificationAdapter() {
		if (isTestSpecificationItemProvider == null) {
			isTestSpecificationItemProvider = new ISTestSpecificationItemProvider(this);
		}

		return isTestSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISReleaseSpecificationItemProvider isReleaseSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISReleaseSpecificationAdapter() {
		if (isReleaseSpecificationItemProvider == null) {
			isReleaseSpecificationItemProvider = new ISReleaseSpecificationItemProvider(this);
		}

		return isReleaseSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISReleaseConfigurationItemProvider isReleaseConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISReleaseConfigurationAdapter() {
		if (isReleaseConfigurationItemProvider == null) {
			isReleaseConfigurationItemProvider = new ISReleaseConfigurationItemProvider(this);
		}

		return isReleaseConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDeploymentSpecificationItemProvider isDeploymentSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISDeploymentSpecificationAdapter() {
		if (isDeploymentSpecificationItemProvider == null) {
			isDeploymentSpecificationItemProvider = new ISDeploymentSpecificationItemProvider(this);
		}

		return isDeploymentSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISRuntimeInstanceItemProvider isRuntimeInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISRuntimeInstanceAdapter() {
		if (isRuntimeInstanceItemProvider == null) {
			isRuntimeInstanceItemProvider = new ISRuntimeInstanceItemProvider(this);
		}

		return isRuntimeInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISRuntimeInstanceAggregationItemProvider isRuntimeInstanceAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISRuntimeInstanceAggregationAdapter() {
		if (isRuntimeInstanceAggregationItemProvider == null) {
			isRuntimeInstanceAggregationItemProvider = new ISRuntimeInstanceAggregationItemProvider(this);
		}

		return isRuntimeInstanceAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISUnitTestCaseItemProvider isUnitTestCaseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISUnitTestCaseAdapter() {
		if (isUnitTestCaseItemProvider == null) {
			isUnitTestCaseItemProvider = new ISUnitTestCaseItemProvider(this);
		}

		return isUnitTestCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISAcceptanceTestCaseItemProvider isAcceptanceTestCaseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISAcceptanceTestCaseAdapter() {
		if (isAcceptanceTestCaseItemProvider == null) {
			isAcceptanceTestCaseItemProvider = new ISAcceptanceTestCaseItemProvider(this);
		}

		return isAcceptanceTestCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISIntegrationTestCaseItemProvider isIntegrationTestCaseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISIntegrationTestCaseAdapter() {
		if (isIntegrationTestCaseItemProvider == null) {
			isIntegrationTestCaseItemProvider = new ISIntegrationTestCaseItemProvider(this);
		}

		return isIntegrationTestCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISUnitTestCaseAggregationItemProvider isUnitTestCaseAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISUnitTestCaseAggregationAdapter() {
		if (isUnitTestCaseAggregationItemProvider == null) {
			isUnitTestCaseAggregationItemProvider = new ISUnitTestCaseAggregationItemProvider(this);
		}

		return isUnitTestCaseAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISAcceptanceTestCaseAggregationItemProvider isAcceptanceTestCaseAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISAcceptanceTestCaseAggregationAdapter() {
		if (isAcceptanceTestCaseAggregationItemProvider == null) {
			isAcceptanceTestCaseAggregationItemProvider = new ISAcceptanceTestCaseAggregationItemProvider(this);
		}

		return isAcceptanceTestCaseAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISIntegrationTestCaseAggregationItemProvider isIntegrationTestCaseAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISIntegrationTestCaseAggregationAdapter() {
		if (isIntegrationTestCaseAggregationItemProvider == null) {
			isIntegrationTestCaseAggregationItemProvider = new ISIntegrationTestCaseAggregationItemProvider(this);
		}

		return isIntegrationTestCaseAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISStaffSpecificationItemProvider isStaffSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISStaffSpecificationAdapter() {
		if (isStaffSpecificationItemProvider == null) {
			isStaffSpecificationItemProvider = new ISStaffSpecificationItemProvider(this);
		}

		return isStaffSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISPersonListItemProvider isPersonListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISPersonListAdapter() {
		if (isPersonListItemProvider == null) {
			isPersonListItemProvider = new ISPersonListItemProvider(this);
		}

		return isPersonListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISPersonItemProvider isPersonItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISPersonAdapter() {
		if (isPersonItemProvider == null) {
			isPersonItemProvider = new ISPersonItemProvider(this);
		}

		return isPersonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISRoleListItemProvider isRoleListItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISRoleListAdapter() {
		if (isRoleListItemProvider == null) {
			isRoleListItemProvider = new ISRoleListItemProvider(this);
		}

		return isRoleListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDeveloperItemProvider isDeveloperItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISDeveloperAdapter() {
		if (isDeveloperItemProvider == null) {
			isDeveloperItemProvider = new ISDeveloperItemProvider(this);
		}

		return isDeveloperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISBuildConfiguratorItemProvider isBuildConfiguratorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfigurator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISBuildConfiguratorAdapter() {
		if (isBuildConfiguratorItemProvider == null) {
			isBuildConfiguratorItemProvider = new ISBuildConfiguratorItemProvider(this);
		}

		return isBuildConfiguratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTestDeveloperItemProvider isTestDeveloperItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestDeveloper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISTestDeveloperAdapter() {
		if (isTestDeveloperItemProvider == null) {
			isTestDeveloperItemProvider = new ISTestDeveloperItemProvider(this);
		}

		return isTestDeveloperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTesterItemProvider isTesterItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISTesterAdapter() {
		if (isTesterItemProvider == null) {
			isTesterItemProvider = new ISTesterItemProvider(this);
		}

		return isTesterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISReleaseConfiguratorItemProvider isReleaseConfiguratorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfigurator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISReleaseConfiguratorAdapter() {
		if (isReleaseConfiguratorItemProvider == null) {
			isReleaseConfiguratorItemProvider = new ISReleaseConfiguratorItemProvider(this);
		}

		return isReleaseConfiguratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDeployerItemProvider isDeployerItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISDeployerAdapter() {
		if (isDeployerItemProvider == null) {
			isDeployerItemProvider = new ISDeployerItemProvider(this);
		}

		return isDeployerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDesignPatternSpecificationItemProvider isDesignPatternSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISDesignPatternSpecificationAdapter() {
		if (isDesignPatternSpecificationItemProvider == null) {
			isDesignPatternSpecificationItemProvider = new ISDesignPatternSpecificationItemProvider(this);
		}

		return isDesignPatternSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDesignPatternRoleItemProvider isDesignPatternRoleItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISDesignPatternRoleAdapter() {
		if (isDesignPatternRoleItemProvider == null) {
			isDesignPatternRoleItemProvider = new ISDesignPatternRoleItemProvider(this);
		}

		return isDesignPatternRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTechnologySpecificationItemProvider isTechnologySpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISTechnologySpecificationAdapter() {
		if (isTechnologySpecificationItemProvider == null) {
			isTechnologySpecificationItemProvider = new ISTechnologySpecificationItemProvider(this);
		}

		return isTechnologySpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTechnologicalCorrespondenceItemProvider isTechnologicalCorrespondenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISTechnologicalCorrespondenceAdapter() {
		if (isTechnologicalCorrespondenceItemProvider == null) {
			isTechnologicalCorrespondenceItemProvider = new ISTechnologicalCorrespondenceItemProvider(this);
		}

		return isTechnologicalCorrespondenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (isFieldOfActivityAnnotationsRepositoryItemProvider != null) isFieldOfActivityAnnotationsRepositoryItemProvider.dispose();
		if (isDevelopmentArtefactSpecificationItemProvider != null) isDevelopmentArtefactSpecificationItemProvider.dispose();
		if (isSourceFileItemProvider != null) isSourceFileItemProvider.dispose();
		if (isSourceFileAggregationItemProvider != null) isSourceFileAggregationItemProvider.dispose();
		if (isMetadataFileItemProvider != null) isMetadataFileItemProvider.dispose();
		if (isMetadataFileAggregationItemProvider != null) isMetadataFileAggregationItemProvider.dispose();
		if (isBuildSpecificationItemProvider != null) isBuildSpecificationItemProvider.dispose();
		if (isBuildConfigurationItemProvider != null) isBuildConfigurationItemProvider.dispose();
		if (isThirdPartyComponentOrLibraryItemProvider != null) isThirdPartyComponentOrLibraryItemProvider.dispose();
		if (isTestSpecificationItemProvider != null) isTestSpecificationItemProvider.dispose();
		if (isReleaseSpecificationItemProvider != null) isReleaseSpecificationItemProvider.dispose();
		if (isReleaseConfigurationItemProvider != null) isReleaseConfigurationItemProvider.dispose();
		if (isDeploymentSpecificationItemProvider != null) isDeploymentSpecificationItemProvider.dispose();
		if (isRuntimeInstanceItemProvider != null) isRuntimeInstanceItemProvider.dispose();
		if (isRuntimeInstanceAggregationItemProvider != null) isRuntimeInstanceAggregationItemProvider.dispose();
		if (isUnitTestCaseItemProvider != null) isUnitTestCaseItemProvider.dispose();
		if (isAcceptanceTestCaseItemProvider != null) isAcceptanceTestCaseItemProvider.dispose();
		if (isIntegrationTestCaseItemProvider != null) isIntegrationTestCaseItemProvider.dispose();
		if (isUnitTestCaseAggregationItemProvider != null) isUnitTestCaseAggregationItemProvider.dispose();
		if (isAcceptanceTestCaseAggregationItemProvider != null) isAcceptanceTestCaseAggregationItemProvider.dispose();
		if (isIntegrationTestCaseAggregationItemProvider != null) isIntegrationTestCaseAggregationItemProvider.dispose();
		if (isStaffSpecificationItemProvider != null) isStaffSpecificationItemProvider.dispose();
		if (isPersonListItemProvider != null) isPersonListItemProvider.dispose();
		if (isPersonItemProvider != null) isPersonItemProvider.dispose();
		if (isRoleListItemProvider != null) isRoleListItemProvider.dispose();
		if (isDeveloperItemProvider != null) isDeveloperItemProvider.dispose();
		if (isBuildConfiguratorItemProvider != null) isBuildConfiguratorItemProvider.dispose();
		if (isTestDeveloperItemProvider != null) isTestDeveloperItemProvider.dispose();
		if (isTesterItemProvider != null) isTesterItemProvider.dispose();
		if (isReleaseConfiguratorItemProvider != null) isReleaseConfiguratorItemProvider.dispose();
		if (isDeployerItemProvider != null) isDeployerItemProvider.dispose();
		if (isDesignPatternSpecificationItemProvider != null) isDesignPatternSpecificationItemProvider.dispose();
		if (isDesignPatternRoleItemProvider != null) isDesignPatternRoleItemProvider.dispose();
		if (isTechnologySpecificationItemProvider != null) isTechnologySpecificationItemProvider.dispose();
		if (isTechnologicalCorrespondenceItemProvider != null) isTechnologicalCorrespondenceItemProvider.dispose();
	}

}
