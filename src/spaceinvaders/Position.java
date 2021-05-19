/**
 */
package spaceinvaders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.Position#getX <em>X</em>}</li>
 *   <li>{@link spaceinvaders.Position#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see spaceinvaders.SpaceinvadersPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see spaceinvaders.SpaceinvadersPackage#getPosition_X()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link spaceinvaders.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see spaceinvaders.SpaceinvadersPackage#getPosition_Y()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link spaceinvaders.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.x = x;\r\n\t\t   this.y = y;\r\n\t   '"
	 * @generated
	 */
	Position Position(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.x;\r\n\t   '"
	 * @generated
	 */
	int abscisse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.y;\r\n\t  '"
	 * @generated
	 */
	int ordonnee();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nouvelleAbscisseRequired="true" nouvelleAbscisseOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.x = nouvelleAbscisse;\r\n\t   '"
	 * @generated
	 */
	void changerAbscisse(int nouvelleAbscisse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nouvelleOrdonneeRequired="true" nouvelleOrdonneeOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.y = nouvelleOrdonnee;\r\n\t   '"
	 * @generated
	 */
	void changerOrdonnee(int nouvelleOrdonnee);

} // Position
