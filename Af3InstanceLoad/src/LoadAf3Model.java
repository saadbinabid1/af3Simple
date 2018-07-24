import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simpleaf3.Component;
import simpleaf3.ComponentArchitecture;
import simpleaf3.Requirement;
import simpleaf3.Simpleaf3Package;

public class LoadAf3Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Initialize the model
        Simpleaf3Package.eINSTANCE.eClass();

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("simpleaf3", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI("file:/C:/Users/SaadBinAbid/runtime-af3_Asset2_Sample/simpleaf3.example/My.simpleaf3"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        ComponentArchitecture compArch = (ComponentArchitecture) resource.getContents().get(0);
        System.out.println("Component Architecture------>>>>>><"+compArch.getName()) ;
        
//        Requirement req= new Simpleaf3FactoryImpl().eINSTANCE.createRequirement();
//        req.setName("Demo_Requirement");
//        req.setDescription("Saad created Requirement");
//        req.setId("5032");
                
//        compArch.getRequirements().add(req);
     // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        EList<Component> comps= compArch.getComponents();
        for (Component comp1: comps)
        {
            System.out.println("Comp name------>>>>>"+  comp1.getName());
        }
        
        EList<Requirement> reqs= compArch.getRequirements();
        for (Requirement req1: reqs)
        {
            System.out.println("Req name------>>>>>"+  req1.getName());
        }

	}

}
