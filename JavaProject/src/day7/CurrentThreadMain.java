package day7;

public class CurrentThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Obtaining the handle to the currently running thread : Main Thread
				Thread mainThreadRef = Thread.currentThread();
				int mainThreadPriority = mainThreadRef.getPriority();
				String mainThreadName = mainThreadRef.getName();
				System.out.println("Main thread priority: " + mainThreadPriority);
				System.out.println("Main thread name: " + mainThreadName);
				
				//Stopping this main thread
				mainThreadRef.stop();
				
				System.out.println("This statement will not get printed");

	}

}
