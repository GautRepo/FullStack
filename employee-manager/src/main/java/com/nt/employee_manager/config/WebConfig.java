package com.nt.employee_manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Enable CORS for all API endpoints
                .allowedOrigins("http://localhost:3000")  // Allow requests from React frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
