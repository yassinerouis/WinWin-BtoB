package org.sid;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


@SpringBootApplication
public class GestionProduitsApplication {
	 HttpSecurity http;
	 
	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(GestionProduitsApplication.class, args);
}
}
