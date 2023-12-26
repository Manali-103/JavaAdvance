package todoJDBC;

public class course {
private int CourseId;
private int Fees;
private int Duration;
private String Title;
private String Provider;


	public int getCourseId() {
	return CourseId;
}
public void setCourseId(int courseId) {
	CourseId = courseId;
}
public int getFees() {
	return Fees;
}
public void setFees(int fees) {
	Fees = fees;
}
public int getDuration() {
	return Duration;
}
public void setDuration(int duration) {
	Duration = duration;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getProvider() {
	return Provider;
}
public void setProvider(String provider) {
	Provider = provider;
}
	public course() {
		// TODO Auto-generated constructor stub
	}
	public course(int id, int fees, int duration, String title, String provider) {
		// TODO Auto-generated constructor stub
	id = CourseId;
	Fees = fees;
	Duration = duration;
	Title = title;
	Provider = provider;
		
	}
	@Override
	public String toString() {
		return "course [CourseId=" + CourseId + ", Fees=" + Fees + ", Duration=" + Duration + ", Title=" + Title
				+ ", Provider=" + Provider + "]";
	}

}
