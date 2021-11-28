package com.guinesbear.springdata.componentmapping.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    @Embedded
    private Address address;

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Employee setAddress(Address address) {
        this.address = address;
        return this;
    }
}
