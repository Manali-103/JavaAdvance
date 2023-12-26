package day10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc //enabling spring web MVC support
public class SpringWebMvcConfigurer implements WebMvcConfigurer {
	@Bean
    public ViewResolver getViewResolver() {
    	InternalResourceViewResolver is = new InternalResourceViewResolver();
    	String prefix = "/WEB-INF/Pages/";
    	String suffix =".jsp";
    	is.setPrefix(prefix);
    	is.setSuffix(suffix);
    	return is;
    }
}
