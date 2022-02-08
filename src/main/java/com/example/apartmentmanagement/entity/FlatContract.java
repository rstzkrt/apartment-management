package com.example.apartmentmanagement.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
@Entity
@SequenceGenerator(name="flat_contract_seq")
public class FlatContract {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="flat_contract_seq")
    private int id;

    @DateTimeFormat
    private Date startingDate;

    @DateTimeFormat
    private Date endingDate;

    @NotNull
    private int price;

    @OneToOne
    private Flat flat;

    @OneToOne
    private Landlord landlord;

    @OneToOne
    private Tenant tenant;
}