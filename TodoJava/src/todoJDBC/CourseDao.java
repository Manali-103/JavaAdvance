package todoJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import todoJDBC.JdbcUtils;
import todoJDBC.course;

public class CourseDao implements DaoInterface<course, Integer> {

	@Override
	public Collection<course> getAll() {
		String sqlQuery = "select courseId, fees, duration, title, provider from course";
		Collection<course> allcourses = new ArrayList<>();
		try(
				Connection conn = JdbcUtils.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				){
			while(rs.next()) {
				int id = rs.getInt(1);
				int fees = rs.getInt(4);
				int duration = rs.getInt(3);
				String Title = rs.getString(2);
				String Provider = rs.getString(3);
				
				//Populating a course object based upon the values fetched from the record.
				course currentcourse = new course(id, fees, duration, Title, Provider);
				//Adding this course object into the Collection
				allcourses.add(currentcourse);
				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		 
		return allcourses;
	}

	@Override
	public course getOne(Integer id) {
		// TODO Auto-generated method stub
		course foundcourse = null;
		try(
				Connection conn = JdbcUtils.buildConnection();
				){
			String sqlQuery = 
					"select courseId, fees, duration, title, provider from course where course = ?";
			PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, id);
			ResultSet rs =  pstmt.executeQuery();
			if(rs.next()) {
				int id1 = rs.getInt(1);
				int fees = rs.getInt(4);
				int duration = rs.getInt(3);
				String Title = rs.getString(2);
				String Provider = rs.getString(3);
				
				foundcourse = new course(id1, fees, duration, Title, Provider);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return foundcourse;
	}

	@Override
	public void create(course newcourse) {
		String sqlQuery =
		"insert into course(courseId, fees,duration,title, provider) values(?,?,?,?,?)";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
				//Extracting the values from the incoming course object
				int id = newcourse.getCourseId();
				int fees  = newcourse.getFees();
				int duration  = newcourse.getDuration();
				String title = newcourse.getTitle();
				String provider = newcourse.getProvider();
				//Substituting the values for unknown parameters
				pstmt.setInt(1, id);
				pstmt.setInt(2, fees);
				pstmt.setInt(3, duration);
				pstmt.setString(4, title);
				pstmt.setString(5, provider);
				
				int count = pstmt.executeUpdate();
				System.out.println(count + " record inserted");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteOne(Integer id) {
		String sqlQuery = "delete from course where courseId = ?";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			System.out.println(count + " record deleted");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	public void update(course modifiedcourse) {
		String sqlQuery = "update course set fees = ?, duration = ?, title = ?, provider = ? where courseId = ?";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			int id = modifiedcourse.getCourseId();
			int fees = modifiedcourse.getFees();
			int duration = modifiedcourse.getDuration();
			String Title  = modifiedcourse.getTitle();
			String Provider = modifiedcourse.getProvider();
			
			pstmt.setInt(4, id);
			pstmt.setInt(1, fees);
			pstmt.setInt(2, duration);
			pstmt.setString(3, Title);
			pstmt.setString(3, Provider);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record updated");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}


}
