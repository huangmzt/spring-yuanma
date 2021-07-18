package runmodule.IOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"runmodule.IOC"})
public class MainConfig {

//    @Bean(initMethod = "initMethod")
//    public Person person(){
//        Person person = new Person();
//        person.setName("张三");
//        return person;
//    }
}
