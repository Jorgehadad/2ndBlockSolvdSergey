package com.solvd.jdbc.entities;

public class Staff {
    private Integer DNI;
    private String Name;
    private Double salary;
    private Integer NumSegSoc;
    private String Address;
    private String Phone_fijo;
    private String Phone_mobile;
    private String NameP;

    public Staff() {
    }

    public Staff(Integer DNI, String Name, Double salary, Integer NumSegSoc, String Address, String Phone_fijo, String Phone_mobile, String NameP) {
        this.DNI = DNI;
        this.Name = Name;
        this.salary = salary;
        this.NumSegSoc = NumSegSoc;
        this.Address = Address;
        this.Phone_fijo = Phone_fijo;
        this.Phone_mobile = Phone_mobile;
        this.NameP = NameP;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getNumSegSoc() {
        return NumSegSoc;
    }

    public void setNumSegSoc(Integer NumSegSoc) {
        this.NumSegSoc = NumSegSoc;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone_fijo() {
        return Phone_fijo;
    }

    public void setPhone_fijo(String Phone_fijo) {
        this.Phone_fijo = Phone_fijo;
    }

    public String getPhone_mobile() {
        return Phone_mobile;
    }

    public void setPhone_mobile(String Phone_mobile) {
        this.Phone_mobile = Phone_mobile;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    @Override
    public String toString() {
        return "Staff{" + "DNI=" + DNI + ", Name=" + Name + ", salary=" + salary + ", NumSegSoc=" + NumSegSoc + ", Address=" + Address + ", Phone_fijo=" + Phone_fijo + ", Phone_mobile=" + Phone_mobile + ", NameP=" + NameP + '}';
    }
}
