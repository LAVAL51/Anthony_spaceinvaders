/**
 */
package spaceinvaders.impl;

import jdk.java.lang.LangPackage;

import jdk.java.lang.impl.LangPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.junit.JunitPackage;

import org.junit.impl.JunitPackageImpl;

import spaceinvaders.Dimension;
import spaceinvaders.Dimension_Dimension;
import spaceinvaders.Dimension_hauteur;
import spaceinvaders.Dimension_longueur;
import spaceinvaders.NewClass1;
import spaceinvaders.Position;
import spaceinvaders.Position_Position;
import spaceinvaders.Position_abscisse;
import spaceinvaders.Position_changerAbscisse;
import spaceinvaders.Position_changerOrdonnee;
import spaceinvaders.Position_ordonnee;
import spaceinvaders.SpaceInvaderTest;
import spaceinvaders.SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche;
import spaceinvaders.SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche;
import spaceinvaders.SpaceInvaderTest_initialisation;
import spaceinvaders.SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide;
import spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement;
import spaceinvaders.SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException;
import spaceinvaders.SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite;
import spaceinvaders.SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite;
import spaceinvaders.SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite;
import spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu;
import spaceinvaders.SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu;
import spaceinvaders.SpaceinvadersFactory;
import spaceinvaders.SpaceinvadersPackage;
import spaceinvaders.SpacesInvaders;
import spaceinvaders.SpacesInvaders_SpacesInvaders;
import spaceinvaders.SpacesInvaders_aUnVaisseau;
import spaceinvaders.SpacesInvaders_aUnVaisseauQuiOccupeLaPosition;
import spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaDroite;
import spaceinvaders.SpacesInvaders_deplacerVaisseauVersLaGauche;
import spaceinvaders.SpacesInvaders_estDansEspaceJeu;
import spaceinvaders.SpacesInvaders_positionnerUnNouveauVaisseau;
import spaceinvaders.SpacesInvaders_recupererEspaceJeuDansChaineASCII;
import spaceinvaders.SpacesInvaders_recupererMarqueDeLaPosition;
import spaceinvaders.Vaisseau;
import spaceinvaders.Vaisseau_Vaisseau;
import spaceinvaders.Vaisseau_abscisseLaPlusADroite;
import spaceinvaders.Vaisseau_abscisseLaPlusAGauche;
import spaceinvaders.Vaisseau_estAbscisseCouverte;
import spaceinvaders.Vaisseau_estOrdonneeCouverte;
import spaceinvaders.Vaisseau_longueur;
import spaceinvaders.Vaisseau_occupeLaPosition;
import spaceinvaders.Vaisseau_ordonneeLaPlusBasse;
import spaceinvaders.Vaisseau_ordonneeLaPlusHaute;
import spaceinvaders.Vaisseau_positionner;
import spaceinvaders.Vaisseau_seDeplacerVersLaDroite;
import spaceinvaders.Vaisseau_seDeplacerVersLaGauche;

import utils.UtilsPackage;

