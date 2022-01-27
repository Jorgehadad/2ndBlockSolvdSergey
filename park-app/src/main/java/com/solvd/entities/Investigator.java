
package com.solvd.entities;

import com.solvd.factorypattern.IStaff;

public class Investigator implements IStaff {
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

    @Override
    public void earnMoney() {
        System.out.println("Investigator earns money");
    }

    @Override
    public void work() {
        System.out.println("Investigator works");
    }

    @Override
    public boolean isConservation() {
        return false;
    }

    @Override
    public boolean isInvestigator() {
        return true;
    }

    @Override
    public boolean isVigilance() {
        return false;
    }
    
    
}
