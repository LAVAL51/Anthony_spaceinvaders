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
import spaceinvaders.Vaisseau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vaisseau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.impl.VaisseauImpl#getOrigine <em>Origine</em>}</li>
 *   <li>{@link spaceinvaders.impl.VaisseauImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link spaceinvaders.impl.VaisseauImpl#getVitesse <em>Vitesse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VaisseauImpl extends MinimalEObjectImpl.Container implements Vaisseau {
	/**
	 * The cached value of the '{@link #getOrigine() <em>Origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigine()
	 * @generated
	 * @ordered
	 */
	protected Position origine;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The default value of the '{@link #getVitesse() <em>Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected static final int VITESSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected int vitesse = VITESSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VaisseauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceinvadersPackage.Literals.VAISSEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getOrigine() {
		if (origine != null && origine.eIsProxy()) {
			InternalEObject oldOrigine = (InternalEObject)origine;
			origine = (Position)eResolveProxy(oldOrigine);
			if (origine != oldOrigine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpaceinvadersPackage.VAISSEAU__ORIGINE, oldOrigine, origine));
			}
		}
		return origine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetOrigine() {
		return origine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigine(Position newOrigine) {
		Position oldOrigine = origine;
		origine = newOrigine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.VAISSEAU__ORIGINE, oldOrigine, origine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getDimension() {
		if (dimension != null && dimension.eIsProxy()) {
			InternalEObject oldDimension = (InternalEObject)dimension;
			dimension = (Dimension)eResolveProxy(oldDimension);
			if (dimension != oldDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpaceinvadersPackage.VAISSEAU__DIMENSION, oldDimension, dimension));
			}
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimension(Dimension newDimension) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.VAISSEAU__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVitesse(int newVitesse) {
		int oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.VAISSEAU__VITESSE, oldVitesse, vitesse));
	}

	/**
	 * The cached OCL expression body for the '{@link #Vaisseau(int, int) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String VAISSEAU__INT_INT__EOCL_EXP = "this(longueur, hauteur, 0, 0);";

	/**
	 * The cached OCL query for the '{@link #Vaisseau(int, int) <em>Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> VAISSEAU__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vaisseau Vaisseau(int longueur, int hauteur) {
		if (VAISSEAU__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(0));
			try {
				VAISSEAU__INT_INT__EOCL_QRY = helper.createQuery(VAISSEAU__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(VAISSEAU__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("longueur", longueur);
		environment.add("hauteur", hauteur);
		return (Vaisseau) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #Vaisseau(int, int, int, int) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(int, int, int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String VAISSEAU__INT_INT_INT_INT__EOCL_EXP = "this(new Dimension(longueur, hauteur), new Position(x, y));";

	/**
	 * The cached OCL query for the '{@link #Vaisseau(int, int, int, int) <em>Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(int, int, int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> VAISSEAU__INT_INT_INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vaisseau Vaisseau(int longueur, int hauteur, int x, int y) {
		if (VAISSEAU__INT_INT_INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(1));
			try {
				VAISSEAU__INT_INT_INT_INT__EOCL_QRY = helper.createQuery(VAISSEAU__INT_INT_INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(VAISSEAU__INT_INT_INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("longueur", longueur);
		environment.add("hauteur", hauteur);
		environment.add("x", x);
		environment.add("y", y);
		return (Vaisseau) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #occupeLaPosition(int, int) <em>Occupe La Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #occupeLaPosition(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPE_LA_POSITION__INT_INT__EOCL_EXP = "return estAbscisseCouverte(x) && estOrdonneeCouverte(y);";

	/**
	 * The cached OCL query for the '{@link #occupeLaPosition(int, int) <em>Occupe La Position</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #occupeLaPosition(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> OCCUPE_LA_POSITION__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean occupeLaPosition(int x, int y) {
		if (OCCUPE_LA_POSITION__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(2));
			try {
				OCCUPE_LA_POSITION__INT_INT__EOCL_QRY = helper.createQuery(OCCUPE_LA_POSITION__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(OCCUPE_LA_POSITION__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("x", x);
		environment.add("y", y);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #estOrdonneeCouverte(int) <em>Est Ordonnee Couverte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #estOrdonneeCouverte(int)
	 * @generated
	 * @ordered
	 */
	protected static final String EST_ORDONNEE_COUVERTE__INT__EOCL_EXP = "return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());";

	/**
	 * The cached OCL query for the '{@link #estOrdonneeCouverte(int) <em>Est Ordonnee Couverte</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #estOrdonneeCouverte(int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> EST_ORDONNEE_COUVERTE__INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean estOrdonneeCouverte(int y) {
		if (EST_ORDONNEE_COUVERTE__INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(3));
			try {
				EST_ORDONNEE_COUVERTE__INT__EOCL_QRY = helper.createQuery(EST_ORDONNEE_COUVERTE__INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(EST_ORDONNEE_COUVERTE__INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("y", y);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #estAbscisseCouverte(int) <em>Est Abscisse Couverte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #estAbscisseCouverte(int)
	 * @generated
	 * @ordered
	 */
	protected static final String EST_ABSCISSE_COUVERTE__INT__EOCL_EXP = "return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());";

	/**
	 * The cached OCL query for the '{@link #estAbscisseCouverte(int) <em>Est Abscisse Couverte</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #estAbscisseCouverte(int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> EST_ABSCISSE_COUVERTE__INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean estAbscisseCouverte(int x) {
		if (EST_ABSCISSE_COUVERTE__INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(4));
			try {
				EST_ABSCISSE_COUVERTE__INT__EOCL_QRY = helper.createQuery(EST_ABSCISSE_COUVERTE__INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(EST_ABSCISSE_COUVERTE__INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("x", x);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #ordonneeLaPlusBasse() <em>Ordonnee La Plus Basse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ordonneeLaPlusBasse()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDONNEE_LA_PLUS_BASSE__EOCL_EXP = "return this.origine.ordonnee() - this.dimension.hauteur() + 1;";

	/**
	 * The cached OCL query for the '{@link #ordonneeLaPlusBasse() <em>Ordonnee La Plus Basse</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ordonneeLaPlusBasse()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> ORDONNEE_LA_PLUS_BASSE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int ordonneeLaPlusBasse() {
		if (ORDONNEE_LA_PLUS_BASSE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(5));
			try {
				ORDONNEE_LA_PLUS_BASSE__EOCL_QRY = helper.createQuery(ORDONNEE_LA_PLUS_BASSE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(ORDONNEE_LA_PLUS_BASSE__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #ordonneeLaPlusHaute() <em>Ordonnee La Plus Haute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ordonneeLaPlusHaute()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDONNEE_LA_PLUS_HAUTE__EOCL_EXP = "return this.origine.ordonnee();"+
"  ";

	/**
	 * The cached OCL query for the '{@link #ordonneeLaPlusHaute() <em>Ordonnee La Plus Haute</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ordonneeLaPlusHaute()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> ORDONNEE_LA_PLUS_HAUTE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int ordonneeLaPlusHaute() {
		if (ORDONNEE_LA_PLUS_HAUTE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(6));
			try {
				ORDONNEE_LA_PLUS_HAUTE__EOCL_QRY = helper.createQuery(ORDONNEE_LA_PLUS_HAUTE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(ORDONNEE_LA_PLUS_HAUTE__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #abscisseLaPlusADroite() <em>Abscisse La Plus ADroite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #abscisseLaPlusADroite()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSCISSE_LA_PLUS_ADROITE__EOCL_EXP = "return this.origine.abscisse() + this.dimension.longueur() - 1;"+
"  ";

	/**
	 * The cached OCL query for the '{@link #abscisseLaPlusADroite() <em>Abscisse La Plus ADroite</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #abscisseLaPlusADroite()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> ABSCISSE_LA_PLUS_ADROITE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int abscisseLaPlusADroite() {
		if (ABSCISSE_LA_PLUS_ADROITE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(7));
			try {
				ABSCISSE_LA_PLUS_ADROITE__EOCL_QRY = helper.createQuery(ABSCISSE_LA_PLUS_ADROITE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(ABSCISSE_LA_PLUS_ADROITE__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #abscisseLaPlusAGauche() <em>Abscisse La Plus AGauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #abscisseLaPlusAGauche()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSCISSE_LA_PLUS_AGAUCHE__EOCL_EXP = "return this.origine.abscisse();"+
"  ";

	/**
	 * The cached OCL query for the '{@link #abscisseLaPlusAGauche() <em>Abscisse La Plus AGauche</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #abscisseLaPlusAGauche()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> ABSCISSE_LA_PLUS_AGAUCHE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int abscisseLaPlusAGauche() {
		if (ABSCISSE_LA_PLUS_AGAUCHE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(8));
			try {
				ABSCISSE_LA_PLUS_AGAUCHE__EOCL_QRY = helper.createQuery(ABSCISSE_LA_PLUS_AGAUCHE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(ABSCISSE_LA_PLUS_AGAUCHE__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #seDeplacerVersLaDroite() <em>Se Deplacer Vers La Droite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #seDeplacerVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static final String SE_DEPLACER_VERS_LA_DROITE__EOCL_EXP = "this.origine.changerAbscisse(this.origine.abscisse() + vitesse);"+
"	";

	/**
	 * The cached OCL query for the '{@link #seDeplacerVersLaDroite() <em>Se Deplacer Vers La Droite</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #seDeplacerVersLaDroite()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> SE_DEPLACER_VERS_LA_DROITE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void seDeplacerVersLaDroite() {
		if (SE_DEPLACER_VERS_LA_DROITE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(9));
			try {
				SE_DEPLACER_VERS_LA_DROITE__EOCL_QRY = helper.createQuery(SE_DEPLACER_VERS_LA_DROITE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(SE_DEPLACER_VERS_LA_DROITE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #seDeplacerVersLaGauche() <em>Se Deplacer Vers La Gauche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #seDeplacerVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static final String SE_DEPLACER_VERS_LA_GAUCHE__EOCL_EXP = "this.origine.changerAbscisse(this.origine.abscisse() - vitesse);"+
"	";

	/**
	 * The cached OCL query for the '{@link #seDeplacerVersLaGauche() <em>Se Deplacer Vers La Gauche</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #seDeplacerVersLaGauche()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> SE_DEPLACER_VERS_LA_GAUCHE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void seDeplacerVersLaGauche() {
		if (SE_DEPLACER_VERS_LA_GAUCHE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(10));
			try {
				SE_DEPLACER_VERS_LA_GAUCHE__EOCL_QRY = helper.createQuery(SE_DEPLACER_VERS_LA_GAUCHE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(SE_DEPLACER_VERS_LA_GAUCHE__EOCL_QRY);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #positionner(int, int) <em>Positionner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positionner(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIONNER__INT_INT__EOCL_EXP = "this.origine.changerAbscisse(x);"+
"	   this.origine.changerOrdonnee(y);"+
"  ";

	/**
	 * The cached OCL query for the '{@link #positionner(int, int) <em>Positionner</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positionner(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> POSITIONNER__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void positionner(int x, int y) {
		if (POSITIONNER__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(11));
			try {
				POSITIONNER__INT_INT__EOCL_QRY = helper.createQuery(POSITIONNER__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(POSITIONNER__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("x", x);
		environment.add("y", y);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #longueur() <em>Longueur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #longueur()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGUEUR__EOCL_EXP = "return dimension.longueur;"+
"	";

	/**
	 * The cached OCL query for the '{@link #longueur() <em>Longueur</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #longueur()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> LONGUEUR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int longueur() {
		if (LONGUEUR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(12));
			try {
				LONGUEUR__EOCL_QRY = helper.createQuery(LONGUEUR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(LONGUEUR__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int)
	 * @generated
	 * @ordered
	 */
	protected static final String VAISSEAU__DIMENSION_POSITION_INT__EOCL_EXP = "this.dimension = dimension;"+
