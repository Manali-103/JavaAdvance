package day8.programatically;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day7.GreetingService;


public class JavaBasedConfigurationMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
       
       Class<SpringConfig> configurationUnit = SpringConfig.class;
       annoCtx.register(configurationUnit);
       
       //refreshing context
       annoCtx.refresh();
       
       Object obj = annoCtx.getBean("helloBean");
       GreetingService gs = (GreetingService)obj;
       String reply = gs.sayGreeting();
       System.out.println(reply);
       
        obj = annoCtx.getBean("MyUserBean");
        gs = (GreetingService)obj;
        reply = gs.sayGreeting();
       System.out.println(reply);
	}

}
