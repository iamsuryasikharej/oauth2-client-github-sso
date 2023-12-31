package com.example.oauthclient;

import com.nimbusds.openid.connect.sdk.federation.registration.ClientRegistrationType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.*;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .oauth2Login()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and().build();



    }
    @Bean
    ClientRegistrationRepository clientRegistrationRepository()
    {
        InMemoryClientRegistrationRepository clientRegistrationRepository=new InMemoryClientRegistrationRepository(clientRegistration());
       return clientRegistrationRepository;
    }
    @Bean
    ClientRegistration clientRegistration()
    {

        return  CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("sorry_cant_share_this")
                .clientSecret("nice_try_but_i_am_smarter_😎")
                .redirectUri("http://localhost:8980/hello")
        .build();

    }
}
