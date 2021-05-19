/**
 */
package spaceinvaders.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spaceinvaders.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spaceinvaders.SpaceinvadersPackage
 * @generated
 */
public class SpaceinvadersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpaceinvadersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceinvadersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpaceinvadersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceinvadersSwitch<Adapter> modelSwitch =
		new SpaceinvadersSwitch<Adapter>() {
			@Override
			public Adapter caseSpacesInvaders(SpacesInvaders object) {
				return createSpacesInvadersAdapter();
			}
			@Override
			public Adapter caseVaisseau(Vaisseau object) {
				return createVaisseauAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter casePosition_Position(Position_Position object) {
				return createPosition_PositionAdapter();
			}
			@Override
			public Adapter casePosition_abscisse(Position_abscisse object) {
				return createPosition_abscisseAdapter();
			}
			@Override
			public Adapter casePosition_ordonnee(Position_ordonnee object) {
				return createPosition_ordonneeAdapter();
			}
			@Override
			public Adapter casePosition_changerAbscisse(Position_changerAbscisse object) {
				return createPosition_changerAbscisseAdapter();
			}
			@Override
			public Adapter casePosition_changerOrdonnee(Position_changerOrdonnee object) {
				return createPosition_changerOrdonneeAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseDimension_Dimension(Dimension_Dimension object) {
				return createDimension_DimensionAdapter();
			}
			@Override
			public Adapter caseDimension_longueur(Dimension_longueur object) {
				return createDimension_longueurAdapter();
			}
			@Override
			public Adapter caseDimension_hauteur(Dimension_hauteur object) {
				return createDimension_hauteurAdapter();
			}
			@Override
			public Adapter caseVaisseau_Vaisseau(Vaisseau_Vaisseau object) {
				return createVaisseau_VaisseauAdapter();
			}
			@Override
			public Adapter caseSpaceinvaders_Vaisseau_Vaisseau(Vaisseau_Vaisseau object) {
				return createSpaceinvaders_Vaisseau_VaisseauAdapter();
			}
			@Override
			public Adapter caseVaisseau_Vaisseau_1(Vaisseau_Vaisseau object) {
				return createVaisseau_Vaisseau_1Adapter();
			}
			@Override
			public Adapter caseVaisseau_Vaisseau_2(Vaisseau_Vaisseau object) {
				return createVaisseau_Vaisseau_2Adapter();
			}
			@Override
			public Adapter caseVaisseau_occupeLaPosition(Vaisseau_occupeLaPosition object) {
				return createVaisseau_occupeLaPositionAdapter();
			}
			@Override
			public Adapter caseVaisseau_estOrdonneeCouverte(Vaisseau_estOrdonneeCouverte object) {
				return createVaisseau_estOrdonneeCouverteAdapter();
			}
			@Override
			public Adapter caseVaisseau_estAbscisseCouverte(Vaisseau_estAbscisseCouverte object) {
				return createVaisseau_estAbscisseCouverteAdapter();
			}
			@Override
			public Adapter caseVaisseau_ordonneeLaPlusBasse(Vaisseau_ordonneeLaPlusBasse object) {
				return createVaisseau_ordonneeLaPlusBasseAdapter();
			}
			@Override
			public Adapter caseVaisseau_ordonneeLaPlusHaute(Vaisseau_ordonneeLaPlusHaute object) {
				return createVaisseau_ordonneeLaPlusHauteAdapter();
			}
			@Override
			public Adapter caseVaisseau_abscisseLaPlusADroite(Vaisseau_abscisseLaPlusADroite object) {
				return createVaisseau_abscisseLaPlusADroiteAdapter();
			}
			@Override
			public Adapter caseVaisseau_abscisseLaPlusAGauche(Vaisseau_abscisseLaPlusAGauche object) {
				return createVaisseau_abscisseLaPlusAGaucheAdapter();
			}
			@Override
			public Adapter caseVaisseau_seDeplacerVersLaDroite(Vaisseau_seDeplacerVersLaDroite object) {
				return createVaisseau_seDeplacerVersLaDroiteAdapter();
			}
			@Override
			public Adapter caseVaisseau_seDeplacerVersLaGauche(Vaisseau_seDeplacerVersLaGauche object) {
				return createVaisseau_seDeplacerVersLaGaucheAdapter();
			}
			@Override
			public Adapter caseVaisseau_positionner(Vaisseau_positionner object) {
				return createVaisseau_positionnerAdapter();
			}
			@Override
			public Adapter caseVaisseau_longueur(Vaisseau_longueur object) {
				return createVaisseau_longueurAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_SpacesInvaders(SpacesInvaders_SpacesInvaders object) {
				return createSpacesInvaders_SpacesInvadersAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_recupererEspaceJeuDansChaineASCII(SpacesInvaders_recupererEspaceJeuDansChaineASCII object) {
				return createSpacesInvaders_recupererEspaceJeuDansChaineASCIIAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_recupererMarqueDeLaPosition(SpacesInvaders_recupererMarqueDeLaPosition object) {
				return createSpacesInvaders_recupererMarqueDeLaPositionAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_aUnVaisseauQuiOccupeLaPosition(SpacesInvaders_aUnVaisseauQuiOccupeLaPosition object) {
				return createSpacesInvaders_aUnVaisseauQuiOccupeLaPositionAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_aUnVaisseau(SpacesInvaders_aUnVaisseau object) {
				return createSpacesInvaders_aUnVaisseauAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_estDansEspaceJeu(SpacesInvaders_estDansEspaceJeu object) {
				return createSpacesInvaders_estDansEspaceJeuAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_deplacerVaisseauVersLaDroite(SpacesInvaders_deplacerVaisseauVersLaDroite object) {
				return createSpacesInvaders_deplacerVaisseauVersLaDroiteAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_deplacerVaisseauVersLaGauche(SpacesInvaders_deplacerVaisseauVersLaGauche object) {
				return createSpacesInvaders_deplacerVaisseauVersLaGaucheAdapter();
			}
			@Override
			public Adapter caseSpacesInvaders_positionnerUnNouveauVaisseau(SpacesInvaders_positionnerUnNouveauVaisseau object) {
				return createSpacesInvaders_positionnerUnNouveauVaisseauAdapter();
			}
			@Override
			public Adapter caseSpaceinvaders_SpacesInvaders_positionnerUnNouveauVaisseau(SpacesInvaders_positionnerUnNouveauVaisseau object) {
				return createSpaceinvaders_SpacesInvaders_positionnerUnNouveauVaisseauAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest(SpaceInvaderTest object) {
				return createSpaceInvaderTestAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_initialisation(SpaceInvaderTest_initialisation object) {
				return createSpaceInvaderTest_initialisationAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide(SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide object) {
				return createSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu(SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu object) {
				return createSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException(SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException object) {
				return createSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu(SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu object) {
				return createSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement(SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement object) {
				return createSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche(SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche object) {
				return createSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche(SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche object) {
				return createSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite(SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite object) {
				return createSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite(SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite object) {
				return createSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteAdapter();
			}
			@Override
			public Adapter caseSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite(SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite object) {
				return createSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteAdapter();
			}
			@Override
			public Adapter caseNewClass1(NewClass1 object) {
				return createNewClass1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders <em>Spaces Invaders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders
	 * @generated
	 */
	public Adapter createSpacesInvadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau <em>Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau
	 * @generated
	 */
	public Adapter createVaisseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Position_Position <em>Position Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Position_Position
	 * @generated
	 */
	public Adapter createPosition_PositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Position_abscisse <em>Position abscisse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Position_abscisse
	 * @generated
	 */
	public Adapter createPosition_abscisseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Position_ordonnee <em>Position ordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Position_ordonnee
	 * @generated
	 */
	public Adapter createPosition_ordonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Position_changerAbscisse <em>Position changer Abscisse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Position_changerAbscisse
	 * @generated
	 */
	public Adapter createPosition_changerAbscisseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Position_changerOrdonnee <em>Position changer Ordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Position_changerOrdonnee
	 * @generated
	 */
	public Adapter createPosition_changerOrdonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Dimension_Dimension <em>Dimension Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Dimension_Dimension
	 * @generated
	 */
	public Adapter createDimension_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Dimension_longueur <em>Dimension longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Dimension_longueur
	 * @generated
	 */
	public Adapter createDimension_longueurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Dimension_hauteur <em>Dimension hauteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Dimension_hauteur
	 * @generated
	 */
	public Adapter createDimension_hauteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	public Adapter createVaisseau_VaisseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	public Adapter createSpaceinvaders_Vaisseau_VaisseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	public Adapter createVaisseau_Vaisseau_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_Vaisseau <em>Vaisseau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_Vaisseau
	 * @generated
	 */
	public Adapter createVaisseau_Vaisseau_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_occupeLaPosition <em>Vaisseau occupe La Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_occupeLaPosition
	 * @generated
	 */
	public Adapter createVaisseau_occupeLaPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_estOrdonneeCouverte <em>Vaisseau est Ordonnee Couverte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_estOrdonneeCouverte
	 * @generated
	 */
	public Adapter createVaisseau_estOrdonneeCouverteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_estAbscisseCouverte <em>Vaisseau est Abscisse Couverte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_estAbscisseCouverte
	 * @generated
	 */
	public Adapter createVaisseau_estAbscisseCouverteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_ordonneeLaPlusBasse <em>Vaisseau ordonnee La Plus Basse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_ordonneeLaPlusBasse
	 * @generated
	 */
	public Adapter createVaisseau_ordonneeLaPlusBasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_ordonneeLaPlusHaute <em>Vaisseau ordonnee La Plus Haute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_ordonneeLaPlusHaute
	 * @generated
	 */
	public Adapter createVaisseau_ordonneeLaPlusHauteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_abscisseLaPlusADroite <em>Vaisseau abscisse La Plus ADroite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_abscisseLaPlusADroite
	 * @generated
	 */
	public Adapter createVaisseau_abscisseLaPlusADroiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_abscisseLaPlusAGauche <em>Vaisseau abscisse La Plus AGauche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_abscisseLaPlusAGauche
	 * @generated
	 */
	public Adapter createVaisseau_abscisseLaPlusAGaucheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_seDeplacerVersLaDroite <em>Vaisseau se Deplacer Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_seDeplacerVersLaDroite
	 * @generated
	 */
	public Adapter createVaisseau_seDeplacerVersLaDroiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_seDeplacerVersLaGauche <em>Vaisseau se Deplacer Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_seDeplacerVersLaGauche
	 * @generated
	 */
	public Adapter createVaisseau_seDeplacerVersLaGaucheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_positionner <em>Vaisseau positionner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_positionner
	 * @generated
	 */
	public Adapter createVaisseau_positionnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.Vaisseau_longueur <em>Vaisseau longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.Vaisseau_longueur
	 * @generated
	 */
	public Adapter createVaisseau_longueurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_SpacesInvaders <em>Spaces Invaders Spaces Invaders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_SpacesInvaders
	 * @generated
	 */
	public Adapter createSpacesInvaders_SpacesInvadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_recupererEspaceJeuDansChaineASCII <em>Spaces Invaders recuperer Espace Jeu Dans Chaine ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_recupererEspaceJeuDansChaineASCII
	 * @generated
	 */
	public Adapter createSpacesInvaders_recupererEspaceJeuDansChaineASCIIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_recupererMarqueDeLaPosition <em>Spaces Invaders recuperer Marque De La Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_recupererMarqueDeLaPosition
	 * @generated
	 */
	public Adapter createSpacesInvaders_recupererMarqueDeLaPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_aUnVaisseauQuiOccupeLaPosition <em>Spaces Invaders aUn Vaisseau Qui Occupe La Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_aUnVaisseauQuiOccupeLaPosition
	 * @generated
	 */
	public Adapter createSpacesInvaders_aUnVaisseauQuiOccupeLaPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_aUnVaisseau <em>Spaces Invaders aUn Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_aUnVaisseau
	 * @generated
	 */
	public Adapter createSpacesInvaders_aUnVaisseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_estDansEspaceJeu <em>Spaces Invaders est Dans Espace Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_estDansEspaceJeu
	 * @generated
	 */
	public Adapter createSpacesInvaders_estDansEspaceJeuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaDroite <em>Spaces Invaders deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaDroite
	 * @generated
	 */
	public Adapter createSpacesInvaders_deplacerVaisseauVersLaDroiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaGauche <em>Spaces Invaders deplacer Vaisseau Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaGauche
	 * @generated
	 */
	public Adapter createSpacesInvaders_deplacerVaisseauVersLaGaucheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau
	 * @generated
	 */
	public Adapter createSpacesInvaders_positionnerUnNouveauVaisseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau <em>Spaces Invaders positionner Un Nouveau Vaisseau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau
	 * @generated
	 */
	public Adapter createSpaceinvaders_SpacesInvaders_positionnerUnNouveauVaisseauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest <em>Space Invader Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest
	 * @generated
	 */
	public Adapter createSpaceInvaderTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_initialisation <em>Space Invader Test initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_initialisation
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_initialisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide <em>Space Invader Test test Au Debut Jeu Space Invader Est Vide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu <em>Space Invader Test test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException <em>Space Invader Test test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu <em>Space Invader Test test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement <em>Space Invader Test test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche <em>Space Invader Test Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche <em>Space Invader Test Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite <em>Space Invader Test test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite <em>Space Invader Test test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite <em>Space Invader Test test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite
	 * @generated
	 */
	public Adapter createSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spaceinvaders.NewClass1 <em>New Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spaceinvaders.NewClass1
	 * @generated
	 */
	public Adapter createNewClass1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpaceinvadersAdapterFactory
