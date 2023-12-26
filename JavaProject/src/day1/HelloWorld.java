package day1;

import java.util.Scanner;

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        
        String myName = sc.nextLine();
        System.out.println("my name is:" + myName);
	}

}
