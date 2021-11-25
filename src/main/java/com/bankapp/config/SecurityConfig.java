package com.bankapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure (HttpSecurity http) throws  Exception {
    http
        .authorizeRequests()
        .antMatchers("/notices","/contact")
        .permitAll()
        .antMatchers("/loans","/cards","/balance","/account")
        .authenticated()
        .and().formLogin()
        .and().httpBasic();
  }
  @Override
  protected void configure (AuthenticationManagerBuilder auth) throws  Exception {
auth.inMemoryAuthentication().withUser("user").password("pass").authorities("user").and()
    .withUser("admin").password("pass").authorities("admin").and()
    .passwordEncoder(NoOpPasswordEncoder.getInstance());
  }
}

