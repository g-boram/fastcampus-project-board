package com.fastcampus.board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("boram"); // TODO: 스프링 시큐리티로 인증 기능을 붙이게 될때, 수정 하자
    }
}
