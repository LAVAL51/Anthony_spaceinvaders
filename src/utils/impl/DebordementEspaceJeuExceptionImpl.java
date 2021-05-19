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

import utils.DebordementEspaceJeuException;
import utils.UtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debordement Espace Jeu Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DebordementEspaceJeuExceptionImpl extends RuntimeExceptionImpl implements DebordementEspaceJeuException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebordementEspaceJeuExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.DEBORDEMENT_ESPACE_JEU_EXCEPTION;
	}

	/**
	 * The cached OCL expression body for the '{@link #DebordementEspaceJeuException(java.lang.String) <em>Debordement Espace Jeu Exception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DebordementEspaceJeuException(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING__EOCL_EXP = "super(message);"+
" ";

	/**
	 * The cached OCL query for the '{@link #DebordementEspaceJeuException(java.lang.String) <em>Debordement Espace Jeu Exception</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DebordementEspaceJeuException(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebordementEspaceJeuException DebordementEspaceJeuException(String message) {
		if (DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(UtilsPackage.Literals.DEBORDEMENT_ESPACE_JEU_EXCEPTION, UtilsPackage.Literals.DEBORDEMENT_ESPACE_JEU_EXCEPTION.getEAllOperations().get(0));
			try {
				DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY = helper.createQuery(DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("message", message);
		return (DebordementEspaceJeuException) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UtilsPackage.DEBORDEMENT_ESPACE_JEU_EXCEPTION___DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING:
				return DebordementEspaceJeuException((String)arguments.get(0));
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

} //DebordementEspaceJeuExceptionImpl
