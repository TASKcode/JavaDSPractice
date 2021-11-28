package com.guineabear.springdata.hibernateinheritance.TableperEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bankcheck")
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
