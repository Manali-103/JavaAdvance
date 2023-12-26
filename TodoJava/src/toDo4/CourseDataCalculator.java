package toDo4;

import toDo1.CSM;

public abstract class CourseDataCalculator {
	public abstract float doCalculation(CSM [] CourseList);	
	
	public static void main(String[] args) {
		CSM c1 = new CSM (1, 1000, 10, "Java", "Mana");
		CSM c2 = new CSM (2, 1400, 20, "C++", "KAKA");
		CSM c3 = new CSM (3, 1500, 30, "C#", "TATA");
		CSM CourseList[] = {c1, c2, c3}
;       
		CourseDataCalculator AverageDuration = new AverageDuration();
		CourseDataCalculator AverageFees = new AverageFees();
		
		float AvgDuration = AverageDuration.doCalculation(CourseList);
		float AvgFees = AverageFees.doCalculation(CourseList);
		
		System.out.println("Average of duration" + " " + AvgDuration + " " + "hours");
		System.out.println("Average of fees" + " "+ AvgFees);
		}
	
}

