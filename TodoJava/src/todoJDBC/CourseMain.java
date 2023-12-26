package todoJDBC;

import java.util.Collection;

import todoJDBC.DaoInterface;
import todoJDBC.course;
import todoJDBC.CourseDao;

public class CourseMain {
	private static void showOneCourse() {
		DaoInterface<course, Integer> idao = new CourseDao();
		course rst = 	idao.getOne(3);
		if(rst != null)
			System.out.println(rst);
		else
			System.out.println("course with this ID does not exist");
	}
	private static void showAllCourses() {
		DaoInterface<course, Integer> idao = new CourseDao();
		Collection<course> allAvailablecourses  = idao.getAll();
		//allAvailablecourses.stream().forEach((rst) -> System.out.println(rst));
		for(course rst : allAvailablecourses)
			System.out.println(rst);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //showOneCourse();
          showAllCourses();
	}

}
