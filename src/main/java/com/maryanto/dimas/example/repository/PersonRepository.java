package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.documents.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveCrudRepository<Person, String> {

    Flux<Person> findByFirstNameAndLastName(String firstName, String lastName);
}
