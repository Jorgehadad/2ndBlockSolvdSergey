package com.solvd.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "visitor")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"dni","name","Address","Profession"})
public class Visitor {
    @JsonProperty("dni")
    private Integer dni;

    @JsonProperty("name")
    private String name;

    @JsonProperty("Address")
    private String Address;

    @JsonProperty("Profession")
    private String Profession;

    @JsonIgnore
    private List<Housed> housedList;

    public Visitor() {
    }

    public Visitor(Integer dni, String name, String Address, String Profession) {
        this.dni = dni;
        this.name = name;
        this.Address = Address;
        this.Profession = Profession;
    }

    public Integer getDNI() {
        return dni;
    }

    @JsonSetter("dni")
    public void setDNI(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    @JsonSetter("Address")
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    public List<Housed> getHousedList() {
        return housedList;
    }

    public void setHousedList(List<Housed> housedList) {
        this.housedList = housedList;
    }
    

    // to string with housedList
    @Override
    public String toString() {
        return "Visitor{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Profession='" + Profession + '\'' +
                ", housedList=" + housedList +
                '}';
    }
}
