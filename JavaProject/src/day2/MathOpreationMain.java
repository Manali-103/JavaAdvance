package day2;

public class MathOpreationMain {
	static {
		System.out.println("Demonstrating static block and global variables.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adding a static block that gets called during class loading
		
		
			System.out.println("PI value: " + MathOpreation.PI);
			System.out.println(MathOpreation.doAdd(5, 10));
			System.out.println(MathOpreation.doSubtract(5, 10));

		
	}

}

