package com.solvd.entities;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "areas")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"nameA","nameP","extension"})
@JsonRootName("areas")
@JsonPropertyOrder({"nameA","nameP","extension"})
public class Area  {

    @JsonProperty("nameA")
    private String nameA;

    @JsonProperty("nameP")
    private String nameP;

    @JsonProperty("extension")
    private Double extension;

    @JsonGetter("nameA")
    public String getnameA() {
        return nameA;
    }

    @XmlElement(name = "nameA")
    @JsonSetter("nameA")
    public void setnameA(String nameA) {
        this.nameA = nameA;
    }

    @JsonGetter("nameP")
    public String getnameP() {
        return nameP;
    }

    @XmlElement(name = "nameP")
    @JsonSetter("nameP")
    public void setnameP(String nameP) {
        this.nameP = nameP;
    }

    @JsonGetter("extension")
    public Double getExtension() {
        return extension;
    }

    @XmlElement(name = "extension")
    @JsonSetter("extension")
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
