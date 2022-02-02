package com.solvd.objectsignore;

public class Organize {
    private Integer NumAccomodation; 
    private String NameP;
    private Integer Cod_Excursion;

    public Organize() {
    }

    public Organize(Integer NumAccomodation, String NameP, Integer Cod_Excursion) {
        this.NumAccomodation = NumAccomodation;
        this.NameP = NameP;
        this.Cod_Excursion = Cod_Excursion;
    }

    public Integer getNumAccomodation() {
        return NumAccomodation;
    }

    public void setNumAccomodation(Integer NumAccomodation) {
        this.NumAccomodation = NumAccomodation;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    public Integer getCod_Excursion() {
        return Cod_Excursion;
    }

    public void setCod_Excursion(Integer Cod_Excursion) {
        this.Cod_Excursion = Cod_Excursion;
    }   

    @Override
    public String toString() {
        return "Organize{" + "NumAccomodation=" + NumAccomodation + ", NameP=" + NameP + ", Cod_Excursion=" + Cod_Excursion + '}';
    }
    
}
