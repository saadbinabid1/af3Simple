/**
 */
package simpleaf3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleaf3.Behavior;
import simpleaf3.Component;
import simpleaf3.Port;
import simpleaf3.Simpleaf3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleaf3.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleaf3.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link simpleaf3.impl.ComponentImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link simpleaf3.impl.ComponentImpl#getTraceby <em>Traceby</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The default value of the '{@link #getTraceby() <em>Traceby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceby()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACEBY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceby() <em>Traceby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceby()
	 * @generated
	 * @ordered
	 */
	protected String traceby = TRACEBY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Simpleaf3Package.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleaf3Package.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList.Resolving<Port>(Port.class, this, Simpleaf3Package.COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (Behavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				InternalEObject newBehavior = (InternalEObject) behavior;
				NotificationChain msgs = oldBehavior.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Simpleaf3Package.COMPONENT__BEHAVIOR, null, null);
				if (newBehavior.eInternalContainer() == null) {
					msgs = newBehavior.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Simpleaf3Package.COMPONENT__BEHAVIOR,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Simpleaf3Package.COMPONENT__BEHAVIOR,
							oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Simpleaf3Package.COMPONENT__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject) behavior).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Simpleaf3Package.COMPONENT__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject) newBehavior).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Simpleaf3Package.COMPONENT__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleaf3Package.COMPONENT__BEHAVIOR, newBehavior,
					newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceby() {
		return traceby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceby(String newTraceby) {
		String oldTraceby = traceby;
		traceby = newTraceby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleaf3Package.COMPONENT__TRACEBY, oldTraceby,
					traceby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Simpleaf3Package.COMPONENT__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case Simpleaf3Package.COMPONENT__BEHAVIOR:
			return basicSetBehavior(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Simpleaf3Package.COMPONENT__NAME:
			return getName();
		case Simpleaf3Package.COMPONENT__PORTS:
			return getPorts();
		case Simpleaf3Package.COMPONENT__BEHAVIOR:
			if (resolve)
				return getBehavior();
			return basicGetBehavior();
		case Simpleaf3Package.COMPONENT__TRACEBY:
			return getTraceby();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Simpleaf3Package.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case Simpleaf3Package.COMPONENT__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case Simpleaf3Package.COMPONENT__BEHAVIOR:
			setBehavior((Behavior) newValue);
			return;
		case Simpleaf3Package.COMPONENT__TRACEBY:
			setTraceby((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Simpleaf3Package.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Simpleaf3Package.COMPONENT__PORTS:
			getPorts().clear();
			return;
		case Simpleaf3Package.COMPONENT__BEHAVIOR:
			setBehavior((Behavior) null);
			return;
		case Simpleaf3Package.COMPONENT__TRACEBY:
			setTraceby(TRACEBY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Simpleaf3Package.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Simpleaf3Package.COMPONENT__PORTS:
			return ports != null && !ports.isEmpty();
		case Simpleaf3Package.COMPONENT__BEHAVIOR:
			return behavior != null;
		case Simpleaf3Package.COMPONENT__TRACEBY:
			return TRACEBY_EDEFAULT == null ? traceby != null : !TRACEBY_EDEFAULT.equals(traceby);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", traceby: ");
		result.append(traceby);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
