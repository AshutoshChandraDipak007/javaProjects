package com.telusko.secureapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userServiceDetails;
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider(); //provider is talking to service and service will talk to dao.
		provider.setUserDetailsService(userServiceDetails);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());  //plane text password
		//provider.setPasswordEncoder(new BCryptPasswordEncoder());		// BCrypt password
		return provider;
	} 
	
	/*@SuppressWarnings("deprecation")
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List<UserDetails> users=new ArrayList<UserDetails>();
		users.add(User.withDefaultPasswordEncoder().username("ashu").password("ashu").roles("USER").build());
		return new InMemoryUserDetailsManager(users);
	}*/
	

}
