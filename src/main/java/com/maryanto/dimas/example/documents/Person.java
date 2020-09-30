package com.maryanto.dimas.example.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Builder
@Document(collection = "person")
public class Person {

    @Id
    private String id;
    @NotNull
    @NotEmpty
    private String firstName;
    @NotNull
    @NotEmpty
    private String lastName;
    @Past
    private LocalDate birthDate;
    @PositiveOrZero
    @NotNull
    private Number saldo;
    @Version
    private Long version;

}


