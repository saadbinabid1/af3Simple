/**
 */
package simpleaf3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleaf3.Automaton#getStates <em>States</em>}</li>
 *   <li>{@link simpleaf3.Automaton#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see simpleaf3.Simpleaf3Package#getAutomaton()
 * @model
 * @generated
 */
public interface Automaton extends Behavior {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link simpleaf3.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see simpleaf3.Simpleaf3Package#getAutomaton_States()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link simpleaf3.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see simpleaf3.Simpleaf3Package#getAutomaton_Transitions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Automaton
