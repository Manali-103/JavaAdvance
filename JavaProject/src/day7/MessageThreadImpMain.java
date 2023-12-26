package day7;

public class MessageThreadImpMain extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MessageThreadImpl("Hello",2000);
		Thread t2 = new MessageThreadImpl("Hi", 1000);
		t1.start();
		t2.start();
	}

}
