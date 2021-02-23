package by.itman.qualifier.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TheServiceConfiguration {
    @Bean
    public TheService firstService() {
        return new TheService(1);
    }

    @Bean
    public TheService secondService() {
        return new TheService(2);
    }
}
