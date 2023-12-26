package day10.Model;
 
public class StudentProgress {
	private String name;
	 private int totalmarks;
	 
	public StudentProgress(String name, int totalmarks) {
		super();
		this.name = name;
		this.totalmarks = totalmarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "StudentProgress [name=" + name + ", totalmarks=" + totalmarks + "]";
	}
	
}
