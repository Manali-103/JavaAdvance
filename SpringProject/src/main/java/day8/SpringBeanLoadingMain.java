package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLoadingMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
      //ctx.getBean("myBean3"); when this line executes, spring instantiated the beans becauses it behaviour is LAZY
	}

}
