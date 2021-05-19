/**
 */
package spaceinvaders.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import spaceinvaders.Dimension;
import spaceinvaders.SpaceinvadersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.impl.DimensionImpl#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link spaceinvaders.impl.DimensionImpl#getHauteur <em>Hauteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceinvadersPackage.Literals.DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.DIMENSION__LONGUEUR, oldLongueur, longueur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.DIMENSION__HAUTEUR, oldHauteur, hauteur));
	}

	/**
	 * The cached OCL expression body for the '{@link #Dimension(int, int) <em>Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Dimension(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION__INT_INT__EOCL_EXP = "this.longueur = longueur;"+
"		   this.hauteur = hauteur;"+
"	   ";

	/**
	 * The cached OCL query for the '{@link #Dimension(int, int) <em>Dimension</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Dimension(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DIMENSION__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension Dimension(int longueur, int hauteur) {
		if (DIMENSION__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.DIMENSION, SpaceinvadersPackage.Literals.DIMENSION.getEAllOperations().get(0));
			try {
				DIMENSION__INT_INT__EOCL_QRY = helper.createQuery(DIMENSION__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DIMENSION__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("longueur", longueur);
		environment.add("hauteur", hauteur);
		return (Dimension) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #longueur() <em>Longueur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #longueur()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGUEUR__EOCL_EXP = "return this.longueur;"+
"	   ";

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
			helper.setOperationContext(SpaceinvadersPackage.Literals.DIMENSION, SpaceinvadersPackage.Literals.DIMENSION.getEAllOperations().get(1));
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
	 * The cached OCL expression body for the '{@link #hauteur() <em>Hauteur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hauteur()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUTEUR__EOCL_EXP = "return this.hauteur;"+
"	   ";

	/**
	 * The cached OCL query for the '{@link #hauteur() <em>Hauteur</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hauteur()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAUTEUR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int hauteur() {
		if (HAUTEUR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.DIMENSION, SpaceinvadersPackage.Literals.DIMENSION.getEAllOperations().get(2));
			try {
				HAUTEUR__EOCL_QRY = helper.createQuery(HAUTEUR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAUTEUR__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceinvadersPackage.DIMENSION__LONGUEUR:
				return getLongueur();
			case SpaceinvadersPackage.DIMENSION__HAUTEUR:
				return getHauteur();
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
			case SpaceinvadersPackage.DIMENSION__LONGUEUR:
				setLongueur((Integer)newValue);
				return;
			case SpaceinvadersPackage.DIMENSION__HAUTEUR:
				setHauteur((Integer)newValue);
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
			case SpaceinvadersPackage.DIMENSION__LONGUEUR:
				setLongueur(LONGUEUR_EDEFAULT);
				return;
			case SpaceinvadersPackage.DIMENSION__HAUTEUR:
				setHauteur(HAUTEUR_EDEFAULT);
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
			case SpaceinvadersPackage.DIMENSION__LONGUEUR:
				return longueur != LONGUEUR_EDEFAULT;
			case SpaceinvadersPackage.DIMENSION__HAUTEUR:
				return hauteur != HAUTEUR_EDEFAULT;
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
			case SpaceinvadersPackage.DIMENSION___DIMENSION__INT_INT:
				return Dimension((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.DIMENSION___LONGUEUR:
				return longueur();
			case SpaceinvadersPackage.DIMENSION___HAUTEUR:
				return hauteur();
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
		result.append(" (longueur: ");
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

} //DimensionImpl
