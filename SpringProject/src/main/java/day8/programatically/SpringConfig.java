package day8.programatically;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import day7.GreetingService;
import day7.HelloService;
import day7.WelcomeService;
import day8.UserGreetingService;
import day8.UserService;

@Configuration //Marks this class as Configuration unit
@ComponentScan //scans the classes annotated with '@Component'
public class SpringConfig {
    @Bean //marks this method as a bean declaration or registered method
	public GreetingService helloBean() {
		GreetingService service = new HelloService();
		return service;
	}
	
    @Bean
	public GreetingService WelcomeBean() {
		GreetingService service = new WelcomeService();
		return service;
	}
    
    @Bean("MyUserBean")
    public GreetingService userBean() {
    	GreetingService service = new UserService();
    	return service;
    }
    
    @Bean("greetingBean")
    @Scope("prototype")
    public GreetingService userGreetingBean() {
    	GreetingService service = new UserGreetingService("Welcome", 45,"Jack");
    	return service;
    }
    

}
