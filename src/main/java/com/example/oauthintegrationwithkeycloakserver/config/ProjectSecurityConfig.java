package com.example.oauthintegrationwithkeycloakserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    /**
     * From Spring Security 5.7, the WebSecurityConfigurerAdapter is deprecated to encourage users
     * to move towards a component-based security configuration. It is recommended to create a bean
     * of type SecurityFilterChain for security related configurations.
     *
     * @param http
     * @return SecurityFilterChain
     * @throws Exception
     */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeyCloakRoleConverter());

        http.csrf().disable()
                .cors().disable()
                .authorizeHttpRequests((auth) -> auth
                        .antMatchers("/home").permitAll()
                        .antMatchers("/user").hasRole("USER")
                        .antMatchers("/dashboard").authenticated()
                        .antMatchers("/user-admin").hasAnyRole("USER", "ADMIN")
                )
                .oauth2ResourceServer().jwt().jwtAuthenticationConverter(jwtAuthenticationConverter);
        return http.build();
    }
}
