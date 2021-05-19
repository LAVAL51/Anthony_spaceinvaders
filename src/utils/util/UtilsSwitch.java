/**
 */
package utils.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import utils.*;

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
 * @see utils.UtilsPackage
 * @generated
 */
public class UtilsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsSwitch() {
		if (modelPackage == null) {
			modelPackage = UtilsPackage.eINSTANCE;
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
			case UtilsPackage.DEBORDEMENT_ESPACE_JEU_EXCEPTION: {
				DebordementEspaceJeuException debordementEspaceJeuException = (DebordementEspaceJeuException)theEObject;
				T result = caseDebordementEspaceJeuException(debordementEspaceJeuException);
				if (result == null) result = caseRuntimeException(debordementEspaceJeuException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.DEBORDEMENT_ESPACE_JEU_EXCEPTION_DEBORDEMENT_ESPACE_JEU_EXCEPTION: {
				DebordementEspaceJeuException_DebordementEspaceJeuException debordementEspaceJeuException_DebordementEspaceJeuException = (DebordementEspaceJeuException_DebordementEspaceJeuException)theEObject;
				T result = caseDebordementEspaceJeuException_DebordementEspaceJeuException(debordementEspaceJeuException_DebordementEspaceJeuException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.HORS_ESPACE_JEU_EXCEPTION: {
				HorsEspaceJeuException horsEspaceJeuException = (HorsEspaceJeuException)theEObject;
				T result = caseHorsEspaceJeuException(horsEspaceJeuException);
				if (result == null) result = caseRuntimeException(horsEspaceJeuException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.HORS_ESPACE_JEU_EXCEPTION_HORS_ESPACE_JEU_EXCEPTION: {
				HorsEspaceJeuException_HorsEspaceJeuException horsEspaceJeuException_HorsEspaceJeuException = (HorsEspaceJeuException_HorsEspaceJeuException)theEObject;
				T result = caseHorsEspaceJeuException_HorsEspaceJeuException(horsEspaceJeuException_HorsEspaceJeuException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debordement Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debordement Espace Jeu Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebordementEspaceJeuException(DebordementEspaceJeuException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debordement Espace Jeu Exception Debordement Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debordement Espace Jeu Exception Debordement Espace Jeu Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebordementEspaceJeuException_DebordementEspaceJeuException(DebordementEspaceJeuException_DebordementEspaceJeuException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hors Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hors Espace Jeu Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorsEspaceJeuException(HorsEspaceJeuException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hors Espace Jeu Exception Hors Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hors Espace Jeu Exception Hors Espace Jeu Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorsEspaceJeuException_HorsEspaceJeuException(HorsEspaceJeuException_HorsEspaceJeuException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeException(jdk.java.lang.RuntimeException object) {
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

} //UtilsSwitch
