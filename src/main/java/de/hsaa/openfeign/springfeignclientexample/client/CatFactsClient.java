package de.hsaa.openfeign.springfeignclientexample.client;


import de.hsaa.openfeign.springfeignclientexample.config.LectureClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value= "CatFacts",
        url = "https://catfact.ninja"
)
public interface CatFactsClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/fact",
            consumes = "application/json"
    )
    CatFact getCatFact();
}
