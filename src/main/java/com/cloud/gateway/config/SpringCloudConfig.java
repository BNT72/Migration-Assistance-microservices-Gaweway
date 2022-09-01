//package com.cloud.gateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//@Configuration
//@CrossOrigin(origins = "*", maxAge = 3600)
//public class SpringCloudConfig {
//
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route(r -> r.path("/user/**")
//                        .uri("http://localhost:8084/")
//                        )
//                .build();
//    }
//
//}