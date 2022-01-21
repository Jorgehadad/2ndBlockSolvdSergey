package com.solvd.entities;

import com.solvd.adapter.ISetAmount;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "staff")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"dni", "name", "salary","numSegSoc", "address", "phone_fijo", "phome_mobile", "nameP"})
public class Staff implements ISetAmount {
    @JsonProperty("dni")
    private Integer dni;

    @JsonProperty("name")
    private String name;

    @JsonProperty("salary")
    private Double salary;

    @JsonProperty("numSegSoc")
    private Integer numSegSoc;

    @JsonProperty("address")
    private String address;

    @JsonProperty("phone_fijo")
    private Integer phone_fijo;

    @JsonProperty("phome_mobile")
    private Integer phone_mobile;

    @JsonProperty("nameP")
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

    @JsonSetter("dni")
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    @JsonSetter("salary")
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getNumSegSoc() {
        return numSegSoc;
    }

    @JsonSetter("numSegSoc")
    public void setNumSegSoc(Integer numSegSoc) {
        this.numSegSoc = numSegSoc;
    }

    public String getAddress() {
        return address;
    }

    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone_fijo() {
        return phone_fijo;
    }

    @JsonSetter("phone_fijo")
    public void setPhone_fijo(Integer phone_fijo) {
        this.phone_fijo = phone_fijo;
    }

    public Integer getPhone_mobile() {
        return phone_mobile;
    }

    @JsonSetter("phone_mobile")
    public void setPhone_mobile(Integer phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    public String getNameP() {
        return nameP;
    }

    @JsonSetter("nameP")
    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    @Override
    public void setAmount(double amount) {
        this.salary = amount;
        
    }

    @Override
    public double getAmount() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Staff [dni=" + dni + ", name=" + name + ", salary=" + salary + ", numSegSoc=" + numSegSoc + ", address=" + address + ", phone_fijo=" + phone_fijo + ", phone_mobile=" + phone_mobile + ", nameP=" + nameP + "]";
    }
}
