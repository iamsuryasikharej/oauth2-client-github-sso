package com.example.oauthclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class WebSecurityConfig {
//    @Bean
//    @Order(2)
//    SecurityFilterChain securityFilterChain1(HttpSecurity httpSecurity) throws Exception {
//        return  httpSecurity.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .build();
//    }
}
