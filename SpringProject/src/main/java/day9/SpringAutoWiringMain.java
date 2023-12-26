package day9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutoWiringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<SpringAutoWireConfig> configClass = 
        		SpringAutoWireConfig.class;
        AnnotationConfigApplicationContext annoctx = new
        		AnnotationConfigApplicationContext(configClass);
        
        Object carObj = annoctx.getBean("myCar");
        System.out.println(carObj);
        }

}
