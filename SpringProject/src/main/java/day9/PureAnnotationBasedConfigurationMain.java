package day9;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day9_four.FourthTest;
import day9_four.another.AnotherFourthTest;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Class<SpringAppConfig> ConfigClass =  SpringAppConfig.class;
      AnnotationConfigApplicationContext annoctx = new AnnotationConfigApplicationContext(ConfigClass);
      
      //loading a bean of type:FirstTest
      FirstTest first = annoctx.getBean(FirstTest.class);
      SecondTest sec = annoctx.getBean(SecondTest.class);
      Object obj = annoctx.getBean("Third");
      ThirdTest th = (ThirdTest)obj;
      FourthTest Fr = annoctx.getBean(FourthTest.class);
      //this will not work cause not in same package this will work only when we declared componentscan Specific pkg name
      
      AnotherFourthTest Fr1 = annoctx.getBean(AnotherFourthTest.class);
      first.doTest();
      
      sec.doTest();
      
      th.doTest();
      
      Fr.doTest();
      Fr1.doTest();
      
      
//      System.out.println("-------------Accessing bean of type java.util.List------------------");
//		
//		obj = annoctx.getBean("countries");
//		List<String> listOfCountries = (List<String>)obj;
//		//listOfCountries.stream().forEach(ctr -> System.out.println(ctr));
//		System.out.println(listOfCountries);
	}

}
