package com.solvd.builderpattern;

import com.solvd.entities.Staff;

//ABSTRACT BUILDER
public abstract class StaffBuilder {

    protected Staff staff;

    public Staff getStaff() {
        return staff;
    }

    public void createStaff() {
        staff = new Staff();
    }
    /*
    private Integer dni;
    private String name;
    private Double salary;
    private Integer numSegSoc;
    private String address;
    private Integer phone_fijo;
    private Integer phone_mobile;
    private String nameP;
    */
    public abstract void setDni(Integer dni);
    public abstract void setName(String name);
    public abstract void setSalary(Double salary);
    public abstract void setNumSegSoc(Integer numSegSoc);
    public abstract void setAddress(String address);
    public abstract void setPhone_fijo(Integer phone_fijo);
    public abstract void setPhone_mobile(Integer phone_mobile);
    public abstract void setNameP(String nameP);
}
