package com.example.apartmentmanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name="flat_seq")
public class Flat {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="flat_seq")
    public int id;

    public int doorNumber;

    public int floor;

    @ManyToOne(targetEntity = Apartment.class,cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Apartment apartment;

    @OneToOne
    private FlatContract flatContract;
}