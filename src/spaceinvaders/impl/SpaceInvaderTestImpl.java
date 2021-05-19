/**
 */
package spaceinvaders.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import spaceinvaders.SpaceInvaderTest;
import spaceinvaders.SpaceinvadersPackage;
import spaceinvaders.SpacesInvaders;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space Invader Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.impl.SpaceInvaderTestImpl#getSpaceinvaders <em>Spaceinvaders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpaceInvaderTestImpl extends MinimalEObjectImpl.Container implements SpaceInvaderTest {
	/**
	 * The cached value of the '{@link #getSpaceinvaders() <em>Spaceinvaders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceinvaders()
	 * @generated
	 * @ordered
	 */
	protected SpacesInvaders spaceinvaders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceInvaderTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceinvadersPackage.Literals.SPACE_INVADER_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacesInvaders getSpaceinvaders() {
		if (spaceinvaders != null && spaceinvaders.eIsProxy()) {
			InternalEObject oldSpaceinvaders = (InternalEObject)spaceinvaders;
			spaceinvaders = (SpacesInvaders)eResolveProxy(oldSpaceinvaders);
			if (spaceinvaders != oldSpaceinvaders) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpaceinvadersPackage.SPACE_INVADER_TEST__SPACEINVADERS, oldSpaceinvaders, spaceinvaders));
			}
		}
		return spaceinvaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacesInvaders basicGetSpaceinvaders() {
		return spaceinvaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceinvaders(SpacesInvaders newSpaceinvaders) {
		SpacesInvaders oldSpaceinvaders = spaceinvaders;
		spaceinvaders = newSpaceinvaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.SPACE_INVADER_TEST__SPACEINVADERS, oldSpaceinvaders, spaceinvaders));
	}

	/**
	 * The cached OCL expression body for the '{@link #initialisation() <em>Initialisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initialisation()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALISATION__EOCL_EXP = "spaceinvaders = new SpacesInvaders(15, 10);"+
" ";

	/**
	 * The cached OCL query for the '{@link #initialisation() <em>Initialisation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initialisation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> INITIALISATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialisation() {
		if (INITIALISATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(0));
			try {
				INITIALISATION__EOCL_QRY = helper.createQuery(INITIALISATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(INITIALISATION__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_AuDebut_JeuSpaceInvaderEstVide() <em>Test Au Debut Jeu Space Invader Est Vide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_AuDebut_JeuSpaceInvaderEstVide()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE__EOCL_EXP = "assertEquals("" + "+
"		"...............\n" + "+
"		"...............\n" +"+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
"	    ";

	/**
	 * The cached OCL query for the '{@link #test_AuDebut_JeuSpaceInvaderEstVide() <em>Test Au Debut Jeu Space Invader Est Vide</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_AuDebut_JeuSpaceInvaderEstVide()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_AuDebut_JeuSpaceInvaderEstVide() {
		if (TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(1));
			try {
				TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE__EOCL_QRY = helper.createQuery(TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() <em>Test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);"+
"		assertEquals("" + "+
"		"...............\n" + "+
"		"...............\n" +"+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		".......V.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
"	";

	/**
	 * The cached OCL query for the '{@link #test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() <em>Test un Nouveau Vaisseau Est Correctement Positionne Dans Espace Jeu</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		if (TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(2));
			try {
				TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY = helper.createQuery(TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() <em>Test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION__EOCL_EXP = "try {"+
"			spaceinvaders.positionnerUnNouveauVaisseau(1,1,15,9);"+
"			fail("Position trop à droite : devrait déclencher une exception HorsEspaceJeuException");"+
"		} catch (final HorsEspaceJeuException e) {"+
"		}"+
"		"+
"		"+
"		try {"+
"			spaceinvaders.positionnerUnNouveauVaisseau(1,1,-1,9);"+
"			fail("Position trop à gauche : devrait déclencher une exception HorsEspaceJeuException");"+
"		} catch (final HorsEspaceJeuException e) {"+
"		}"+
"		"+
"		"+
"		try {"+
"			spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,10);"+
"			fail("Position trop en bas : devrait déclencher une exception HorsEspaceJeuException");"+
"		} catch (final HorsEspaceJeuException e) {"+
"		}"+
"		"+
"		"+
"		try {"+
"			spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,-1);"+
"			fail("Position trop à haut : devrait déclencher une exception HorsEspaceJeuException");"+
"		} catch (final HorsEspaceJeuException e) {"+
"		}"+
"			"+
"	";

	/**
	 * The cached OCL query for the '{@link #test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() <em>Test Un Nouveau Vaisseau Positionne Hors Espace Jeu Doit Lever Une Exception</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
		if (TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(3));
			try {
				TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION__EOCL_QRY = helper.createQuery(TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() <em>Test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);"+
"		assertEquals("" + "+
"		"...............\n" + "+
"		"...............\n" +"+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		".......VVV.....\n" + "+
"		".......VVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
"	";

	/**
	 * The cached OCL query for the '{@link #test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() <em>Test un Nouveau Vaisseau Avec Dimension Est Correctement Positionne Dans Espace Jeu</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		if (TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(4));
			try {
				TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY = helper.createQuery(TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() <em>Test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT__EOCL_EXP = "try {"+
"			spaceinvaders.positionnerUnNouveauVaisseau(9,2,7,9);"+
"			fail("Dépassement du vaisseau à droite en raison de sa longueur trop importante : devrait déclencher une exception DebordementEspaceJeuException");"+
"		} catch (final DebordementEspaceJeuException e) {"+
"		}"+
"		"+
"		"+
"		try {"+
"			spaceinvaders.positionnerUnNouveauVaisseau(3,4,7,1);"+
"			fail("Dépassement du vaisseau vers le haut en raison de sa hauteur trop importante : devrait déclencher une exception DebordementEspaceJeuException");"+
"		} catch (final DebordementEspaceJeuException e) {"+
"		}"+
"			"+
"	";

	/**
	 * The cached OCL query for the '{@link #test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() <em>Test Un Nouveau Vaisseau Positionne Dans Espace Jeu Mais Avec Dimension Trop Grande Doit Lever Une Exception De Debordement</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() {
		if (TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(5));
			try {
				TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT__EOCL_QRY = helper.createQuery(TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #VaisseauAvance_DeplacerVaisseauVersLaGauche() <em>Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VaisseauAvance_DeplacerVaisseauVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static final String VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9), 1);"+
"		spaceinvaders.deplacerVaisseauVersLaGauche();"+
"	"+
"		assertEquals("" + "+
"		"...............\n" + "+
"		"...............\n" +"+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"......VVV......\n" + "+
"		"......VVV......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
" ";

	/**
	 * The cached OCL query for the '{@link #VaisseauAvance_DeplacerVaisseauVersLaGauche() <em>Vaisseau Avance Deplacer Vaisseau Vers La Gauche</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VaisseauAvance_DeplacerVaisseauVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void VaisseauAvance_DeplacerVaisseauVersLaGauche() {
		if (VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(6));
			try {
				VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY = helper.createQuery(VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #VaisseauImmobile_DeplacerVaisseauVersLaGauche() <em>Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VaisseauImmobile_DeplacerVaisseauVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static final String VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(3,2,0,9);"+
"		spaceinvaders.deplacerVaisseauVersLaGauche();"+
"		"+
"		assertEquals("" + "+
"		"...............\n" + "+
"		"...............\n" +"+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"...............\n" + "+
"		"VVV............\n" + "+
"		"VVV............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
"	";

	/**
	 * The cached OCL query for the '{@link #VaisseauImmobile_DeplacerVaisseauVersLaGauche() <em>Vaisseau Immobile Deplacer Vaisseau Vers La Gauche</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VaisseauImmobile_DeplacerVaisseauVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
		if (VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(7));
			try {
				VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY = helper.createQuery(VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_VaisseauAvance_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_VaisseauAvance_DeplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9),3);"+
"     spaceinvaders.deplacerVaisseauVersLaDroite();"+
"     assertEquals("" + "+
"     "...............\n" + "+
"     "...............\n" +"+
"     "...............\n" + "+
"     "...............\n" + "+
"     "...............\n" + "+
"     "...............\n" + "+
"     "...............\n" + "+
"     "...............\n" + "+
"     "..........VVV..\n" + "+
"     "..........VVV..\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
" ";

	/**
	 * The cached OCL query for the '{@link #test_VaisseauAvance_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Avance Deplacer Vaisseau Vers La Droite</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_VaisseauAvance_DeplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
		if (TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(8));
			try {
				TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY = helper.createQuery(TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_VaisseauImmobile_DeplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(12,9), 3);"+
"    spaceinvaders.deplacerVaisseauVersLaDroite();"+
"    assertEquals("" + "+
"    "...............\n" + "+
"    "...............\n" +"+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "............VVV\n" + "+
"    "............VVV\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
" ";

	/**
	 * The cached OCL query for the '{@link #test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Immobile Deplacer Vaisseau Vers La Droite</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_VaisseauImmobile_DeplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
		if (TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(9));
			try {
				TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY = helper.createQuery(TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP = "spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(10,9),3);"+
"    spaceinvaders.deplacerVaisseauVersLaDroite();"+
"    assertEquals("" + "+
"    "...............\n" + "+
"    "...............\n" +"+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "...............\n" + "+
"    "............VVV\n" + "+
"    "............VVV\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());"+
" ";

	/**
	 * The cached OCL query for the '{@link #test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() <em>Test Vaisseau Avance Partiellement Deplacer Vaisseau Vers La Droite</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite() {
		if (TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACE_INVADER_TEST, SpaceinvadersPackage.Literals.SPACE_INVADER_TEST.getEAllOperations().get(10));
			try {
				TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY = helper.createQuery(TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceinvadersPackage.SPACE_INVADER_TEST__SPACEINVADERS:
				if (resolve) return getSpaceinvaders();
				return basicGetSpaceinvaders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpaceinvadersPackage.SPACE_INVADER_TEST__SPACEINVADERS:
				setSpaceinvaders((SpacesInvaders)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpaceinvadersPackage.SPACE_INVADER_TEST__SPACEINVADERS:
				setSpaceinvaders((SpacesInvaders)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpaceinvadersPackage.SPACE_INVADER_TEST__SPACEINVADERS:
				return spaceinvaders != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpaceinvadersPackage.SPACE_INVADER_TEST___INITIALISATION:
				initialisation();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_AU_DEBUT_JEU_SPACE_INVADER_EST_VIDE:
				test_AuDebut_JeuSpaceInvaderEstVide();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU:
				test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_HORS_ESPACE_JEU_DOIT_LEVER_UNE_EXCEPTION:
				test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_AVEC_DIMENSION_EST_CORRECTEMENT_POSITIONNE_DANS_ESPACE_JEU:
				test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_UN_NOUVEAU_VAISSEAU_POSITIONNE_DANS_ESPACE_JEU_MAIS_AVEC_DIMENSION_TROP_GRANDE_DOIT_LEVER_UNE_EXCEPTION_DE_DEBORDEMENT:
				test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE:
				VaisseauAvance_DeplacerVaisseauVersLaGauche();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_GAUCHE:
				VaisseauImmobile_DeplacerVaisseauVersLaGauche();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_DEPLACER_VAISSEAU_VERS_LA_DROITE:
				test_VaisseauAvance_DeplacerVaisseauVersLaDroite();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_VAISSEAU_IMMOBILE_DEPLACER_VAISSEAU_VERS_LA_DROITE:
				test_VaisseauImmobile_DeplacerVaisseauVersLaDroite();
				return null;
			case SpaceinvadersPackage.SPACE_INVADER_TEST___TEST_VAISSEAU_AVANCE_PARTIELLEMENT_DEPLACER_VAISSEAU_VERS_LA_DROITE:
				test_VaisseauAvancePartiellement_DeplacerVaisseauVersLaDroite();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //SpaceInvaderTestImpl
