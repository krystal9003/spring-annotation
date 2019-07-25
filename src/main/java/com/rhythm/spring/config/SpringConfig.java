package com.rhythm.spring.config;

import com.rhythm.spring.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Student student(){
        return new Student();
    }

}
