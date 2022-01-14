
package com.solvd.objectsIgnore;

public class Investigator {
    private Integer DNI;
    private String Title;

    public Investigator() {
    }

    public Investigator(Integer DNI, String title) {
        this.DNI = DNI;
        Title = title;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Investigator{" +
                "DNI=" + DNI +
                ", Title='" + Title + '\'' +
                '}';
    }
    
}
