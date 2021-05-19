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

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import spaceinvaders.Dimension;
import spaceinvaders.Position;
import spaceinvaders.SpaceinvadersPackage;
import spaceinvaders.SpacesInvaders;
import spaceinvaders.Vaisseau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spaces Invaders</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.impl.SpacesInvadersImpl#getMARQUE_FIN_LIGNE <em>MARQUE FIN LIGNE</em>}</li>
 *   <li>{@link spaceinvaders.impl.SpacesInvadersImpl#getMARQUE_VIDE <em>MARQUE VIDE</em>}</li>
 *   <li>{@link spaceinvaders.impl.SpacesInvadersImpl#getMARQUE_VAISSEAU <em>MARQUE VAISSEAU</em>}</li>
 *   <li>{@link spaceinvaders.impl.SpacesInvadersImpl#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link spaceinvaders.impl.SpacesInvadersImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link spaceinvaders.impl.SpacesInvadersImpl#getVaisseau <em>Vaisseau</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpacesInvadersImpl extends MinimalEObjectImpl.Container implements SpacesInvaders {
	/**
	 * The default value of the '{@link #getMARQUE_FIN_LIGNE() <em>MARQUE FIN LIGNE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMARQUE_FIN_LIGNE()
	 * @generated
	 * @ordered
	 */
	protected static final char MARQUE_FIN_LIGNE_EDEFAULT = '\'';

	/**
	 * The cached value of the '{@link #getMARQUE_FIN_LIGNE() <em>MARQUE FIN LIGNE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMARQUE_FIN_LIGNE()
	 * @generated
	 * @ordered
	 */
	protected char marquE_FIN_LIGNE = MARQUE_FIN_LIGNE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMARQUE_VIDE() <em>MARQUE VIDE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMARQUE_VIDE()
	 * @generated
	 * @ordered
	 */
	protected static final char MARQUE_VIDE_EDEFAULT = '\'';

	/**
	 * The cached value of the '{@link #getMARQUE_VIDE() <em>MARQUE VIDE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMARQUE_VIDE()
	 * @generated
	 * @ordered
	 */
	protected char marquE_VIDE = MARQUE_VIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMARQUE_VAISSEAU() <em>MARQUE VAISSEAU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMARQUE_VAISSEAU()
	 * @generated
	 * @ordered
	 */
	protected static final char MARQUE_VAISSEAU_EDEFAULT = '\'';

	/**
	 * The cached value of the '{@link #getMARQUE_VAISSEAU() <em>MARQUE VAISSEAU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMARQUE_VAISSEAU()
	 * @generated
	 * @ordered
	 */
	protected char marquE_VAISSEAU = MARQUE_VAISSEAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongueur() <em>Longueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected static final int LONGUEUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongueur() <em>Longueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected int longueur = LONGUEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHauteur() <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected static final int HAUTEUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHauteur() <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected int hauteur = HAUTEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVaisseau() <em>Vaisseau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaisseau()
	 * @generated
	 * @ordered
	 */
	protected Vaisseau vaisseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacesInvadersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceinvadersPackage.Literals.SPACES_INVADERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getMARQUE_FIN_LIGNE() {
		return marquE_FIN_LIGNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getMARQUE_VIDE() {
		return marquE_VIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getMARQUE_VAISSEAU() {
		return marquE_VAISSEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLongueur() {
		return longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongueur(int newLongueur) {
		int oldLongueur = longueur;
		longueur = newLongueur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.SPACES_INVADERS__LONGUEUR, oldLongueur, longueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHauteur() {
		return hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHauteur(int newHauteur) {
		int oldHauteur = hauteur;
		hauteur = newHauteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.SPACES_INVADERS__HAUTEUR, oldHauteur, hauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vaisseau getVaisseau() {
		if (vaisseau != null && vaisseau.eIsProxy()) {
			InternalEObject oldVaisseau = (InternalEObject)vaisseau;
			vaisseau = (Vaisseau)eResolveProxy(oldVaisseau);
			if (vaisseau != oldVaisseau) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpaceinvadersPackage.SPACES_INVADERS__VAISSEAU, oldVaisseau, vaisseau));
			}
		}
		return vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vaisseau basicGetVaisseau() {
		return vaisseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVaisseau(Vaisseau newVaisseau) {
		Vaisseau oldVaisseau = vaisseau;
		vaisseau = newVaisseau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.SPACES_INVADERS__VAISSEAU, oldVaisseau, vaisseau));
	}

	/**
	 * The cached OCL expression body for the '{@link #SpacesInvaders(int, int) <em>Spaces Invaders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SpacesInvaders(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String SPACES_INVADERS__INT_INT__EOCL_EXP = "this.longueur = longueur;"+
"	   this.hauteur = hauteur;";

	/**
	 * The cached OCL query for the '{@link #SpacesInvaders(int, int) <em>Spaces Invaders</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SpacesInvaders(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> SPACES_INVADERS__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacesInvaders SpacesInvaders(int longueur, int hauteur) {
		if (SPACES_INVADERS__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(0));
			try {
				SPACES_INVADERS__INT_INT__EOCL_QRY = helper.createQuery(SPACES_INVADERS__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(SPACES_INVADERS__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("longueur", longueur);
		environment.add("hauteur", hauteur);
		return (SpacesInvaders) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #recupererEspaceJeuDansChaineASCII() <em>Recuperer Espace Jeu Dans Chaine ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #recupererEspaceJeuDansChaineASCII()
	 * @generated
	 * @ordered
	 */
	protected static final String RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII__EOCL_EXP = "StringBuilder espaceDeJeu = new StringBuilder();"+
"		for (int y = 0; y < hauteur; y++) {"+
"			for (int x = 0; x < longueur; x++) {"+
"				espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));"+
"			}"+
"			espaceDeJeu.append(MARQUE_FIN_LIGNE);"+
"		}"+
"		return espaceDeJeu.toString();"+
"	";

	/**
	 * The cached OCL query for the '{@link #recupererEspaceJeuDansChaineASCII() <em>Recuperer Espace Jeu Dans Chaine ASCII</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #recupererEspaceJeuDansChaineASCII()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String recupererEspaceJeuDansChaineASCII() {
		if (RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(1));
			try {
				RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII__EOCL_QRY = helper.createQuery(RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII__EOCL_QRY);
		return (String) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #recupererMarqueDeLaPosition(int) <em>Recuperer Marque De La Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #recupererMarqueDeLaPosition(int)
	 * @generated
	 * @ordered
	 */
	protected static final String RECUPERER_MARQUE_DE_LA_POSITION__INT__EOCL_EXP = "char marque;"+
"		if (this.aUnVaisseauQuiOccupeLaPosition(x, y))"+
"		      marque=MARQUE_VAISSEAU;"+
"		else"+
"		      marque=MARQUE_VIDE;"+
"		return marque;"+
"	";

	/**
	 * The cached OCL query for the '{@link #recupererMarqueDeLaPosition(int) <em>Recuperer Marque De La Position</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #recupererMarqueDeLaPosition(int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RECUPERER_MARQUE_DE_LA_POSITION__INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char recupererMarqueDeLaPosition(int y) {
		if (RECUPERER_MARQUE_DE_LA_POSITION__INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(2));
			try {
				RECUPERER_MARQUE_DE_LA_POSITION__INT__EOCL_QRY = helper.createQuery(RECUPERER_MARQUE_DE_LA_POSITION__INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(RECUPERER_MARQUE_DE_LA_POSITION__INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("y", y);
		return ((Character) query.evaluate(this)).charValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #aUnVaisseauQuiOccupeLaPosition(int, int) <em>AUn Vaisseau Qui Occupe La Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #aUnVaisseauQuiOccupeLaPosition(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT__EOCL_EXP = "return this.aUnVaisseau() && vaisseau.occupeLaPosition(x, y);"+
"	";

	/**
	 * The cached OCL query for the '{@link #aUnVaisseauQuiOccupeLaPosition(int, int) <em>AUn Vaisseau Qui Occupe La Position</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #aUnVaisseauQuiOccupeLaPosition(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {
		if (AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(3));
			try {
				AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT__EOCL_QRY = helper.createQuery(AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("x", x);
		environment.add("y", y);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #aUnVaisseau() <em>AUn Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #aUnVaisseau()
	 * @generated
	 * @ordered
	 */
	protected static final String AUN_VAISSEAU__EOCL_EXP = "return vaisseau!=null;"+
"	";

	/**
	 * The cached OCL query for the '{@link #aUnVaisseau() <em>AUn Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #aUnVaisseau()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> AUN_VAISSEAU__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean aUnVaisseau() {
		if (AUN_VAISSEAU__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(4));
			try {
				AUN_VAISSEAU__EOCL_QRY = helper.createQuery(AUN_VAISSEAU__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(AUN_VAISSEAU__EOCL_QRY);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #estDansEspaceJeu(int, int) <em>Est Dans Espace Jeu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #estDansEspaceJeu(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String EST_DANS_ESPACE_JEU__INT_INT__EOCL_EXP = "return (((x >= 0) && (x < longueur)) && ((y >= 0) && (y < hauteur)));"+
"	";

	/**
	 * The cached OCL query for the '{@link #estDansEspaceJeu(int, int) <em>Est Dans Espace Jeu</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #estDansEspaceJeu(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> EST_DANS_ESPACE_JEU__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean estDansEspaceJeu(int x, int y) {
		if (EST_DANS_ESPACE_JEU__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(5));
			try {
				EST_DANS_ESPACE_JEU__INT_INT__EOCL_QRY = helper.createQuery(EST_DANS_ESPACE_JEU__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(EST_DANS_ESPACE_JEU__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("x", x);
		environment.add("y", y);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #deplacerVaisseauVersLaDroite() <em>Deplacer Vaisseau Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP = "if (vaisseau.abscisseLaPlusADroite() < (longueur - 1)) {"+
"			vaisseau.seDeplacerVersLaDroite();"+
"			if (!estDansEspaceJeu(vaisseau.abscisseLaPlusADroite(), vaisseau.ordonneeLaPlusHaute())) {"+
"				vaisseau.positionner(longueur - vaisseau.longueur(), vaisseau.ordonneeLaPlusHaute());"+
"			}"+
"		}"+
"	";

	/**
	 * The cached OCL query for the '{@link #deplacerVaisseauVersLaDroite() <em>Deplacer Vaisseau Vers La Droite</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deplacerVaisseauVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deplacerVaisseauVersLaDroite() {
		if (DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(6));
			try {
				DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY = helper.createQuery(DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DEPLACER_VAISSEAU_VERS_LA_DROITE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #deplacerVaisseauVersLaGauche() <em>Deplacer Vaisseau Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deplacerVaisseauVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_EXP = "if (vaisseau.abscisseLaPlusAGauche()> 0) vaisseau.seDeplacerVersLaGauche();"+
"		"+
"	";

	/**
	 * The cached OCL query for the '{@link #deplacerVaisseauVersLaGauche() <em>Deplacer Vaisseau Vers La Gauche</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deplacerVaisseauVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deplacerVaisseauVersLaGauche() {
		if (DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(7));
			try {
				DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY = helper.createQuery(DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DEPLACER_VAISSEAU_VERS_LA_GAUCHE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #positionnerUnNouveauVaisseau(int, int, int, int) <em>Positionner Un Nouveau Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positionnerUnNouveauVaisseau(int, int, int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT__EOCL_EXP = "if (!estDansEspaceJeu(x, y))"+
"			throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");"+
"		if ( !estDansEspaceJeu(x+longueur-1,y))"+
"			throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers la droite à cause de sa longueur");"+
"		if (!estDansEspaceJeu(x,y-hauteur+1))"+
"			throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers le bas à cause de sa hauteur");"+
"		vaisseau = new Vaisseau(longueur, hauteur);"+
"		vaisseau.positionner(x, y);"+
"	";

	/**
	 * The cached OCL query for the '{@link #positionnerUnNouveauVaisseau(int, int, int, int) <em>Positionner Un Nouveau Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positionnerUnNouveauVaisseau(int, int, int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void positionnerUnNouveauVaisseau(int longueur, int hauteur, int x, int y) {
		if (POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(8));
			try {
				POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT__EOCL_QRY = helper.createQuery(POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("longueur", longueur);
		environment.add("hauteur", hauteur);
		environment.add("x", x);
		environment.add("y", y);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #positionnerUnNouveauVaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int) <em>Positionner Un Nouveau Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positionnerUnNouveauVaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT__EOCL_EXP = "int x = position.abscisse();"+
"		int y = position.ordonnee();"+
"		"+
"		if (!estDansEspaceJeu(x, y))"+
"			throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");"+
"		int longueurVaisseau = dimension.longueur();"+
"		int hauteurVaisseau = dimension.hauteur();"+
"		"+
"		if (!estDansEspaceJeu(x + longueurVaisseau - 1, y))"+
"			throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers la droite à cause de sa longueur");"+
"		if (!estDansEspaceJeu(x, y - hauteurVaisseau + 1))"+
"			throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers le bas à cause de sa hauteur");"+
"	    vaisseau = new Vaisseau(dimension,position,vitesse);"+
"	";

	/**
	 * The cached OCL query for the '{@link #positionnerUnNouveauVaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int) <em>Positionner Un Nouveau Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positionnerUnNouveauVaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void positionnerUnNouveauVaisseau(Dimension dimension, Position position, int vitesse) {
		if (POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.SPACES_INVADERS, SpaceinvadersPackage.Literals.SPACES_INVADERS.getEAllOperations().get(9));
			try {
				POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY = helper.createQuery(POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("dimension", dimension);
		environment.add("position", position);
		environment.add("vitesse", vitesse);
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
			case SpaceinvadersPackage.SPACES_INVADERS__MARQUE_FIN_LIGNE:
				return getMARQUE_FIN_LIGNE();
			case SpaceinvadersPackage.SPACES_INVADERS__MARQUE_VIDE:
				return getMARQUE_VIDE();
			case SpaceinvadersPackage.SPACES_INVADERS__MARQUE_VAISSEAU:
				return getMARQUE_VAISSEAU();
			case SpaceinvadersPackage.SPACES_INVADERS__LONGUEUR:
				return getLongueur();
			case SpaceinvadersPackage.SPACES_INVADERS__HAUTEUR:
				return getHauteur();
			case SpaceinvadersPackage.SPACES_INVADERS__VAISSEAU:
				if (resolve) return getVaisseau();
				return basicGetVaisseau();
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
			case SpaceinvadersPackage.SPACES_INVADERS__LONGUEUR:
				setLongueur((Integer)newValue);
				return;
			case SpaceinvadersPackage.SPACES_INVADERS__HAUTEUR:
				setHauteur((Integer)newValue);
				return;
			case SpaceinvadersPackage.SPACES_INVADERS__VAISSEAU:
				setVaisseau((Vaisseau)newValue);
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
			case SpaceinvadersPackage.SPACES_INVADERS__LONGUEUR:
				setLongueur(LONGUEUR_EDEFAULT);
				return;
			case SpaceinvadersPackage.SPACES_INVADERS__HAUTEUR:
				setHauteur(HAUTEUR_EDEFAULT);
				return;
			case SpaceinvadersPackage.SPACES_INVADERS__VAISSEAU:
				setVaisseau((Vaisseau)null);
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
			case SpaceinvadersPackage.SPACES_INVADERS__MARQUE_FIN_LIGNE:
				return marquE_FIN_LIGNE != MARQUE_FIN_LIGNE_EDEFAULT;
			case SpaceinvadersPackage.SPACES_INVADERS__MARQUE_VIDE:
				return marquE_VIDE != MARQUE_VIDE_EDEFAULT;
			case SpaceinvadersPackage.SPACES_INVADERS__MARQUE_VAISSEAU:
				return marquE_VAISSEAU != MARQUE_VAISSEAU_EDEFAULT;
			case SpaceinvadersPackage.SPACES_INVADERS__LONGUEUR:
				return longueur != LONGUEUR_EDEFAULT;
			case SpaceinvadersPackage.SPACES_INVADERS__HAUTEUR:
				return hauteur != HAUTEUR_EDEFAULT;
			case SpaceinvadersPackage.SPACES_INVADERS__VAISSEAU:
				return vaisseau != null;
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
			case SpaceinvadersPackage.SPACES_INVADERS___SPACES_INVADERS__INT_INT:
				return SpacesInvaders((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.SPACES_INVADERS___RECUPERER_ESPACE_JEU_DANS_CHAINE_ASCII:
				return recupererEspaceJeuDansChaineASCII();
			case SpaceinvadersPackage.SPACES_INVADERS___RECUPERER_MARQUE_DE_LA_POSITION__INT:
				return recupererMarqueDeLaPosition((Integer)arguments.get(0));
			case SpaceinvadersPackage.SPACES_INVADERS___AUN_VAISSEAU_QUI_OCCUPE_LA_POSITION__INT_INT:
				return aUnVaisseauQuiOccupeLaPosition((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.SPACES_INVADERS___AUN_VAISSEAU:
				return aUnVaisseau();
			case SpaceinvadersPackage.SPACES_INVADERS___EST_DANS_ESPACE_JEU__INT_INT:
				return estDansEspaceJeu((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_DROITE:
				deplacerVaisseauVersLaDroite();
				return null;
			case SpaceinvadersPackage.SPACES_INVADERS___DEPLACER_VAISSEAU_VERS_LA_GAUCHE:
				deplacerVaisseauVersLaGauche();
				return null;
			case SpaceinvadersPackage.SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__INT_INT_INT_INT:
				positionnerUnNouveauVaisseau((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case SpaceinvadersPackage.SPACES_INVADERS___POSITIONNER_UN_NOUVEAU_VAISSEAU__DIMENSION_POSITION_INT:
				positionnerUnNouveauVaisseau((Dimension)arguments.get(0), (Position)arguments.get(1), (Integer)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MARQUE_FIN_LIGNE: ");
		result.append(marquE_FIN_LIGNE);
		result.append(", MARQUE_VIDE: ");
		result.append(marquE_VIDE);
		result.append(", MARQUE_VAISSEAU: ");
		result.append(marquE_VAISSEAU);
		result.append(", longueur: ");
		result.append(longueur);
		result.append(", hauteur: ");
		result.append(hauteur);
		result.append(')');
		return result.toString();
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //SpacesInvadersImpl
