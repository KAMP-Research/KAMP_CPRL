/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.Constraint;
import de.uka.ipd.sdq.dsexplore.qml.contract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.DeterministicEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.EnumLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.EnumOperator;
import de.uka.ipd.sdq.dsexplore.qml.contract.EnumRangeValueType;
import de.uka.ipd.sdq.dsexplore.qml.contract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.Goal;
import de.uka.ipd.sdq.dsexplore.qml.contract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contract.NumericLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.Objective;
import de.uka.ipd.sdq.dsexplore.qml.contract.Percentile;
import de.uka.ipd.sdq.dsexplore.qml.contract.PointEstimator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractFactory;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.RefinedQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.Restriction;
import de.uka.ipd.sdq.dsexplore.qml.contract.ScaleLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.SimpleQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.StochasticEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contract.ValueLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.Variance;

import de.uka.ipd.sdq.dsexplore.qml.contract.util.QMLContractValidator;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsPackage;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QMLContractPackageImpl extends EPackageImpl implements QMLContractPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleQMLContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEstimatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticEvaluationAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedQMLContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicEvaluationAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericQMLContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRangeValueTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QMLContractPackageImpl() {
		super(eNS_URI, QMLContractFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QMLContractPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QMLContractPackage init() {
		if (isInited) return (QMLContractPackage)EPackage.Registry.INSTANCE.getEPackage(QMLContractPackage.eNS_URI);

		// Obtain or create and register package
		QMLContractPackageImpl theQMLContractPackage = (QMLContractPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QMLContractPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QMLContractPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QMLContractTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQMLContractPackage.createPackageContents();

		// Initialize created meta-data
		theQMLContractPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQMLContractPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return QMLContractValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQMLContractPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QMLContractPackage.eNS_URI, theQMLContractPackage);
		return theQMLContractPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleQMLContract() {
		return simpleQMLContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleQMLContract_Criteria() {
		return (EReference)simpleQMLContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleQMLContract_ContractType() {
		return (EReference)simpleQMLContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterion() {
		return criterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterion_Dimension() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterion_Aspects() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationAspect() {
		return evaluationAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationAspect_AspectRequirement() {
		return (EReference)evaluationAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectRequirement() {
		return aspectRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectRequirement_AspectRequirementLiteral() {
		return (EReference)aspectRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueLiteral() {
		return valueLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentile() {
		return percentileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentile_Percentile() {
		return (EAttribute)percentileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointEstimator() {
		return pointEstimatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticEvaluationAspect() {
		return stochasticEvaluationAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequency() {
		return frequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequency_UpperLimit() {
		return (EReference)frequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequency_LowerLimit() {
		return (EReference)frequencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeValue() {
		return rangeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeValue_RangeLimitLiteral() {
		return (EReference)rangeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeValue_Type() {
		return (EAttribute)rangeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMean() {
		return meanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariance() {
		return varianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericLiteral() {
		return numericLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericLiteral_Value() {
		return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteral_Value() {
		return (EReference)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetLiteral() {
		return setLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetLiteral_Values() {
		return (EReference)setLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedQMLContract() {
		return refinedQMLContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedQMLContract_RefinedBy() {
		return (EReference)refinedQMLContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedQMLContract_BaseContract() {
		return (EReference)refinedQMLContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministicEvaluationAspect() {
		return deterministicEvaluationAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestriction_Operator() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericQMLContract() {
		return genericQMLContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleLiteral() {
		return scaleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleLiteral_Value() {
		return (EAttribute)scaleLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumOperator() {
		return enumOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumRangeValueType() {
		return enumRangeValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractFactory getQMLContractFactory() {
		return (QMLContractFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simpleQMLContractEClass = createEClass(SIMPLE_QML_CONTRACT);
		createEReference(simpleQMLContractEClass, SIMPLE_QML_CONTRACT__CRITERIA);
		createEReference(simpleQMLContractEClass, SIMPLE_QML_CONTRACT__CONTRACT_TYPE);

		criterionEClass = createEClass(CRITERION);
		createEReference(criterionEClass, CRITERION__DIMENSION);
		createEReference(criterionEClass, CRITERION__ASPECTS);

		evaluationAspectEClass = createEClass(EVALUATION_ASPECT);
		createEReference(evaluationAspectEClass, EVALUATION_ASPECT__ASPECT_REQUIREMENT);

		aspectRequirementEClass = createEClass(ASPECT_REQUIREMENT);
		createEReference(aspectRequirementEClass, ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL);

		valueLiteralEClass = createEClass(VALUE_LITERAL);

		percentileEClass = createEClass(PERCENTILE);
		createEAttribute(percentileEClass, PERCENTILE__PERCENTILE);

		pointEstimatorEClass = createEClass(POINT_ESTIMATOR);

		stochasticEvaluationAspectEClass = createEClass(STOCHASTIC_EVALUATION_ASPECT);

		frequencyEClass = createEClass(FREQUENCY);
		createEReference(frequencyEClass, FREQUENCY__UPPER_LIMIT);
		createEReference(frequencyEClass, FREQUENCY__LOWER_LIMIT);

		rangeValueEClass = createEClass(RANGE_VALUE);
		createEReference(rangeValueEClass, RANGE_VALUE__RANGE_LIMIT_LITERAL);
		createEAttribute(rangeValueEClass, RANGE_VALUE__TYPE);

		meanEClass = createEClass(MEAN);

		varianceEClass = createEClass(VARIANCE);

		numericLiteralEClass = createEClass(NUMERIC_LITERAL);
		createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__VALUE);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEReference(enumLiteralEClass, ENUM_LITERAL__VALUE);

		setLiteralEClass = createEClass(SET_LITERAL);
		createEReference(setLiteralEClass, SET_LITERAL__VALUES);

		refinedQMLContractEClass = createEClass(REFINED_QML_CONTRACT);
		createEReference(refinedQMLContractEClass, REFINED_QML_CONTRACT__REFINED_BY);
		createEReference(refinedQMLContractEClass, REFINED_QML_CONTRACT__BASE_CONTRACT);

		valueEClass = createEClass(VALUE);

		deterministicEvaluationAspectEClass = createEClass(DETERMINISTIC_EVALUATION_ASPECT);

		objectiveEClass = createEClass(OBJECTIVE);

		constraintEClass = createEClass(CONSTRAINT);

		restrictionEClass = createEClass(RESTRICTION);
		createEAttribute(restrictionEClass, RESTRICTION__OPERATOR);

		goalEClass = createEClass(GOAL);

		genericQMLContractEClass = createEClass(GENERIC_QML_CONTRACT);

		scaleLiteralEClass = createEClass(SCALE_LITERAL);
		createEAttribute(scaleLiteralEClass, SCALE_LITERAL__VALUE);

		// Create enums
		enumOperatorEEnum = createEEnum(ENUM_OPERATOR);
		enumRangeValueTypeEEnum = createEEnum(ENUM_RANGE_VALUE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QMLContractTypePackage theQMLContractTypePackage = (QMLContractTypePackage)EPackage.Registry.INSTANCE.getEPackage(QMLContractTypePackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		DimensionsPackage theDimensionsPackage = (DimensionsPackage)EPackage.Registry.INSTANCE.getEPackage(DimensionsPackage.eNS_URI);
		DimensiontypesPackage theDimensiontypesPackage = (DimensiontypesPackage)EPackage.Registry.INSTANCE.getEPackage(DimensiontypesPackage.eNS_URI);
		QMLDeclarationsPackage theQMLDeclarationsPackage = (QMLDeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(QMLDeclarationsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter scaleLiteralEClass_T = addETypeParameter(scaleLiteralEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theDimensiontypesPackage.getENumber());
		scaleLiteralEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		simpleQMLContractEClass.getESuperTypes().add(this.getGenericQMLContract());
		criterionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		evaluationAspectEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		aspectRequirementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		valueLiteralEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		percentileEClass.getESuperTypes().add(this.getPointEstimator());
		pointEstimatorEClass.getESuperTypes().add(this.getStochasticEvaluationAspect());
		stochasticEvaluationAspectEClass.getESuperTypes().add(this.getEvaluationAspect());
		frequencyEClass.getESuperTypes().add(this.getStochasticEvaluationAspect());
		rangeValueEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		meanEClass.getESuperTypes().add(this.getPointEstimator());
		varianceEClass.getESuperTypes().add(this.getPointEstimator());
		numericLiteralEClass.getESuperTypes().add(this.getValueLiteral());
		enumLiteralEClass.getESuperTypes().add(this.getValueLiteral());
		setLiteralEClass.getESuperTypes().add(this.getValueLiteral());
		refinedQMLContractEClass.getESuperTypes().add(this.getGenericQMLContract());
		valueEClass.getESuperTypes().add(this.getDeterministicEvaluationAspect());
		deterministicEvaluationAspectEClass.getESuperTypes().add(this.getEvaluationAspect());
		objectiveEClass.getESuperTypes().add(this.getCriterion());
		constraintEClass.getESuperTypes().add(this.getCriterion());
		restrictionEClass.getESuperTypes().add(this.getAspectRequirement());
		goalEClass.getESuperTypes().add(this.getAspectRequirement());
		genericQMLContractEClass.getESuperTypes().add(theQMLDeclarationsPackage.getQMLDeclaration());
		scaleLiteralEClass.getESuperTypes().add(this.getValueLiteral());
		scaleLiteralEClass.getESuperTypes().add(ecorePackage.getENamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(simpleQMLContractEClass, SimpleQMLContract.class, "SimpleQMLContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleQMLContract_Criteria(), this.getCriterion(), null, "criteria", null, 0, -1, SimpleQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimpleQMLContract_ContractType(), theQMLContractTypePackage.getQMLContractType(), null, "contractType", null, 1, 1, SimpleQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(simpleQMLContractEClass, ecorePackage.getEBoolean(), "all_DIMENSIONs_must_be_from_same_CONTRACTTYPE", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(criterionEClass, Criterion.class, "Criterion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterion_Dimension(), theDimensionsPackage.getDimension(), null, "dimension", null, 1, 1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCriterion_Aspects(), this.getEvaluationAspect(), null, "aspects", null, 1, -1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(criterionEClass, ecorePackage.getEBoolean(), "Only_CONSTRAINTS_have_RESTRICTIONS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(criterionEClass, ecorePackage.getEBoolean(), "FREQUENCY_only_possible_if_DIMENSION_is_ordered", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(criterionEClass, ecorePackage.getEBoolean(), "POINTESTIMATOR_only_for_numeric_dimensions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(criterionEClass, ecorePackage.getEBoolean(), "Only_OBJECTIVES_have_GOALS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(evaluationAspectEClass, EvaluationAspect.class, "EvaluationAspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationAspect_AspectRequirement(), this.getAspectRequirement(), null, "aspectRequirement", null, 0, 1, EvaluationAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(evaluationAspectEClass, ecorePackage.getEBoolean(), "FREQUENCY_LIMIT_must_be_NUMERIC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(evaluationAspectEClass, ecorePackage.getEBoolean(), "FREQUENCY_LIMIT_must_be_between_0_and_100", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aspectRequirementEClass, AspectRequirement.class, "AspectRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspectRequirement_AspectRequirementLiteral(), this.getValueLiteral(), null, "aspectRequirementLiteral", null, 1, 1, AspectRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueLiteralEClass, ValueLiteral.class, "ValueLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(percentileEClass, Percentile.class, "Percentile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentile_Percentile(), ecorePackage.getEDouble(), "percentile", null, 1, 1, Percentile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(percentileEClass, ecorePackage.getEBoolean(), "PERCENTILE_between_0_and_100", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pointEstimatorEClass, PointEstimator.class, "PointEstimator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stochasticEvaluationAspectEClass, StochasticEvaluationAspect.class, "StochasticEvaluationAspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frequencyEClass, Frequency.class, "Frequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrequency_UpperLimit(), this.getRangeValue(), null, "upperLimit", null, 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFrequency_LowerLimit(), this.getRangeValue(), null, "lowerLimit", null, 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(frequencyEClass, ecorePackage.getEBoolean(), "range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rangeValueEClass, RangeValue.class, "RangeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeValue_RangeLimitLiteral(), this.getValueLiteral(), null, "rangeLimitLiteral", null, 1, 1, RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRangeValue_Type(), this.getEnumRangeValueType(), "type", null, 1, 1, RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(meanEClass, Mean.class, "Mean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varianceEClass, Variance.class, "Variance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericLiteral_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteral_Value(), theDimensiontypesPackage.getElement(), null, "value", null, 1, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetLiteral_Values(), theDimensiontypesPackage.getElement(), null, "values", null, 1, -1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(refinedQMLContractEClass, RefinedQMLContract.class, "RefinedQMLContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinedQMLContract_RefinedBy(), this.getCriterion(), null, "refinedBy", null, 0, -1, RefinedQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRefinedQMLContract_BaseContract(), this.getGenericQMLContract(), null, "baseContract", null, 1, 1, RefinedQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(refinedQMLContractEClass, ecorePackage.getEBoolean(), "contract_cannot_refine_itself", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deterministicEvaluationAspectEClass, DeterministicEvaluationAspect.class, "DeterministicEvaluationAspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(constraintEClass, ecorePackage.getEBoolean(), "All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestriction_Operator(), this.getEnumOperator(), "operator", null, 1, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericQMLContractEClass, GenericQMLContract.class, "GenericQMLContract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scaleLiteralEClass, ScaleLiteral.class, "ScaleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(scaleLiteralEClass_T);
		initEAttribute(getScaleLiteral_Value(), g1, "value", null, 1, 1, ScaleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumOperatorEEnum, EnumOperator.class, "EnumOperator");
		addEEnumLiteral(enumOperatorEEnum, EnumOperator.LESS);
		addEEnumLiteral(enumOperatorEEnum, EnumOperator.GREATER);
		addEEnumLiteral(enumOperatorEEnum, EnumOperator.EQUAL);
		addEEnumLiteral(enumOperatorEEnum, EnumOperator.LESS_OR_EQUAL);
		addEEnumLiteral(enumOperatorEEnum, EnumOperator.GREATER_OR_EQUAL);

		initEEnum(enumRangeValueTypeEEnum, EnumRangeValueType.class, "EnumRangeValueType");
		addEEnumLiteral(enumRangeValueTypeEEnum, EnumRangeValueType.INCLUSIVE);
		addEEnumLiteral(enumRangeValueTypeEEnum, EnumRangeValueType.EXCLUSIVE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (simpleQMLContractEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "(self.contractType<> null) implies (\r\n\tself.criteria->forAll(c|\r\n\t\tself.contractType.dimensions->exists(dim|c.dimension=dim)\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (criterionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.aspects->exists(a|a.aspectRequirement <> null and a.aspectRequirement.oclIsTypeOf(QMLContract::Restriction)) implies (\r\n\tself.oclIsTypeOf(QMLContract::Constraint)\r\n)"
		   });	
		addAnnotation
		  (criterionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.aspects->forAll(aspect|\r\n\taspect.oclIsTypeOf(QMLContract::Frequency) implies (\r\n\t\tself.dimension.type.oclIsTypeOf(dimensiontypes::DimensionTypeNumeric) or\r\n\t\t(self.dimension.type.oclIsTypeOf(dimensiontypes::DimensionTypeEnum) and self.dimension.type.oclAsType(dimensiontypes::DimensionTypeEnum).order->size()>0 ) or \r\n\t\t(self.dimension.type.oclIsTypeOf(dimensiontypes::DimensionTypeSet) and self.dimension.type.oclAsType(dimensiontypes::DimensionTypeSet).order->size()>0 )\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (criterionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.aspects->forAll(aspect|\r\n\taspect.oclIsTypeOf(QMLContract::PointEstimator) implies (\r\n\t\tself.dimension.type.oclIsTypeOf(dimensiontypes::DimensionTypeNumeric)\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (criterionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.aspects->exists(a|a.aspectRequirement <> null and a.aspectRequirement.oclIsTypeOf(QMLContract::Goal)) implies (\r\n\tself.oclIsTypeOf(QMLContract::Objective)\r\n)"
		   });	
		addAnnotation
		  (evaluationAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.oclIsTypeOf(QMLContract::Frequency) implies (\r\n\tself.aspectRequirement <> null implies (\r\n\t\tself.aspectRequirement.aspectRequirementLiteral.oclIsTypeOf(QMLContract::NumericLiteral)\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (evaluationAspectEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.oclIsTypeOf(QMLContract::Frequency) implies (\r\n\tself.aspectRequirement <> null implies (\r\n\t\tself.aspectRequirement.aspectRequirementLiteral.oclIsTypeOf(QMLContract::NumericLiteral) implies (\r\n\t\t\tself.aspectRequirement.aspectRequirementLiteral.oclAsType(QMLContract::NumericLiteral).value.oclAsType(Real) > 0 and\r\n\t\t\tself.aspectRequirement.aspectRequirementLiteral.oclAsType(QMLContract::NumericLiteral).value.oclAsType(Real) < 100\r\n\t\t)\r\n\t)\r\n)"
		   });	
		addAnnotation
		  (percentileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.percentile.oclAsType(Real) > 0.0 and self.percentile.oclAsType(Real) < 100.0"
		   });	
		addAnnotation
		  (frequencyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "(self.lowerLimit <> null) or (self.upperLimit <> null)"
		   });	
		addAnnotation
		  (refinedQMLContractEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.baseContract <> self"
		   });	
		addAnnotation
		  (constraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.aspects->forAll(a|a.aspectRequirement<>null and a.aspectRequirement.oclIsTypeOf(QMLContract::Restriction))"
		   });
	}

} //QMLContractPackageImpl
