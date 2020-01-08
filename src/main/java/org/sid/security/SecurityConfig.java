package org.sid.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
	public class SecurityConfig extends WebSecurityConfigurerAdapter {
		@Autowired
		BCryptPasswordEncoder bCryptPasswordEncoder;
		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			BCryptPasswordEncoder bcpe = getBCPE();
			
			auth.inMemoryAuthentication().withUser("admin@gmail.com").password(bcpe.encode("admin")).roles("ADMIN", "USER");
			auth.inMemoryAuthentication().withUser("rouissi.yassine.97@gmail.com").password(bcpe.encode("yassine")).roles("USER");
			auth.inMemoryAuthentication().withUser("amineomri@gmail.com").password(bcpe.encode("amine")).roles("USER");
			auth.inMemoryAuthentication().withUser("boumeazamohamed@gmail.com").password(bcpe.encode("mohamed")).roles("USER");
			auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder());
		}
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.formLogin();
//			http.authorizeRequests().anyRequest().authenticated();
			http.authorizeRequests().antMatchers("/admin/*").hasRole("ADMIN");
			http.authorizeRequests().antMatchers("/user/*").hasRole("USER");
		}
		
		@Bean
		BCryptPasswordEncoder getBCPE() {
			return new BCryptPasswordEncoder();
		}
	}
