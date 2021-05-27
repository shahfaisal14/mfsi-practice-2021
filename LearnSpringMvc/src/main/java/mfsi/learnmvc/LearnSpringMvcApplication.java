package mfsi.learnmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "mfsi.learnmvc.domain")
@EnableJpaRepositories(basePackages = "mfsi.learnmvc.repository")
public class LearnSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringMvcApplication.class, args);
	}

}
