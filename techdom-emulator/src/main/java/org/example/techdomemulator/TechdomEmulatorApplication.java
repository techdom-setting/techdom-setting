package org.example.techdomemulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
@Configuration
public class TechdomEmulatorApplication {

	// private final TestBean testBean;
	//
	// @Autowired
	// public TechdomEmulatorApplication(TestBean testBean) {
	// 	this.testBean = testBean;
	// }
	//
	// @PostConstruct
	// public void dependencyTest() {
	// 	testBean.dependencyTest();
	// }

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(TechdomEmulatorApplication.class, args);
	}

}
