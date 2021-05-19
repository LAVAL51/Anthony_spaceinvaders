/**
 */
package utils.impl;

import java.lang.reflect.InvocationTargetException;

import jdk.java.lang.impl.RuntimeExceptionImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import utils.HorsEspaceJeuException;
import utils.UtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hors Espace Jeu Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HorsEspaceJeuExceptionImpl extends RuntimeExceptionImpl implements HorsEspaceJeuException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorsEspaceJeuExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.HORS_ESPACE_JEU_EXCEPTION;
	}

	/**
	 * The cached OCL expression body for the '{@link #HorsEspaceJeuException(java.lang.String) <em>Hors Espace Jeu Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HorsEspaceJeuException(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HORS_ESPACE_JEU_EXCEPTION__STRING__EOCL_EXP = "super(message);"+
" ";

	/**
	 * The cached OCL query for the '{@link #HorsEspaceJeuException(java.lang.String) <em>Hors Espace Jeu Exception</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HorsEspaceJeuException(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HORS_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorsEspaceJeuException HorsEspaceJeuException(String message) {
		if (HORS_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(UtilsPackage.Literals.HORS_ESPACE_JEU_EXCEPTION, UtilsPackage.Literals.HORS_ESPACE_JEU_EXCEPTION.getEAllOperations().get(0));
			try {
				HORS_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY = helper.createQuery(HORS_ESPACE_JEU_EXCEPTION__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HORS_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("message", message);
		return (HorsEspaceJeuException) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UtilsPackage.HORS_ESPACE_JEU_EXCEPTION___HORS_ESPACE_JEU_EXCEPTION__STRING:
				return HorsEspaceJeuException((String)arguments.get(0));
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

} //HorsEspaceJeuExceptionImpl
