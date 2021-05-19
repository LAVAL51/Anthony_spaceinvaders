/**
 */
package spaceinvaders.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import spaceinvaders.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see spaceinvaders.SpaceinvadersPackage
 * @generated
 */
public class SpaceinvadersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpaceinvadersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceinvadersSwitch() {
		if (modelPackage == null) {
			modelPackage = SpaceinvadersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpaceinvadersPackage.SPACES_INVADERS: {
				SpacesInvaders spacesInvaders = (SpacesInvaders)theEObject;
				T result = caseSpacesInvaders(spacesInvaders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU: {
				Vaisseau vaisseau = (Vaisseau)theEObject;
				T result = caseVaisseau(vaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.POSITION_POSITION: {
				Position_Position position_Position = (Position_Position)theEObject;
				T result = casePosition_Position(position_Position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.POSITION_ABSCISSE: {
				Position_abscisse position_abscisse = (Position_abscisse)theEObject;
				T result = casePosition_abscisse(position_abscisse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.POSITION_ORDONNEE: {
				Position_ordonnee position_ordonnee = (Position_ordonnee)theEObject;
				T result = casePosition_ordonnee(position_ordonnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.POSITION_CHANGER_ABSCISSE: {
				Position_changerAbscisse position_changerAbscisse = (Position_changerAbscisse)theEObject;
				T result = casePosition_changerAbscisse(position_changerAbscisse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.POSITION_CHANGER_ORDONNEE: {
				Position_changerOrdonnee position_changerOrdonnee = (Position_changerOrdonnee)theEObject;
				T result = casePosition_changerOrdonnee(position_changerOrdonnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.DIMENSION_DIMENSION: {
				Dimension_Dimension dimension_Dimension = (Dimension_Dimension)theEObject;
				T result = caseDimension_Dimension(dimension_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.DIMENSION_LONGUEUR: {
				Dimension_longueur dimension_longueur = (Dimension_longueur)theEObject;
				T result = caseDimension_longueur(dimension_longueur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.DIMENSION_HAUTEUR: {
				Dimension_hauteur dimension_hauteur = (Dimension_hauteur)theEObject;
				T result = caseDimension_hauteur(dimension_hauteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: {
				Vaisseau_Vaisseau vaisseau_Vaisseau = (Vaisseau_Vaisseau)theEObject;
				T result = caseVaisseau_Vaisseau(vaisseau_Vaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: {
				Vaisseau_Vaisseau vaisseau_Vaisseau = (Vaisseau_Vaisseau)theEObject;
				T result = caseSpaceinvaders_Vaisseau_Vaisseau(vaisseau_Vaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: {
				Vaisseau_Vaisseau vaisseau_Vaisseau = (Vaisseau_Vaisseau)theEObject;
				T result = caseVaisseau_Vaisseau_1(vaisseau_Vaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_VAISSEAU: {
				Vaisseau_Vaisseau vaisseau_Vaisseau = (Vaisseau_Vaisseau)theEObject;
				T result = caseVaisseau_Vaisseau_2(vaisseau_Vaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_OCCUPE_LA_POSITION: {
				Vaisseau_occupeLaPosition vaisseau_occupeLaPosition = (Vaisseau_occupeLaPosition)theEObject;
				T result = caseVaisseau_occupeLaPosition(vaisseau_occupeLaPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_EST_ORDONNEE_COUVERTE: {
				Vaisseau_estOrdonneeCouverte vaisseau_estOrdonneeCouverte = (Vaisseau_estOrdonneeCouverte)theEObject;
				T result = caseVaisseau_estOrdonneeCouverte(vaisseau_estOrdonneeCouverte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_EST_ABSCISSE_COUVERTE: {
				Vaisseau_estAbscisseCouverte vaisseau_estAbscisseCouverte = (Vaisseau_estAbscisseCouverte)theEObject;
				T result = caseVaisseau_estAbscisseCouverte(vaisseau_estAbscisseCouverte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_ORDONNEE_LA_PLUS_BASSE: {
				Vaisseau_ordonneeLaPlusBasse vaisseau_ordonneeLaPlusBasse = (Vaisseau_ordonneeLaPlusBasse)theEObject;
				T result = caseVaisseau_ordonneeLaPlusBasse(vaisseau_ordonneeLaPlusBasse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_ORDONNEE_LA_PLUS_HAUTE: {
				Vaisseau_ordonneeLaPlusHaute vaisseau_ordonneeLaPlusHaute = (Vaisseau_ordonneeLaPlusHaute)theEObject;
				T result = caseVaisseau_ordonneeLaPlusHaute(vaisseau_ordonneeLaPlusHaute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_ABSCISSE_LA_PLUS_ADROITE: {
				Vaisseau_abscisseLaPlusADroite vaisseau_abscisseLaPlusADroite = (Vaisseau_abscisseLaPlusADroite)theEObject;
				T result = caseVaisseau_abscisseLaPlusADroite(vaisseau_abscisseLaPlusADroite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE: {
				Vaisseau_abscisseLaPlusAGauche vaisseau_abscisseLaPlusAGauche = (Vaisseau_abscisseLaPlusAGauche)theEObject;
				T result = caseVaisseau_abscisseLaPlusAGauche(vaisseau_abscisseLaPlusAGauche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_SE_DEPLACER_VERS_LA_DROITE: {
				Vaisseau_seDeplacerVersLaDroite vaisseau_seDeplacerVersLaDroite = (Vaisseau_seDeplacerVersLaDroite)theEObject;
				T result = caseVaisseau_seDeplacerVersLaDroite(vaisseau_seDeplacerVersLaDroite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE: {
				Vaisseau_seDeplacerVersLaGauche vaisseau_seDeplacerVersLaGauche = (Vaisseau_seDeplacerVersLaGauche)theEObject;
				T result = caseVaisseau_seDeplacerVersLaGauche(vaisseau_seDeplacerVersLaGauche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_POSITIONNER: {
				Vaisseau_positionner vaisseau_positionner = (Vaisseau_positionner)theEObject;
				T result = caseVaisseau_positionner(vaisseau_positionner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.VAISSEAU_LONGUEUR: {
				Vaisseau_longueur vaisseau_longueur = (Vaisseau_longueur)theEObject;
				T result = caseVaisseau_longueur(vaisseau_longueur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_SPACES_INVADERS: {
				SpacesInvaders_SpacesInvaders spacesInvaders_SpacesInvaders = (SpacesInvaders_SpacesInvaders)theEObject;
				T result = caseSpacesInvaders_SpacesInvaders(spacesInvaders_SpacesInvaders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII: {
				SpacesInvaders_recupererEspaceJeuDansChaineASCII spacesInvaders_recupererEspaceJeuDansChaineASCII = (SpacesInvaders_recupererEspaceJeuDansChaineASCII)theEObject;
				T result = caseSpacesInvaders_recupererEspaceJeuDansChaineASCII(spacesInvaders_recupererEspaceJeuDansChaineASCII);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION: {
				SpacesInvaders_recupererMarqueDeLaPosition spacesInvaders_recupererMarqueDeLaPosition = (SpacesInvaders_recupererMarqueDeLaPosition)theEObject;
				T result = caseSpacesInvaders_recupererMarqueDeLaPosition(spacesInvaders_recupererMarqueDeLaPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION: {
				SpacesInvaders_aUnVaisseauQuiOccupeLaPosition spacesInvaders_aUnVaisseauQuiOccupeLaPosition = (SpacesInvaders_aUnVaisseauQuiOccupeLaPosition)theEObject;
				T result = caseSpacesInvaders_aUnVaisseauQuiOccupeLaPosition(spacesInvaders_aUnVaisseauQuiOccupeLaPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_AUN_VAISSEAU: {
				SpacesInvaders_aUnVaisseau spacesInvaders_aUnVaisseau = (SpacesInvaders_aUnVaisseau)theEObject;
				T result = caseSpacesInvaders_aUnVaisseau(spacesInvaders_aUnVaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_EST_DANS_ESPACE_JEU: {
				SpacesInvaders_estDansEspaceJeu spacesInvaders_estDansEspaceJeu = (SpacesInvaders_estDansEspaceJeu)theEObject;
				T result = caseSpacesInvaders_estDansEspaceJeu(spacesInvaders_estDansEspaceJeu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE: {
				SpacesInvaders_deplacerVaisseauVersLaDroite spacesInvaders_deplacerVaisseauVersLaDroite = (SpacesInvaders_deplacerVaisseauVersLaDroite)theEObject;
				T result = caseSpacesInvaders_deplacerVaisseauVersLaDroite(spacesInvaders_deplacerVaisseauVersLaDroite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE: {
				SpacesInvaders_deplacerVaisseauVersLaGauche spacesInvaders_deplacerVaisseauVersLaGauche = (SpacesInvaders_deplacerVaisseauVersLaGauche)theEObject;
				T result = caseSpacesInvaders_deplacerVaisseauVersLaGauche(spacesInvaders_deplacerVaisseauVersLaGauche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU: {
				SpacesInvaders_positionnerUnNouveauVaisseau spacesInvaders_positionnerUnNouveauVaisseau = (SpacesInvaders_positionnerUnNouveauVaisseau)theEObject;
				T result = caseSpacesInvaders_positionnerUnNouveauVaisseau(spacesInvaders_positionnerUnNouveauVaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU: {
				SpacesInvaders_positionnerUnNouveauVaisseau spacesInvaders_positionnerUnNouveauVaisseau = (SpacesInvaders_positionnerUnNouveauVaisseau)theEObject;
				T result = caseSpaceinvaders_SpacesInvaders_positionnerUnNouveauVaisseau(spacesInvaders_positionnerUnNouveauVaisseau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST: {
				SpaceInvaderTest spaceInvaderTest = (SpaceInvaderTest)theEObject;
				T result = caseSpaceInvaderTest(spaceInvaderTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_INITIALISATION: {
				SpaceInvaderTest_initialisation spaceInvaderTest_initialisation = (SpaceInvaderTest_initialisation)theEObject;
				T result = caseSpaceInvaderTest_initialisation(spaceInvaderTest_initialisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE: {
				SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide = (SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide)theEObject;
				T result = caseSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide(spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU: {
				SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu = (SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu)theEObject;
				T result = caseSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu(spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION: {
				SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException = (SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException)theEObject;
				T result = caseSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException(spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU: {
				SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu = (SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu)theEObject;
				T result = caseSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu(spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT: {
				SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement = (SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement)theEObject;
				T result = caseSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement(spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE: {
				SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche = (SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche)theEObject;
				T result = caseSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche(spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE: {
				SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche = (SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche)theEObject;
				T result = caseSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche(spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE: {
				SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite = (SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite)theEObject;
				T result = caseSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite(spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE: {
				SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite = (SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite)theEObject;
				T result = caseSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite(spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE: {
				SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite = (SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite)theEObject;
				T result = caseSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite(spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceinvadersPackage.NEW_CLASS1: {
				NewClass1 newClass1 = (NewClass1)theEObject;
				T result = caseNewClass1(newClass1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders(SpacesInvaders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau(Vaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_Position(Position_Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position abscisse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position abscisse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_abscisse(Position_abscisse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position ordonnee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position ordonnee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_ordonnee(Position_ordonnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position changer Abscisse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position changer Abscisse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_changerAbscisse(Position_changerAbscisse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position changer Ordonnee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position changer Ordonnee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_changerOrdonnee(Position_changerOrdonnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension_Dimension(Dimension_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension longueur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension longueur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension_longueur(Dimension_longueur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension hauteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension hauteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension_hauteur(Dimension_hauteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_Vaisseau(Vaisseau_Vaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceinvaders_Vaisseau_Vaisseau(Vaisseau_Vaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_Vaisseau_1(Vaisseau_Vaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_Vaisseau_2(Vaisseau_Vaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau occupe La Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau occupe La Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_occupeLaPosition(Vaisseau_occupeLaPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau est Ordonnee Couverte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau est Ordonnee Couverte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_estOrdonneeCouverte(Vaisseau_estOrdonneeCouverte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau est Abscisse Couverte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau est Abscisse Couverte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_estAbscisseCouverte(Vaisseau_estAbscisseCouverte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau ordonnee La Plus Basse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau ordonnee La Plus Basse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_ordonneeLaPlusBasse(Vaisseau_ordonneeLaPlusBasse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau ordonnee La Plus Haute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau ordonnee La Plus Haute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_ordonneeLaPlusHaute(Vaisseau_ordonneeLaPlusHaute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau abscisse La Plus ADroite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau abscisse La Plus ADroite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_abscisseLaPlusADroite(Vaisseau_abscisseLaPlusADroite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau abscisse La Plus AGauche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau abscisse La Plus AGauche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_abscisseLaPlusAGauche(Vaisseau_abscisseLaPlusAGauche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau se Deplacer Vers La Droite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau se Deplacer Vers La Droite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_seDeplacerVersLaDroite(Vaisseau_seDeplacerVersLaDroite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau se Deplacer Vers La Gauche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau se Deplacer Vers La Gauche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_seDeplacerVersLaGauche(Vaisseau_seDeplacerVersLaGauche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau positionner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau positionner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_positionner(Vaisseau_positionner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaisseau longueur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaisseau longueur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaisseau_longueur(Vaisseau_longueur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders Spaces Invaders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders Spaces Invaders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_SpacesInvaders(SpacesInvaders_SpacesInvaders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_recupererEspaceJeuDansChaineASCII(SpacesInvaders_recupererEspaceJeuDansChaineASCII object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders recuperer Marque De La Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders recuperer Marque De La Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_recupererMarqueDeLaPosition(SpacesInvaders_recupererMarqueDeLaPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_aUnVaisseauQuiOccupeLaPosition(SpacesInvaders_aUnVaisseauQuiOccupeLaPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders aUn Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders aUn Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_aUnVaisseau(SpacesInvaders_aUnVaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders est Dans Espace Jeu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders est Dans Espace Jeu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_estDansEspaceJeu(SpacesInvaders_estDansEspaceJeu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_deplacerVaisseauVersLaDroite(SpacesInvaders_deplacerVaisseauVersLaDroite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_deplacerVaisseauVersLaGauche(SpacesInvaders_deplacerVaisseauVersLaGauche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacesInvaders_positionnerUnNouveauVaisseau(SpacesInvaders_positionnerUnNouveauVaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spaces Invaders positionner Un Nouveau Vaisseau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceinvaders_SpacesInvaders_positionnerUnNouveauVaisseau(SpacesInvaders_positionnerUnNouveauVaisseau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest(SpaceInvaderTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test initialisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test initialisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_initialisation(SpaceInvaderTest_initialisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide(SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu(SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException(SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu(SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement(SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche(SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche(SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite(SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite(SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite(SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Class1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Class1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewClass1(NewClass1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SpaceinvadersSwitch
