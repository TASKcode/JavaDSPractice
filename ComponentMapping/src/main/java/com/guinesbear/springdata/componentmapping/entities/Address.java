package com.guinesbear.springdata.componentmapping.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String streetaddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;


    public String getStreetaddress() {
        return streetaddress;
    }

    public Address setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Address setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }
}
