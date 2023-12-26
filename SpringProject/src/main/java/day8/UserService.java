package day8;

import day7.GreetingService;

public class UserService implements GreetingService {

	public UserService() {
		// TODO Auto-generated constructor stub
		System.out.println("user service instantiated");
	}

	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome User";
	}

}
