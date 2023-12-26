package day6;

public class MultipleExceptionHandlerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 int x = Integer.parseInt(args[0]);
	      int y = Integer.parseInt(args[1]);
	      int result = x + y;
	      System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Enter at least 2 number");
		}
		catch(ArithmeticException ex) {
			System.out.println("Enter 2nd number as non-zero");
		}
	}

}
