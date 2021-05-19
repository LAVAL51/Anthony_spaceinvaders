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

import spaceinvaders.Position;
import spaceinvaders.SpaceinvadersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spaceinvaders.impl.PositionImpl#getX <em>X</em>}</li>
 *   <li>{@link spaceinvaders.impl.PositionImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceinvadersPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.POSITION__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceinvadersPackage.POSITION__Y, oldY, y));
	}

	/**
	 * The cached OCL expression body for the '{@link #Position(int, int) <em>Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Position(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION__INT_INT__EOCL_EXP = "this.x = x;"+
"		   this.y = y;"+
"	   ";

	/**
	 * The cached OCL query for the '{@link #Position(int, int) <em>Position</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Position(int, int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> POSITION__INT_INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position Position(int x, int y) {
		if (POSITION__INT_INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.POSITION, SpaceinvadersPackage.Literals.POSITION.getEAllOperations().get(0));
			try {
				POSITION__INT_INT__EOCL_QRY = helper.createQuery(POSITION__INT_INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(POSITION__INT_INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("x", x);
		environment.add("y", y);
		return (Position) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #abscisse() <em>Abscisse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #abscisse()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSCISSE__EOCL_EXP = "return this.x;"+
"	   ";

	/**
	 * The cached OCL query for the '{@link #abscisse() <em>Abscisse</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #abscisse()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> ABSCISSE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int abscisse() {
		if (ABSCISSE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.POSITION, SpaceinvadersPackage.Literals.POSITION.getEAllOperations().get(1));
			try {
				ABSCISSE__EOCL_QRY = helper.createQuery(ABSCISSE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(ABSCISSE__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #ordonnee() <em>Ordonnee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ordonnee()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDONNEE__EOCL_EXP = "return this.y;"+
"	  ";

	/**
	 * The cached OCL query for the '{@link #ordonnee() <em>Ordonnee</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ordonnee()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> ORDONNEE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int ordonnee() {
		if (ORDONNEE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.POSITION, SpaceinvadersPackage.Literals.POSITION.getEAllOperations().get(2));
			try {
				ORDONNEE__EOCL_QRY = helper.createQuery(ORDONNEE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(ORDONNEE__EOCL_QRY);
		return ((Integer) query.evaluate(this)).intValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #changerAbscisse(int) <em>Changer Abscisse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #changerAbscisse(int)
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGER_ABSCISSE__INT__EOCL_EXP = "this.x = nouvelleAbscisse;"+
"	   ";

	/**
	 * The cached OCL query for the '{@link #changerAbscisse(int) <em>Changer Abscisse</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #changerAbscisse(int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> CHANGER_ABSCISSE__INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changerAbscisse(int nouvelleAbscisse) {
		if (CHANGER_ABSCISSE__INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.POSITION, SpaceinvadersPackage.Literals.POSITION.getEAllOperations().get(3));
			try {
				CHANGER_ABSCISSE__INT__EOCL_QRY = helper.createQuery(CHANGER_ABSCISSE__INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(CHANGER_ABSCISSE__INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("nouvelleAbscisse", nouvelleAbscisse);
		return (void) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #changerOrdonnee(int) <em>Changer Ordonnee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #changerOrdonnee(int)
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGER_ORDONNEE__INT__EOCL_EXP = "this.y = nouvelleOrdonnee;"+
"	   ";

	/**
	 * The cached OCL query for the '{@link #changerOrdonnee(int) <em>Changer Ordonnee</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #changerOrdonnee(int)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> CHANGER_ORDONNEE__INT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changerOrdonnee(int nouvelleOrdonnee) {
		if (CHANGER_ORDONNEE__INT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SpaceinvadersPackage.Literals.POSITION, SpaceinvadersPackage.Literals.POSITION.getEAllOperations().get(4));
			try {
				CHANGER_ORDONNEE__INT__EOCL_QRY = helper.createQuery(CHANGER_ORDONNEE__INT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(CHANGER_ORDONNEE__INT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("nouvelleOrdonnee", nouvelleOrdonnee);
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
			case SpaceinvadersPackage.POSITION__X:
				return getX();
			case SpaceinvadersPackage.POSITION__Y:
				return getY();
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
			case SpaceinvadersPackage.POSITION__X:
				setX((Integer)newValue);
				return;
			case SpaceinvadersPackage.POSITION__Y:
				setY((Integer)newValue);
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
			case SpaceinvadersPackage.POSITION__X:
				setX(X_EDEFAULT);
				return;
			case SpaceinvadersPackage.POSITION__Y:
				setY(Y_EDEFAULT);
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
			case SpaceinvadersPackage.POSITION__X:
				return x != X_EDEFAULT;
			case SpaceinvadersPackage.POSITION__Y:
				return y != Y_EDEFAULT;
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
			case SpaceinvadersPackage.POSITION___POSITION__INT_INT:
				return Position((Integer)arguments.get(0), (Integer)arguments.get(1));
			case SpaceinvadersPackage.POSITION___ABSCISSE:
				return abscisse();
			case SpaceinvadersPackage.POSITION___ORDONNEE:
				return ordonnee();
			case SpaceinvadersPackage.POSITION___CHANGER_ABSCISSE__INT:
				changerAbscisse((Integer)arguments.get(0));
				return null;
			case SpaceinvadersPackage.POSITION___CHANGER_ORDONNEE__INT:
				changerOrdonnee((Integer)arguments.get(0));
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
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

} //PositionImpl
