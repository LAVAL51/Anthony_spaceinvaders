/**
 */
package utils.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import utils.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see utils.UtilsPackage
 * @generated
 */
public class UtilsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UtilsPackage.eINSTANCE;
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
	protected UtilsSwitch<Adapter> modelSwitch =
		new UtilsSwitch<Adapter>() {
			@Override
			public Adapter caseDebordementEspaceJeuException(DebordementEspaceJeuException object) {
				return createDebordementEspaceJeuExceptionAdapter();
			}
			@Override
			public Adapter caseDebordementEspaceJeuException_DebordementEspaceJeuException(DebordementEspaceJeuException_DebordementEspaceJeuException object) {
				return createDebordementEspaceJeuException_DebordementEspaceJeuExceptionAdapter();
			}
			@Override
			public Adapter caseHorsEspaceJeuException(HorsEspaceJeuException object) {
				return createHorsEspaceJeuExceptionAdapter();
			}
			@Override
			public Adapter caseHorsEspaceJeuException_HorsEspaceJeuException(HorsEspaceJeuException_HorsEspaceJeuException object) {
				return createHorsEspaceJeuException_HorsEspaceJeuExceptionAdapter();
			}
			@Override
			public Adapter caseRuntimeException(jdk.java.lang.RuntimeException object) {
				return createRuntimeExceptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link utils.DebordementEspaceJeuException <em>Debordement Espace Jeu Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see utils.DebordementEspaceJeuException
	 * @generated
	 */
	public Adapter createDebordementEspaceJeuExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link utils.DebordementEspaceJeuException_DebordementEspaceJeuException <em>Debordement Espace Jeu Exception Debordement Espace Jeu Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see utils.DebordementEspaceJeuException_DebordementEspaceJeuException
	 * @generated
	 */
	public Adapter createDebordementEspaceJeuException_DebordementEspaceJeuExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link utils.HorsEspaceJeuException <em>Hors Espace Jeu Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see utils.HorsEspaceJeuException
	 * @generated
	 */
	public Adapter createHorsEspaceJeuExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link utils.HorsEspaceJeuException_HorsEspaceJeuException <em>Hors Espace Jeu Exception Hors Espace Jeu Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see utils.HorsEspaceJeuException_HorsEspaceJeuException
	 * @generated
	 */
	public Adapter createHorsEspaceJeuException_HorsEspaceJeuExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jdk.java.lang.RuntimeException <em>Runtime Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jdk.java.lang.RuntimeException
	 * @generated
	 */
	public Adapter createRuntimeExceptionAdapter() {
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

} //UtilsAdapterFactory
