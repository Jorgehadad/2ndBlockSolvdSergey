package com.solvd.entities;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "area")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"nameP", "dateDeclaration"})
public class Park {
    
    @JsonProperty("nameP")
    private String nameP;

    @JsonProperty("dateDeclaration")
    private Date dateDeclaration;

    @JsonIgnore
    private List<Area> areas;
    
    public Park() {
    }

    public Park(String nameP, Date dateDeclaration) {
        this.nameP = nameP;
        this.dateDeclaration = dateDeclaration;
    }
 
    public String getNameP() {
        return nameP;
    }

    @JsonSetter("nameP")
    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public Date getDateDeclaracion() {
        return dateDeclaration;
    }

    @JsonSetter("dateDeclaration")
    public void setDateDeclaracion(Date dateDeclaracion) {
        this.dateDeclaration = dateDeclaracion;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return "Park{" +
                "nameP='" + nameP + '\'' +
                ", dateDeclaracion=" + dateDeclaration +
                ", areas=" + areas +
                '}';
    }


}
 