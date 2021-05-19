/**
 */
package spaceinvaders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.Dimension#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link spaceinvaders.Dimension#getHauteur <em>Hauteur</em>}</li>
 * </ul>
 *
 * @see spaceinvaders.SpaceinvadersPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Longueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur</em>' attribute.
	 * @see #setLongueur(int)
	 * @see spaceinvaders.SpaceinvadersPackage#getDimension_Longueur()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getLongueur();

	/**
	 * Sets the value of the '{@link spaceinvaders.Dimension#getLongueur <em>Longueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur</em>' attribute.
	 * @see #getLongueur()
	 * @generated
	 */
	void setLongueur(int value);

	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' attribute.
	 * @see #setHauteur(int)
	 * @see spaceinvaders.SpaceinvadersPackage#getDimension_Hauteur()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getHauteur();

	/**
	 * Sets the value of the '{@link spaceinvaders.Dimension#getHauteur <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' attribute.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" longueurRequired="true" longueurOrdered="false" hauteurRequired="true" hauteurOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.longueur = longueur;\r\n\t\t   this.hauteur = hauteur;\r\n\t   '"
	 * @generated
	 */
	Dimension Dimension(int longueur, int hauteur);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.longueur;\r\n\t   '"
	 * @generated
	 */
	int longueur();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.hauteur;\r\n\t   '"
	 * @generated
	 */
	int hauteur();

} // Dimension
