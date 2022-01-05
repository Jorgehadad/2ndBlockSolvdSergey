package com.solvd.jdbc.entities;

public class Conservation {
    private Integer DNI;
    private String Speciality;
    private String NameA;
    private String NameP;

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getNameA() {
        return NameA;
    }

    public void setNameA(String nameA) {
        NameA = nameA;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String nameP) {
        NameP = nameP;
    }

    @Override
    public String toString() {
        return "Conservation{" +
                "DNI=" + DNI +
                ", Speciality='" + Speciality + '\'' +
                ", NameA='" + NameA + '\'' +
                ", NameP='" + NameP + '\'' +
                '}';
    }

    
}
