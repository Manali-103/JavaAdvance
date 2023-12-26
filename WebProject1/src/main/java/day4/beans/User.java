package day4.beans;

public class User {
private String userId;
private String password;


public User(String username, String password) {
	// TODO Auto-generated constructor stub
	userId = username;
	this.password = password;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
