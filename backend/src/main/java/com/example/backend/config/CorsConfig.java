package com.example.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // 모든 origin을 허용, 실제 운영에서는 특정 도메인으로 제한하는 것이 좋습니다.
        config.addAllowedMethod("*"); // 모든 HTTP 메소드를 허용
        config.addAllowedHeader("*"); // 모든 헤더를 허용
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}


