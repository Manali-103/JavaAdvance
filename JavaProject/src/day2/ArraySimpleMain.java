package day2;

public class ArraySimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Declaring an array of 5 integers;
		int num[] = new int[5];
		num[0]= 12;
		num[1]= 13;
		num [2]= 16;
		num[3]=14;
		num[4]=15;
		
		//Declaring and initializing the array simultaneously
		int numList[] = {10,20,30,40,50};
		int size = numList.length;
		// Printing the numbers from start to end 
		for(int index = 0; index<size; index++) {
			int number = numList[index];
			System.out.println(number);
		}
		
		System.out.println("-----------------");
		//printing the number from start to end using for-each loop
		
		//for(int number : numList)
		//	System.out.println(number * number);
    }

}
