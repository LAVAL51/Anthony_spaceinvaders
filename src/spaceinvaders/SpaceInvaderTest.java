/**
 */
package spaceinvaders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space Invader Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.SpaceInvaderTest#getSpaceinvaders <em>Spaceinvaders</em>}</li>
 * </ul>
 *
 * @see spaceinvaders.SpaceinvadersPackage#getSpaceInvaderTest()
 * @model
 * @generated
 */
public interface SpaceInvaderTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Spaceinvaders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spaceinvaders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spaceinvaders</em>' reference.
	 * @see #setSpaceinvaders(SpacesInvaders)
	 * @see spaceinvaders.SpaceinvadersPackage#getSpaceInvaderTest_Spaceinvaders()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpacesInvaders getSpaceinvaders();

	/**
	 * Sets the value of the '{@link spaceinvaders.SpaceInvaderTest#getSpaceinvaders <em>Spaceinvaders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spaceinvaders</em>' reference.
	 * @see #getSpaceinvaders()
	 * @generated
	 */
	void setSpaceinvaders(SpacesInvaders value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders = new SpacesInvaders(15, 10);\r\n '"
	 * @generated
	 */
	void initialisation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='assertEquals(\"\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" +\r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n\t    '"
	 * @generated
	 */
	void test_AuDebut_JeuSpaceInvaderEstVide();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);\r\n\t\tassertEquals(\"\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" +\r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\".......V.......\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n\t'"
	 * @generated
	 */
	void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='try {\r\n\t\t\tspaceinvaders.positionnerUnNouveauVaisseau(1,1,15,9);\r\n\t\t\tfail(\"Position trop \340 droite : devrait d\351clencher une exception HorsEspaceJeuException\");\r\n\t\t} catch (final HorsEspaceJeuException e) {\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\ttry {\r\n\t\t\tspaceinvaders.positionnerUnNouveauVaisseau(1,1,-1,9);\r\n\t\t\tfail(\"Position trop \340 gauche : devrait d\351clencher une exception HorsEspaceJeuException\");\r\n\t\t} catch (final HorsEspaceJeuException e) {\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\ttry {\r\n\t\t\tspaceinvaders.positionnerUnNouveauVaisseau(1,1,14,10);\r\n\t\t\tfail(\"Position trop en bas : devrait d\351clencher une exception HorsEspaceJeuException\");\r\n\t\t} catch (final HorsEspaceJeuException e) {\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\ttry {\r\n\t\t\tspaceinvaders.positionnerUnNouveauVaisseau(1,1,14,-1);\r\n\t\t\tfail(\"Position trop \340 haut : devrait d\351clencher une exception HorsEspaceJeuException\");\r\n\t\t} catch (final HorsEspaceJeuException e) {\r\n\t\t}\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);\r\n\t\tassertEquals(\"\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" +\r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\".......VVV.....\\n\" + \r\n\t\t\".......VVV.....\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n\t'"
	 * @generated
	 */
	void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='try {\r\n\t\t\tspaceinvaders.positionnerUnNouveauVaisseau(9,2,7,9);\r\n\t\t\tfail(\"D\351passement du vaisseau \340 droite en raison de sa longueur trop importante : devrait d\351clencher une exception DebordementEspaceJeuException\");\r\n\t\t} catch (final DebordementEspaceJeuException e) {\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\ttry {\r\n\t\t\tspaceinvaders.positionnerUnNouveauVaisseau(3,4,7,1);\r\n\t\t\tfail(\"D\351passement du vaisseau vers le haut en raison de sa hauteur trop importante : devrait d\351clencher une exception DebordementEspaceJeuException\");\r\n\t\t} catch (final DebordementEspaceJeuException e) {\r\n\t\t}\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9), 1);\r\n\t\tspaceinvaders.deplacerVaisseauVersLaGauche();\r\n\t\r\n\t\tassertEquals(\"\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" +\r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"......VVV......\\n\" + \r\n\t\t\"......VVV......\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n '"
	 * @generated
	 */
	void VaisseauAvance_DeplacerVaisseauVersLaGauche();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(3,2,0,9);\r\n\t\tspaceinvaders.deplacerVaisseauVersLaGauche();\r\n\t\t\r\n\t\tassertEquals(\"\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" +\r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"...............\\n\" + \r\n\t\t\"VVV............\\n\" + \r\n\t\t\"VVV............\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n\t'"
	 * @generated
	 */
	void VaisseauImmobile_DeplacerVaisseauVersLaGauche();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9),3);\r\n     spaceinvaders.deplacerVaisseauVersLaDroite();\r\n     assertEquals(\"\" + \r\n     \"...............\\n\" + \r\n     \"...............\\n\" +\r\n     \"...............\\n\" + \r\n     \"...............\\n\" + \r\n     \"...............\\n\" + \r\n     \"...............\\n\" + \r\n     \"...............\\n\" + \r\n     \"...............\\n\" + \r\n     \"..........VVV..\\n\" + \r\n     \"..........VVV..\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n '"
	 * @generated
	 */
	void test_VaisseauAvance_DeplacerVaisseauVersLaDroite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(12,9), 3);\r\n    spaceinvaders.deplacerVaisseauVersLaDroite();\r\n    assertEquals(\"\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" +\r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"............VVV\\n\" + \r\n    \"............VVV\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n '"
	 * @generated
	 */
	void test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(10,9),3);\r\n    spaceinvaders.deplacerVaisseauVersLaDroite();\r\n    assertEquals(\"\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" +\r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"...............\\n\" + \r\n    \"............VVV\\n\" + \r\n    \"............VVV\\n\" , spaceinvaders.recupererEspaceJeuDansChaineASCII());\r\n '"
	 * @generated
	 */
	void test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();

} // SpaceInvaderTest
