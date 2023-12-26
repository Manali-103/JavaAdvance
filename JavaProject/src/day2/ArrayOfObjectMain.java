package day2;

public class ArrayOfObjectMain {
	private static void printMinorPersonNames(Person[] personListRef) {
		for(Person currentPerson : personListRef) {
			int currentPersonAge = currentPerson.getAge();
			String currentPersonName = currentPerson.getName();
			if(currentPersonAge < 18)
				System.out.println(currentPersonName);
		}
		
	}

	public static void main(String[] args) {
		// Creating an array of type Person
		Person personList[] = new Person[3];
		personList[0] = new Person();
		personList[1] = new Person("Gautam", 24);
		personList[2] = new Person(12, "Gauri");
		
		printMinorPersonNames(personList);
		
		/*//Other alternative
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		personList[0] = p1;
		//and so on
		
		//OR
		
		Person personList1[] = {p1, p2, p3};
		
		*/

	}
}
