/**
 */
package org.junit.impl;

import jdk.java.lang.LangPackage;

import jdk.java.lang.impl.LangPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.JunitFactory;
import org.junit.JunitPackage;
import org.junit.Test;

import spaceinvaders.SpaceinvadersPackage;

import spaceinvaders.impl.SpaceinvadersPackageImpl;

import utils.UtilsPackage;

import utils.impl.UtilsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JunitPackageImpl extends EPackageImpl implements JunitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.junit.JunitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JunitPackageImpl() {
		super(eNS_URI, JunitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JunitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JunitPackage init() {
		if (isInited) return (JunitPackage)EPackage.Registry.INSTANCE.getEPackage(JunitPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJunitPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JunitPackageImpl theJunitPackage = registeredJunitPackage instanceof JunitPackageImpl ? (JunitPackageImpl)registeredJunitPackage : new JunitPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl)(registeredPackage instanceof LangPackageImpl ? registeredPackage : LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpaceinvadersPackage.eNS_URI);
		SpaceinvadersPackageImpl theSpaceinvadersPackage = (SpaceinvadersPackageImpl)(registeredPackage instanceof SpaceinvadersPackageImpl ? registeredPackage : SpaceinvadersPackage.eINSTANCE);

		// Create package meta-data objects
		theJunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theSpaceinvadersPackage.createPackageContents();

		// Initialize created meta-data
		theJunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theSpaceinvadersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJunitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JunitPackage.eNS_URI, theJunitPackage);
		return theJunitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssert() {
		return assertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBefore() {
		return beforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JunitFactory getJunitFactory() {
		return (JunitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assertEClass = createEClass(ASSERT);

		testEClass = createEClass(TEST);

		beforeEClass = createEClass(BEFORE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(assertEClass, Assert.class, "Assert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testEClass, Test.class, "Test", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beforeEClass, Before.class, "Before", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JunitPackageImpl
