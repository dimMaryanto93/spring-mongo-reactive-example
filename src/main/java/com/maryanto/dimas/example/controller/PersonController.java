package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.documents.Person;
import com.maryanto.dimas.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/{id}/findById")
    public Mono<Person> findById(@PathVariable("id") Long id) {
        return this.service.findById(id);
    }

    @PostMapping("/new")
    public Mono<Person> save(@RequestBody @Validated Person person) {
        return this.service.save(person);
    }
}
