package com.example.apartmentmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@SequenceGenerator(name="landlord_seq")
public class Landlord {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="landlord_seq")
    private int id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @DateTimeFormat()
    private Date dateOfBirth;

}