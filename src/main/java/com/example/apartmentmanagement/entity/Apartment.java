package com.example.apartmentmanagement.entity;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="apartment_seq")
public class Apartment {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="apartment_seq")
    private int id;

    @NotNull
    private int apartmentNo;

    @Nullable
    private String apartmentName;

    @NotNull
    private String street;

    @NotNull
    private String city;

    @NotNull
    private String country;

    @OneToMany
    private List<Flat> flats;
}