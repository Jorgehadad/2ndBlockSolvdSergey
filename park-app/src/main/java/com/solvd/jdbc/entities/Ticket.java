package com.solvd.jdbc.entities;

public class Ticket {
    private Integer NumTicket;
    private String NameP;
    private Integer DNI;
    private Double price;

    public Ticket() {
    }

    public Ticket(Integer NumTicket, String NameP, Integer DNI, Double price) {
        this.NumTicket = NumTicket;
        this.NameP = NameP;
        this.DNI = DNI;
        this.price = price;
    }

    public Integer getNumTicket() {
        return NumTicket;
    }

    public void setNumTicket(Integer NumTicket) {
        this.NumTicket = NumTicket;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "NumTicket=" + NumTicket +
                ", NameP='" + NameP + '\'' +
                ", DNI=" + DNI +
                ", price=" + price +
                '}';
    }
    

}
