package com.solvd.objectsignore;

import java.sql.Date;

public class Sale {
    private Integer Name;
    private String NameP;
    private String NameA;
    private Integer NumTicket;
    private Date Date_payment;

    public Sale() {
    }

    public Sale(Integer Name, String NameP, String NameA, Integer NumTicket, Date Date_payment) {
        this.Name = Name;
        this.NameP = NameP;
        this.NameA = NameA;
        this.NumTicket = NumTicket;
        this.Date_payment = Date_payment;
    }

    public Integer getName() {
        return Name;
    }

    public void setName(Integer Name) {
        this.Name = Name;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    public String getNameA() {
        return NameA;
    }

    public void setNameA(String NameA) {
        this.NameA = NameA;
    }

    public Integer getNumTicket() {
        return NumTicket;
    }

    public void setNumTicket(Integer NumTicket) {
        this.NumTicket = NumTicket;
    }

    public Date getDate_payment() {
        return Date_payment;
    }

    public void setDate_payment(Date Date_payment) {
        this.Date_payment = Date_payment;
    }

    @Override
    public String toString() {
        return "Sale{" + "Name=" + Name + ", NameP=" + NameP + ", NameA=" + NameA + ", NumTicket=" + NumTicket + ", Date_payment=" + Date_payment + '}';
    }
}
