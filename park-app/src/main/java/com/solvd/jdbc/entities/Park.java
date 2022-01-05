package com.solvd.jdbc.entities;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "area")
@XmlAccessorType(XmlAccessType.FIELD)
public class Park {

    @JsonProperty("nameP")
    private String nameP;

    @JsonProperty("dateDeclaration")
    private Date dateDeclaration;

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

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public Date getDateDeclaracion() {
        return dateDeclaration;
    }

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
 