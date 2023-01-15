package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:from_Json_to_DB.xml")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("input_data.xml");
	}
}
 