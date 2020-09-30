package com.maryanto.dimas.example.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Data
@Builder
@Document(collection = "person")
public class Person {

    @MongoId
    private Long id;

    @NotNull
    @NotEmpty
    private String firstName;
    @NotNull
    @NotEmpty
    private String lastName;
    @Past
    private LocalDate birthDate;
    @Positive
    @NotNull
    @NotEmpty
    private Number saldo;
    @Version
    private Long version;

}


