package com.gardhagen.currencyexchange.model;

import javax.persistence.*;

@Entity
@Table
public class Currency {
    @Id
    @SequenceGenerator(
            name = "currency_sequence",
            sequenceName = "currency_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "currency_sequence"
    )
    private long id;
    private String currencyName;
    private double value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
