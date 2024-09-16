package com.example.RestClient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfiguration {

    @Bean
    public RestClient getRestClient(){
        return RestClient.create("https://0f355914-910f-4ea8-8238-98e6806a67de.mock.pstmn.io");
    }
}
