package com.guineabear.springdata.association.onetomany.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<PhoneNumber> numbers;

    public Set<PhoneNumber> getNumbers() {
        return numbers;
    }

    public Customer setNumbers(Set<PhoneNumber> numbers) {
        this.numbers = numbers;
        return this;
    }

    public long getId() {
        return id;
    }

    public Customer setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public void addPhoneNumber(PhoneNumber number) {
        if (number != null) {
            if (numbers == null) {
                numbers = new HashSet<>();
            }
            number.setCustomer(this);
            numbers.add(number);
        }
    }
}
