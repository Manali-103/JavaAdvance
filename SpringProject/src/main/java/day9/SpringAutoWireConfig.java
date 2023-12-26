package day9;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringAutoWireConfig {
	@Bean
   public MusicSystem getMusicSystem() {
	   MusicSystem ms = new MusicSystem("Sony", "Dolby");
	   return ms;
   }

	@Bean
	//@Primary
	public MusicSystem getMusicSystem2() {
		MusicSystem ms = new MusicSystem("Panasonic", "Mono");
		return ms;
	}
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine("Petrol", "1200CC");
		return eng;
	}
	
	@Bean("myCar")
	public Car getCar() {
		Car carObj = new Car();
		carObj.setMake("Hundai");
		carObj.setModel("I 20");
		carObj.setPrice(745000);
		return carObj;
	}
}
