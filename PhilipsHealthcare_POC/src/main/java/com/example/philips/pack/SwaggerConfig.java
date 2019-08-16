package com.example.philips.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/*
	 * private static final Contact DEFAULT_CONTACT = new Contact(); public static
	 * final ApiInfo DEFAULT_API_INFO =new ApiInfo("Awesome API Title",
	 * "Awesome API Description", "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0",
	 * "http://www.apache.org/licenses/LINCES-2.0");
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.philips.pack")).build();

	}
}
