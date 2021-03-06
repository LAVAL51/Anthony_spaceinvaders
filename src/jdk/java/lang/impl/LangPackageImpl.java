/**
 */
package jdk.java.lang.impl;

import jdk.java.lang.LangFactory;
import jdk.java.lang.LangPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.junit.JunitPackage;

import org.junit.impl.JunitPackageImpl;

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
public class LangPackageImpl extends EPackageImpl implements LangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeExceptionEClass = null;

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
	 * @see jdk.java.lang.LangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LangPackageImpl() {
		super(eNS_URI, LangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LangPackage init() {
		if (isInited) return (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LangPackageImpl theLangPackage = registeredLangPackage instanceof LangPackageImpl ? (LangPackageImpl)registeredLangPackage : new LangPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpaceinvadersPackage.eNS_URI);
		SpaceinvadersPackageImpl theSpaceinvadersPackage = (SpaceinvadersPackageImpl)(registeredPackage instanceof SpaceinvadersPackageImpl ? registeredPackage : SpaceinvadersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JunitPackage.eNS_URI);
		JunitPackageImpl theJunitPackage = (JunitPackageImpl)(registeredPackage instanceof JunitPackageImpl ? registeredPackage : JunitPackage.eINSTANCE);

		// Create package meta-data objects
		theLangPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theSpaceinvadersPackage.createPackageContents();
		theJunitPackage.createPackageContents();

		// Initialize created meta-data
		theLangPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theSpaceinvadersPackage.initializePackageContents();
		theJunitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLangPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LangPackage.eNS_URI, theLangPackage);
		return theLangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeException() {
		return runtimeExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangFactory getLangFactory() {
		return (LangFactory)getEFactoryInstance();
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
		runtimeExceptionEClass = createEClass(RUNTIME_EXCEPTION);
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
		initEClass(runtimeExceptionEClass, jdk.java.lang.RuntimeException.class, "RuntimeException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LangPackageImpl
