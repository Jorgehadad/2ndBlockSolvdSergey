package com.solvd.entities;

public class Staff {
    private Integer dni;
    private String name;
    private Double salary;
    private Integer numSegSoc;
    private String address;
    private Integer phone_fijo;
    private Integer phone_mobile;
    private String nameP;

    public Staff() {
    }

    public Staff(Integer dni, String name, Double salary, Integer numSegSoc, String address, Integer phone_fijo, Integer phone_mobile, String nameP) {
        this.dni = dni;
        this.name = name;
        this.salary = salary;
        this.numSegSoc = numSegSoc;
        this.address = address;
        this.phone_fijo = phone_fijo;
        this.phone_mobile = phone_mobile;
        this.nameP = nameP;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getNumSegSoc() {
        return numSegSoc;
    }

    public void setNumSegSoc(Integer numSegSoc) {
        this.numSegSoc = numSegSoc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone_fijo() {
        return phone_fijo;
    }

    public void setPhone_fijo(Integer phone_fijo) {
        this.phone_fijo = phone_fijo;
    }

    public Integer getPhone_mobile() {
        return phone_mobile;
    }

    public void setPhone_mobile(Integer phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    @Override
    public String toString() {
        return "Staff{" + "dni=" + dni + ", name=" + name + ", salary=" + salary + ", numSegSoc=" + numSegSoc + ", address=" + address + ", phone_fijo=" + phone_fijo + ", phone_mobile=" + phone_mobile + ", nameP=" + nameP + '}';
    }
}
