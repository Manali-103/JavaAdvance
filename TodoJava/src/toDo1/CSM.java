package toDo1;

public class CSM {
       private int CourseId,Duration,fees;
       private String title, provider;
       static int count;
 
       
       public CSM(int CourseId,int fees, int Duration, String title, String provider) {
   		// TODO Auto-generated constructor stub
   		this.CourseId=CourseId;
   		this.fees= fees;
   		this.Duration=Duration;
   		this.title=title;
   		this.provider=provider;
   		count++;
   	
       }
       
   public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	
	public void Display() {
		System.out.println("CourseId:" + getCourseId() + "," 
	+ "Duration:" + getDuration()+ "," 
				+ "Fees:" + getFees()+ "," 
	+ "Provider:" + getProvider()+ "," 
				+ "Title:" + getTitle()+ ",");
	}

}
	
