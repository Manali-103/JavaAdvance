package toDo5;

import toDo1.CSM;

public class CourseInfo {
private String ProviderName;
private int Duration;
static int count, totalCount;

public CourseInfo(String ProviderName, int Duration) {
	this.ProviderName = ProviderName;
	this.Duration = Duration;
	count++;
	
}

public String getProviderName() {
	return ProviderName;
}

public void setProviderName(String providerName) {
	ProviderName = providerName;
}

public int getDuration() {
	return Duration;
}

public void setDuration(int duration) {
	Duration = duration;
}

public float processCourseInfo(CSM[] courseInfoList) {
	// TODO Auto-generated method stub
	return 0;
}


}
