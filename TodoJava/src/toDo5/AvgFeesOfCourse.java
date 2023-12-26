package toDo5;

import toDo1.CSM;

public class AvgFeesOfCourse implements CourseInfoProcessor {

	@Override
	public float processCourseInfo( CSM[] CourseList, CourseInfo CourseInfoList) {
		// TODO Auto-generated method stub
		float totalFees = 0;
		float TotalAvg=0;
		
		for(CSM course : CourseList) {
			if(course.getProvider() == CourseInfoList.getProviderName() && course.getDuration() == CourseInfoList.getDuration() )
			totalFees += course.getFees();
		}
		
		TotalAvg = totalFees / CourseList.length;
		return TotalAvg;
	}

}
