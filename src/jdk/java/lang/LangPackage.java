/**
 */
package jdk.java.lang;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jdk.java.lang.LangFactory
 * @model kind="package"
 * @generated
 */
public interface LangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///spaceinvaders2/java/lang.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spaceinvaders2.java.lang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangPackage eINSTANCE = jdk.java.lang.impl.LangPackageImpl.init();

	/**
	 * The meta object id for the '{@link jdk.java.lang.impl.RuntimeExceptionImpl <em>Runtime Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.lang.impl.RuntimeExceptionImpl
	 * @see jdk.java.lang.impl.LangPackageImpl#getRuntimeException()
	 * @generated
	 */
	int RUNTIME_EXCEPTION = 0;

	/**
	 * The number of structural features of the '<em>Runtime Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXCEPTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link jdk.java.lang.RuntimeException <em>Runtime Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Exception</em>'.
	 * @see jdk.java.lang.RuntimeException
	 * @generated
	 */
	EClass getRuntimeException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LangFactory getLangFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jdk.java.lang.impl.RuntimeExceptionImpl <em>Runtime Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.lang.impl.RuntimeExceptionImpl
		 * @see jdk.java.lang.impl.LangPackageImpl#getRuntimeException()
		 * @generated
		 */
		EClass RUNTIME_EXCEPTION = eINSTANCE.getRuntimeException();

	}

} //LangPackage
