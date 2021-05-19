/**
 */
package spaceinvaders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spaceinvaders.SpaceinvadersFactory
 * @model kind="package"
 * @generated
 */
public interface SpaceinvadersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spaceinvaders";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///spaceinvaders2/spaceinvaders.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spaceinvaders2.spaceinvaders";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpaceinvadersPackage eINSTANCE = spaceinvaders.impl.SpaceinvadersPackageImpl.init();

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvadersImpl <em>Spaces Invaders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvadersImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders()
	 * @generated
	 */
	int SPACES_INVADERS = 0;

	/**
	 * The feature id for the '<em><b>MARQUE FIN LIGNE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS__MARQUE_FIN_LIGNE = 0;

	/**
	 * The feature id for the '<em><b>MARQUE VIDE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS__MARQUE_VIDE = 1;

	/**
	 * The feature id for the '<em><b>MARQUE VAISSEAU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS__MARQUE_VAISSEAU = 2;

	/**
	 * The feature id for the '<em><b>Longueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS__LONGUEUR = 3;

	/**
	 * The feature id for the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS__HAUTEUR = 4;

	/**
	 * The feature id for the '<em><b>Vaisseau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS__VAISSEAU = 5;

	/**
	 * The number of structural features of the '<em>Spaces Invaders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Spaces Invaders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___SPACES_INVADERS__INT_INT = 0;

	/**
	 * The operation id for the '<em>Recuperer Espace Jeu Dans Chaine ASCII</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII = 1;

	/**
	 * The operation id for the '<em>Recuperer Marque De La Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___RECUPERER_MARQUE_DE_LA_POSITION__INT = 2;

	/**
	 * The operation id for the '<em>AUn Vaisseau Qui Occupe La Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT = 3;

	/**
	 * The operation id for the '<em>AUn Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___AUN_VAISSEAU = 4;

	/**
	 * The operation id for the '<em>Est Dans Espace Jeu</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___EST_DANS_ESPACE_JEU__INT_INT = 5;

	/**
	 * The operation id for the '<em>Deplacer Vaisseau Vers La Droite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_DROITE = 6;

	/**
	 * The operation id for the '<em>Deplacer Vaisseau Vers La Gauche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_GAUCHE = 7;

	/**
	 * The operation id for the '<em>Positionner Un Nouveau Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT = 8;

	/**
	 * The operation id for the '<em>Positionner Un Nouveau Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT = 9;

	/**
	 * The number of operations of the '<em>Spaces Invaders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.VaisseauImpl <em>Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.VaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau()
	 * @generated
	 */
	int VAISSEAU = 1;

	/**
	 * The feature id for the '<em><b>Origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU__ORIGINE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU__DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Vitesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU__VITESSE = 2;

	/**
	 * The number of structural features of the '<em>Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___VAISSEAU__INT_INT = 0;

	/**
	 * The operation id for the '<em>Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___VAISSEAU__INT_INT_INT_INT = 1;

	/**
	 * The operation id for the '<em>Occupe La Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___OCCUPE_LA_POSITION__INT_INT = 2;

	/**
	 * The operation id for the '<em>Est Ordonnee Couverte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___EST_ORDONNEE_COUVERTE__INT = 3;

	/**
	 * The operation id for the '<em>Est Abscisse Couverte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___EST_ABSCISSE_COUVERTE__INT = 4;

	/**
	 * The operation id for the '<em>Ordonnee La Plus Basse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___ORDONNEE_LA_PLUS_BASSE = 5;

	/**
	 * The operation id for the '<em>Ordonnee La Plus Haute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___ORDONNEE_LA_PLUS_HAUTE = 6;

	/**
	 * The operation id for the '<em>Abscisse La Plus ADroite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___ABSCISSE_LA_PLUS_ADROITE = 7;

	/**
	 * The operation id for the '<em>Abscisse La Plus AGauche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___ABSCISSE_LA_PLUS_AGAUCHE = 8;

	/**
	 * The operation id for the '<em>Se Deplacer Vers La Droite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___SE_DEPLACER_VERS_LA_DROITE = 9;

	/**
	 * The operation id for the '<em>Se Deplacer Vers La Gauche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___SE_DEPLACER_VERS_LA_GAUCHE = 10;

	/**
	 * The operation id for the '<em>Positionner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___POSITIONNER__INT_INT = 11;

	/**
	 * The operation id for the '<em>Longueur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___LONGUEUR = 12;

	/**
	 * The operation id for the '<em>Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___VAISSEAU__DIMENSION_POSITION_INT = 13;

	/**
	 * The operation id for the '<em>Vaisseau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU___VAISSEAU__DIMENSION_POSITION = 14;

	/**
	 * The number of operations of the '<em>Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_OPERATION_COUNT = 15;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.PositionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___POSITION__INT_INT = 0;

	/**
	 * The operation id for the '<em>Abscisse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___ABSCISSE = 1;

	/**
	 * The operation id for the '<em>Ordonnee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___ORDONNEE = 2;

	/**
	 * The operation id for the '<em>Changer Abscisse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CHANGER_ABSCISSE__INT = 3;

	/**
	 * The operation id for the '<em>Changer Ordonnee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CHANGER_ORDONNEE__INT = 4;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Position_PositionImpl <em>Position Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Position_PositionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_Position()
	 * @generated
	 */
	int POSITION_POSITION = 3;

	/**
	 * The number of structural features of the '<em>Position Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Position_abscisseImpl <em>Position abscisse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Position_abscisseImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_abscisse()
	 * @generated
	 */
	int POSITION_ABSCISSE = 4;

	/**
	 * The number of structural features of the '<em>Position abscisse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ABSCISSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position abscisse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ABSCISSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Position_ordonneeImpl <em>Position ordonnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Position_ordonneeImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_ordonnee()
	 * @generated
	 */
	int POSITION_ORDONNEE = 5;

	/**
	 * The number of structural features of the '<em>Position ordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ORDONNEE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position ordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ORDONNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Position_changerAbscisseImpl <em>Position changer Abscisse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Position_changerAbscisseImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_changerAbscisse()
	 * @generated
	 */
	int POSITION_CHANGER_ABSCISSE = 6;

	/**
	 * The number of structural features of the '<em>Position changer Abscisse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CHANGER_ABSCISSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position changer Abscisse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CHANGER_ABSCISSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Position_changerOrdonneeImpl <em>Position changer Ordonnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Position_changerOrdonneeImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_changerOrdonnee()
	 * @generated
	 */
	int POSITION_CHANGER_ORDONNEE = 7;

	/**
	 * The number of structural features of the '<em>Position changer Ordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CHANGER_ORDONNEE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position changer Ordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CHANGER_ORDONNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.DimensionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Longueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LONGUEUR = 0;

	/**
	 * The feature id for the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HAUTEUR = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION___DIMENSION__INT_INT = 0;

	/**
	 * The operation id for the '<em>Longueur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION___LONGUEUR = 1;

	/**
	 * The operation id for the '<em>Hauteur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION___HAUTEUR = 2;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Dimension_DimensionImpl <em>Dimension Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Dimension_DimensionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension_Dimension()
	 * @generated
	 */
	int DIMENSION_DIMENSION = 9;

	/**
	 * The number of structural features of the '<em>Dimension Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DIMENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dimension Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Dimension_longueurImpl <em>Dimension longueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Dimension_longueurImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension_longueur()
	 * @generated
	 */
	int DIMENSION_LONGUEUR = 10;

	/**
	 * The number of structural features of the '<em>Dimension longueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LONGUEUR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dimension longueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LONGUEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Dimension_hauteurImpl <em>Dimension hauteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Dimension_hauteurImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension_hauteur()
	 * @generated
	 */
	int DIMENSION_HAUTEUR = 11;

	/**
	 * The number of structural features of the '<em>Dimension hauteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_HAUTEUR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dimension hauteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_HAUTEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
	 * @generated
	 */
	int VAISSEAU_VAISSEAU = 12;

	/**
	 * The number of structural features of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
	 * @generated
	 */
	int VAISSEAU_VAISSEAU = 13;

	/**
	 * The number of structural features of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
	 * @generated
	 */
	int VAISSEAU_VAISSEAU = 14;

	/**
	 * The number of structural features of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
	 * @generated
	 */
	int VAISSEAU_VAISSEAU = 15;

	/**
	 * The number of structural features of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_occupeLaPositionImpl <em>Vaisseau occupe La Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_occupeLaPositionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_occupeLaPosition()
	 * @generated
	 */
	int VAISSEAU_OCCUPE_LA_POSITION = 16;

	/**
	 * The number of structural features of the '<em>Vaisseau occupe La Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_OCCUPE_LA_POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau occupe La Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_OCCUPE_LA_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_estOrdonneeCouverteImpl <em>Vaisseau est Ordonnee Couverte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_estOrdonneeCouverteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_estOrdonneeCouverte()
	 * @generated
	 */
	int VAISSEAU_EST_ORDONNEE_COUVERTE = 17;

	/**
	 * The number of structural features of the '<em>Vaisseau est Ordonnee Couverte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_EST_ORDONNEE_COUVERTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau est Ordonnee Couverte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_EST_ORDONNEE_COUVERTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_estAbscisseCouverteImpl <em>Vaisseau est Abscisse Couverte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_estAbscisseCouverteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_estAbscisseCouverte()
	 * @generated
	 */
	int VAISSEAU_EST_ABSCISSE_COUVERTE = 18;

	/**
	 * The number of structural features of the '<em>Vaisseau est Abscisse Couverte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_EST_ABSCISSE_COUVERTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau est Abscisse Couverte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_EST_ABSCISSE_COUVERTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_ordonneeLaPlusBasseImpl <em>Vaisseau ordonnee La Plus Basse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_ordonneeLaPlusBasseImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_ordonneeLaPlusBasse()
	 * @generated
	 */
	int VAISSEAU_ORDONNEE_LA_PLUS_BASSE = 19;

	/**
	 * The number of structural features of the '<em>Vaisseau ordonnee La Plus Basse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ORDONNEE_LA_PLUS_BASSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau ordonnee La Plus Basse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ORDONNEE_LA_PLUS_BASSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_ordonneeLaPlusHauteImpl <em>Vaisseau ordonnee La Plus Haute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_ordonneeLaPlusHauteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_ordonneeLaPlusHaute()
	 * @generated
	 */
	int VAISSEAU_ORDONNEE_LA_PLUS_HAUTE = 20;

	/**
	 * The number of structural features of the '<em>Vaisseau ordonnee La Plus Haute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ORDONNEE_LA_PLUS_HAUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau ordonnee La Plus Haute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ORDONNEE_LA_PLUS_HAUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_abscisseLaPlusADroiteImpl <em>Vaisseau abscisse La Plus ADroite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_abscisseLaPlusADroiteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_abscisseLaPlusADroite()
	 * @generated
	 */
	int VAISSEAU_ABSCISSE_LA_PLUS_ADROITE = 21;

	/**
	 * The number of structural features of the '<em>Vaisseau abscisse La Plus ADroite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ABSCISSE_LA_PLUS_ADROITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau abscisse La Plus ADroite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ABSCISSE_LA_PLUS_ADROITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_abscisseLaPlusAGaucheImpl <em>Vaisseau abscisse La Plus AGauche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_abscisseLaPlusAGaucheImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_abscisseLaPlusAGauche()
	 * @generated
	 */
	int VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE = 22;

	/**
	 * The number of structural features of the '<em>Vaisseau abscisse La Plus AGauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau abscisse La Plus AGauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_seDeplacerVersLaDroiteImpl <em>Vaisseau se Deplacer Vers La Droite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_seDeplacerVersLaDroiteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_seDeplacerVersLaDroite()
	 * @generated
	 */
	int VAISSEAU_SE_DEPLACER_VERS_LA_DROITE = 23;

	/**
	 * The number of structural features of the '<em>Vaisseau se Deplacer Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_SE_DEPLACER_VERS_LA_DROITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau se Deplacer Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_SE_DEPLACER_VERS_LA_DROITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_seDeplacerVersLaGaucheImpl <em>Vaisseau se Deplacer Vers La Gauche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_seDeplacerVersLaGaucheImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_seDeplacerVersLaGauche()
	 * @generated
	 */
	int VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE = 24;

	/**
	 * The number of structural features of the '<em>Vaisseau se Deplacer Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau se Deplacer Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_positionnerImpl <em>Vaisseau positionner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_positionnerImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_positionner()
	 * @generated
	 */
	int VAISSEAU_POSITIONNER = 25;

	/**
	 * The number of structural features of the '<em>Vaisseau positionner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_POSITIONNER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau positionner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_POSITIONNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.Vaisseau_longueurImpl <em>Vaisseau longueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.Vaisseau_longueurImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_longueur()
	 * @generated
	 */
	int VAISSEAU_LONGUEUR = 26;

	/**
	 * The number of structural features of the '<em>Vaisseau longueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_LONGUEUR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vaisseau longueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAISSEAU_LONGUEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_SpacesInvadersImpl <em>Spaces Invaders Spaces Invaders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_SpacesInvadersImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_SpacesInvaders()
	 * @generated
	 */
	int SPACES_INVADERS_SPACES_INVADERS = 27;

	/**
	 * The number of structural features of the '<em>Spaces Invaders Spaces Invaders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_SPACES_INVADERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders Spaces Invaders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_SPACES_INVADERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_recupererEspaceJeuDansChaineASCIIImpl <em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_recupererEspaceJeuDansChaineASCIIImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_recupererEspaceJeuDansChaineASCII()
	 * @generated
	 */
	int SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII = 28;

	/**
	 * The number of structural features of the '<em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_recupererMarqueDeLaPositionImpl <em>Spaces Invaders recuperer Marque De La Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_recupererMarqueDeLaPositionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_recupererMarqueDeLaPosition()
	 * @generated
	 */
	int SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION = 29;

	/**
	 * The number of structural features of the '<em>Spaces Invaders recuperer Marque De La Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders recuperer Marque De La Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_aUnVaisseauQuiOccupeLaPositionImpl <em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_aUnVaisseauQuiOccupeLaPositionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_aUnVaisseauQuiOccupeLaPosition()
	 * @generated
	 */
	int SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION = 30;

	/**
	 * The number of structural features of the '<em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_aUnVaisseauImpl <em>Spaces Invaders aUn Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_aUnVaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_aUnVaisseau()
	 * @generated
	 */
	int SPACES_INVADERS_AUN_VAISSEAU = 31;

	/**
	 * The number of structural features of the '<em>Spaces Invaders aUn Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_AUN_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders aUn Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_AUN_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_estDansEspaceJeuImpl <em>Spaces Invaders est Dans Espace Jeu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_estDansEspaceJeuImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_estDansEspaceJeu()
	 * @generated
	 */
	int SPACES_INVADERS_EST_DANS_ESPACE_JEU = 32;

	/**
	 * The number of structural features of the '<em>Spaces Invaders est Dans Espace Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_EST_DANS_ESPACE_JEU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders est Dans Espace Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_EST_DANS_ESPACE_JEU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaDroiteImpl <em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaDroiteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_deplacerVaisseauVersLaDroite()
	 * @generated
	 */
	int SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE = 33;

	/**
	 * The number of structural features of the '<em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaGaucheImpl <em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaGaucheImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_deplacerVaisseauVersLaGauche()
	 * @generated
	 */
	int SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = 34;

	/**
	 * The number of structural features of the '<em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_positionnerUnNouveauVaisseau()
	 * @generated
	 */
	int SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU = 35;

	/**
	 * The number of structural features of the '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_positionnerUnNouveauVaisseau()
	 * @generated
	 */
	int SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU = 36;

	/**
	 * The number of structural features of the '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTestImpl <em>Space Invader Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTestImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest()
	 * @generated
	 */
	int SPACE_INVADER_TEST = 37;

	/**
	 * The feature id for the '<em><b>Spaceinvaders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST__SPACEINVADERS = 0;

	/**
	 * The number of structural features of the '<em>Space Invader Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Initialisation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___INITIALISATION = 0;

	/**
	 * The operation id for the '<em>Test Au Debut Jeu Space Invader Est Vide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE = 1;

	/**
	 * The operation id for the '<em>Test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = 2;

	/**
	 * The operation id for the '<em>Test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION = 3;

	/**
	 * The operation id for the '<em>Test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = 4;

	/**
	 * The operation id for the '<em>Test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT = 5;

	/**
	 * The operation id for the '<em>Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = 6;

	/**
	 * The operation id for the '<em>Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = 7;

	/**
	 * The operation id for the '<em>Test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE = 8;

	/**
	 * The operation id for the '<em>Test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE = 9;

	/**
	 * The operation id for the '<em>Test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE = 10;

	/**
	 * The number of operations of the '<em>Space Invader Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_initialisationImpl <em>Space Invader Test initialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_initialisationImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_initialisation()
	 * @generated
	 */
	int SPACE_INVADER_TEST_INITIALISATION = 38;

	/**
	 * The number of structural features of the '<em>Space Invader Test initialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_INITIALISATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test initialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_INITIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideImpl <em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE = 39;

	/**
	 * The number of structural features of the '<em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuImpl <em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = 40;

	/**
	 * The number of structural features of the '<em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionImpl <em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION = 41;

	/**
	 * The number of structural features of the '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuImpl <em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = 42;

	/**
	 * The number of structural features of the '<em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementImpl <em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT = 43;

	/**
	 * The number of structural features of the '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheImpl <em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche()
	 * @generated
	 */
	int SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = 44;

	/**
	 * The number of structural features of the '<em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheImpl <em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche()
	 * @generated
	 */
	int SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = 45;

	/**
	 * The number of structural features of the '<em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteImpl <em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE = 46;

	/**
	 * The number of structural features of the '<em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteImpl <em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE = 47;

	/**
	 * The number of structural features of the '<em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteImpl <em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteImpl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite()
	 * @generated
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE = 48;

	/**
	 * The number of structural features of the '<em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spaceinvaders.impl.NewClass1Impl <em>New Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spaceinvaders.impl.NewClass1Impl
	 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getNewClass1()
	 * @generated
	 */
	int NEW_CLASS1 = 49;

	/**
	 * The number of structural features of the '<em>New Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS1_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders <em>Spaces Invaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders</em>'.
	 * @see spaceinvaders.SpacesInvaders
	 * @generated
	 */
	EClass getSpacesInvaders();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.SpacesInvaders#getMARQUE_FIN_LIGNE <em>MARQUE FIN LIGNE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MARQUE FIN LIGNE</em>'.
	 * @see spaceinvaders.SpacesInvaders#getMARQUE_FIN_LIGNE()
	 * @see #getSpacesInvaders()
	 * @generated
	 */
	EAttribute getSpacesInvaders_MARQUE_FIN_LIGNE();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.SpacesInvaders#getMARQUE_VIDE <em>MARQUE VIDE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MARQUE VIDE</em>'.
	 * @see spaceinvaders.SpacesInvaders#getMARQUE_VIDE()
	 * @see #getSpacesInvaders()
	 * @generated
	 */
	EAttribute getSpacesInvaders_MARQUE_VIDE();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.SpacesInvaders#getMARQUE_VAISSEAU <em>MARQUE VAISSEAU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MARQUE VAISSEAU</em>'.
	 * @see spaceinvaders.SpacesInvaders#getMARQUE_VAISSEAU()
	 * @see #getSpacesInvaders()
	 * @generated
	 */
	EAttribute getSpacesInvaders_MARQUE_VAISSEAU();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.SpacesInvaders#getLongueur <em>Longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longueur</em>'.
	 * @see spaceinvaders.SpacesInvaders#getLongueur()
	 * @see #getSpacesInvaders()
	 * @generated
	 */
	EAttribute getSpacesInvaders_Longueur();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.SpacesInvaders#getHauteur <em>Hauteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hauteur</em>'.
	 * @see spaceinvaders.SpacesInvaders#getHauteur()
	 * @see #getSpacesInvaders()
	 * @generated
	 */
	EAttribute getSpacesInvaders_Hauteur();

	/**
	 * Returns the meta object for the reference '{@link spaceinvaders.SpacesInvaders#getVaisseau <em>Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vaisseau</em>'.
	 * @see spaceinvaders.SpacesInvaders#getVaisseau()
	 * @see #getSpacesInvaders()
	 * @generated
	 */
	EReference getSpacesInvaders_Vaisseau();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#SpacesInvaders(int, int) <em>Spaces Invaders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Spaces Invaders</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#SpacesInvaders(int, int)
	 * @generated
	 */
	EOperation getSpacesInvaders__SpacesInvaders__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#recupererEspaceJeuDansChaineASCII() <em>Recuperer Espace Jeu Dans Chaine ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recuperer Espace Jeu Dans Chaine ASCII</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#recupererEspaceJeuDansChaineASCII()
	 * @generated
	 */
	EOperation getSpacesInvaders__RecupererEspaceJeuDansChaineASCII();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#recupererMarqueDeLaPosition(int) <em>Recuperer Marque De La Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recuperer Marque De La Position</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#recupererMarqueDeLaPosition(int)
	 * @generated
	 */
	EOperation getSpacesInvaders__RecupererMarqueDeLaPosition__int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#aUnVaisseauQuiOccupeLaPosition(int, int) <em>AUn Vaisseau Qui Occupe La Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>AUn Vaisseau Qui Occupe La Position</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#aUnVaisseauQuiOccupeLaPosition(int, int)
	 * @generated
	 */
	EOperation getSpacesInvaders__AUnVaisseauQuiOccupeLaPosition__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#aUnVaisseau() <em>AUn Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>AUn Vaisseau</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#aUnVaisseau()
	 * @generated
	 */
	EOperation getSpacesInvaders__AUnVaisseau();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#estDansEspaceJeu(int, int) <em>Est Dans Espace Jeu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Dans Espace Jeu</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#estDansEspaceJeu(int, int)
	 * @generated
	 */
	EOperation getSpacesInvaders__EstDansEspaceJeu__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#deplacerVaisseauVersLaDroite() <em>Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deplacer Vaisseau Vers La Droite</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#deplacerVaisseauVersLaDroite()
	 * @generated
	 */
	EOperation getSpacesInvaders__DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#deplacerVaisseauVersLaGauche() <em>Deplacer Vaisseau Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deplacer Vaisseau Vers La Gauche</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#deplacerVaisseauVersLaGauche()
	 * @generated
	 */
	EOperation getSpacesInvaders__DeplacerVaisseauVersLaGauche();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#positionnerUnNouveauVaisseau(int, int, int, int) <em>Positionner Un Nouveau Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positionner Un Nouveau Vaisseau</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#positionnerUnNouveauVaisseau(int, int, int, int)
	 * @generated
	 */
	EOperation getSpacesInvaders__PositionnerUnNouveauVaisseau__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpacesInvaders#positionnerUnNouveauVaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int) <em>Positionner Un Nouveau Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positionner Un Nouveau Vaisseau</em>' operation.
	 * @see spaceinvaders.SpacesInvaders#positionnerUnNouveauVaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int)
	 * @generated
	 */
	EOperation getSpacesInvaders__PositionnerUnNouveauVaisseau__Dimension_Position_int();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau <em>Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau</em>'.
	 * @see spaceinvaders.Vaisseau
	 * @generated
	 */
	EClass getVaisseau();

	/**
	 * Returns the meta object for the reference '{@link spaceinvaders.Vaisseau#getOrigine <em>Origine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origine</em>'.
	 * @see spaceinvaders.Vaisseau#getOrigine()
	 * @see #getVaisseau()
	 * @generated
	 */
	EReference getVaisseau_Origine();

	/**
	 * Returns the meta object for the reference '{@link spaceinvaders.Vaisseau#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see spaceinvaders.Vaisseau#getDimension()
	 * @see #getVaisseau()
	 * @generated
	 */
	EReference getVaisseau_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.Vaisseau#getVitesse <em>Vitesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vitesse</em>'.
	 * @see spaceinvaders.Vaisseau#getVitesse()
	 * @see #getVaisseau()
	 * @generated
	 */
	EAttribute getVaisseau_Vitesse();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#Vaisseau(int, int) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vaisseau</em>' operation.
	 * @see spaceinvaders.Vaisseau#Vaisseau(int, int)
	 * @generated
	 */
	EOperation getVaisseau__Vaisseau__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#Vaisseau(int, int, int, int) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vaisseau</em>' operation.
	 * @see spaceinvaders.Vaisseau#Vaisseau(int, int, int, int)
	 * @generated
	 */
	EOperation getVaisseau__Vaisseau__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#occupeLaPosition(int, int) <em>Occupe La Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occupe La Position</em>' operation.
	 * @see spaceinvaders.Vaisseau#occupeLaPosition(int, int)
	 * @generated
	 */
	EOperation getVaisseau__OccupeLaPosition__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#estOrdonneeCouverte(int) <em>Est Ordonnee Couverte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Ordonnee Couverte</em>' operation.
	 * @see spaceinvaders.Vaisseau#estOrdonneeCouverte(int)
	 * @generated
	 */
	EOperation getVaisseau__EstOrdonneeCouverte__int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#estAbscisseCouverte(int) <em>Est Abscisse Couverte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Abscisse Couverte</em>' operation.
	 * @see spaceinvaders.Vaisseau#estAbscisseCouverte(int)
	 * @generated
	 */
	EOperation getVaisseau__EstAbscisseCouverte__int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#ordonneeLaPlusBasse() <em>Ordonnee La Plus Basse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ordonnee La Plus Basse</em>' operation.
	 * @see spaceinvaders.Vaisseau#ordonneeLaPlusBasse()
	 * @generated
	 */
	EOperation getVaisseau__OrdonneeLaPlusBasse();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#ordonneeLaPlusHaute() <em>Ordonnee La Plus Haute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ordonnee La Plus Haute</em>' operation.
	 * @see spaceinvaders.Vaisseau#ordonneeLaPlusHaute()
	 * @generated
	 */
	EOperation getVaisseau__OrdonneeLaPlusHaute();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#abscisseLaPlusADroite() <em>Abscisse La Plus ADroite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abscisse La Plus ADroite</em>' operation.
	 * @see spaceinvaders.Vaisseau#abscisseLaPlusADroite()
	 * @generated
	 */
	EOperation getVaisseau__AbscisseLaPlusADroite();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#abscisseLaPlusAGauche() <em>Abscisse La Plus AGauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abscisse La Plus AGauche</em>' operation.
	 * @see spaceinvaders.Vaisseau#abscisseLaPlusAGauche()
	 * @generated
	 */
	EOperation getVaisseau__AbscisseLaPlusAGauche();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#seDeplacerVersLaDroite() <em>Se Deplacer Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Se Deplacer Vers La Droite</em>' operation.
	 * @see spaceinvaders.Vaisseau#seDeplacerVersLaDroite()
	 * @generated
	 */
	EOperation getVaisseau__SeDeplacerVersLaDroite();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#seDeplacerVersLaGauche() <em>Se Deplacer Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Se Deplacer Vers La Gauche</em>' operation.
	 * @see spaceinvaders.Vaisseau#seDeplacerVersLaGauche()
	 * @generated
	 */
	EOperation getVaisseau__SeDeplacerVersLaGauche();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#positionner(int, int) <em>Positionner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positionner</em>' operation.
	 * @see spaceinvaders.Vaisseau#positionner(int, int)
	 * @generated
	 */
	EOperation getVaisseau__Positionner__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#longueur() <em>Longueur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Longueur</em>' operation.
	 * @see spaceinvaders.Vaisseau#longueur()
	 * @generated
	 */
	EOperation getVaisseau__Longueur();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vaisseau</em>' operation.
	 * @see spaceinvaders.Vaisseau#Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int)
	 * @generated
	 */
	EOperation getVaisseau__Vaisseau__Dimension_Position_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Vaisseau#Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vaisseau</em>' operation.
	 * @see spaceinvaders.Vaisseau#Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position)
	 * @generated
	 */
	EOperation getVaisseau__Vaisseau__Dimension_Position();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see spaceinvaders.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see spaceinvaders.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see spaceinvaders.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Position#Position(int, int) <em>Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position</em>' operation.
	 * @see spaceinvaders.Position#Position(int, int)
	 * @generated
	 */
	EOperation getPosition__Position__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Position#abscisse() <em>Abscisse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abscisse</em>' operation.
	 * @see spaceinvaders.Position#abscisse()
	 * @generated
	 */
	EOperation getPosition__Abscisse();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Position#ordonnee() <em>Ordonnee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ordonnee</em>' operation.
	 * @see spaceinvaders.Position#ordonnee()
	 * @generated
	 */
	EOperation getPosition__Ordonnee();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Position#changerAbscisse(int) <em>Changer Abscisse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Changer Abscisse</em>' operation.
	 * @see spaceinvaders.Position#changerAbscisse(int)
	 * @generated
	 */
	EOperation getPosition__ChangerAbscisse__int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Position#changerOrdonnee(int) <em>Changer Ordonnee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Changer Ordonnee</em>' operation.
	 * @see spaceinvaders.Position#changerOrdonnee(int)
	 * @generated
	 */
	EOperation getPosition__ChangerOrdonnee__int();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Position_Position <em>Position Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Position</em>'.
	 * @see spaceinvaders.Position_Position
	 * @generated
	 */
	EClass getPosition_Position();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Position_abscisse <em>Position abscisse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position abscisse</em>'.
	 * @see spaceinvaders.Position_abscisse
	 * @generated
	 */
	EClass getPosition_abscisse();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Position_ordonnee <em>Position ordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position ordonnee</em>'.
	 * @see spaceinvaders.Position_ordonnee
	 * @generated
	 */
	EClass getPosition_ordonnee();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Position_changerAbscisse <em>Position changer Abscisse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position changer Abscisse</em>'.
	 * @see spaceinvaders.Position_changerAbscisse
	 * @generated
	 */
	EClass getPosition_changerAbscisse();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Position_changerOrdonnee <em>Position changer Ordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position changer Ordonnee</em>'.
	 * @see spaceinvaders.Position_changerOrdonnee
	 * @generated
	 */
	EClass getPosition_changerOrdonnee();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see spaceinvaders.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.Dimension#getLongueur <em>Longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longueur</em>'.
	 * @see spaceinvaders.Dimension#getLongueur()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Longueur();

	/**
	 * Returns the meta object for the attribute '{@link spaceinvaders.Dimension#getHauteur <em>Hauteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hauteur</em>'.
	 * @see spaceinvaders.Dimension#getHauteur()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Hauteur();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Dimension#Dimension(int, int) <em>Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension</em>' operation.
	 * @see spaceinvaders.Dimension#Dimension(int, int)
	 * @generated
	 */
	EOperation getDimension__Dimension__int_int();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Dimension#longueur() <em>Longueur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Longueur</em>' operation.
	 * @see spaceinvaders.Dimension#longueur()
	 * @generated
	 */
	EOperation getDimension__Longueur();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.Dimension#hauteur() <em>Hauteur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hauteur</em>' operation.
	 * @see spaceinvaders.Dimension#hauteur()
	 * @generated
	 */
	EOperation getDimension__Hauteur();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Dimension_Dimension <em>Dimension Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Dimension</em>'.
	 * @see spaceinvaders.Dimension_Dimension
	 * @generated
	 */
	EClass getDimension_Dimension();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Dimension_longueur <em>Dimension longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension longueur</em>'.
	 * @see spaceinvaders.Dimension_longueur
	 * @generated
	 */
	EClass getDimension_longueur();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Dimension_hauteur <em>Dimension hauteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension hauteur</em>'.
	 * @see spaceinvaders.Dimension_hauteur
	 * @generated
	 */
	EClass getDimension_hauteur();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau Vaisseau</em>'.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	EClass getVaisseau_Vaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau Vaisseau</em>'.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	EClass getVaisseau_Vaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau Vaisseau</em>'.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	EClass getVaisseau_Vaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau Vaisseau</em>'.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	EClass getVaisseau_Vaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_occupeLaPosition <em>Vaisseau occupe La Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau occupe La Position</em>'.
	 * @see spaceinvaders.Vaisseau_occupeLaPosition
	 * @generated
	 */
	EClass getVaisseau_occupeLaPosition();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_estOrdonneeCouverte <em>Vaisseau est Ordonnee Couverte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau est Ordonnee Couverte</em>'.
	 * @see spaceinvaders.Vaisseau_estOrdonneeCouverte
	 * @generated
	 */
	EClass getVaisseau_estOrdonneeCouverte();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_estAbscisseCouverte <em>Vaisseau est Abscisse Couverte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau est Abscisse Couverte</em>'.
	 * @see spaceinvaders.Vaisseau_estAbscisseCouverte
	 * @generated
	 */
	EClass getVaisseau_estAbscisseCouverte();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_ordonneeLaPlusBasse <em>Vaisseau ordonnee La Plus Basse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau ordonnee La Plus Basse</em>'.
	 * @see spaceinvaders.Vaisseau_ordonneeLaPlusBasse
	 * @generated
	 */
	EClass getVaisseau_ordonneeLaPlusBasse();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_ordonneeLaPlusHaute <em>Vaisseau ordonnee La Plus Haute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau ordonnee La Plus Haute</em>'.
	 * @see spaceinvaders.Vaisseau_ordonneeLaPlusHaute
	 * @generated
	 */
	EClass getVaisseau_ordonneeLaPlusHaute();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_abscisseLaPlusADroite <em>Vaisseau abscisse La Plus ADroite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau abscisse La Plus ADroite</em>'.
	 * @see spaceinvaders.Vaisseau_abscisseLaPlusADroite
	 * @generated
	 */
	EClass getVaisseau_abscisseLaPlusADroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_abscisseLaPlusAGauche <em>Vaisseau abscisse La Plus AGauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau abscisse La Plus AGauche</em>'.
	 * @see spaceinvaders.Vaisseau_abscisseLaPlusAGauche
	 * @generated
	 */
	EClass getVaisseau_abscisseLaPlusAGauche();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_seDeplacerVersLaDroite <em>Vaisseau se Deplacer Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau se Deplacer Vers La Droite</em>'.
	 * @see spaceinvaders.Vaisseau_seDeplacerVersLaDroite
	 * @generated
	 */
	EClass getVaisseau_seDeplacerVersLaDroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_seDeplacerVersLaGauche <em>Vaisseau se Deplacer Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau se Deplacer Vers La Gauche</em>'.
	 * @see spaceinvaders.Vaisseau_seDeplacerVersLaGauche
	 * @generated
	 */
	EClass getVaisseau_seDeplacerVersLaGauche();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_positionner <em>Vaisseau positionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau positionner</em>'.
	 * @see spaceinvaders.Vaisseau_positionner
	 * @generated
	 */
	EClass getVaisseau_positionner();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.Vaisseau_longueur <em>Vaisseau longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaisseau longueur</em>'.
	 * @see spaceinvaders.Vaisseau_longueur
	 * @generated
	 */
	EClass getVaisseau_longueur();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_SpacesInvaders <em>Spaces Invaders Spaces Invaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders Spaces Invaders</em>'.
	 * @see spaceinvaders.SpacesInvaders_SpacesInvaders
	 * @generated
	 */
	EClass getSpacesInvaders_SpacesInvaders();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_recupererEspaceJeuDansChaineASCII <em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>'.
	 * @see spaceinvaders.SpacesInvaders_recupererEspaceJeuDansChaineASCII
	 * @generated
	 */
	EClass getSpacesInvaders_recupererEspaceJeuDansChaineASCII();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_recupererMarqueDeLaPosition <em>Spaces Invaders recuperer Marque De La Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders recuperer Marque De La Position</em>'.
	 * @see spaceinvaders.SpacesInvaders_recupererMarqueDeLaPosition
	 * @generated
	 */
	EClass getSpacesInvaders_recupererMarqueDeLaPosition();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_aUnVaisseauQuiOccupeLaPosition <em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>'.
	 * @see spaceinvaders.SpacesInvaders_aUnVaisseauQuiOccupeLaPosition
	 * @generated
	 */
	EClass getSpacesInvaders_aUnVaisseauQuiOccupeLaPosition();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_aUnVaisseau <em>Spaces Invaders aUn Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders aUn Vaisseau</em>'.
	 * @see spaceinvaders.SpacesInvaders_aUnVaisseau
	 * @generated
	 */
	EClass getSpacesInvaders_aUnVaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_estDansEspaceJeu <em>Spaces Invaders est Dans Espace Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders est Dans Espace Jeu</em>'.
	 * @see spaceinvaders.SpacesInvaders_estDansEspaceJeu
	 * @generated
	 */
	EClass getSpacesInvaders_estDansEspaceJeu();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaDroite <em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>'.
	 * @see spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaDroite
	 * @generated
	 */
	EClass getSpacesInvaders_deplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaGauche <em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>'.
	 * @see spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaGauche
	 * @generated
	 */
	EClass getSpacesInvaders_deplacerVaisseauVersLaGauche();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>'.
	 * @see spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau
	 * @generated
	 */
	EClass getSpacesInvaders_positionnerUnNouveauVaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>'.
	 * @see spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau
	 * @generated
	 */
	EClass getSpacesInvaders_positionnerUnNouveauVaisseau();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest <em>Space Invader Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test</em>'.
	 * @see spaceinvaders.SpaceInvaderTest
	 * @generated
	 */
	EClass getSpaceInvaderTest();

	/**
	 * Returns the meta object for the reference '{@link spaceinvaders.SpaceInvaderTest#getSpaceinvaders <em>Spaceinvaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spaceinvaders</em>'.
	 * @see spaceinvaders.SpaceInvaderTest#getSpaceinvaders()
	 * @see #getSpaceInvaderTest()
	 * @generated
	 */
	EReference getSpaceInvaderTest_Spaceinvaders();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#initialisation() <em>Initialisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialisation</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#initialisation()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Initialisation();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_AuDebut_JeuSpaceInvaderEstVide() <em>Test Au Debut Jeu Space Invader Est Vide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Au Debut Jeu Space Invader Est Vide</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_AuDebut_JeuSpaceInvaderEstVide()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_AuDebut_JeuSpaceInvaderEstVide();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() <em>Test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() <em>Test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() <em>Test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() <em>Test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#VaisseauAvance_DeplacerVaisseauVersLaGauche() <em>Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#VaisseauAvance_DeplacerVaisseauVersLaGauche()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__VaisseauAvance_DeplacerVaisseauVersLaGauche();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#VaisseauImmobile_DeplacerVaisseauVersLaGauche() <em>Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#VaisseauImmobile_DeplacerVaisseauVersLaGauche()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__VaisseauImmobile_DeplacerVaisseauVersLaGauche();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_VaisseauAvance_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_VaisseauAvance_DeplacerVaisseauVersLaDroite()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_VaisseauAvance_DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_VaisseauImmobile_DeplacerVaisseauVersLaDroite()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for the '{@link spaceinvaders.SpaceInvaderTest#test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>' operation.
	 * @see spaceinvaders.SpaceInvaderTest#test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite()
	 * @generated
	 */
	EOperation getSpaceInvaderTest__Test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_initialisation <em>Space Invader Test initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test initialisation</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_initialisation
	 * @generated
	 */
	EClass getSpaceInvaderTest_initialisation();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide <em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu <em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException <em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu <em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement <em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche <em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche
	 * @generated
	 */
	EClass getSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche <em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche
	 * @generated
	 */
	EClass getSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite <em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite <em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite <em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>'.
	 * @see spaceinvaders.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite
	 * @generated
	 */
	EClass getSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();

	/**
	 * Returns the meta object for class '{@link spaceinvaders.NewClass1 <em>New Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Class1</em>'.
	 * @see spaceinvaders.NewClass1
	 * @generated
	 */
	EClass getNewClass1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpaceinvadersFactory getSpaceinvadersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvadersImpl <em>Spaces Invaders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvadersImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders()
		 * @generated
		 */
		EClass SPACES_INVADERS = eINSTANCE.getSpacesInvaders();

		/**
		 * The meta object literal for the '<em><b>MARQUE FIN LIGNE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACES_INVADERS__MARQUE_FIN_LIGNE = eINSTANCE.getSpacesInvaders_MARQUE_FIN_LIGNE();

		/**
		 * The meta object literal for the '<em><b>MARQUE VIDE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACES_INVADERS__MARQUE_VIDE = eINSTANCE.getSpacesInvaders_MARQUE_VIDE();

		/**
		 * The meta object literal for the '<em><b>MARQUE VAISSEAU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACES_INVADERS__MARQUE_VAISSEAU = eINSTANCE.getSpacesInvaders_MARQUE_VAISSEAU();

		/**
		 * The meta object literal for the '<em><b>Longueur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACES_INVADERS__LONGUEUR = eINSTANCE.getSpacesInvaders_Longueur();

		/**
		 * The meta object literal for the '<em><b>Hauteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACES_INVADERS__HAUTEUR = eINSTANCE.getSpacesInvaders_Hauteur();

		/**
		 * The meta object literal for the '<em><b>Vaisseau</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACES_INVADERS__VAISSEAU = eINSTANCE.getSpacesInvaders_Vaisseau();

		/**
		 * The meta object literal for the '<em><b>Spaces Invaders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___SPACES_INVADERS__INT_INT = eINSTANCE.getSpacesInvaders__SpacesInvaders__int_int();

		/**
		 * The meta object literal for the '<em><b>Recuperer Espace Jeu Dans Chaine ASCII</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII = eINSTANCE.getSpacesInvaders__RecupererEspaceJeuDansChaineASCII();

		/**
		 * The meta object literal for the '<em><b>Recuperer Marque De La Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___RECUPERER_MARQUE_DE_LA_POSITION__INT = eINSTANCE.getSpacesInvaders__RecupererMarqueDeLaPosition__int();

		/**
		 * The meta object literal for the '<em><b>AUn Vaisseau Qui Occupe La Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT = eINSTANCE.getSpacesInvaders__AUnVaisseauQuiOccupeLaPosition__int_int();

		/**
		 * The meta object literal for the '<em><b>AUn Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___AUN_VAISSEAU = eINSTANCE.getSpacesInvaders__AUnVaisseau();

		/**
		 * The meta object literal for the '<em><b>Est Dans Espace Jeu</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___EST_DANS_ESPACE_JEU__INT_INT = eINSTANCE.getSpacesInvaders__EstDansEspaceJeu__int_int();

		/**
		 * The meta object literal for the '<em><b>Deplacer Vaisseau Vers La Droite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpacesInvaders__DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '<em><b>Deplacer Vaisseau Vers La Gauche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_GAUCHE = eINSTANCE.getSpacesInvaders__DeplacerVaisseauVersLaGauche();

		/**
		 * The meta object literal for the '<em><b>Positionner Un Nouveau Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT = eINSTANCE.getSpacesInvaders__PositionnerUnNouveauVaisseau__int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Positionner Un Nouveau Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT = eINSTANCE.getSpacesInvaders__PositionnerUnNouveauVaisseau__Dimension_Position_int();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.VaisseauImpl <em>Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.VaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau()
		 * @generated
		 */
		EClass VAISSEAU = eINSTANCE.getVaisseau();

		/**
		 * The meta object literal for the '<em><b>Origine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAISSEAU__ORIGINE = eINSTANCE.getVaisseau_Origine();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAISSEAU__DIMENSION = eINSTANCE.getVaisseau_Dimension();

		/**
		 * The meta object literal for the '<em><b>Vitesse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAISSEAU__VITESSE = eINSTANCE.getVaisseau_Vitesse();

		/**
		 * The meta object literal for the '<em><b>Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___VAISSEAU__INT_INT = eINSTANCE.getVaisseau__Vaisseau__int_int();

		/**
		 * The meta object literal for the '<em><b>Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___VAISSEAU__INT_INT_INT_INT = eINSTANCE.getVaisseau__Vaisseau__int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Occupe La Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___OCCUPE_LA_POSITION__INT_INT = eINSTANCE.getVaisseau__OccupeLaPosition__int_int();

		/**
		 * The meta object literal for the '<em><b>Est Ordonnee Couverte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___EST_ORDONNEE_COUVERTE__INT = eINSTANCE.getVaisseau__EstOrdonneeCouverte__int();

		/**
		 * The meta object literal for the '<em><b>Est Abscisse Couverte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___EST_ABSCISSE_COUVERTE__INT = eINSTANCE.getVaisseau__EstAbscisseCouverte__int();

		/**
		 * The meta object literal for the '<em><b>Ordonnee La Plus Basse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___ORDONNEE_LA_PLUS_BASSE = eINSTANCE.getVaisseau__OrdonneeLaPlusBasse();

		/**
		 * The meta object literal for the '<em><b>Ordonnee La Plus Haute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___ORDONNEE_LA_PLUS_HAUTE = eINSTANCE.getVaisseau__OrdonneeLaPlusHaute();

		/**
		 * The meta object literal for the '<em><b>Abscisse La Plus ADroite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___ABSCISSE_LA_PLUS_ADROITE = eINSTANCE.getVaisseau__AbscisseLaPlusADroite();

		/**
		 * The meta object literal for the '<em><b>Abscisse La Plus AGauche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___ABSCISSE_LA_PLUS_AGAUCHE = eINSTANCE.getVaisseau__AbscisseLaPlusAGauche();

		/**
		 * The meta object literal for the '<em><b>Se Deplacer Vers La Droite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___SE_DEPLACER_VERS_LA_DROITE = eINSTANCE.getVaisseau__SeDeplacerVersLaDroite();

		/**
		 * The meta object literal for the '<em><b>Se Deplacer Vers La Gauche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___SE_DEPLACER_VERS_LA_GAUCHE = eINSTANCE.getVaisseau__SeDeplacerVersLaGauche();

		/**
		 * The meta object literal for the '<em><b>Positionner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___POSITIONNER__INT_INT = eINSTANCE.getVaisseau__Positionner__int_int();

		/**
		 * The meta object literal for the '<em><b>Longueur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___LONGUEUR = eINSTANCE.getVaisseau__Longueur();

		/**
		 * The meta object literal for the '<em><b>Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___VAISSEAU__DIMENSION_POSITION_INT = eINSTANCE.getVaisseau__Vaisseau__Dimension_Position_int();

		/**
		 * The meta object literal for the '<em><b>Vaisseau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VAISSEAU___VAISSEAU__DIMENSION_POSITION = eINSTANCE.getVaisseau__Vaisseau__Dimension_Position();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.PositionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___POSITION__INT_INT = eINSTANCE.getPosition__Position__int_int();

		/**
		 * The meta object literal for the '<em><b>Abscisse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___ABSCISSE = eINSTANCE.getPosition__Abscisse();

		/**
		 * The meta object literal for the '<em><b>Ordonnee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___ORDONNEE = eINSTANCE.getPosition__Ordonnee();

		/**
		 * The meta object literal for the '<em><b>Changer Abscisse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___CHANGER_ABSCISSE__INT = eINSTANCE.getPosition__ChangerAbscisse__int();

		/**
		 * The meta object literal for the '<em><b>Changer Ordonnee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___CHANGER_ORDONNEE__INT = eINSTANCE.getPosition__ChangerOrdonnee__int();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Position_PositionImpl <em>Position Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Position_PositionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_Position()
		 * @generated
		 */
		EClass POSITION_POSITION = eINSTANCE.getPosition_Position();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Position_abscisseImpl <em>Position abscisse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Position_abscisseImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_abscisse()
		 * @generated
		 */
		EClass POSITION_ABSCISSE = eINSTANCE.getPosition_abscisse();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Position_ordonneeImpl <em>Position ordonnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Position_ordonneeImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_ordonnee()
		 * @generated
		 */
		EClass POSITION_ORDONNEE = eINSTANCE.getPosition_ordonnee();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Position_changerAbscisseImpl <em>Position changer Abscisse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Position_changerAbscisseImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_changerAbscisse()
		 * @generated
		 */
		EClass POSITION_CHANGER_ABSCISSE = eINSTANCE.getPosition_changerAbscisse();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Position_changerOrdonneeImpl <em>Position changer Ordonnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Position_changerOrdonneeImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getPosition_changerOrdonnee()
		 * @generated
		 */
		EClass POSITION_CHANGER_ORDONNEE = eINSTANCE.getPosition_changerOrdonnee();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.DimensionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Longueur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__LONGUEUR = eINSTANCE.getDimension_Longueur();

		/**
		 * The meta object literal for the '<em><b>Hauteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HAUTEUR = eINSTANCE.getDimension_Hauteur();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIMENSION___DIMENSION__INT_INT = eINSTANCE.getDimension__Dimension__int_int();

		/**
		 * The meta object literal for the '<em><b>Longueur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIMENSION___LONGUEUR = eINSTANCE.getDimension__Longueur();

		/**
		 * The meta object literal for the '<em><b>Hauteur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIMENSION___HAUTEUR = eINSTANCE.getDimension__Hauteur();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Dimension_DimensionImpl <em>Dimension Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Dimension_DimensionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension_Dimension()
		 * @generated
		 */
		EClass DIMENSION_DIMENSION = eINSTANCE.getDimension_Dimension();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Dimension_longueurImpl <em>Dimension longueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Dimension_longueurImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension_longueur()
		 * @generated
		 */
		EClass DIMENSION_LONGUEUR = eINSTANCE.getDimension_longueur();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Dimension_hauteurImpl <em>Dimension hauteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Dimension_hauteurImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getDimension_hauteur()
		 * @generated
		 */
		EClass DIMENSION_HAUTEUR = eINSTANCE.getDimension_hauteur();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
		 * @generated
		 */
		EClass VAISSEAU_VAISSEAU = eINSTANCE.getVaisseau_Vaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
		 * @generated
		 */
		EClass VAISSEAU_VAISSEAU = eINSTANCE.getVaisseau_Vaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
		 * @generated
		 */
		EClass VAISSEAU_VAISSEAU = eINSTANCE.getVaisseau_Vaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_VaisseauImpl <em>Vaisseau Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_VaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_Vaisseau()
		 * @generated
		 */
		EClass VAISSEAU_VAISSEAU = eINSTANCE.getVaisseau_Vaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_occupeLaPositionImpl <em>Vaisseau occupe La Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_occupeLaPositionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_occupeLaPosition()
		 * @generated
		 */
		EClass VAISSEAU_OCCUPE_LA_POSITION = eINSTANCE.getVaisseau_occupeLaPosition();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_estOrdonneeCouverteImpl <em>Vaisseau est Ordonnee Couverte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_estOrdonneeCouverteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_estOrdonneeCouverte()
		 * @generated
		 */
		EClass VAISSEAU_EST_ORDONNEE_COUVERTE = eINSTANCE.getVaisseau_estOrdonneeCouverte();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_estAbscisseCouverteImpl <em>Vaisseau est Abscisse Couverte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_estAbscisseCouverteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_estAbscisseCouverte()
		 * @generated
		 */
		EClass VAISSEAU_EST_ABSCISSE_COUVERTE = eINSTANCE.getVaisseau_estAbscisseCouverte();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_ordonneeLaPlusBasseImpl <em>Vaisseau ordonnee La Plus Basse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_ordonneeLaPlusBasseImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_ordonneeLaPlusBasse()
		 * @generated
		 */
		EClass VAISSEAU_ORDONNEE_LA_PLUS_BASSE = eINSTANCE.getVaisseau_ordonneeLaPlusBasse();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_ordonneeLaPlusHauteImpl <em>Vaisseau ordonnee La Plus Haute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_ordonneeLaPlusHauteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_ordonneeLaPlusHaute()
		 * @generated
		 */
		EClass VAISSEAU_ORDONNEE_LA_PLUS_HAUTE = eINSTANCE.getVaisseau_ordonneeLaPlusHaute();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_abscisseLaPlusADroiteImpl <em>Vaisseau abscisse La Plus ADroite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_abscisseLaPlusADroiteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_abscisseLaPlusADroite()
		 * @generated
		 */
		EClass VAISSEAU_ABSCISSE_LA_PLUS_ADROITE = eINSTANCE.getVaisseau_abscisseLaPlusADroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_abscisseLaPlusAGaucheImpl <em>Vaisseau abscisse La Plus AGauche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_abscisseLaPlusAGaucheImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_abscisseLaPlusAGauche()
		 * @generated
		 */
		EClass VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE = eINSTANCE.getVaisseau_abscisseLaPlusAGauche();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_seDeplacerVersLaDroiteImpl <em>Vaisseau se Deplacer Vers La Droite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_seDeplacerVersLaDroiteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_seDeplacerVersLaDroite()
		 * @generated
		 */
		EClass VAISSEAU_SE_DEPLACER_VERS_LA_DROITE = eINSTANCE.getVaisseau_seDeplacerVersLaDroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_seDeplacerVersLaGaucheImpl <em>Vaisseau se Deplacer Vers La Gauche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_seDeplacerVersLaGaucheImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_seDeplacerVersLaGauche()
		 * @generated
		 */
		EClass VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE = eINSTANCE.getVaisseau_seDeplacerVersLaGauche();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_positionnerImpl <em>Vaisseau positionner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_positionnerImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_positionner()
		 * @generated
		 */
		EClass VAISSEAU_POSITIONNER = eINSTANCE.getVaisseau_positionner();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.Vaisseau_longueurImpl <em>Vaisseau longueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.Vaisseau_longueurImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getVaisseau_longueur()
		 * @generated
		 */
		EClass VAISSEAU_LONGUEUR = eINSTANCE.getVaisseau_longueur();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_SpacesInvadersImpl <em>Spaces Invaders Spaces Invaders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_SpacesInvadersImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_SpacesInvaders()
		 * @generated
		 */
		EClass SPACES_INVADERS_SPACES_INVADERS = eINSTANCE.getSpacesInvaders_SpacesInvaders();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_recupererEspaceJeuDansChaineASCIIImpl <em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_recupererEspaceJeuDansChaineASCIIImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_recupererEspaceJeuDansChaineASCII()
		 * @generated
		 */
		EClass SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII = eINSTANCE.getSpacesInvaders_recupererEspaceJeuDansChaineASCII();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_recupererMarqueDeLaPositionImpl <em>Spaces Invaders recuperer Marque De La Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_recupererMarqueDeLaPositionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_recupererMarqueDeLaPosition()
		 * @generated
		 */
		EClass SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION = eINSTANCE.getSpacesInvaders_recupererMarqueDeLaPosition();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_aUnVaisseauQuiOccupeLaPositionImpl <em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_aUnVaisseauQuiOccupeLaPositionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_aUnVaisseauQuiOccupeLaPosition()
		 * @generated
		 */
		EClass SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION = eINSTANCE.getSpacesInvaders_aUnVaisseauQuiOccupeLaPosition();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_aUnVaisseauImpl <em>Spaces Invaders aUn Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_aUnVaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_aUnVaisseau()
		 * @generated
		 */
		EClass SPACES_INVADERS_AUN_VAISSEAU = eINSTANCE.getSpacesInvaders_aUnVaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_estDansEspaceJeuImpl <em>Spaces Invaders est Dans Espace Jeu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_estDansEspaceJeuImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_estDansEspaceJeu()
		 * @generated
		 */
		EClass SPACES_INVADERS_EST_DANS_ESPACE_JEU = eINSTANCE.getSpacesInvaders_estDansEspaceJeu();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaDroiteImpl <em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaDroiteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_deplacerVaisseauVersLaDroite()
		 * @generated
		 */
		EClass SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpacesInvaders_deplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaGaucheImpl <em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_deplacerVaisseauVersLaGaucheImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_deplacerVaisseauVersLaGauche()
		 * @generated
		 */
		EClass SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = eINSTANCE.getSpacesInvaders_deplacerVaisseauVersLaGauche();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_positionnerUnNouveauVaisseau()
		 * @generated
		 */
		EClass SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU = eINSTANCE.getSpacesInvaders_positionnerUnNouveauVaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpacesInvaders_positionnerUnNouveauVaisseauImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpacesInvaders_positionnerUnNouveauVaisseau()
		 * @generated
		 */
		EClass SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU = eINSTANCE.getSpacesInvaders_positionnerUnNouveauVaisseau();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTestImpl <em>Space Invader Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTestImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST = eINSTANCE.getSpaceInvaderTest();

		/**
		 * The meta object literal for the '<em><b>Spaceinvaders</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_INVADER_TEST__SPACEINVADERS = eINSTANCE.getSpaceInvaderTest_Spaceinvaders();

		/**
		 * The meta object literal for the '<em><b>Initialisation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___INITIALISATION = eINSTANCE.getSpaceInvaderTest__Initialisation();

		/**
		 * The meta object literal for the '<em><b>Test Au Debut Jeu Space Invader Est Vide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE = eINSTANCE.getSpaceInvaderTest__Test_AuDebut_JeuSpaceInvaderEstVide();

		/**
		 * The meta object literal for the '<em><b>Test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = eINSTANCE.getSpaceInvaderTest__Test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();

		/**
		 * The meta object literal for the '<em><b>Test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION = eINSTANCE.getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();

		/**
		 * The meta object literal for the '<em><b>Test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = eINSTANCE.getSpaceInvaderTest__Test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();

		/**
		 * The meta object literal for the '<em><b>Test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT = eINSTANCE.getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();

		/**
		 * The meta object literal for the '<em><b>Vaisseau Avance Deplacer Vaisseau Vers La Gauche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = eINSTANCE.getSpaceInvaderTest__VaisseauAvance_DeplacerVaisseauVersLaGauche();

		/**
		 * The meta object literal for the '<em><b>Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = eINSTANCE.getSpaceInvaderTest__VaisseauImmobile_DeplacerVaisseauVersLaGauche();

		/**
		 * The meta object literal for the '<em><b>Test Vaisseau Avance Deplacer Vaisseau Vers La Droite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpaceInvaderTest__Test_VaisseauAvance_DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '<em><b>Test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpaceInvaderTest__Test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '<em><b>Test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpaceInvaderTest__Test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_initialisationImpl <em>Space Invader Test initialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_initialisationImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_initialisation()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_INITIALISATION = eINSTANCE.getSpaceInvaderTest_initialisation();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideImpl <em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE = eINSTANCE.getSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuImpl <em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = eINSTANCE.getSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionImpl <em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION = eINSTANCE.getSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuImpl <em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU = eINSTANCE.getSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementImpl <em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT = eINSTANCE.getSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheImpl <em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = eINSTANCE.getSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheImpl <em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE = eINSTANCE.getSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteImpl <em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteImpl <em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteImpl <em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteImpl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite()
		 * @generated
		 */
		EClass SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE = eINSTANCE.getSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();

		/**
		 * The meta object literal for the '{@link spaceinvaders.impl.NewClass1Impl <em>New Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spaceinvaders.impl.NewClass1Impl
		 * @see spaceinvaders.impl.SpaceinvadersPackageImpl#getNewClass1()
		 * @generated
		 */
		EClass NEW_CLASS1 = eINSTANCE.getNewClass1();

	}

} //SpaceinvadersPackage
