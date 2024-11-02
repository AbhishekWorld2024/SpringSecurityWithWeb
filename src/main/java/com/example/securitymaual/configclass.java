
package com.example.securitymaual;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class configclass {

    // Define the in-memory users
    @Bean
    UserDetailsService userDetailsService() {
        UserDetails user1 = User.withUsername("abhi")
                .password(passwordEncoder().encode("abhi@1")) 
                .roles("USER")
                .build();

        UserDetails user2 = User.withUsername("Sandy")
                .password(passwordEncoder().encode("Sandy@1")) 
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }
  @Bean
  PasswordEncoder passwordEncoder(){
	  return new BCryptPasswordEncoder();
  }
 
   

    // Define the security filter chain
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(request -> request.requestMatchers("/", "/home").permitAll()
                    .requestMatchers("/UserDetails").authenticated()
                .anyRequest().authenticated() 
            )
            .formLogin(form->form.defaultSuccessUrl("/UserDetails", true)) 
            .httpBasic(Customizer.withDefaults()); 
        return http.build();
    }
}
