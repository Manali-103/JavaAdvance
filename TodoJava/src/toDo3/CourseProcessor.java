package toDo3;

import toDo1.CSM;

public class CourseProcessor {
	public static void printShortDurationCourseNames(CSM[] courseListRef ) {
		for(CSM currentCourse : courseListRef) {
			int currentCourseDuration = currentCourse.getDuration();
			String currentName = currentCourse.getTitle();
			if(currentCourseDuration < 40)
				System.out.println(currentName);
		}
	}
	
	
	public static void main(String[] args) {
		CSM C1 = new CSM(1, 1000, 10, "CDAC", "MANA");
		CSM C2 = new CSM(2, 6000, 60, "JAVA", "ANYAA");
           CSM courseListRef[] = {C1, C2};
           printShortDurationCourseNames(courseListRef);
	}

}
