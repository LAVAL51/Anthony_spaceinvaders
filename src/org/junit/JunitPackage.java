/**
 */
package org.junit;

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
 * @see org.junit.JunitFactory
 * @model kind="package"
 * @generated
 */
public interface JunitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "junit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///spaceinvaders2/org/junit.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spaceinvaders2.org.junit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JunitPackage eINSTANCE = org.junit.impl.JunitPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.junit.impl.AssertImpl <em>Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.junit.impl.AssertImpl
	 * @see org.junit.impl.JunitPackageImpl#getAssert()
	 * @generated
	 */
	int ASSERT = 0;

	/**
	 * The number of structural features of the '<em>Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.junit.Test <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.junit.Test
	 * @see org.junit.impl.JunitPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 1;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.junit.Before <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.junit.Before
	 * @see org.junit.impl.JunitPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 2;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.junit.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert</em>'.
	 * @see org.junit.Assert
	 * @generated
	 */
	EClass getAssert();

	/**
	 * Returns the meta object for class '{@link org.junit.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.junit.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for class '{@link org.junit.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see org.junit.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JunitFactory getJunitFactory();

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
		 * The meta object literal for the '{@link org.junit.impl.AssertImpl <em>Assert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.junit.impl.AssertImpl
		 * @see org.junit.impl.JunitPackageImpl#getAssert()
		 * @generated
		 */
		EClass ASSERT = eINSTANCE.getAssert();

		/**
		 * The meta object literal for the '{@link org.junit.Test <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.junit.Test
		 * @see org.junit.impl.JunitPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '{@link org.junit.Before <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.junit.Before
		 * @see org.junit.impl.JunitPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

	}

} //JunitPackage
