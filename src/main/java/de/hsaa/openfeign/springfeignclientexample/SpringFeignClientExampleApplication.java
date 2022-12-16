package de.hsaa.openfeign.springfeignclientexample;

import de.hsaa.openfeign.springfeignclientexample.client.CatFactsClient;
import de.hsaa.openfeign.springfeignclientexample.client.LectureClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignClientExampleApplication {

    @Autowired
    private CatFactsClient catFactsClient;
    @Autowired
    private LectureClient lectureClient;

    public static void main(String[] args) {
        SpringApplication.run(SpringFeignClientExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println(lectureClient.getAllLecture());
        };
    }
}
