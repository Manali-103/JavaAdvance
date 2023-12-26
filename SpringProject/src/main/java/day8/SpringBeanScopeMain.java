package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeMain {

	public SpringBeanScopeMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
	     Object obj =  ctx.getBean("myBean4"); 
	     Object obj2 =  ctx.getBean("myBean4"); 
	     Object obj3 =  ctx.getBean("myBean4"); 
	     
	     System.out.println(obj == obj2);
	     System.out.println(obj == obj3);
	     System.out.println("------------------------");
	     
	      obj =  ctx.getBean("myBean5"); 
	     obj2 =  ctx.getBean("myBean5"); 
	      obj3 =  ctx.getBean("myBean5"); 
	     
	     System.out.println(obj == obj2);
	     System.out.println(obj == obj3);
	     
	}

}
