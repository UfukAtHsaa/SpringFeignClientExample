package de.hsaa.openfeign.springfeignclientexample.client;

import de.hsaa.openfeign.springfeignclientexample.config.LectureClientConfig;
import de.hsaa.openfeign.springfeignclientexample.config.LectureClientFallback;
import de.hsaa.openfeign.springfeignclientexample.config.LectureClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@FeignClient(
        value = "LectureClient",
        url = "http://localhost:8081",
        configuration = LectureClientConfig.class,
//        fallback = LectureClientFallback.class,
        fallbackFactory = LectureClientFallbackFactory.class
)
public interface LectureClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/private/v1/lecture",
            consumes = "application/json"
    )
    Collection<Lecture> getAllLecture();
}
