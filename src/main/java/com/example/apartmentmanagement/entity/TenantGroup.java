package com.example.apartmentmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@SequenceGenerator(name="tenant_group_seq")
public class TenantGroup {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tenant_group_seq")
    private int id;

    @Size(min = 3,max = 50)
    private String groupName;

}