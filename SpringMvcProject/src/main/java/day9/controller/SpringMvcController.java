package day9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMvcController {
  //defining a request handling method
	@RequestMapping("/showIndex")
	public String getIndexPage() {
		return "index"; //returns view name
	}
	
	
}
