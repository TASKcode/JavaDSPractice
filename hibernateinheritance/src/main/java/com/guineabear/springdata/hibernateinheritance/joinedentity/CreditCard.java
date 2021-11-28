package com.guineabear.springdata.hibernateinheritance.joinedentity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
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
