package day10;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMvcWebApplicationInitializer implements WebApplicationInitializer {
  //this class is used to configured front controller: DispatcherServlet to accept any request
	
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		WebApplicationContext webCtx = getContext();
        DispatcherServlet frontControllerServlet = new DispatcherServlet(webCtx);
        ServletRegistration.Dynamic dispatcher =
        servletContext.addServlet("frontController", frontControllerServlet);
        
        dispatcher.addMapping("/");
        
	}
  private WebApplicationContext getContext() {
	  AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
	  webCtx.setConfigLocations("day10");
	  return webCtx;
  }
}
