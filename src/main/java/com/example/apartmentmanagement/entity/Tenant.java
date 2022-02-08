package com.example.apartmentmanagement.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Data
@Entity
@SequenceGenerator(name="tenant_seq")
//@ToString(exclude = "")
public class Tenant {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tenant_seq")
    public int id;

    @Size(min = 1,max = 16)
    public String firstName;

    @Size(min = 1,max = 50)
    public String lastName;

    @NotNull
    @Email
    public String email;

}