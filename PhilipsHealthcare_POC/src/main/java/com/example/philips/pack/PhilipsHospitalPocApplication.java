package com.example.philips.pack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@EnableSwagger2
public class PhilipsHospitalPocApplication implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(PhilipsHospitalPocApplication.class);
	 @Value("${spring.application.name}")
	 private String name;
	 
	public static void main(String[] args) {
		SpringApplication.run(PhilipsHospitalPocApplication.class, args);
	}
	
	 /* @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.example.philips.pack")).build();
	   }*/
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
	    
		System.out.println("Hello From CommandLineRunner....");
	}
	 @RequestMapping(value = "/")
	   public String name() {
	      return name;
	   }

}

