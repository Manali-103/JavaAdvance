package toDo4;

import toDo1.CSM;

public class AverageFees extends CourseDataCalculator {

	@Override
	public  float doCalculation(CSM[] CourseList) {
		// TODO Auto-generated method stub
		//if(CourseList.length == 0) {
			
			//return 0.0f;
			//}
			float totalFees = 0;
			float TotalAvg=0;
			for(CSM course : CourseList) {
				totalFees += course.getFees();
			}
			
			TotalAvg = totalFees / CourseList.length;
			return TotalAvg;
	}
    
}
