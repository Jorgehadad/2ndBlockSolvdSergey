package com.solvd.objectsignore;

public class Vigilance {
    private Integer DNI;
    private String NameP;
    private String NameA;
    private String enrollment;
    private String type;

    public Vigilance() {
    }

    public Vigilance(Integer DNI, String NameP, String NameA, String enrollment, String type) {
        this.DNI = DNI;
        this.NameP = NameP;
        this.NameA = NameA;
        this.enrollment = enrollment;
        this.type = type;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
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

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vigilance{" +
                "DNI=" + DNI +
                ", NameP='" + NameP + '\'' +
                ", NameA='" + NameA + '\'' +
                ", enrollment='" + enrollment + '\'' +
                ", type='" + type + '\'' +
                '}';
    }   
}
