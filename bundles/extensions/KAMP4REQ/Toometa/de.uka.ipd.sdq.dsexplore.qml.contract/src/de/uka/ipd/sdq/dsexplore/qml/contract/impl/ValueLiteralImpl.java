/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.ValueLiteral;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ValueLiteralImpl extends IdentifierImpl implements ValueLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.VALUE_LITERAL;
	}

} //ValueLiteralImpl
