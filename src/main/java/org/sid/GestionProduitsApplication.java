package org.sid;


import org.springframework.boot.SpringApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


@SpringBootApplication
=======
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

>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
public class GestionProduitsApplication {
	 HttpSecurity http;
	 
	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(GestionProduitsApplication.class, args);
<<<<<<< HEAD
}
=======
		
}

>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
}
