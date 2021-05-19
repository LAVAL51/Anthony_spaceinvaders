/**
 */
package utils.impl;

import jdk.java.lang.LangPackage;

import jdk.java.lang.impl.LangPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.junit.JunitPackage;

import org.junit.impl.JunitPackageImpl;

import spaceinvaders.SpaceinvadersPackage;

import spaceinvaders.impl.SpaceinvadersPackageImpl;

import utils.DebordementEspaceJeuException;
import utils.DebordementEspaceJeuException_DebordementEspaceJeuException;
import utils.HorsEspaceJeuException;
import utils.HorsEspaceJeuException_HorsEspaceJeuException;
import utils.UtilsFactory;
import utils.UtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsPackageImpl extends EPackageImpl implements UtilsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debordementEspaceJeuExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debordementEspaceJeuException_DebordementEspaceJeuExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horsEspaceJeuExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horsEspaceJeuException_HorsEspaceJeuExceptionEClass = null;

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
	 * @see utils.UtilsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilsPackageImpl() {
		super(eNS_URI, UtilsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilsPackage init() {
		if (isInited) return (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUtilsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UtilsPackageImpl theUtilsPackage = registeredUtilsPackage instanceof UtilsPackageImpl ? (UtilsPackageImpl)registeredUtilsPackage : new UtilsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl)(registeredPackage instanceof LangPackageImpl ? registeredPackage : LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpaceinvadersPackage.eNS_URI);
		SpaceinvadersPackageImpl theSpaceinvadersPackage = (SpaceinvadersPackageImpl)(registeredPackage instanceof SpaceinvadersPackageImpl ? registeredPackage : SpaceinvadersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JunitPackage.eNS_URI);
		JunitPackageImpl theJunitPackage = (JunitPackageImpl)(registeredPackage instanceof JunitPackageImpl ? registeredPackage : JunitPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilsPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theSpaceinvadersPackage.createPackageContents();
		theJunitPackage.createPackageContents();

		// Initialize created meta-data
		theUtilsPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theSpaceinvadersPackage.initializePackageContents();
		theJunitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilsPackage.eNS_URI, theUtilsPackage);
		return theUtilsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDebordementEspaceJeuException() {
		return debordementEspaceJeuExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDebordementEspaceJeuException__DebordementEspaceJeuException__String() {
		return debordementEspaceJeuExceptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDebordementEspaceJeuException_DebordementEspaceJeuException() {
		return debordementEspaceJeuException_DebordementEspaceJeuExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHorsEspaceJeuException() {
		return horsEspaceJeuExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHorsEspaceJeuException__HorsEspaceJeuException__String() {
		return horsEspaceJeuExceptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHorsEspaceJeuException_HorsEspaceJeuException() {
		return horsEspaceJeuException_HorsEspaceJeuExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UtilsFactory getUtilsFactory() {
		return (UtilsFactory)getEFactoryInstance();
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
		debordementEspaceJeuExceptionEClass = createEClass(DEBORDEMENT_ESPACE_JEU_EXCEPTION);
		createEOperation(debordementEspaceJeuExceptionEClass, DEBORDEMENT_ESPACE_JEU_EXCEPTION___DEBORDEMENT_ESPACE_JEU_EXCEPTION__STRING);

		debordementEspaceJeuException_DebordementEspaceJeuExceptionEClass = createEClass(DEBORDEMENT_ESPACE_JEU_EXCEPTION_DEBORDEMENT_ESPACE_JEU_EXCEPTION);

		horsEspaceJeuExceptionEClass = createEClass(HORS_ESPACE_JEU_EXCEPTION);
		createEOperation(horsEspaceJeuExceptionEClass, HORS_ESPACE_JEU_EXCEPTION___HORS_ESPACE_JEU_EXCEPTION__STRING);

		horsEspaceJeuException_HorsEspaceJeuExceptionEClass = createEClass(HORS_ESPACE_JEU_EXCEPTION_HORS_ESPACE_JEU_EXCEPTION);
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

		// Obtain other dependent packages
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		debordementEspaceJeuExceptionEClass.getESuperTypes().add(theLangPackage.getRuntimeException());
		horsEspaceJeuExceptionEClass.getESuperTypes().add(theLangPackage.getRuntimeException());

		// Initialize classes, features, and operations; add parameters
		initEClass(debordementEspaceJeuExceptionEClass, DebordementEspaceJeuException.class, "DebordementEspaceJeuException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDebordementEspaceJeuException__DebordementEspaceJeuException__String(), this.getDebordementEspaceJeuException(), "DebordementEspaceJeuException", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(debordementEspaceJeuException_DebordementEspaceJeuExceptionEClass, DebordementEspaceJeuException_DebordementEspaceJeuException.class, "DebordementEspaceJeuException_DebordementEspaceJeuException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(horsEspaceJeuExceptionEClass, HorsEspaceJeuException.class, "HorsEspaceJeuException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHorsEspaceJeuException__HorsEspaceJeuException__String(), this.getHorsEspaceJeuException(), "HorsEspaceJeuException", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(horsEspaceJeuException_HorsEspaceJeuExceptionEClass, HorsEspaceJeuException_HorsEspaceJeuException.class, "HorsEspaceJeuException_HorsEspaceJeuException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (debordementEspaceJeuException_DebordementEspaceJeuExceptionEClass,
		   source,
		   new String[] {
			   "originalName", "DebordementEspaceJeuException"
		   });
		addAnnotation
		  (horsEspaceJeuException_HorsEspaceJeuExceptionEClass,
		   source,
		   new String[] {
			   "originalName", "HorsEspaceJeuException"
		   });
	}

} //UtilsPackageImpl
