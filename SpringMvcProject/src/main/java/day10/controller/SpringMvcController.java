package day10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import day10.Model.StudentProgress;
import day10.Model.TotalMarksCalculator;
import day10.Model.User;
import day10.Model.UserValidator;

@Controller
@SessionAttributes("progressReport")//Binding this attribute at session level
public class SpringMvcController {
  //defining a request handling method
	
	
	@RequestMapping("/showLogin")//@RequestMapping(value = "/showLogin", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login"; //returns view name
	}
	
	//this method will be called when client makes a post request for /doValid URL
	@RequestMapping(value ="/doValidate", method = RequestMethod.POST)
	public String getResultPage(@RequestParam("uid") String userName, @RequestParam("pid") String password) {
		String resultPage = "Failure";
		User userModel = new User(userName, password);
		boolean success = UserValidator.isValid(userModel);
		if(success)
			resultPage = "Success";
		
		return resultPage;
	}
	
//	@RequestMapping("/studentEntry")//@RequestMapping(value = "/showLogin", method = RequestMethod.GET)
//	public String getStudentEntry() {
//		return "StudentEntry"; //returns view name
//	}
//	
//	
//	
//	
//	
//	
//	@RequestMapping(value= "/acceptStudent", method= RequestMethod.POST)
//	public  String processStudentInfo(String studentName, int phy, int chem, int math, Model dataModel) {
//		int totalMarks = TotalMarksCalculator.getTotalMarks(phy, chem, math);
//		StudentProgress progress = new StudentProgress(studentName, totalMarks);
//		//attching studentProgress information to data model
//		dataModel.addAttribute("progressReport",progress);
//		dataModel.addAttribute("message", "Thank You");
//		return "studentProgress";
//	}
	
}
