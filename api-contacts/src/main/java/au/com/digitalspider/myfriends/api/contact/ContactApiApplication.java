package au.com.digitalspider.myfriends.api.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan("au.com.digitalspider.api.contact")
//@EntityScan(basePackages = { "au.com.digitalspider.api.contact.model" })
//@EnableJpaRepositories(basePackages = { "au.com.digitalspider.api.contact.repo" })
public class ContactApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApiApplication.class, args);
	}

}
