package com.ashhellwig.ashhellwigspring;

public class ExperienceNotFoundException extends RuntimeException {
    ExperienceNotFoundException(Long id) {
        super("Could not find experience: " + id);
    }
}
