/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Transition#getId <em>Id</em>}</li>
 *   <li>{@link petrinet.Transition#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Transition#getBox <em>Box</em>}</li>
 *   <li>{@link petrinet.Transition#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see petrinet.PetrinetPackage#getTransition_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link petrinet.Transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Box</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Box}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' reference list.
	 * @see petrinet.PetrinetPackage#getTransition_Box()
	 * @model
	 * @generated
	 */
	EList<Box> getBox();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference list.
	 * @see petrinet.PetrinetPackage#getTransition_Place()
	 * @model
	 * @generated
	 */
	EList<Place> getPlace();

} // Transition
