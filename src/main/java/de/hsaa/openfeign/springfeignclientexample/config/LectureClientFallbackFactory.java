package de.hsaa.openfeign.springfeignclientexample.config;

import de.hsaa.openfeign.springfeignclientexample.client.Lecture;
import de.hsaa.openfeign.springfeignclientexample.client.LectureClient;
import de.hsaa.openfeign.springfeignclientexample.exception.NotFoundException;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LectureClientFallbackFactory implements FallbackFactory<LectureClient> {
    @Override
    public LectureClient create(Throwable cause) {

        System.err.println("An exception occurred when calling the UserSessionClient. Throwable: " + cause.toString());
        if (cause instanceof NotFoundException) {
            // do some crazy sh..
        }
        return () -> {
            System.out.println("[Fallback] LectureClient");
            return List.of(new Lecture());
        };
    }
}
