/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.Box;
import petrinet.Net;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Token;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.NetImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link petrinet.impl.NetImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link petrinet.impl.NetImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petrinet.impl.NetImpl#getBox <em>Box</em>}</li>
 *   <li>{@link petrinet.impl.NetImpl#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetImpl extends MinimalEObjectImpl.Container implements Net {
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
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getBox() <em>Box</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBox()
	 * @generated
	 * @ordered
	 */
	protected EList<Box> box;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<Place>(Place.class, this, PetrinetPackage.NET__PLACE);
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
			arc = new EObjectContainmentEList<Arc>(Arc.class, this, PetrinetPackage.NET__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, PetrinetPackage.NET__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Box> getBox() {
		if (box == null) {
			box = new EObjectContainmentEList<Box>(Box.class, this, PetrinetPackage.NET__BOX);
		}
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getToken() {
		if (token == null) {
			token = new EObjectContainmentEList<Token>(Token.class, this, PetrinetPackage.NET__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.NET__PLACE:
				return ((InternalEList<?>)getPlace()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NET__ARC:
				return ((InternalEList<?>)getArc()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NET__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NET__BOX:
				return ((InternalEList<?>)getBox()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NET__TOKEN:
				return ((InternalEList<?>)getToken()).basicRemove(otherEnd, msgs);
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
			case PetrinetPackage.NET__PLACE:
				return getPlace();
			case PetrinetPackage.NET__ARC:
				return getArc();
			case PetrinetPackage.NET__TRANSITION:
				return getTransition();
			case PetrinetPackage.NET__BOX:
				return getBox();
			case PetrinetPackage.NET__TOKEN:
				return getToken();
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
			case PetrinetPackage.NET__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetPackage.NET__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.NET__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case PetrinetPackage.NET__BOX:
				getBox().clear();
				getBox().addAll((Collection<? extends Box>)newValue);
				return;
			case PetrinetPackage.NET__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
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
			case PetrinetPackage.NET__PLACE:
				getPlace().clear();
				return;
			case PetrinetPackage.NET__ARC:
				getArc().clear();
				return;
			case PetrinetPackage.NET__TRANSITION:
				getTransition().clear();
				return;
			case PetrinetPackage.NET__BOX:
				getBox().clear();
				return;
			case PetrinetPackage.NET__TOKEN:
				getToken().clear();
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
			case PetrinetPackage.NET__PLACE:
				return place != null && !place.isEmpty();
			case PetrinetPackage.NET__ARC:
				return arc != null && !arc.isEmpty();
			case PetrinetPackage.NET__TRANSITION:
				return transition != null && !transition.isEmpty();
			case PetrinetPackage.NET__BOX:
				return box != null && !box.isEmpty();
			case PetrinetPackage.NET__TOKEN:
				return token != null && !token.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetImpl
