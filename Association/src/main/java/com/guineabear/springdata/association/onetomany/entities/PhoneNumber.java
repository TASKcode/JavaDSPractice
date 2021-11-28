package com.guineabear.springdata.association.onetomany.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "number")
    private String number;
    private String type;

    @ManyToOne
    @JoinColumn(name = "customer_id")    //To Tell JPA which column in the table should be Marked.
    private Customer customer;

    public long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public PhoneNumber setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public PhoneNumber setId(long id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public PhoneNumber setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getType() {
        return type;
    }

    public PhoneNumber setType(String type) {
        this.type = type;
        return this;
    }
}
