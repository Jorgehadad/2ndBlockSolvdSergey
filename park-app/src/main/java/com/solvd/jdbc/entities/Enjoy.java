package com.solvd.jdbc.entities;

public class Enjoy {
    private Integer DNI;
    private Integer Cod_Excursion;

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getCod_Excursion() {
        return Cod_Excursion;
    }

    public void setCod_Excursion(Integer cod_Excursion) {
        Cod_Excursion = cod_Excursion;
    }

    @Override
    public String toString() {
        return "Enjoy{" +
                "DNI=" + DNI +
                ", Cod_Excursion=" + Cod_Excursion +
                '}';
    }

    public Enjoy() {
    }

    public Enjoy(Integer DNI, Integer cod_Excursion) {
        this.DNI = DNI;
        this.Cod_Excursion = cod_Excursion;
    }

}
