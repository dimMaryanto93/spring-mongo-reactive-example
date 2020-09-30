package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.documents.Person;
import com.maryanto.dimas.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional(readOnly = true)
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public Mono<Person> findById(String id) {
        return this.repo.findById(id);
    }

    @Transactional(readOnly = true)
    public Mono<Person> save(Person person) {
        return this.repo.save(person);
    }

    public Flux<Person> findAll() {
        return this.repo.findAll();
    }

    public Flux<Person> findByFirstNameAndLastName(String firstName, String lastName) {
        return this.repo.findByFirstNameAndLastName(firstName, lastName);
    }
}
