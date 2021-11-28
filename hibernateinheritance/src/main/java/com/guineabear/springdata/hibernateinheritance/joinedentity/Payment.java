package com.guineabear.springdata.hibernateinheritance.joinedentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {
    @Id
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public Payment setId(int id) {
        this.id = id;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Payment setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
