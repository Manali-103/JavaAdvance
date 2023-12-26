package day9;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"day9","day9_four"})//here we declared paticular pacakage other pkg will  not work
public class SpringAppConfig {

	public List<String> countries(){
		List<String> countryList = 
				Arrays.asList("Bharat", "Bhutan", "Nepal");
				return countryList;
	}
	

}
