/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import petrinet.Arc;
import petrinet.Box;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ArcImpl#getId <em>Id</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getBoxIn <em>Box In</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getBoxOut <em>Box Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends MinimalEObjectImpl.Container implements Arc {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The cached value of the '{@link #getBoxIn() <em>Box In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxIn()
	 * @generated
	 * @ordered
	 */
	protected Box boxIn;

	/**
	 * The cached value of the '{@link #getBoxOut() <em>Box Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxOut()
	 * @generated
	 * @ordered
	 */
	protected Box boxOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__PLACE, oldPlace, newPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject)place).eInverseRemove(this, PetrinetPackage.PLACE__ARC, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, PetrinetPackage.PLACE__ARC, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TRANSITION, oldTransition, newTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject)transition).eInverseRemove(this, PetrinetPackage.TRANSITION__ARC, Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, PetrinetPackage.TRANSITION__ARC, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBoxIn() {
		if (boxIn != null && boxIn.eIsProxy()) {
			InternalEObject oldBoxIn = (InternalEObject)boxIn;
			boxIn = (Box)eResolveProxy(oldBoxIn);
			if (boxIn != oldBoxIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__BOX_IN, oldBoxIn, boxIn));
			}
		}
		return boxIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetBoxIn() {
		return boxIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoxIn(Box newBoxIn, NotificationChain msgs) {
		Box oldBoxIn = boxIn;
		boxIn = newBoxIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__BOX_IN, oldBoxIn, newBoxIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxIn(Box newBoxIn) {
		if (newBoxIn != boxIn) {
			NotificationChain msgs = null;
			if (boxIn != null)
				msgs = ((InternalEObject)boxIn).eInverseRemove(this, PetrinetPackage.BOX__ARC_IN, Box.class, msgs);
			if (newBoxIn != null)
				msgs = ((InternalEObject)newBoxIn).eInverseAdd(this, PetrinetPackage.BOX__ARC_IN, Box.class, msgs);
			msgs = basicSetBoxIn(newBoxIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__BOX_IN, newBoxIn, newBoxIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBoxOut() {
		if (boxOut != null && boxOut.eIsProxy()) {
			InternalEObject oldBoxOut = (InternalEObject)boxOut;
			boxOut = (Box)eResolveProxy(oldBoxOut);
			if (boxOut != oldBoxOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__BOX_OUT, oldBoxOut, boxOut));
			}
		}
		return boxOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetBoxOut() {
		return boxOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoxOut(Box newBoxOut, NotificationChain msgs) {
		Box oldBoxOut = boxOut;
		boxOut = newBoxOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__BOX_OUT, oldBoxOut, newBoxOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxOut(Box newBoxOut) {
		if (newBoxOut != boxOut) {
			NotificationChain msgs = null;
			if (boxOut != null)
				msgs = ((InternalEObject)boxOut).eInverseRemove(this, PetrinetPackage.BOX__ARC_OUT, Box.class, msgs);
			if (newBoxOut != null)
				msgs = ((InternalEObject)newBoxOut).eInverseAdd(this, PetrinetPackage.BOX__ARC_OUT, Box.class, msgs);
			msgs = basicSetBoxOut(newBoxOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__BOX_OUT, newBoxOut, newBoxOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.ARC__PLACE:
				if (place != null)
					msgs = ((InternalEObject)place).eInverseRemove(this, PetrinetPackage.PLACE__ARC, Place.class, msgs);
				return basicSetPlace((Place)otherEnd, msgs);
			case PetrinetPackage.ARC__TRANSITION:
				if (transition != null)
					msgs = ((InternalEObject)transition).eInverseRemove(this, PetrinetPackage.TRANSITION__ARC, Transition.class, msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
			case PetrinetPackage.ARC__BOX_IN:
				if (boxIn != null)
					msgs = ((InternalEObject)boxIn).eInverseRemove(this, PetrinetPackage.BOX__ARC_IN, Box.class, msgs);
				return basicSetBoxIn((Box)otherEnd, msgs);
			case PetrinetPackage.ARC__BOX_OUT:
				if (boxOut != null)
					msgs = ((InternalEObject)boxOut).eInverseRemove(this, PetrinetPackage.BOX__ARC_OUT, Box.class, msgs);
				return basicSetBoxOut((Box)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.ARC__PLACE:
				return basicSetPlace(null, msgs);
			case PetrinetPackage.ARC__TRANSITION:
				return basicSetTransition(null, msgs);
			case PetrinetPackage.ARC__BOX_IN:
				return basicSetBoxIn(null, msgs);
			case PetrinetPackage.ARC__BOX_OUT:
				return basicSetBoxOut(null, msgs);
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
			case PetrinetPackage.ARC__ID:
				return getId();
			case PetrinetPackage.ARC__WEIGHT:
				return getWeight();
			case PetrinetPackage.ARC__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
			case PetrinetPackage.ARC__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case PetrinetPackage.ARC__BOX_IN:
				if (resolve) return getBoxIn();
				return basicGetBoxIn();
			case PetrinetPackage.ARC__BOX_OUT:
				if (resolve) return getBoxOut();
				return basicGetBoxOut();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.ARC__ID:
				setId((Integer)newValue);
				return;
			case PetrinetPackage.ARC__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case PetrinetPackage.ARC__PLACE:
				setPlace((Place)newValue);
				return;
			case PetrinetPackage.ARC__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case PetrinetPackage.ARC__BOX_IN:
				setBoxIn((Box)newValue);
				return;
			case PetrinetPackage.ARC__BOX_OUT:
				setBoxOut((Box)newValue);
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
			case PetrinetPackage.ARC__ID:
				setId(ID_EDEFAULT);
				return;
			case PetrinetPackage.ARC__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PetrinetPackage.ARC__PLACE:
				setPlace((Place)null);
				return;
			case PetrinetPackage.ARC__TRANSITION:
				setTransition((Transition)null);
				return;
			case PetrinetPackage.ARC__BOX_IN:
				setBoxIn((Box)null);
				return;
			case PetrinetPackage.ARC__BOX_OUT:
				setBoxOut((Box)null);
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
			case PetrinetPackage.ARC__ID:
				return id != ID_EDEFAULT;
			case PetrinetPackage.ARC__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case PetrinetPackage.ARC__PLACE:
				return place != null;
			case PetrinetPackage.ARC__TRANSITION:
				return transition != null;
			case PetrinetPackage.ARC__BOX_IN:
				return boxIn != null;
			case PetrinetPackage.ARC__BOX_OUT:
				return boxOut != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
