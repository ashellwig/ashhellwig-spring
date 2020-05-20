package com.ashhellwig.ashhellwigspring;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {
    private final ExperienceRepository repository;

    ExperienceController(ExperienceRepository repository) {
        this.repository = repository;
    }

    // Aggregate Root
    @GetMapping("/experience")
    public List<Experience> all() {
        return repository.findAll();
    }

    @PostMapping("/experience")
    public Experience newExperience(@RequestBody Experience newExperience) {
        return repository.save(newExperience);
    }

    // Single item
    @GetMapping("/experience/{id}")
    public Experience one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ExperienceNotFoundException(id));
    }

    @DeleteMapping("/experience/{id}")
    public void deleteExperience(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
