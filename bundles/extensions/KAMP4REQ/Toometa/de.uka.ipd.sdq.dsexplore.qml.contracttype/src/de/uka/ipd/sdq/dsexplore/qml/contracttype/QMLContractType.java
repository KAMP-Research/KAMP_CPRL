/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclaration;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QML Contract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A contract type represents&nbsp;a
 * QoS&nbsp;category.&nbsp;It&nbsp;defines&nbsp;the&nbsp;dimensions&nbsp;that&nbsp;can&nbsp;be&nbsp;used&nbsp;to&nbsp;characterize&nbsp;a<br />
 * particular&nbsp;QoS&nbsp;aspect.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage#getQMLContractType()
 * @model
 * @generated
 */
public interface QMLContractType extends QMLDeclaration {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage#getQMLContractType_Dimensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dimension> getDimensions();

} // QMLContractType
