package com.solvd.entities;

import java.sql.Date;

import java.util.List;

import com.fasterxml.jackson.annotation.*;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "housed")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"numAccomodation, dniVisitor, arrivalDate, departureDate, room "})
@JsonRootName("housed")
@JsonPropertyOrder({"numAccomodation", "dniVisitor", "arrivalDate", "departureDate", "room"})
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

    @JsonCreator
    public Housed(@JsonProperty("numAccomodation") Integer numAccomodation, @JsonProperty("dniVisitor") Integer dniVisitor, @JsonProperty("arrivalDate") Date arrivalDate, @JsonProperty("departureDate") Date departureDate, @JsonProperty("room") String room) {
        this.numAccomodation = numAccomodation;
        this.dniVisitor = dniVisitor;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.room = room;
    }

    @JsonGetter("numAccomodation")
    public Integer getNumAccomodation() {
        return numAccomodation;
    }

    @XmlElement(name = "numAccomodation")
    @JsonSetter("numAccomodation")
    public void setNumAccomodation(Integer numAccomodation) {
        this.numAccomodation = numAccomodation;
    }

    @JsonGetter("dniVisitor")
    public Integer getDniVisitor() {
        return dniVisitor;
    }

    @XmlElement(name = "dniVisitor")
    @JsonSetter("dniVisitor")
    public void setDniVisitor(Integer dniVisitor) {
        this.dniVisitor = dniVisitor;
    }

    @JsonGetter("arrivalDate")
    public Date getarrivalDate() {
        return arrivalDate;
    }

    @XmlElement(name = "arrivalDate")
    @JsonSetter("arrivalDate")
    public void setarrivalDate(Date arrival_date) {
        arrivalDate = arrival_date;
    }

    @JsonGetter("departureDate")
    public Date getdepartureDate() {
        return departureDate;
    }

    @XmlElement(name = "departureDate")
    @JsonSetter("departureDate")
    public void setdepartureDate(Date departure_date) {
        departureDate = departure_date;
    }

    @JsonGetter("room")
    public String getRoom() {
        return room;
    }

    @XmlElement(name = "room")
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
