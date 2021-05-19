/**
 */
package utils.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import utils.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsFactoryImpl extends EFactoryImpl implements UtilsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilsFactory init() {
		try {
			UtilsFactory theUtilsFactory = (UtilsFactory)EPackage.Registry.INSTANCE.getEFactory(UtilsPackage.eNS_URI);
			if (theUtilsFactory != null) {
				return theUtilsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UtilsPackage.DEBORDEMENT_ESPACE_JEU_EXCEPTION: return createDebordementEspaceJeuException();
			case UtilsPackage.DEBORDEMENT_ESPACE_JEU_EXCEPTION_DEBORDEMENT_ESPACE_JEU_EXCEPTION: return createDebordementEspaceJeuException_DebordementEspaceJeuException();
			case UtilsPackage.HORS_ESPACE_JEU_EXCEPTION: return createHorsEspaceJeuException();
			case UtilsPackage.HORS_ESPACE_JEU_EXCEPTION_HORS_ESPACE_JEU_EXCEPTION: return createHorsEspaceJeuException_HorsEspaceJeuException();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DebordementEspaceJeuException createDebordementEspaceJeuException() {
		DebordementEspaceJeuExceptionImpl debordementEspaceJeuException = new DebordementEspaceJeuExceptionImpl();
		return debordementEspaceJeuException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DebordementEspaceJeuException_DebordementEspaceJeuException createDebordementEspaceJeuException_DebordementEspaceJeuException() {
		DebordementEspaceJeuException_DebordementEspaceJeuExceptionImpl debordementEspaceJeuException_DebordementEspaceJeuException = new DebordementEspaceJeuException_DebordementEspaceJeuExceptionImpl();
		return debordementEspaceJeuException_DebordementEspaceJeuException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HorsEspaceJeuException createHorsEspaceJeuException() {
		HorsEspaceJeuExceptionImpl horsEspaceJeuException = new HorsEspaceJeuExceptionImpl();
		return horsEspaceJeuException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HorsEspaceJeuException_HorsEspaceJeuException createHorsEspaceJeuException_HorsEspaceJeuException() {
		HorsEspaceJeuException_HorsEspaceJeuExceptionImpl horsEspaceJeuException_HorsEspaceJeuException = new HorsEspaceJeuException_HorsEspaceJeuExceptionImpl();
		return horsEspaceJeuException_HorsEspaceJeuException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UtilsPackage getUtilsPackage() {
		return (UtilsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilsPackage getPackage() {
		return UtilsPackage.eINSTANCE;
	}

} //UtilsFactoryImpl
