package toDo4;

import toDo1.CSM;

public class AverageDuration extends CourseDataCalculator {

	@Override
	public float doCalculation(CSM[] CourseList) {
		if(CourseList.length == 0) {
		// TODO Auto-generated method stub
		return 0.0f;
		}
		float totalDuration = 0;
		for(CSM course : CourseList) {
			totalDuration += course.getDuration();
		}
		
		return totalDuration / CourseList.length;
	}

}
