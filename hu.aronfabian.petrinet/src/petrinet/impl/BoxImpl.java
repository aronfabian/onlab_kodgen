/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.Box;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Token;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.BoxImpl#getToken <em>Token</em>}</li>
 *   <li>{@link petrinet.impl.BoxImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link petrinet.impl.BoxImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link petrinet.impl.BoxImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.BoxImpl#getArcIn <em>Arc In</em>}</li>
 *   <li>{@link petrinet.impl.BoxImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petrinet.impl.BoxImpl#getArcOut <em>Arc Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxImpl extends MinimalEObjectImpl.Container implements Box {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> token;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> place;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arc;

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
	 * The cached value of the '{@link #getArcIn() <em>Arc In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcIn;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getArcOut() <em>Arc Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getToken() {
		if (token == null) {
			token = new EObjectContainmentEList<Token>(Token.class, this, PetrinetPackage.BOX__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<Place>(Place.class, this, PetrinetPackage.BOX__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArc() {
		if (arc == null) {
			arc = new EObjectContainmentEList<Arc>(Arc.class, this, PetrinetPackage.BOX__ARC);
		}
		return arc;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.BOX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcIn() {
		if (arcIn == null) {
			arcIn = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.BOX__ARC_IN, PetrinetPackage.ARC__BOX_IN);
		}
		return arcIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcOut() {
		if (arcOut == null) {
			arcOut = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.BOX__ARC_OUT, PetrinetPackage.ARC__BOX_OUT);
		}
		return arcOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, PetrinetPackage.BOX__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.BOX__ARC_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcIn()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.BOX__ARC_OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcOut()).basicAdd(otherEnd, msgs);
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
			case PetrinetPackage.BOX__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.BOX__PLACE:
				return ((InternalEList<?>)getPlace()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.BOX__ARC:
				return ((InternalEList<?>)getArc()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.BOX__ARC_IN:
				return ((InternalEList<?>)getArcIn()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.BOX__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.BOX__ARC_OUT:
				return ((InternalEList<?>)getArcOut()).basicRemove(otherEnd, msgs);
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
			case PetrinetPackage.BOX__TOKEN:
				return getToken();
			case PetrinetPackage.BOX__PLACE:
				return getPlace();
			case PetrinetPackage.BOX__ARC:
				return getArc();
			case PetrinetPackage.BOX__NAME:
				return getName();
			case PetrinetPackage.BOX__ARC_IN:
				return getArcIn();
			case PetrinetPackage.BOX__TRANSITION:
				return getTransition();
			case PetrinetPackage.BOX__ARC_OUT:
				return getArcOut();
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
			case PetrinetPackage.BOX__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
				return;
			case PetrinetPackage.BOX__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetPackage.BOX__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.BOX__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.BOX__ARC_IN:
				getArcIn().clear();
				getArcIn().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.BOX__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case PetrinetPackage.BOX__ARC_OUT:
				getArcOut().clear();
				getArcOut().addAll((Collection<? extends Arc>)newValue);
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
			case PetrinetPackage.BOX__TOKEN:
				getToken().clear();
				return;
			case PetrinetPackage.BOX__PLACE:
				getPlace().clear();
				return;
			case PetrinetPackage.BOX__ARC:
				getArc().clear();
				return;
			case PetrinetPackage.BOX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.BOX__ARC_IN:
				getArcIn().clear();
				return;
			case PetrinetPackage.BOX__TRANSITION:
				getTransition().clear();
				return;
			case PetrinetPackage.BOX__ARC_OUT:
				getArcOut().clear();
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
			case PetrinetPackage.BOX__TOKEN:
				return token != null && !token.isEmpty();
			case PetrinetPackage.BOX__PLACE:
				return place != null && !place.isEmpty();
			case PetrinetPackage.BOX__ARC:
				return arc != null && !arc.isEmpty();
			case PetrinetPackage.BOX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.BOX__ARC_IN:
				return arcIn != null && !arcIn.isEmpty();
			case PetrinetPackage.BOX__TRANSITION:
				return transition != null && !transition.isEmpty();
			case PetrinetPackage.BOX__ARC_OUT:
				return arcOut != null && !arcOut.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BoxImpl
