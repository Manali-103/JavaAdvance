package day5;

public interface TestInterface {
      void doTest();
      
      default void doTesting() {
    	  System.out.println("testing");
      }
      
      static void performTest() {
    	  System.out.println("performing some test");
      }
}
