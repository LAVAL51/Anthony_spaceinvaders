/**
 */
package spaceinvaders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spaces Invaders</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.SpacesInvaders#getMARQUE_FIN_LIGNE <em>MARQUE FIN LIGNE</em>}</li>
 *   <li>{@link spaceinvaders.SpacesInvaders#getMARQUE_VIDE <em>MARQUE VIDE</em>}</li>
 *   <li>{@link spaceinvaders.SpacesInvaders#getMARQUE_VAISSEAU <em>MARQUE VAISSEAU</em>}</li>
 *   <li>{@link spaceinvaders.SpacesInvaders#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link spaceinvaders.SpacesInvaders#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link spaceinvaders.SpacesInvaders#getVaisseau <em>Vaisseau</em>}</li>
 * </ul>
 *
 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders()
 * @model
 * @generated
 */
public interface SpacesInvaders extends EObject {
	/**
	 * Returns the value of the '<em><b>MARQUE FIN LIGNE</b></em>' attribute.
	 * The default value is <code>"\'\\n\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MARQUE FIN LIGNE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MARQUE FIN LIGNE</em>' attribute.
	 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders_MARQUE_FIN_LIGNE()
	 * @model default="\'\\n\'" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	char getMARQUE_FIN_LIGNE();

	/**
	 * Returns the value of the '<em><b>MARQUE VIDE</b></em>' attribute.
	 * The default value is <code>"\'.\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MARQUE VIDE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MARQUE VIDE</em>' attribute.
	 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders_MARQUE_VIDE()
	 * @model default="\'.\'" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	char getMARQUE_VIDE();

	/**
	 * Returns the value of the '<em><b>MARQUE VAISSEAU</b></em>' attribute.
	 * The default value is <code>"\'V\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MARQUE VAISSEAU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MARQUE VAISSEAU</em>' attribute.
	 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders_MARQUE_VAISSEAU()
	 * @model default="\'V\'" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	char getMARQUE_VAISSEAU();

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
	 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders_Longueur()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getLongueur();

	/**
	 * Sets the value of the '{@link spaceinvaders.SpacesInvaders#getLongueur <em>Longueur</em>}' attribute.
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
	 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders_Hauteur()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getHauteur();

	/**
	 * Sets the value of the '{@link spaceinvaders.SpacesInvaders#getHauteur <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' attribute.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(int value);

	/**
	 * Returns the value of the '<em><b>Vaisseau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaisseau</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaisseau</em>' reference.
	 * @see #setVaisseau(Vaisseau)
	 * @see spaceinvaders.SpaceinvadersPackage#getSpacesInvaders_Vaisseau()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Vaisseau getVaisseau();

	/**
	 * Sets the value of the '{@link spaceinvaders.SpacesInvaders#getVaisseau <em>Vaisseau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaisseau</em>' reference.
	 * @see #getVaisseau()
	 * @generated
	 */
	void setVaisseau(Vaisseau value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" longueurRequired="true" longueurOrdered="false" hauteurRequired="true" hauteurOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.longueur = longueur;\r\n\t   this.hauteur = hauteur;\r\n'"
	 * @generated
	 */
	SpacesInvaders SpacesInvaders(int longueur, int hauteur);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='StringBuilder espaceDeJeu = new StringBuilder();\r\n\t\tfor (int y = 0; y &lt; hauteur; y++) {\r\n\t\t\tfor (int x = 0; x &lt; longueur; x++) {\r\n\t\t\t\tespaceDeJeu.append(recupererMarqueDeLaPosition(x, y));\r\n\t\t\t}\r\n\t\t\tespaceDeJeu.append(MARQUE_FIN_LIGNE);\r\n\t\t}\r\n\t\treturn espaceDeJeu.toString();\r\n\t'"
	 * @generated
	 */
	String recupererEspaceJeuDansChaineASCII();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='char marque;\r\n\t\tif (this.aUnVaisseauQuiOccupeLaPosition(x, y))\r\n\t\t      marque=MARQUE_VAISSEAU;\r\n\t\telse\r\n\t\t      marque=MARQUE_VIDE;\r\n\t\treturn marque;\r\n\t'"
	 * @generated
	 */
	char recupererMarqueDeLaPosition(int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.aUnVaisseau() &amp;&amp; vaisseau.occupeLaPosition(x, y);\r\n\t'"
	 * @generated
	 */
	boolean aUnVaisseauQuiOccupeLaPosition(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return vaisseau!=null;\r\n\t'"
	 * @generated
	 */
	boolean aUnVaisseau();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return (((x &gt;= 0) &amp;&amp; (x &lt; longueur)) &amp;&amp; ((y &gt;= 0) &amp;&amp; (y &lt; hauteur)));\r\n\t'"
	 * @generated
	 */
	boolean estDansEspaceJeu(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (vaisseau.abscisseLaPlusADroite() &lt; (longueur - 1)) {\r\n\t\t\tvaisseau.seDeplacerVersLaDroite();\r\n\t\t\tif (!estDansEspaceJeu(vaisseau.abscisseLaPlusADroite(), vaisseau.ordonneeLaPlusHaute())) {\r\n\t\t\t\tvaisseau.positionner(longueur - vaisseau.longueur(), vaisseau.ordonneeLaPlusHaute());\r\n\t\t\t}\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void deplacerVaisseauVersLaDroite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (vaisseau.abscisseLaPlusAGauche()&gt; 0) vaisseau.seDeplacerVersLaGauche();\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void deplacerVaisseauVersLaGauche();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model longueurRequired="true" longueurOrdered="false" hauteurRequired="true" hauteurOrdered="false" xRequired="true" xOrdered="false" yRequired="true" yOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (!estDansEspaceJeu(x, y))\r\n\t\t\tthrow new HorsEspaceJeuException(\"La position du vaisseau est en dehors de l\'espace jeu\");\r\n\r\n\t\tif ( !estDansEspaceJeu(x+longueur-1,y))\r\n\t\t\tthrow new DebordementEspaceJeuException(\"Le vaisseau d\351borde de l\'espace jeu vers la droite \340 cause de sa longueur\");\r\n\t\tif (!estDansEspaceJeu(x,y-hauteur+1))\r\n\t\t\tthrow new DebordementEspaceJeuException(\"Le vaisseau d\351borde de l\'espace jeu vers le bas \340 cause de sa hauteur\");\r\n\r\n\t\tvaisseau = new Vaisseau(longueur, hauteur);\r\n\t\tvaisseau.positionner(x, y);\r\n\t'"
	 * @generated
	 */
	void positionnerUnNouveauVaisseau(int longueur, int hauteur, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dimensionRequired="true" dimensionOrdered="false" positionRequired="true" positionOrdered="false" vitesseRequired="true" vitesseOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='int x = position.abscisse();\r\n\t\tint y = position.ordonnee();\r\n\t\t\r\n\t\tif (!estDansEspaceJeu(x, y))\r\n\t\t\tthrow new HorsEspaceJeuException(\"La position du vaisseau est en dehors de l\'espace jeu\");\r\n\r\n\t\tint longueurVaisseau = dimension.longueur();\r\n\t\tint hauteurVaisseau = dimension.hauteur();\r\n\t\t\r\n\t\tif (!estDansEspaceJeu(x + longueurVaisseau - 1, y))\r\n\t\t\tthrow new DebordementEspaceJeuException(\"Le vaisseau d\351borde de l\'espace jeu vers la droite \340 cause de sa longueur\");\r\n\t\tif (!estDansEspaceJeu(x, y - hauteurVaisseau + 1))\r\n\t\t\tthrow new DebordementEspaceJeuException(\"Le vaisseau d\351borde de l\'espace jeu vers le bas \340 cause de sa hauteur\");\r\n\r\n\t    vaisseau = new Vaisseau(dimension,position,vitesse);\r\n\t'"
	 * @generated
	 */
	void positionnerUnNouveauVaisseau(Dimension dimension, Position position, int vitesse);

} // SpacesInvaders
