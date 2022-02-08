package com.example.apartmentmanagement.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@Entity
@SequenceGenerator(name="flat_resident_seq")
public class FlatResident {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="flat_resident_seq")
    public int id;

    @Size(min = 1,max = 16)
    public String firstName;

    @Size(min = 1,max = 50)
    public String lastName;

    @NotNull
    @Email
    public String email;

}