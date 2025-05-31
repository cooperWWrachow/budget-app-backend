//package com.budgetapp.backend.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig {
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**") // Allow ALL paths — prevents edge cases
//                        .allowedOrigins(
//                                "http://localhost:5173",
//                                "http://cooper-budget-app.s3-website-us-east-1.amazonaws.com",
//                                "https://cooper-budget-app.s3-website-us-east-1.amazonaws.com"
//                        )
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                        .allowedHeaders("*")
//                        .allowCredentials(true); // Good practice for future-proofing
//            }
//        };
//    }
//}
