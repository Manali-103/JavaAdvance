package day8.programatically;

import org.springframework.stereotype.Component;

@Component //marks this class as a managed component
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Test initiated");
	}
	public void doTest() {
		System.out.println("Test works");
	}

}
