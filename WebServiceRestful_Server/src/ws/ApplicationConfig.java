package ws;

import java.util.Set;

import javax.ws.rs.core.Application;
@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

	
	@Override
	public Set<Class<?>> getClasses(){
		
		Set<Class<?>> resources= new java.util.HashSet<>();
		addRestResouceClasses(resources);
		return resources;
	}
	
	private void addRestResouceClasses(Set<Class<?>> resources){
		resources.add(ws.DemoRest.class);
	}
}
