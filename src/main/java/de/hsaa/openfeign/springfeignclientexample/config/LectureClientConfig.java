package de.hsaa.openfeign.springfeignclientexample.config;

import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class LectureClientConfig {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user1", "password");
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomLectureErrorDecoder();
    }
}
