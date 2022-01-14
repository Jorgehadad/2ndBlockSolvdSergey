package com.solvd.objectsIgnore;

public class Management {
    private Integer DNI;
    private Integer NumTicket;
     
    public Management() {
    }

    public Management(Integer DNI, Integer NumTicket) {
        this.DNI = DNI;
        this.NumTicket = NumTicket;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getNumTicket() {
        return NumTicket;
    }

    public void setNumTicket(Integer NumTicket) {
        this.NumTicket = NumTicket;
    }

    @Override
    public String toString() {
        return "Management{" +
                "DNI=" + DNI +
                ", NumTicket=" + NumTicket +
                '}';
    }
    
}
