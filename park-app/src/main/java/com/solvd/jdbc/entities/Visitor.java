package com.solvd.jdbc.entities;

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
    private Integer DNI;

    @JsonProperty("name")
    private String Name;

    @JsonProperty("Address")
    private String Address;

    @JsonProperty("Profession")
    private String Profession;

    @JsonIgnore
    private List<Housed> housedList;

    public Visitor() {
    }

    public Visitor(Integer DNI, String Name, String Address, String Profession) {
        this.DNI = DNI;
        this.Name = Name;
        this.Address = Address;
        this.Profession = Profession;
    }

    public Integer getDNI() {
        return DNI;
    }

    @JsonSetter("dni")
    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return Name;
    }

    @JsonSetter("name")
    public void setName(String Name) {
        this.Name = Name;
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
    

    @Override
    public String toString() {
        return "Visitor{" +
                "DNI=" + DNI +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Profession='" + Profession + '\'' +
                '}';
    }
}
