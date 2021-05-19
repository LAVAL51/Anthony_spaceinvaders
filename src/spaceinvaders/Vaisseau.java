/**
 */
package spaceinvaders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vaisseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.Vaisseau#getOrigine <em>Origine</em>}</li>
 *   <li>{@link spaceinvaders.Vaisseau#getDimension <em>Dimension</em>}</li>
 *   <li>{@link spaceinvaders.Vaisseau#getVitesse <em>Vitesse</em>}</li>
 * </ul>
 *
 * @see spaceinvaders.SpaceinvadersPackage#getVaisseau()
 * @model
 * @generated
 */
public interface Vaisseau extends EObject {
	/**
	 * Returns the value of the '<em><b>Origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine</em>' reference.
	 * @see #setOrigine(Position)
	 * @see spaceinvaders.SpaceinvadersPackage#getVaisseau_Origine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Position getOrigine();

	/**
	 * Sets the value of the '{@link spaceinvaders.Vaisseau#getOrigine <em>Origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine</em>' reference.
	 * @see #getOrigine()
	 * @generated
	 */
	void setOrigine(Position value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see spaceinvaders.SpaceinvadersPackage#getVaisseau_Dimension()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link spaceinvaders.Vaisseau#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' attribute.
	 * @see #setVitesse(int)
	 * @see spaceinvaders.SpaceinvadersPackage#getVaisseau_Vitesse()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getVitesse();

	/**
	 * Sets the value of the '{@link spaceinvaders.Vaisseau#getVitesse <em>Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' attribute.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" longueurRequired="true" longueurOrdered="false" hauteurRequired="true" hauteurOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this(longueur, hauteur, 0, 0);\r\n'"
	 * @generated
	 */
	Vaisseau Vaisseau(int longueur, int hauteur);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" longueurRequired="true" longueurOrdered="false" hauteurRequired="true" hauteurOrdered="false" xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this(new Dimension(longueur, hauteur), new Position(x, y));\r\n'"
	 * @generated
	 */
	Vaisseau Vaisseau(int longueur, int hauteur, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return estAbscisseCouverte(x) &amp;&amp; estOrdonneeCouverte(y);\r\n'"
	 * @generated
	 */
	boolean occupeLaPosition(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return (ordonneeLaPlusBasse() &lt;= y) &amp;&amp; (y &lt;= ordonneeLaPlusHaute());\r\n'"
	 * @generated
	 */
	boolean estOrdonneeCouverte(int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" xRequired="true" xOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return (abscisseLaPlusAGauche() &lt;= x) &amp;&amp; (x &lt;= abscisseLaPlusADroite());\r\n'"
	 * @generated
	 */
	boolean estAbscisseCouverte(int x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.origine.ordonnee() - this.dimension.hauteur() + 1;\r\n'"
	 * @generated
	 */
	int ordonneeLaPlusBasse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.origine.ordonnee();\r\n  '"
	 * @generated
	 */
	int ordonneeLaPlusHaute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.origine.abscisse() + this.dimension.longueur() - 1;\r\n  '"
	 * @generated
	 */
	int abscisseLaPlusADroite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.origine.abscisse();\r\n  '"
	 * @generated
	 */
	int abscisseLaPlusAGauche();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.origine.changerAbscisse(this.origine.abscisse() + vitesse);\r\n\t'"
	 * @generated
	 */
	void seDeplacerVersLaDroite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.origine.changerAbscisse(this.origine.abscisse() - vitesse);\r\n\t'"
	 * @generated
	 */
	void seDeplacerVersLaGauche();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.origine.changerAbscisse(x);\r\n\t   this.origine.changerOrdonnee(y);\r\n  '"
	 * @generated
	 */
	void positionner(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return dimension.longueur;\r\n\t'"
	 * @generated
	 */
	int longueur();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dimensionRequired="true" dimensionOrdered="false" positionOrigineRequired="true" positionOrigineOrdered="false" vitesseRequired="true" vitesseOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.dimension = dimension;\r\n\t\tthis.origine = positionOrigine;\r\n\t\tthis.vitesse = vitesse;\r\n\t'"
	 * @generated
	 */
	Vaisseau Vaisseau(Dimension dimension, Position positionOrigine, int vitesse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dimensionRequired="true" dimensionOrdered="false" positionOrigineRequired="true" positionOrigineOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this(dimension, positionOrigine, 1);\r\n\t'"
	 * @generated
	 */
	Vaisseau Vaisseau(Dimension dimension, Position positionOrigine);

} // Vaisseau
