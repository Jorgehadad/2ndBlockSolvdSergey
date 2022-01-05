package com.solvd.jdbc.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "area")
@XmlAccessorType(XmlAccessType.FIELD)
public class Area  {

    @JsonProperty("nameA")
    private String nameA;

    @JsonProperty("nameP")
    private String nameP;

    @JsonProperty("extension")
    private Double extension;

    public String getnameA() {
        return nameA;
    }

    @XmlElement(name = "nameA")
    public void setnameA(String nameA) {
        this.nameA = nameA;
    }

    public String getnameP() {
        return nameP;
    }

    @XmlElement(name = "nameP")
    public void setnameP(String nameP) {
        this.nameP = nameP;
    }

    public Double getExtension() {
        return extension;
    }

    @XmlElement(name = "extension")
    public void setExtension(Double extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "nameA='" + nameA + '\'' +
                ", nameP='" + nameP + '\'' +
                ", extension=" + extension +
                '}';
    }

    public Area(String nameA, String nameP, Double extension) {
        this.nameA = nameA;
        this.nameP = nameP;
        this.extension = extension;
    }

    public Area() {
    }

}
