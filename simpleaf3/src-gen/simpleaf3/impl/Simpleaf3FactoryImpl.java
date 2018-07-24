/**
 */
package simpleaf3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleaf3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Simpleaf3FactoryImpl extends EFactoryImpl implements Simpleaf3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Simpleaf3Factory init() {
		try {
			Simpleaf3Factory theSimpleaf3Factory = (Simpleaf3Factory) EPackage.Registry.INSTANCE
					.getEFactory(Simpleaf3Package.eNS_URI);
			if (theSimpleaf3Factory != null) {
				return theSimpleaf3Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Simpleaf3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpleaf3FactoryImpl() {
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
		case Simpleaf3Package.COMPONENT_ARCHITECTURE:
			return createComponentArchitecture();
		case Simpleaf3Package.COMPONENT:
			return createComponent();
		case Simpleaf3Package.INPUT_PORT:
			return createInputPort();
		case Simpleaf3Package.OUTPUT_PORT:
			return createOutputPort();
		case Simpleaf3Package.AUTOMATON:
			return createAutomaton();
		case Simpleaf3Package.STATE:
			return createState();
		case Simpleaf3Package.TRANSITION:
			return createTransition();
		case Simpleaf3Package.CODE_SPECIFICATION:
			return createCodeSpecification();
		case Simpleaf3Package.REQUIREMENT:
			return createRequirement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentArchitecture createComponentArchitecture() {
		ComponentArchitectureImpl componentArchitecture = new ComponentArchitectureImpl();
		return componentArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automaton createAutomaton() {
		AutomatonImpl automaton = new AutomatonImpl();
		return automaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSpecification createCodeSpecification() {
		CodeSpecificationImpl codeSpecification = new CodeSpecificationImpl();
		return codeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpleaf3Package getSimpleaf3Package() {
		return (Simpleaf3Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Simpleaf3Package getPackage() {
		return Simpleaf3Package.eINSTANCE;
	}

} //Simpleaf3FactoryImpl
