package org.sid;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.MultipartConfigElement;


@SpringBootApplication
@ComponentScan({"org.sid"})

public class GestionProduitsApplication {
	 HttpSecurity http;
	 
	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(GestionProduitsApplication.class, args);
		
}

}
