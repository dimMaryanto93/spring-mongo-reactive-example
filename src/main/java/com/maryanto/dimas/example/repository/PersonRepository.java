package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.documents.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {

    Mono<Person> findByFirstNameAndLastName(String firstName, String lastName);
}
