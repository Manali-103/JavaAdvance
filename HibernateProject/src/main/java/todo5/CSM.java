package todo5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class CSM {
	@Id
	@Column(name="CourseId")
       private int CourseId;
	@Column(name="Duration")
       private int Duration;
	@Column(name="Fees")
       private int fees;
	@Column(name="Title")
       private String title;
	@Column(name="provider")
	private String provider;

       public CSM() {
    	   
       }
       public CSM(int CourseId,int fees, int Duration, String title, String provider) {
   		// TODO Auto-generated constructor stub
   		this.CourseId=CourseId;
   		this.fees= fees;
   		this.Duration=Duration;
   		this.title=title;
   		this.provider=provider;
   		
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
	
