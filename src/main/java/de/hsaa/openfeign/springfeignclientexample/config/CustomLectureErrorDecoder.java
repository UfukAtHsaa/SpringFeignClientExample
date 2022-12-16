package de.hsaa.openfeign.springfeignclientexample.config;

import de.hsaa.openfeign.springfeignclientexample.exception.BadRequestException;
import de.hsaa.openfeign.springfeignclientexample.exception.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomLectureErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 400:
                return new BadRequestException();
            case 404:
                return new NotFoundException();
            default:
                return new Exception("some generic error");
        }
    }
}
