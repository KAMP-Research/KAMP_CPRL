/**
 */
package de.uka.ipd.sdq.componentInternalDependencies.provider;


import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.Entity;


/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleToRoleDependencyItemProvider
extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleToRoleDependencyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addProvidedRolePropertyDescriptor(object);
			addRequiredRolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Provided Role feature.
	 * <!-- begin-user-doc -->
 	* <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoleToRoleDependency_providedRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoleToRoleDependency_providedRole_feature", "_UI_RoleToRoleDependency_type"),
				 ComponentInternalDependenciesPackage.Literals.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoleToRoleDependency_requiredRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoleToRoleDependency_requiredRole_feature", "_UI_RoleToRoleDependency_type"),
				 ComponentInternalDependenciesPackage.Literals.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ComponentInternalDependenciesPackage.Literals.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
 	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RoleToRoleDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleToRoleDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
	// --Start manually modified code
	RoleToRoleDependency dependency = (RoleToRoleDependency)object;
	String providedRoleName = "", requiredRoleName = "", label = "";
	Entity providingEntity = null, requiringEntity = null;
	if (dependency.getProvidedRole() != null) {
		providedRoleName = dependency.getProvidedRole().getEntityName();
		providingEntity = dependency.getProvidedRole().getProvidingEntity_ProvidedRole();
	}
	if (dependency.getRequiredRole() != null) {
		requiredRoleName = dependency.getRequiredRole().getEntityName();
		requiringEntity = dependency.getRequiredRole().getRequiringEntity_RequiredRole();
	}
	label = requiredRoleName + " ==> " + providedRoleName;
	if (providingEntity != null && requiringEntity != null) {
		if (providingEntity == requiringEntity) {
			label += " [Component: " + providingEntity.getEntityName() + "]";
		} else {
			label += " [WARNING: requiring and providing entity not the same]";
		}
	} else {
		label += " [WARNING: at least one role not set]";
	}
	// --End manually modified code
	return label == null || label.length() == 0 ?
		getString("_UI_RoleToRoleDependency_type") :
		getString("_UI_RoleToRoleDependency_type") + " " + label;
}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RoleToRoleDependency.class)) {
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		// --Start manually added code
		// Fire notification so the label is updated immediately
		switch (notification.getFeatureID(RoleToRoleDependency.class)) {
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE:
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
		}
		// --End manually added code
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ComponentInternalDependenciesPackage.Literals.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY,
				 ComponentInternalDependenciesFactory.eINSTANCE.createOperationToOperationDependency()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentInternalDependenciesEditPlugin.INSTANCE;
	}

}
