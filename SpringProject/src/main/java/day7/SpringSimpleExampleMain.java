package day7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configPath = "spring-config.xml";
		//String configPath = "src/main/java/day8/day8.programatically/SpringConfig.java";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(configPath);
		
		//Obtaining the object (bean) against its ID
		Object obj = ctx.getBean("myBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = ctx.getBean("myBean2");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
	}

}
