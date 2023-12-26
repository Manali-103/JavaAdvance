package day5;

public class TestImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				TestInterface ti = new TestImp();
				ti.doTest();
				
				//Invoking a static method using the format: InterfaceName.methodName()
				TestInterface.performTest();
	}

}
