package it.epicode.W6_D3_U2_F.exception;

import it.epicode.W6_D3_U2_F.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(AutoreNotFounException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleAutoreNotFound(AutoreNotFounException e){
        return new ApiError(HttpStatus.NOT_FOUND);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(BlogNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleBlogNotFound(BlogNotFoundException e) {
        return new ApiError(HttpStatus.NOT_FOUND);
    }

}
