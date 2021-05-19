/**
 */
package utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see utils.UtilsPackage
 * @generated
 */
public interface UtilsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsFactory eINSTANCE = utils.impl.UtilsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Debordement Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debordement Espace Jeu Exception</em>'.
	 * @generated
	 */
	DebordementEspaceJeuException createDebordementEspaceJeuException();

	/**
	 * Returns a new object of class '<em>Debordement Espace Jeu Exception Debordement Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debordement Espace Jeu Exception Debordement Espace Jeu Exception</em>'.
	 * @generated
	 */
	DebordementEspaceJeuException_DebordementEspaceJeuException createDebordementEspaceJeuException_DebordementEspaceJeuException();

	/**
	 * Returns a new object of class '<em>Hors Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hors Espace Jeu Exception</em>'.
	 * @generated
	 */
	HorsEspaceJeuException createHorsEspaceJeuException();

	/**
	 * Returns a new object of class '<em>Hors Espace Jeu Exception Hors Espace Jeu Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hors Espace Jeu Exception Hors Espace Jeu Exception</em>'.
	 * @generated
	 */
	HorsEspaceJeuException_HorsEspaceJeuException createHorsEspaceJeuException_HorsEspaceJeuException();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilsPackage getUtilsPackage();

} //UtilsFactory
