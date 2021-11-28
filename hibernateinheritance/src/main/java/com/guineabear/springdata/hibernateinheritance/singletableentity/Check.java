package com.guineabear.springdata.hibernateinheritance.singletableentity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Check extends Payment {

    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public Check setChecknumber(String checknumber) {
        this.checknumber = checknumber;
        return this;
    }
}
