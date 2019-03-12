package com.firewood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CounterConfiguration {

    @Bean
    @Scope("singleton")
    public Counter counterGenerator() {
        return new Counter();
    }
}
