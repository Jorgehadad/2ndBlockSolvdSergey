package com.solvd.jdbc.entities;

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

@XmlRootElement(name = "housed")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"numAccomodation, dniVisitor, arrivalDate, departureDate, room "})
public class Housed {
    @JsonProperty("numAccomodation")
    private Integer numAccomodation;

    @JsonProperty("dniVisitor")
    private Integer dniVisitor;

    @JsonProperty("arrivalDate")
    private Date arrivalDate;

    @JsonProperty("departureDate")
    private Date departureDate; 

    @JsonProperty("room")
    private String room;

    public Housed() {
    }

    public Housed(Integer numAccomodation, Integer dniVisitor, Date arrival_date, Date departure_date, String room) {
        this.numAccomodation = numAccomodation;
        this.dniVisitor = dniVisitor;
        arrivalDate = arrival_date;
        departureDate = departure_date;
        this.room = room;
    }

    public Integer getNumAccomodation() {
        return numAccomodation;
    }

    @JsonSetter("numAccomodation")
    public void setNumAccomodation(Integer numAccomodation) {
        this.numAccomodation = numAccomodation;
    }

    public Integer getDniVisitor() {
        return dniVisitor;
    }

    @JsonSetter("dniVisitor")
    public void setDniVisitor(Integer dniVisitor) {
        this.dniVisitor = dniVisitor;
    }

    public Date getarrivalDate() {
        return arrivalDate;
    }

    @JsonSetter("arrivalDate")
    public void setarrivalDate(Date arrival_date) {
        arrivalDate = arrival_date;
    }

    public Date getdepartureDate() {
        return departureDate;
    }

    @JsonSetter("departureDate")
    public void setdepartureDate(Date departure_date) {
        departureDate = departure_date;
    }

    public String getRoom() {
        return room;
    }

    @JsonSetter("room")
    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Housed{" +
                "NumAccomodation=" + numAccomodation +
                ", dniVisitor=" + dniVisitor +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                ", Room='" + room + '\'' +
                '}';
    }
    
    
}
