package com.collectorawas.familytree;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @SpringBootApplication:
 * 		@Configuration: source of bean definitions for the application context.
 * 		@EnableAutoConfiguration:  Tells Spring Boot to start adding beans based on classpath settings, other beans,
 * 		and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the
 * 		application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
 * 		@ComponentScan: Tells Spring to look for other components, configurations, and services in the
 * 		com/collectorawas/familytree package, letting it find the controllers.
 */
@SpringBootApplication
public class FamilyTreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyTreeApplication.class, args);//launches Application
	}

	/**
	 *  runs on start up. It retrieves all the beans that were created by your application or that were automatically
	 *  added by Spring Boot. It sorts them and prints them out.
	 *
	 * @param ctx
	 * @return
	 */
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
