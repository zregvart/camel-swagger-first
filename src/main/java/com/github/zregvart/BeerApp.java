package com.github.zregvart;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.RestConfiguration;
import org.apache.camel.spi.RestConfiguration.RestBindingMode;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeerApp {

    public static void main(String[] args) {
        SpringApplication.run(BeerApp.class, args);
    }

    @Bean
    CamelContextConfiguration configure() {
        return new CamelContextConfiguration() {

            @Override
            public void beforeApplicationStart(CamelContext camelContext) {
                RestConfiguration restConfiguration = camelContext.getRestConfiguration();

                restConfiguration.setBindingMode(RestBindingMode.json);
            }

            @Override
            public void afterApplicationStart(CamelContext camelContext) {
            }
        };
    }

    @Bean
    RouteBuilder rest() {
        return new BeerRoute();
    }
}