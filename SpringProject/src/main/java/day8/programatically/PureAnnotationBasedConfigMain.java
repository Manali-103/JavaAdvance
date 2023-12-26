package day8.programatically;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationBasedConfigMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringConfig> configurationUnit = SpringConfig.class;
		 AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(configurationUnit);
		 //the above statement handles the activity for registration as well as refreshing the context.
		 //hence there is no need to invoke "register()" and "refresh()" methods separately
		 
		 
		 Class<Test> testRef = Test.class;
		 Test obj = annoCtx.getBean(testRef);
		 obj.doTest();
	}

}