"		this.origine = positionOrigine;"+
"		this.vitesse = vitesse;"+
"	";

	/**
	 * The cached OCL query for the '{@link #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int) <em>Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vaisseau Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		if (VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(13));
			try {
				VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY = helper.createQuery(VAISSEAU__DIMENSION_POSITION_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(VAISSEAU__DIMENSION_POSITION_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("dimension", dimension);
		environment.add("positionOrigine", positionOrigine);
		environment.add("vitesse", vitesse);
		return (Vaisseau) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position) <em>Vaisseau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position)
	 * @generated
	 * @ordered
	 */
	protected static final String VAISSEAU__DIMENSION_POSITION__EOCL_EXP = "this(dimension, positionOrigine, 1);"+
"	";

	/**
	 * The cached OCL query for the '{@link #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position) <em>Vaisseau</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Vaisseau(spaceinvaders.Dimension, spaceinvaders.Position)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> VAISSEAU__DIMENSION_POSITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vaisseau Vaisseau(Dimension dimension, Position positionOrigine) {
		if (VAISSEAU__DIMENSION_POSITION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.VAISSEAU, SpaceinvadersPackage.Literals.VAISSEAU.getEAllOperations().get(14));
			try {
				VAISSEAU__DIMENSION_POSITION__EOCL_QRY = helper.createQuery(VAISSEAU__DIMENSION_POSITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(VAISSEAU__DIMENSION_POSITION__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("dimension", dimension);
		environment.add("positionOrigine", positionOrigine);
		return (Vaisseau) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceinvadersPackage.VAISSEAU__ORIGINE:
				if (resolve) return getOrigine();
				return basicGetOrigine();
			case SpaceinvadersPackage.VAISSEAU__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
			case SpaceinvadersPackage.VAISSEAU__VITESSE:
				return getVitesse();
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
			case SpaceinvadersPackage.VAISSEAU__ORIGINE:
				setOrigine((Position)newValue);
				return;
			case SpaceinvadersPackage.VAISSEAU__DIMENSION:
				setDimension((Dimension)newValue);
				return;
			case SpaceinvadersPackage.VAISSEAU__VITESSE:
				setVitesse((Integer)newValue);
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
			case SpaceinvadersPackage.VAISSEAU__ORIGINE:
				setOrigine((Position)null);
				return;
			case SpaceinvadersPackage.VAISSEAU__DIMENSION:
				setDimension((Dimension)null);
				return;
			case SpaceinvadersPackage.VAISSEAU__VITESSE:
				setVitesse(VITESSE_EDEFAULT);
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
			case SpaceinvadersPackage.VAISSEAU__ORIGINE:
				return origine != null;
			case SpaceinvadersPackage.VAISSEAU__DIMENSION:
				return dimension != null;
			case SpaceinvadersPackage.VAISSEAU__VITESSE:
				return vitesse != VITESSE_EDEFAULT;
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
			case SpaceinvadersPackage.VAISSEAU___VAISSEAU__INT_INT:
				return Vaisseau((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.VAISSEAU___VAISSEAU__INT_INT_INT_INT:
				return Vaisseau((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case SpaceinvadersPackage.VAISSEAU___OCCUPE_LA_POSITION__INT_INT:
				return occupeLaPosition((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.VAISSEAU___EST_ORDONNEE_COUVERTE__INT:
				return estOrdonneeCouverte((Integer)arguments.get(0));
			case SpaceinvadersPackage.VAISSEAU___EST_ABSCISSE_COUVERTE__INT:
				return estAbscisseCouverte((Integer)arguments.get(0));
			case SpaceinvadersPackage.VAISSEAU___ORDONNEE_LA_PLUS_BASSE:
				return ordonneeLaPlusBasse();
			case SpaceinvadersPackage.VAISSEAU___ORDONNEE_LA_PLUS_HAUTE:
				return ordonneeLaPlusHaute();
			case SpaceinvadersPackage.VAISSEAU___ABSCISSE_LA_PLUS_ADROITE:
				return abscisseLaPlusADroite();
			case SpaceinvadersPackage.VAISSEAU___ABSCISSE_LA_PLUS_AGAUCHE:
				return abscisseLaPlusAGauche();
			case SpaceinvadersPackage.VAISSEAU___SE_DEPLACER_VERS_LA_DROITE:
				seDeplacerVersLaDroite();
				return null;
			case SpaceinvadersPackage.VAISSEAU___SE_DEPLACER_VERS_LA_GAUCHE:
				seDeplacerVersLaGauche();
				return null;
			case SpaceinvadersPackage.VAISSEAU___POSITIONNER__INT_INT:
				positionner((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case SpaceinvadersPackage.VAISSEAU___LONGUEUR:
				return longueur();
			case SpaceinvadersPackage.VAISSEAU___VAISSEAU__DIMENSION_POSITION_INT:
				return Vaisseau((Dimension)arguments.get(0), (Position)arguments.get(1), (Integer)arguments.get(2));
			case SpaceinvadersPackage.VAISSEAU___VAISSEAU__DIMENSION_POSITION:
				return Vaisseau((Dimension)arguments.get(0), (Position)arguments.get(1));
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
		result.append(" (vitesse: ");
		result.append(vitesse);
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

} //VaisseauImpl
