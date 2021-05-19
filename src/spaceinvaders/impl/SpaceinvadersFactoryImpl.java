/**
 */
package spaceinvaders.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spaceinvaders.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceinvadersFactoryImpl extends EFactoryImpl implements SpaceinvadersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpaceinvadersFactory init() {
		try {
			SpaceinvadersFactory theSpaceinvadersFactory = (SpaceinvadersFactory)EPackage.Registry.INSTANCE.getEFactory(SpaceinvadersPackage.eNS_URI);
			if (theSpaceinvadersFactory != null) {
				return theSpaceinvadersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpaceinvadersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceinvadersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpaceinvadersPackage.SPACES_INVADERS: return createSpacesInvaders();
			case SpaceinvadersPackage.VAISSEAU: return createVaisseau();
			case SpaceinvadersPackage.POSITION: return createPosition();
			case SpaceinvadersPackage.POSITION_POSITION: return createPosition_Position();
			case SpaceinvadersPackage.POSITION_ABSCISSE: return createPosition_abscisse();
			case SpaceinvadersPackage.POSITION_ORDONNEE: return createPosition_ordonnee();
			case SpaceinvadersPackage.POSITION_CHANGER_ABSCISSE: return createPosition_changerAbscisse();
			case SpaceinvadersPackage.POSITION_CHANGER_ORDONNEE: return createPosition_changerOrdonnee();
			case SpaceinvadersPackage.DIMENSION: return createDimension();
			case SpaceinvadersPackage.DIMENSION_DIMENSION: return createDimension_Dimension();
			case SpaceinvadersPackage.DIMENSION_LONGUEUR: return createDimension_longueur();
			case SpaceinvadersPackage.DIMENSION_HAUTEUR: return createDimension_hauteur();
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: return createVaisseau_Vaisseau();
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: return createVaisseau_Vaisseau();
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: return createVaisseau_Vaisseau();
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: return createVaisseau_Vaisseau();
			case SpaceinvadersPackage.VAISSEAU_OCCUPE_LA_POSITION: return createVaisseau_occupeLaPosition();
			case SpaceinvadersPackage.VAISSEAU_EST_ORDONNEE_COUVERTE: return createVaisseau_estOrdonneeCouverte();
			case SpaceinvadersPackage.VAISSEAU_EST_ABSCISSE_COUVERTE: return createVaisseau_estAbscisseCouverte();
			case SpaceinvadersPackage.VAISSEAU_ORDONNEE_LA_PLUS_BASSE: return createVaisseau_ordonneeLaPlusBasse();
			case SpaceinvadersPackage.VAISSEAU_ORDONNEE_LA_PLUS_HAUTE: return createVaisseau_ordonneeLaPlusHaute();
			case SpaceinvadersPackage.VAISSEAU_ABSCISSE_LA_PLUS_ADROITE: return createVaisseau_abscisseLaPlusADroite();
			case SpaceinvadersPackage.VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE: return createVaisseau_abscisseLaPlusAGauche();
			case SpaceinvadersPackage.VAISSEAU_SE_DEPLACER_VERS_LA_DROITE: return createVaisseau_seDeplacerVersLaDroite();
			case SpaceinvadersPackage.VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE: return createVaisseau_seDeplacerVersLaGauche();
			case SpaceinvadersPackage.VAISSEAU_POSITIONNER: return createVaisseau_positionner();
			case SpaceinvadersPackage.VAISSEAU_LONGUEUR: return createVaisseau_longueur();
			case SpaceinvadersPackage.SPACES_INVADERS_SPACES_INVADERS: return createSpacesInvaders_SpacesInvaders();
			case SpaceinvadersPackage.SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII: return createSpacesInvaders_recupererEspaceJeuDansChaineASCII();
			case SpaceinvadersPackage.SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION: return createSpacesInvaders_recupererMarqueDeLaPosition();
			case SpaceinvadersPackage.SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION: return createSpacesInvaders_aUnVaisseauQuiOccupeLaPosition();
			case SpaceinvadersPackage.SPACES_INVADERS_AUN_VAISSEAU: return createSpacesInvaders_aUnVaisseau();
			case SpaceinvadersPackage.SPACES_INVADERS_EST_DANS_ESPACE_JEU: return createSpacesInvaders_estDansEspaceJeu();
			case SpaceinvadersPackage.SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE: return createSpacesInvaders_deplacerVaisseauVersLaDroite();
			case SpaceinvadersPackage.SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE: return createSpacesInvaders_deplacerVaisseauVersLaGauche();
			case SpaceinvadersPackage.SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU: return createSpacesInvaders_positionnerUnNouveauVaisseau();
			case SpaceinvadersPackage.SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU: return createSpacesInvaders_positionnerUnNouveauVaisseau();
			case SpaceinvadersPackage.SPACE_INVADER_TEST: return createSpaceInvaderTest();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_INITIALISATION: return createSpaceInvaderTest_initialisation();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE: return createSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU: return createSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION: return createSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU: return createSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT: return createSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE: return createSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE: return createSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE: return createSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE: return createSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE: return createSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();
			case SpaceinvadersPackage.NEW_CLASS1: return createNewClass1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders createSpacesInvaders() {
		SpacesInvadersImpl spacesInvaders = new SpacesInvadersImpl();
		return spacesInvaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau createVaisseau() {
		VaisseauImpl vaisseau = new VaisseauImpl();
		return vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_Position createPosition_Position() {
		Position_PositionImpl position_Position = new Position_PositionImpl();
		return position_Position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_abscisse createPosition_abscisse() {
		Position_abscisseImpl position_abscisse = new Position_abscisseImpl();
		return position_abscisse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_ordonnee createPosition_ordonnee() {
		Position_ordonneeImpl position_ordonnee = new Position_ordonneeImpl();
		return position_ordonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_changerAbscisse createPosition_changerAbscisse() {
		Position_changerAbscisseImpl position_changerAbscisse = new Position_changerAbscisseImpl();
		return position_changerAbscisse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_changerOrdonnee createPosition_changerOrdonnee() {
		Position_changerOrdonneeImpl position_changerOrdonnee = new Position_changerOrdonneeImpl();
		return position_changerOrdonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension_Dimension createDimension_Dimension() {
		Dimension_DimensionImpl dimension_Dimension = new Dimension_DimensionImpl();
		return dimension_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension_longueur createDimension_longueur() {
		Dimension_longueurImpl dimension_longueur = new Dimension_longueurImpl();
		return dimension_longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension_hauteur createDimension_hauteur() {
		Dimension_hauteurImpl dimension_hauteur = new Dimension_hauteurImpl();
		return dimension_hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_Vaisseau createVaisseau_Vaisseau() {
		Vaisseau_VaisseauImpl vaisseau_Vaisseau = new Vaisseau_VaisseauImpl();
		return vaisseau_Vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_Vaisseau createVaisseau_Vaisseau() {
		Vaisseau_VaisseauImpl vaisseau_Vaisseau = new Vaisseau_VaisseauImpl();
		return vaisseau_Vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_Vaisseau createVaisseau_Vaisseau() {
		Vaisseau_VaisseauImpl vaisseau_Vaisseau = new Vaisseau_VaisseauImpl();
		return vaisseau_Vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_Vaisseau createVaisseau_Vaisseau() {
		Vaisseau_VaisseauImpl vaisseau_Vaisseau = new Vaisseau_VaisseauImpl();
		return vaisseau_Vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_occupeLaPosition createVaisseau_occupeLaPosition() {
		Vaisseau_occupeLaPositionImpl vaisseau_occupeLaPosition = new Vaisseau_occupeLaPositionImpl();
		return vaisseau_occupeLaPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_estOrdonneeCouverte createVaisseau_estOrdonneeCouverte() {
		Vaisseau_estOrdonneeCouverteImpl vaisseau_estOrdonneeCouverte = new Vaisseau_estOrdonneeCouverteImpl();
		return vaisseau_estOrdonneeCouverte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_estAbscisseCouverte createVaisseau_estAbscisseCouverte() {
		Vaisseau_estAbscisseCouverteImpl vaisseau_estAbscisseCouverte = new Vaisseau_estAbscisseCouverteImpl();
		return vaisseau_estAbscisseCouverte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_ordonneeLaPlusBasse createVaisseau_ordonneeLaPlusBasse() {
		Vaisseau_ordonneeLaPlusBasseImpl vaisseau_ordonneeLaPlusBasse = new Vaisseau_ordonneeLaPlusBasseImpl();
		return vaisseau_ordonneeLaPlusBasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_ordonneeLaPlusHaute createVaisseau_ordonneeLaPlusHaute() {
		Vaisseau_ordonneeLaPlusHauteImpl vaisseau_ordonneeLaPlusHaute = new Vaisseau_ordonneeLaPlusHauteImpl();
		return vaisseau_ordonneeLaPlusHaute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_abscisseLaPlusADroite createVaisseau_abscisseLaPlusADroite() {
		Vaisseau_abscisseLaPlusADroiteImpl vaisseau_abscisseLaPlusADroite = new Vaisseau_abscisseLaPlusADroiteImpl();
		return vaisseau_abscisseLaPlusADroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_abscisseLaPlusAGauche createVaisseau_abscisseLaPlusAGauche() {
		Vaisseau_abscisseLaPlusAGaucheImpl vaisseau_abscisseLaPlusAGauche = new Vaisseau_abscisseLaPlusAGaucheImpl();
		return vaisseau_abscisseLaPlusAGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_seDeplacerVersLaDroite createVaisseau_seDeplacerVersLaDroite() {
		Vaisseau_seDeplacerVersLaDroiteImpl vaisseau_seDeplacerVersLaDroite = new Vaisseau_seDeplacerVersLaDroiteImpl();
		return vaisseau_seDeplacerVersLaDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_seDeplacerVersLaGauche createVaisseau_seDeplacerVersLaGauche() {
		Vaisseau_seDeplacerVersLaGaucheImpl vaisseau_seDeplacerVersLaGauche = new Vaisseau_seDeplacerVersLaGaucheImpl();
		return vaisseau_seDeplacerVersLaGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_positionner createVaisseau_positionner() {
		Vaisseau_positionnerImpl vaisseau_positionner = new Vaisseau_positionnerImpl();
		return vaisseau_positionner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau_longueur createVaisseau_longueur() {
		Vaisseau_longueurImpl vaisseau_longueur = new Vaisseau_longueurImpl();
		return vaisseau_longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_SpacesInvaders createSpacesInvaders_SpacesInvaders() {
		SpacesInvaders_SpacesInvadersImpl spacesInvaders_SpacesInvaders = new SpacesInvaders_SpacesInvadersImpl();
		return spacesInvaders_SpacesInvaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_recupererEspaceJeuDansChaineASCII createSpacesInvaders_recupererEspaceJeuDansChaineASCII() {
		SpacesInvaders_recupererEspaceJeuDansChaineASCIIImpl spacesInvaders_recupererEspaceJeuDansChaineASCII = new SpacesInvaders_recupererEspaceJeuDansChaineASCIIImpl();
		return spacesInvaders_recupererEspaceJeuDansChaineASCII;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_recupererMarqueDeLaPosition createSpacesInvaders_recupererMarqueDeLaPosition() {
		SpacesInvaders_recupererMarqueDeLaPositionImpl spacesInvaders_recupererMarqueDeLaPosition = new SpacesInvaders_recupererMarqueDeLaPositionImpl();
		return spacesInvaders_recupererMarqueDeLaPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_aUnVaisseauQuiOccupeLaPosition createSpacesInvaders_aUnVaisseauQuiOccupeLaPosition() {
		SpacesInvaders_aUnVaisseauQuiOccupeLaPositionImpl spacesInvaders_aUnVaisseauQuiOccupeLaPosition = new SpacesInvaders_aUnVaisseauQuiOccupeLaPositionImpl();
		return spacesInvaders_aUnVaisseauQuiOccupeLaPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_aUnVaisseau createSpacesInvaders_aUnVaisseau() {
		SpacesInvaders_aUnVaisseauImpl spacesInvaders_aUnVaisseau = new SpacesInvaders_aUnVaisseauImpl();
		return spacesInvaders_aUnVaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_estDansEspaceJeu createSpacesInvaders_estDansEspaceJeu() {
		SpacesInvaders_estDansEspaceJeuImpl spacesInvaders_estDansEspaceJeu = new SpacesInvaders_estDansEspaceJeuImpl();
		return spacesInvaders_estDansEspaceJeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_deplacerVaisseauVersLaDroite createSpacesInvaders_deplacerVaisseauVersLaDroite() {
		SpacesInvaders_deplacerVaisseauVersLaDroiteImpl spacesInvaders_deplacerVaisseauVersLaDroite = new SpacesInvaders_deplacerVaisseauVersLaDroiteImpl();
		return spacesInvaders_deplacerVaisseauVersLaDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_deplacerVaisseauVersLaGauche createSpacesInvaders_deplacerVaisseauVersLaGauche() {
		SpacesInvaders_deplacerVaisseauVersLaGaucheImpl spacesInvaders_deplacerVaisseauVersLaGauche = new SpacesInvaders_deplacerVaisseauVersLaGaucheImpl();
		return spacesInvaders_deplacerVaisseauVersLaGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_positionnerUnNouveauVaisseau createSpacesInvaders_positionnerUnNouveauVaisseau() {
		SpacesInvaders_positionnerUnNouveauVaisseauImpl spacesInvaders_positionnerUnNouveauVaisseau = new SpacesInvaders_positionnerUnNouveauVaisseauImpl();
		return spacesInvaders_positionnerUnNouveauVaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders_positionnerUnNouveauVaisseau createSpacesInvaders_positionnerUnNouveauVaisseau() {
		SpacesInvaders_positionnerUnNouveauVaisseauImpl spacesInvaders_positionnerUnNouveauVaisseau = new SpacesInvaders_positionnerUnNouveauVaisseauImpl();
		return spacesInvaders_positionnerUnNouveauVaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest createSpaceInvaderTest() {
		SpaceInvaderTestImpl spaceInvaderTest = new SpaceInvaderTestImpl();
		return spaceInvaderTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_initialisation createSpaceInvaderTest_initialisation() {
		SpaceInvaderTest_initialisationImpl spaceInvaderTest_initialisation = new SpaceInvaderTest_initialisationImpl();
		return spaceInvaderTest_initialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide createSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide() {
		SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideImpl spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide = new SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideImpl();
		return spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu createSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuImpl spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu = new SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuImpl();
		return spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException createSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
		SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionImpl spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException = new SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionImpl();
		return spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu createSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuImpl spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu = new SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuImpl();
		return spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement createSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() {
		SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementImpl spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement = new SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementImpl();
		return spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche createSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche() {
		SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheImpl spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche = new SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheImpl();
		return spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche createSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
		SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheImpl spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche = new SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheImpl();
		return spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite createSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
		SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteImpl spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite = new SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteImpl();
		return spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite createSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
		SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteImpl spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite = new SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteImpl();
		return spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite createSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() {
		SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteImpl spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite = new SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteImpl();
		return spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewClass1 createNewClass1() {
		NewClass1Impl newClass1 = new NewClass1Impl();
		return newClass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceinvadersPackage getSpaceinvadersPackage() {
		return (SpaceinvadersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpaceinvadersPackage getPackage() {
		return SpaceinvadersPackage.eINSTANCE;
	}

} //SpaceinvadersFactoryImpl
