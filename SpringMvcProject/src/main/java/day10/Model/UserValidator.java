package day10.Model;

//import day10.Model.User;

public class UserValidator {
	 public static boolean isValid(User currentUser) {
		  //the code for validation
		  boolean success = false;
		  String currentUserId = currentUser.getUserId();
		  String currentPassword = currentUser.getPassword();
		  
		  if(currentUserId.equals("admin") && currentPassword.equals("Manali123"))
			  success=true;
		  return success;
	  }
}
