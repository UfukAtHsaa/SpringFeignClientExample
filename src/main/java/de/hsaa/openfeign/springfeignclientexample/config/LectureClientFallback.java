package de.hsaa.openfeign.springfeignclientexample.config;

import de.hsaa.openfeign.springfeignclientexample.client.Lecture;
import de.hsaa.openfeign.springfeignclientexample.client.LectureClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class LectureClientFallback implements LectureClient {

    @Override
    public Collection<Lecture> getAllLecture() {
        System.err.println("Service Unavailable: WILL RETURN EMPTY LECTUREs");
        return Collections.emptyList();
    }
}