import utils.impl.UtilsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceinvadersPackageImpl extends EPackageImpl implements SpaceinvadersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvadersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_PositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_abscisseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_ordonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_changerAbscisseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_changerOrdonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimension_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimension_longueurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimension_hauteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_VaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_VaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_VaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_VaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_occupeLaPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_estOrdonneeCouverteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_estAbscisseCouverteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_ordonneeLaPlusBasseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_ordonneeLaPlusHauteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_abscisseLaPlusADroiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_abscisseLaPlusAGaucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_seDeplacerVersLaDroiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_seDeplacerVersLaGaucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_positionnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaisseau_longueurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_SpacesInvadersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_recupererEspaceJeuDansChaineASCIIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_recupererMarqueDeLaPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_aUnVaisseauQuiOccupeLaPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_aUnVaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_estDansEspaceJeuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_deplacerVaisseauVersLaDroiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_deplacerVaisseauVersLaGaucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_positionnerUnNouveauVaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacesInvaders_positionnerUnNouveauVaisseauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_initialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newClass1EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spaceinvaders.SpaceinvadersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpaceinvadersPackageImpl() {
		super(eNS_URI, SpaceinvadersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpaceinvadersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpaceinvadersPackage init() {
		if (isInited) return (SpaceinvadersPackage)EPackage.Registry.INSTANCE.getEPackage(SpaceinvadersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpaceinvadersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpaceinvadersPackageImpl theSpaceinvadersPackage = registeredSpaceinvadersPackage instanceof SpaceinvadersPackageImpl ? (SpaceinvadersPackageImpl)registeredSpaceinvadersPackage : new SpaceinvadersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl)(registeredPackage instanceof LangPackageImpl ? registeredPackage : LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JunitPackage.eNS_URI);
		JunitPackageImpl theJunitPackage = (JunitPackageImpl)(registeredPackage instanceof JunitPackageImpl ? registeredPackage : JunitPackage.eINSTANCE);

		// Create package meta-data objects
		theSpaceinvadersPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theJunitPackage.createPackageContents();

		// Initialize created meta-data
		theSpaceinvadersPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theJunitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpaceinvadersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpaceinvadersPackage.eNS_URI, theSpaceinvadersPackage);
		return theSpaceinvadersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders() {
		return spacesInvadersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacesInvaders_MARQUE_FIN_LIGNE() {
		return (EAttribute)spacesInvadersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacesInvaders_MARQUE_VIDE() {
		return (EAttribute)spacesInvadersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacesInvaders_MARQUE_VAISSEAU() {
		return (EAttribute)spacesInvadersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacesInvaders_Longueur() {
		return (EAttribute)spacesInvadersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacesInvaders_Hauteur() {
		return (EAttribute)spacesInvadersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpacesInvaders_Vaisseau() {
		return (EReference)spacesInvadersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__SpacesInvaders__int_int() {
		return spacesInvadersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__RecupererEspaceJeuDansChaineASCII() {
		return spacesInvadersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__RecupererMarqueDeLaPosition__int() {
		return spacesInvadersEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__AUnVaisseauQuiOccupeLaPosition__int_int() {
		return spacesInvadersEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__AUnVaisseau() {
		return spacesInvadersEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__EstDansEspaceJeu__int_int() {
		return spacesInvadersEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__DeplacerVaisseauVersLaDroite() {
		return spacesInvadersEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__DeplacerVaisseauVersLaGauche() {
		return spacesInvadersEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__PositionnerUnNouveauVaisseau__int_int_int_int() {
		return spacesInvadersEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpacesInvaders__PositionnerUnNouveauVaisseau__Dimension_Position_int() {
		return spacesInvadersEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau() {
		return vaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVaisseau_Origine() {
		return (EReference)vaisseauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVaisseau_Dimension() {
		return (EReference)vaisseauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVaisseau_Vitesse() {
		return (EAttribute)vaisseauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__Vaisseau__int_int() {
		return vaisseauEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__Vaisseau__int_int_int_int() {
		return vaisseauEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__OccupeLaPosition__int_int() {
		return vaisseauEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__EstOrdonneeCouverte__int() {
		return vaisseauEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__EstAbscisseCouverte__int() {
		return vaisseauEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__OrdonneeLaPlusBasse() {
		return vaisseauEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__OrdonneeLaPlusHaute() {
		return vaisseauEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__AbscisseLaPlusADroite() {
		return vaisseauEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__AbscisseLaPlusAGauche() {
		return vaisseauEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__SeDeplacerVersLaDroite() {
		return vaisseauEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__SeDeplacerVersLaGauche() {
		return vaisseauEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__Positionner__int_int() {
		return vaisseauEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__Longueur() {
		return vaisseauEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__Vaisseau__Dimension_Position_int() {
		return vaisseauEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVaisseau__Vaisseau__Dimension_Position() {
		return vaisseauEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_X() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Y() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPosition__Position__int_int() {
		return positionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPosition__Abscisse() {
		return positionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPosition__Ordonnee() {
		return positionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPosition__ChangerAbscisse__int() {
		return positionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPosition__ChangerOrdonnee__int() {
		return positionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_Position() {
		return position_PositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_abscisse() {
		return position_abscisseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_ordonnee() {
		return position_ordonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_changerAbscisse() {
		return position_changerAbscisseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_changerOrdonnee() {
		return position_changerOrdonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Longueur() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Hauteur() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDimension__Dimension__int_int() {
		return dimensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDimension__Longueur() {
		return dimensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDimension__Hauteur() {
		return dimensionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension_Dimension() {
		return dimension_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension_longueur() {
		return dimension_longueurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension_hauteur() {
		return dimension_hauteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_Vaisseau() {
		return vaisseau_VaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_Vaisseau() {
		return vaisseau_VaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_Vaisseau() {
		return vaisseau_VaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_Vaisseau() {
		return vaisseau_VaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_occupeLaPosition() {
		return vaisseau_occupeLaPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_estOrdonneeCouverte() {
		return vaisseau_estOrdonneeCouverteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_estAbscisseCouverte() {
		return vaisseau_estAbscisseCouverteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_ordonneeLaPlusBasse() {
		return vaisseau_ordonneeLaPlusBasseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_ordonneeLaPlusHaute() {
		return vaisseau_ordonneeLaPlusHauteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_abscisseLaPlusADroite() {
		return vaisseau_abscisseLaPlusADroiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_abscisseLaPlusAGauche() {
		return vaisseau_abscisseLaPlusAGaucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_seDeplacerVersLaDroite() {
		return vaisseau_seDeplacerVersLaDroiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_seDeplacerVersLaGauche() {
		return vaisseau_seDeplacerVersLaGaucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_positionner() {
		return vaisseau_positionnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVaisseau_longueur() {
		return vaisseau_longueurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_SpacesInvaders() {
		return spacesInvaders_SpacesInvadersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_recupererEspaceJeuDansChaineASCII() {
		return spacesInvaders_recupererEspaceJeuDansChaineASCIIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_recupererMarqueDeLaPosition() {
		return spacesInvaders_recupererMarqueDeLaPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_aUnVaisseauQuiOccupeLaPosition() {
		return spacesInvaders_aUnVaisseauQuiOccupeLaPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_aUnVaisseau() {
		return spacesInvaders_aUnVaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_estDansEspaceJeu() {
		return spacesInvaders_estDansEspaceJeuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_deplacerVaisseauVersLaDroite() {
		return spacesInvaders_deplacerVaisseauVersLaDroiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_deplacerVaisseauVersLaGauche() {
		return spacesInvaders_deplacerVaisseauVersLaGaucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_positionnerUnNouveauVaisseau() {
		return spacesInvaders_positionnerUnNouveauVaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacesInvaders_positionnerUnNouveauVaisseau() {
		return spacesInvaders_positionnerUnNouveauVaisseauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest() {
		return spaceInvaderTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpaceInvaderTest_Spaceinvaders() {
		return (EReference)spaceInvaderTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Initialisation() {
		return spaceInvaderTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_AuDebut_JeuSpaceInvaderEstVide() {
		return spaceInvaderTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		return spaceInvaderTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
		return spaceInvaderTestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		return spaceInvaderTestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() {
		return spaceInvaderTestEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__VaisseauAvance_DeplacerVaisseauVersLaGauche() {
		return spaceInvaderTestEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
		return spaceInvaderTestEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
		return spaceInvaderTestEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
		return spaceInvaderTestEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpaceInvaderTest__Test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() {
		return spaceInvaderTestEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_initialisation() {
		return spaceInvaderTest_initialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide() {
		return spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		return spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
		return spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		return spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() {
		return spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche() {
		return spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
		return spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
		return spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
		return spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() {
		return spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNewClass1() {
		return newClass1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceinvadersFactory getSpaceinvadersFactory() {
		return (SpaceinvadersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		spacesInvadersEClass = createEClass(SPACES_INVADERS);
		createEAttribute(spacesInvadersEClass, SPACES_INVADERS__MARQUE_FIN_LIGNE);
		createEAttribute(spacesInvadersEClass, SPACES_INVADERS__MARQUE_VIDE);
		createEAttribute(spacesInvadersEClass, SPACES_INVADERS__MARQUE_VAISSEAU);
		createEAttribute(spacesInvadersEClass, SPACES_INVADERS__LONGUEUR);
		createEAttribute(spacesInvadersEClass, SPACES_INVADERS__HAUTEUR);
		createEReference(spacesInvadersEClass, SPACES_INVADERS__VAISSEAU);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___SPACES_INVADERS__INT_INT);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___RECUPERER_MARQUE_DE_LA_POSITION__INT);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___AUN_VAISSEAU);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___EST_DANS_ESPACE_JEU__INT_INT);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_DROITE);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_GAUCHE);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT);
		createEOperation(spacesInvadersEClass, SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT);

		vaisseauEClass = createEClass(VAISSEAU);
		createEReference(vaisseauEClass, VAISSEAU__ORIGINE);
		createEReference(vaisseauEClass, VAISSEAU__DIMENSION);
		createEAttribute(vaisseauEClass, VAISSEAU__VITESSE);
		createEOperation(vaisseauEClass, VAISSEAU___VAISSEAU__INT_INT);
		createEOperation(vaisseauEClass, VAISSEAU___VAISSEAU__INT_INT_INT_INT);
		createEOperation(vaisseauEClass, VAISSEAU___OCCUPE_LA_POSITION__INT_INT);
		createEOperation(vaisseauEClass, VAISSEAU___EST_ORDONNEE_COUVERTE__INT);
		createEOperation(vaisseauEClass, VAISSEAU___EST_ABSCISSE_COUVERTE__INT);
		createEOperation(vaisseauEClass, VAISSEAU___ORDONNEE_LA_PLUS_BASSE);
		createEOperation(vaisseauEClass, VAISSEAU___ORDONNEE_LA_PLUS_HAUTE);
		createEOperation(vaisseauEClass, VAISSEAU___ABSCISSE_LA_PLUS_ADROITE);
		createEOperation(vaisseauEClass, VAISSEAU___ABSCISSE_LA_PLUS_AGAUCHE);
		createEOperation(vaisseauEClass, VAISSEAU___SE_DEPLACER_VERS_LA_DROITE);
		createEOperation(vaisseauEClass, VAISSEAU___SE_DEPLACER_VERS_LA_GAUCHE);
		createEOperation(vaisseauEClass, VAISSEAU___POSITIONNER__INT_INT);
		createEOperation(vaisseauEClass, VAISSEAU___LONGUEUR);
		createEOperation(vaisseauEClass, VAISSEAU___VAISSEAU__DIMENSION_POSITION_INT);
		createEOperation(vaisseauEClass, VAISSEAU___VAISSEAU__DIMENSION_POSITION);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);
		createEOperation(positionEClass, POSITION___POSITION__INT_INT);
		createEOperation(positionEClass, POSITION___ABSCISSE);
		createEOperation(positionEClass, POSITION___ORDONNEE);
		createEOperation(positionEClass, POSITION___CHANGER_ABSCISSE__INT);
		createEOperation(positionEClass, POSITION___CHANGER_ORDONNEE__INT);

		position_PositionEClass = createEClass(POSITION_POSITION);

		position_abscisseEClass = createEClass(POSITION_ABSCISSE);

		position_ordonneeEClass = createEClass(POSITION_ORDONNEE);

		position_changerAbscisseEClass = createEClass(POSITION_CHANGER_ABSCISSE);

		position_changerOrdonneeEClass = createEClass(POSITION_CHANGER_ORDONNEE);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__LONGUEUR);
		createEAttribute(dimensionEClass, DIMENSION__HAUTEUR);
		createEOperation(dimensionEClass, DIMENSION___DIMENSION__INT_INT);
		createEOperation(dimensionEClass, DIMENSION___LONGUEUR);
		createEOperation(dimensionEClass, DIMENSION___HAUTEUR);

		dimension_DimensionEClass = createEClass(DIMENSION_DIMENSION);

		dimension_longueurEClass = createEClass(DIMENSION_LONGUEUR);

		dimension_hauteurEClass = createEClass(DIMENSION_HAUTEUR);

		vaisseau_VaisseauEClass = createEClass(VAISSEAU_VAISSEAU);

		vaisseau_VaisseauEClass = createEClass(VAISSEAU_VAISSEAU);

		vaisseau_VaisseauEClass = createEClass(VAISSEAU_VAISSEAU);

		vaisseau_VaisseauEClass = createEClass(VAISSEAU_VAISSEAU);

		vaisseau_occupeLaPositionEClass = createEClass(VAISSEAU_OCCUPE_LA_POSITION);

		vaisseau_estOrdonneeCouverteEClass = createEClass(VAISSEAU_EST_ORDONNEE_COUVERTE);

		vaisseau_estAbscisseCouverteEClass = createEClass(VAISSEAU_EST_ABSCISSE_COUVERTE);

		vaisseau_ordonneeLaPlusBasseEClass = createEClass(VAISSEAU_ORDONNEE_LA_PLUS_BASSE);

		vaisseau_ordonneeLaPlusHauteEClass = createEClass(VAISSEAU_ORDONNEE_LA_PLUS_HAUTE);

		vaisseau_abscisseLaPlusADroiteEClass = createEClass(VAISSEAU_ABSCISSE_LA_PLUS_ADROITE);

		vaisseau_abscisseLaPlusAGaucheEClass = createEClass(VAISSEAU_ABSCISSE_LA_PLUS_AGAUCHE);

		vaisseau_seDeplacerVersLaDroiteEClass = createEClass(VAISSEAU_SE_DEPLACER_VERS_LA_DROITE);

		vaisseau_seDeplacerVersLaGaucheEClass = createEClass(VAISSEAU_SE_DEPLACER_VERS_LA_GAUCHE);

		vaisseau_positionnerEClass = createEClass(VAISSEAU_POSITIONNER);

		vaisseau_longueurEClass = createEClass(VAISSEAU_LONGUEUR);

		spacesInvaders_SpacesInvadersEClass = createEClass(SPACES_INVADERS_SPACES_INVADERS);

		spacesInvaders_recupererEspaceJeuDansChaineASCIIEClass = createEClass(SPACES_INVADERS_RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII);

		spacesInvaders_recupererMarqueDeLaPositionEClass = createEClass(SPACES_INVADERS_RECUPERER_MARQUE_DE_LA_POSITION);

		spacesInvaders_aUnVaisseauQuiOccupeLaPositionEClass = createEClass(SPACES_INVADERS_AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION);

		spacesInvaders_aUnVaisseauEClass = createEClass(SPACES_INVADERS_AUN_VAISSEAU);

		spacesInvaders_estDansEspaceJeuEClass = createEClass(SPACES_INVADERS_EST_DANS_ESPACE_JEU);

		spacesInvaders_deplacerVaisseauVersLaDroiteEClass = createEClass(SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_DROITE);

		spacesInvaders_deplacerVaisseauVersLaGaucheEClass = createEClass(SPACES_INVADERS_DEPLACER_VAISSEAU_VERS_LA_GAUCHE);

		spacesInvaders_positionnerUnNouveauVaisseauEClass = createEClass(SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU);

		spacesInvaders_positionnerUnNouveauVaisseauEClass = createEClass(SPACES_INVADERS_POSITIONNER_UN_NOUVEAU_VAISSEAU);

		spaceInvaderTestEClass = createEClass(SPACE_INVADER_TEST);
		createEReference(spaceInvaderTestEClass, SPACE_INVADER_TEST__SPACEINVADERS);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___INITIALISATION);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE);
		createEOperation(spaceInvaderTestEClass, SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE);

		spaceInvaderTest_initialisationEClass = createEClass(SPACE_INVADER_TEST_INITIALISATION);

		spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideEClass = createEClass(SPACE_INVADER_TEST_TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE);

		spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuEClass = createEClass(SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU);

		spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionEClass = createEClass(SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION);

		spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuEClass = createEClass(SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU);

		spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementEClass = createEClass(SPACE_INVADER_TEST_TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT);

		spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheEClass = createEClass(SPACE_INVADER_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE);

		spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheEClass = createEClass(SPACE_INVADER_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE);

		spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteEClass = createEClass(SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE);

		spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteEClass = createEClass(SPACE_INVADER_TEST_TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE);

		spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteEClass = createEClass(SPACE_INVADER_TEST_TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE);

		newClass1EClass = createEClass(NEW_CLASS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(spacesInvadersEClass, SpacesInvaders.class, "SpacesInvaders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacesInvaders_MARQUE_FIN_LIGNE(), ecorePackage.getEChar(), "MARQUE_FIN_LIGNE", "\'\\n\'", 1, 1, SpacesInvaders.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpacesInvaders_MARQUE_VIDE(), ecorePackage.getEChar(), "MARQUE_VIDE", "\'.\'", 1, 1, SpacesInvaders.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpacesInvaders_MARQUE_VAISSEAU(), ecorePackage.getEChar(), "MARQUE_VAISSEAU", "\'V\'", 1, 1, SpacesInvaders.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpacesInvaders_Longueur(), ecorePackage.getEInt(), "longueur", null, 1, 1, SpacesInvaders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpacesInvaders_Hauteur(), ecorePackage.getEInt(), "hauteur", null, 1, 1, SpacesInvaders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpacesInvaders_Vaisseau(), this.getVaisseau(), null, "vaisseau", null, 1, 1, SpacesInvaders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getSpacesInvaders__SpacesInvaders__int_int(), this.getSpacesInvaders(), "SpacesInvaders", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hauteur", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpacesInvaders__RecupererEspaceJeuDansChaineASCII(), ecorePackage.getEString(), "recupererEspaceJeuDansChaineASCII", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSpacesInvaders__RecupererMarqueDeLaPosition__int(), ecorePackage.getEChar(), "recupererMarqueDeLaPosition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSpacesInvaders__AUnVaisseauQuiOccupeLaPosition__int_int(), ecorePackage.getEBoolean(), "aUnVaisseauQuiOccupeLaPosition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpacesInvaders__AUnVaisseau(), ecorePackage.getEBoolean(), "aUnVaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSpacesInvaders__EstDansEspaceJeu__int_int(), ecorePackage.getEBoolean(), "estDansEspaceJeu", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpacesInvaders__DeplacerVaisseauVersLaDroite(), null, "deplacerVaisseauVersLaDroite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpacesInvaders__DeplacerVaisseauVersLaGauche(), null, "deplacerVaisseauVersLaGauche", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSpacesInvaders__PositionnerUnNouveauVaisseau__int_int_int_int(), null, "positionnerUnNouveauVaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hauteur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSpacesInvaders__PositionnerUnNouveauVaisseau__Dimension_Position_int(), null, "positionnerUnNouveauVaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDimension(), "dimension", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPosition(), "position", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "vitesse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(vaisseauEClass, Vaisseau.class, "Vaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVaisseau_Origine(), this.getPosition(), null, "origine", null, 1, 1, Vaisseau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVaisseau_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, Vaisseau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVaisseau_Vitesse(), ecorePackage.getEInt(), "vitesse", null, 1, 1, Vaisseau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getVaisseau__Vaisseau__int_int(), this.getVaisseau(), "Vaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hauteur", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__Vaisseau__int_int_int_int(), this.getVaisseau(), "Vaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hauteur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__OccupeLaPosition__int_int(), ecorePackage.getEBoolean(), "occupeLaPosition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__EstOrdonneeCouverte__int(), ecorePackage.getEBoolean(), "estOrdonneeCouverte", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__EstAbscisseCouverte__int(), ecorePackage.getEBoolean(), "estAbscisseCouverte", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__OrdonneeLaPlusBasse(), ecorePackage.getEInt(), "ordonneeLaPlusBasse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__OrdonneeLaPlusHaute(), ecorePackage.getEInt(), "ordonneeLaPlusHaute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__AbscisseLaPlusADroite(), ecorePackage.getEInt(), "abscisseLaPlusADroite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__AbscisseLaPlusAGauche(), ecorePackage.getEInt(), "abscisseLaPlusAGauche", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__SeDeplacerVersLaDroite(), null, "seDeplacerVersLaDroite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__SeDeplacerVersLaGauche(), null, "seDeplacerVersLaGauche", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__Positionner__int_int(), null, "positionner", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVaisseau__Longueur(), ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__Vaisseau__Dimension_Position_int(), this.getVaisseau(), "Vaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDimension(), "dimension", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPosition(), "positionOrigine", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "vitesse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVaisseau__Vaisseau__Dimension_Position(), this.getVaisseau(), "Vaisseau", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDimension(), "dimension", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPosition(), "positionOrigine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), ecorePackage.getEInt(), "x", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPosition_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPosition__Position__int_int(), this.getPosition(), "Position", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPosition__Abscisse(), ecorePackage.getEInt(), "abscisse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPosition__Ordonnee(), ecorePackage.getEInt(), "ordonnee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPosition__ChangerAbscisse__int(), null, "changerAbscisse", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nouvelleAbscisse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPosition__ChangerOrdonnee__int(), null, "changerOrdonnee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nouvelleOrdonnee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(position_PositionEClass, Position_Position.class, "Position_Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(position_abscisseEClass, Position_abscisse.class, "Position_abscisse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(position_ordonneeEClass, Position_ordonnee.class, "Position_ordonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(position_changerAbscisseEClass, Position_changerAbscisse.class, "Position_changerAbscisse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(position_changerOrdonneeEClass, Position_changerOrdonnee.class, "Position_changerOrdonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Longueur(), ecorePackage.getEInt(), "longueur", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDimension_Hauteur(), ecorePackage.getEInt(), "hauteur", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDimension__Dimension__int_int(), this.getDimension(), "Dimension", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "hauteur", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDimension__Longueur(), ecorePackage.getEInt(), "longueur", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDimension__Hauteur(), ecorePackage.getEInt(), "hauteur", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dimension_DimensionEClass, Dimension_Dimension.class, "Dimension_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimension_longueurEClass, Dimension_longueur.class, "Dimension_longueur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimension_hauteurEClass, Dimension_hauteur.class, "Dimension_hauteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_VaisseauEClass, Vaisseau_Vaisseau.class, "Vaisseau_Vaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_VaisseauEClass, Vaisseau_Vaisseau.class, "Vaisseau_Vaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_VaisseauEClass, Vaisseau_Vaisseau.class, "Vaisseau_Vaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_VaisseauEClass, Vaisseau_Vaisseau.class, "Vaisseau_Vaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_occupeLaPositionEClass, Vaisseau_occupeLaPosition.class, "Vaisseau_occupeLaPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_estOrdonneeCouverteEClass, Vaisseau_estOrdonneeCouverte.class, "Vaisseau_estOrdonneeCouverte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_estAbscisseCouverteEClass, Vaisseau_estAbscisseCouverte.class, "Vaisseau_estAbscisseCouverte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_ordonneeLaPlusBasseEClass, Vaisseau_ordonneeLaPlusBasse.class, "Vaisseau_ordonneeLaPlusBasse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_ordonneeLaPlusHauteEClass, Vaisseau_ordonneeLaPlusHaute.class, "Vaisseau_ordonneeLaPlusHaute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_abscisseLaPlusADroiteEClass, Vaisseau_abscisseLaPlusADroite.class, "Vaisseau_abscisseLaPlusADroite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_abscisseLaPlusAGaucheEClass, Vaisseau_abscisseLaPlusAGauche.class, "Vaisseau_abscisseLaPlusAGauche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_seDeplacerVersLaDroiteEClass, Vaisseau_seDeplacerVersLaDroite.class, "Vaisseau_seDeplacerVersLaDroite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_seDeplacerVersLaGaucheEClass, Vaisseau_seDeplacerVersLaGauche.class, "Vaisseau_seDeplacerVersLaGauche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_positionnerEClass, Vaisseau_positionner.class, "Vaisseau_positionner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaisseau_longueurEClass, Vaisseau_longueur.class, "Vaisseau_longueur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_SpacesInvadersEClass, SpacesInvaders_SpacesInvaders.class, "SpacesInvaders_SpacesInvaders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_recupererEspaceJeuDansChaineASCIIEClass, SpacesInvaders_recupererEspaceJeuDansChaineASCII.class, "SpacesInvaders_recupererEspaceJeuDansChaineASCII", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_recupererMarqueDeLaPositionEClass, SpacesInvaders_recupererMarqueDeLaPosition.class, "SpacesInvaders_recupererMarqueDeLaPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_aUnVaisseauQuiOccupeLaPositionEClass, SpacesInvaders_aUnVaisseauQuiOccupeLaPosition.class, "SpacesInvaders_aUnVaisseauQuiOccupeLaPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_aUnVaisseauEClass, SpacesInvaders_aUnVaisseau.class, "SpacesInvaders_aUnVaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_estDansEspaceJeuEClass, SpacesInvaders_estDansEspaceJeu.class, "SpacesInvaders_estDansEspaceJeu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_deplacerVaisseauVersLaDroiteEClass, SpacesInvaders_deplacerVaisseauVersLaDroite.class, "SpacesInvaders_deplacerVaisseauVersLaDroite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_deplacerVaisseauVersLaGaucheEClass, SpacesInvaders_deplacerVaisseauVersLaGauche.class, "SpacesInvaders_deplacerVaisseauVersLaGauche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_positionnerUnNouveauVaisseauEClass, SpacesInvaders_positionnerUnNouveauVaisseau.class, "SpacesInvaders_positionnerUnNouveauVaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacesInvaders_positionnerUnNouveauVaisseauEClass, SpacesInvaders_positionnerUnNouveauVaisseau.class, "SpacesInvaders_positionnerUnNouveauVaisseau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTestEClass, SpaceInvaderTest.class, "SpaceInvaderTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpaceInvaderTest_Spaceinvaders(), this.getSpacesInvaders(), null, "spaceinvaders", null, 1, 1, SpaceInvaderTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Initialisation(), null, "initialisation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_AuDebut_JeuSpaceInvaderEstVide(), null, "test_AuDebut_JeuSpaceInvaderEstVide", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu(), null, "test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException(), null, "test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu(), null, "test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement(), null, "test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__VaisseauAvance_DeplacerVaisseauVersLaGauche(), null, "VaisseauAvance_DeplacerVaisseauVersLaGauche", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__VaisseauImmobile_DeplacerVaisseauVersLaGauche(), null, "VaisseauImmobile_DeplacerVaisseauVersLaGauche", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_VaisseauAvance_DeplacerVaisseauVersLaDroite(), null, "test_VaisseauAvance_DeplacerVaisseauVersLaDroite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_VaisseauImmobile_DeplacerVaisseauVersLaDroite(), null, "test_VaisseauImmobile_DeplacerVaisseauVersLaDroite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpaceInvaderTest__Test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite(), null, "test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(spaceInvaderTest_initialisationEClass, SpaceInvaderTest_initialisation.class, "SpaceInvaderTest_initialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideEClass, SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide.class, "SpaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuEClass, SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu.class, "SpaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionEClass, SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException.class, "SpaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuEClass, SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu.class, "SpaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementEClass, SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement.class, "SpaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheEClass, SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche.class, "SpaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGauche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheEClass, SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche.class, "SpaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGauche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteEClass, SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite.class, "SpaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteEClass, SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite.class, "SpaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteEClass, SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite.class, "SpaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newClass1EClass, NewClass1.class, "NewClass1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (position_PositionEClass,
		   source,
		   new String[] {
			   "originalName", "Position"
		   });
		addAnnotation
		  (position_abscisseEClass,
		   source,
		   new String[] {
			   "originalName", "abscisse"
		   });
		addAnnotation
		  (position_ordonneeEClass,
		   source,
		   new String[] {
			   "originalName", "ordonnee"
		   });
		addAnnotation
		  (position_changerAbscisseEClass,
		   source,
		   new String[] {
			   "originalName", "changerAbscisse"
		   });
		addAnnotation
		  (position_changerOrdonneeEClass,
		   source,
		   new String[] {
			   "originalName", "changerOrdonnee"
		   });
		addAnnotation
		  (dimension_DimensionEClass,
		   source,
		   new String[] {
			   "originalName", "Dimension"
		   });
		addAnnotation
		  (dimension_longueurEClass,
		   source,
		   new String[] {
			   "originalName", "longueur"
		   });
		addAnnotation
		  (dimension_hauteurEClass,
		   source,
		   new String[] {
			   "originalName", "hauteur"
		   });
		addAnnotation
		  (vaisseau_VaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "Vaisseau"
		   });
		addAnnotation
		  (vaisseau_VaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "Vaisseau"
		   });
		addAnnotation
		  (vaisseau_VaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "Vaisseau"
		   });
		addAnnotation
		  (vaisseau_VaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "Vaisseau"
		   });
		addAnnotation
		  (vaisseau_occupeLaPositionEClass,
		   source,
		   new String[] {
			   "originalName", "occupeLaPosition"
		   });
		addAnnotation
		  (vaisseau_estOrdonneeCouverteEClass,
		   source,
		   new String[] {
			   "originalName", "estOrdonneeCouverte"
		   });
		addAnnotation
		  (vaisseau_estAbscisseCouverteEClass,
		   source,
		   new String[] {
			   "originalName", "estAbscisseCouverte"
		   });
		addAnnotation
		  (vaisseau_ordonneeLaPlusBasseEClass,
		   source,
		   new String[] {
			   "originalName", "ordonneeLaPlusBasse"
		   });
		addAnnotation
		  (vaisseau_ordonneeLaPlusHauteEClass,
		   source,
		   new String[] {
			   "originalName", "ordonneeLaPlusHaute"
		   });
		addAnnotation
		  (vaisseau_abscisseLaPlusADroiteEClass,
		   source,
		   new String[] {
			   "originalName", "abscisseLaPlusADroite"
		   });
		addAnnotation
		  (vaisseau_abscisseLaPlusAGaucheEClass,
		   source,
		   new String[] {
			   "originalName", "abscisseLaPlusAGauche"
		   });
		addAnnotation
		  (vaisseau_seDeplacerVersLaDroiteEClass,
		   source,
		   new String[] {
			   "originalName", "seDeplacerVersLaDroite"
		   });
		addAnnotation
		  (vaisseau_seDeplacerVersLaGaucheEClass,
		   source,
		   new String[] {
			   "originalName", "seDeplacerVersLaGauche"
		   });
		addAnnotation
		  (vaisseau_positionnerEClass,
		   source,
		   new String[] {
			   "originalName", "positionner"
		   });
		addAnnotation
		  (vaisseau_longueurEClass,
		   source,
		   new String[] {
			   "originalName", "longueur"
		   });
		addAnnotation
		  (spacesInvaders_SpacesInvadersEClass,
		   source,
		   new String[] {
			   "originalName", "SpacesInvaders"
		   });
		addAnnotation
		  (spacesInvaders_recupererEspaceJeuDansChaineASCIIEClass,
		   source,
		   new String[] {
			   "originalName", "recupererEspaceJeuDansChaineASCII"
		   });
		addAnnotation
		  (spacesInvaders_recupererMarqueDeLaPositionEClass,
		   source,
		   new String[] {
			   "originalName", "recupererMarqueDeLaPosition"
		   });
		addAnnotation
		  (spacesInvaders_aUnVaisseauQuiOccupeLaPositionEClass,
		   source,
		   new String[] {
			   "originalName", "aUnVaisseauQuiOccupeLaPosition"
		   });
		addAnnotation
		  (spacesInvaders_aUnVaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "aUnVaisseau"
		   });
		addAnnotation
		  (spacesInvaders_estDansEspaceJeuEClass,
		   source,
		   new String[] {
			   "originalName", "estDansEspaceJeu"
		   });
		addAnnotation
		  (spacesInvaders_deplacerVaisseauVersLaDroiteEClass,
		   source,
		   new String[] {
			   "originalName", "deplacerVaisseauVersLaDroite"
		   });
		addAnnotation
		  (spacesInvaders_deplacerVaisseauVersLaGaucheEClass,
		   source,
		   new String[] {
			   "originalName", "deplacerVaisseauVersLaGauche"
		   });
		addAnnotation
		  (spacesInvaders_positionnerUnNouveauVaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "positionnerUnNouveauVaisseau"
		   });
		addAnnotation
		  (spacesInvaders_positionnerUnNouveauVaisseauEClass,
		   source,
		   new String[] {
			   "originalName", "positionnerUnNouveauVaisseau"
		   });
		addAnnotation
		  (spaceInvaderTest_initialisationEClass,
		   source,
		   new String[] {
			   "originalName", "initialisation"
		   });
		addAnnotation
		  (spaceInvaderTest_test_AuDebut_JeuSpaceInvaderEstVideEClass,
		   source,
		   new String[] {
			   "originalName", "test_AuDebut_JeuSpaceInvaderEstVide"
		   });
		addAnnotation
		  (spaceInvaderTest_test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeuEClass,
		   source,
		   new String[] {
			   "originalName", "test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu"
		   });
		addAnnotation
		  (spaceInvaderTest_test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneExceptionEClass,
		   source,
		   new String[] {
			   "originalName", "test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException"
		   });
		addAnnotation
		  (spaceInvaderTest_test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeuEClass,
		   source,
		   new String[] {
			   "originalName", "test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu"
		   });
		addAnnotation
		  (spaceInvaderTest_test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordementEClass,
		   source,
		   new String[] {
			   "originalName", "test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement"
		   });
		addAnnotation
		  (spaceInvaderTest_VaisseauAvance_DeplacerVaisseauVersLaGaucheEClass,
		   source,
		   new String[] {
			   "originalName", "VaisseauAvance_DeplacerVaisseauVersLaGauche"
		   });
		addAnnotation
		  (spaceInvaderTest_VaisseauImmobile_DeplacerVaisseauVersLaGaucheEClass,
		   source,
		   new String[] {
			   "originalName", "VaisseauImmobile_DeplacerVaisseauVersLaGauche"
		   });
		addAnnotation
		  (spaceInvaderTest_test_VaisseauAvance_DeplacerVaisseauVersLaDroiteEClass,
		   source,
		   new String[] {
			   "originalName", "test_VaisseauAvance_DeplacerVaisseauVersLaDroite"
		   });
		addAnnotation
		  (spaceInvaderTest_test_VaisseauImmobile_DeplacerVaisseauVersLaDroiteEClass,
		   source,
		   new String[] {
			   "originalName", "test_VaisseauImmobile_DeplacerVaisseauVersLaDroite"
		   });
		addAnnotation
		  (spaceInvaderTest_test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroiteEClass,
		   source,
		   new String[] {
			   "originalName", "test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite"
		   });
	}

} //SpaceinvadersPackageImpl
