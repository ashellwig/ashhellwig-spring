package com.ashhellwig.ashhellwigspring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExperienceNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ExperienceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String experienceNotFoundHandler(ExperienceNotFoundException ex) {
        return ex.getMessage();
    }
}
