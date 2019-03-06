package com.firewood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CounterConfiguration {

    @Bean
    public Counter counterGenerator() {
        return new Counter();
    }
}
