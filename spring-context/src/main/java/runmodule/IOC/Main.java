package runmodule.IOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * IOC注入测试
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = (Person)context.getBean("person");
		System.out.println(person);
	}
}
