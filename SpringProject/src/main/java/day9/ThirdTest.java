package day9;

import org.springframework.stereotype.Component;

@Component("Third")
public class ThirdTest {
	public ThirdTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Third test instantiated");
	}
	
	public void doTest() {
		System.out.println("third test works");
	}


}
