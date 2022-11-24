package com.railway.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public UserDetailsManager userDetailsManager() {
        UserDetails passenger = User.builder()
                .username("passenger")
                .passwordEncoder(password -> bCryptPasswordEncoder().encode(password))
                .password("pass")
                .roles("PASSENGER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .passwordEncoder(password -> bCryptPasswordEncoder().encode(password))
                .password("admin")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(passenger, admin);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        // version for authorization via annotations
        httpSecurity
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/user/**").permitAll().anyRequest().authenticated()
                .and()
                .httpBasic();

        return httpSecurity.build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
