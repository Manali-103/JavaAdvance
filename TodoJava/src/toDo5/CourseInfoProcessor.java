package toDo5;

import toDo1.CSM;
import toDo4.AverageDuration;
import toDo4.AverageFees;
import toDo4.CourseDataCalculator;

public interface CourseInfoProcessor {
   float processCourseInfo(CSM[] CourseList, CourseInfo CourseInfoList);
   
   public static void main(String[] args) {
		
		CSM c1 = new  CSM(1, 1000, 10, "Mana", "Java");
		CSM c2 = new CSM(2, 1400, 10, "Mana", "C++");
		CSM c3 = new CSM(3, 1500, 30, "Sakshi", "C");
		CSM c4 = new CSM(4, 1600, 40, "Suyash", ".NET");
		
		CSM CourseInfoList[] = {c1, c2, c3, c4};
		
		CourseInfoProcessor AvgFeesOfCourse = new AvgFeesOfCourse();
		CourseInfoProcessor CountOfCourse = new CountOfCourse();
		
		float count = CountOfCourse.processCourseInfo( CourseInfoList, null);
		float AvgFees = AvgFeesOfCourse.processCourseInfo(  CourseInfoList, null);
		
		System.out.println("Course Count is " + CourseInfo.count);
		
	}

   
   
}
