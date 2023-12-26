package toDo5;

import toDo1.CSM;

public class CountOfCourse implements CourseInfoProcessor {

	@Override
	public float processCourseInfo( CSM [] CourseList, CourseInfo CourseInfoList) {
		
	int count = 0;
	for(CSM course : CourseList) {
	if(course.getProvider() == CourseInfoList.getProviderName() && course.getDuration() == CourseInfoList.getDuration() )
		count++;
	}
	return count;
	}

}
