package runmodule.IOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Animal animal(){
		Animal animal = new Animal();
		System.out.println("1"+animal);
		return animal;
	}

	@Bean
	public void test(){
		System.out.println("2"+animal());
	}
}
