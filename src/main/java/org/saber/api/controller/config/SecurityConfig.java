package org.saber.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Désactive la protection CSRF pour les API (si nécessaire)
                .authorizeRequests()
                .antMatchers("/api/public/**").permitAll() // Accès public à certaines routes
                .anyRequest().authenticated() // Sécurise toutes les autres routes
                .and()
                .httpBasic(); // Utilisation d'authentification basique (remplaçable par JWT ou OAuth2)
    }
}
