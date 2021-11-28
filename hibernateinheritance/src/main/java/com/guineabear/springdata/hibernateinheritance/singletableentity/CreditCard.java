package com.guineabear.springdata.hibernateinheritance.singletableentity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment {

    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public CreditCard setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
        return this;
    }
}
