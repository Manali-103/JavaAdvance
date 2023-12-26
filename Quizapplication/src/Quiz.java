import java.util.Scanner;
public class Quiz {
	 public static void main(String [] args) {
		 String q1 = "Which is india's capital city?\n"
				   + "(a)Mumbai(b)NewDehli(c)Panaji(d)Satara";
		 
		 String q2 ="Which is Maharashtra's capital city?\n"
				   + "(a)Mumabi(b)NewDehli(c)Panaji(d)Satara";
		 
		 String q3 ="Which is  Goa's capital city?\n"
				   + "(a)Mumabi(b)NewDehli(c)Panaji(d)Satara";
		 
		 Question [] questions = {
				  new Question(q1, "b"),
				  new Question(q2, "a"),
				  new Question(q3, "c")
		 };
		 takeTest(questions);
				  
	 }
	 
	 public static void takeTest(Question [] questions) {
		 int score =0;
		 Scanner sc = new Scanner(System.in);
		 for(int i=0; i<questions.length; i++) {
			 System.out.println(questions[i].app);
			 String answer = sc.nextLine();
			 System.out.println(questions[i].answer);
			 if(answer.equals(questions[i].prompt)) {
				 score++;
			 }
			 
		 }
		 System.out.println("Your"+score+"/" + questions.length);
	 }

}
