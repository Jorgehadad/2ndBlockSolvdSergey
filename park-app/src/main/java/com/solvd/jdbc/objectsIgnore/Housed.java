package com.solvd.jdbc.objectsIgnore;

import java.sql.Date;

public class Housed {
    private Integer NumAccomodation;
    private Integer dniVisitor;
    private Date Arrival_date;
    private Date Departure_date; 
    private String Room;

    public Housed() {
    }

    public Housed(Integer numAccomodation, Integer dniVisitor, Date arrival_date, Date departure_date, String room) {
        NumAccomodation = numAccomodation;
        this.dniVisitor = dniVisitor;
        Arrival_date = arrival_date;
        Departure_date = departure_date;
        Room = room;
    }

    public Integer getNumAccomodation() {
        return NumAccomodation;
    }

    public void setNumAccomodation(Integer numAccomodation) {
        NumAccomodation = numAccomodation;
    }

    public Integer getDniVisitor() {
        return dniVisitor;
    }

    public void setDniVisitor(Integer dniVisitor) {
        this.dniVisitor = dniVisitor;
    }

    public Date getArrival_date() {
        return Arrival_date;
    }

    public void setArrival_date(Date arrival_date) {
        Arrival_date = arrival_date;
    }

    public Date getDeparture_date() {
        return Departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        Departure_date = departure_date;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    @Override
    public String toString() {
        return "Housed{" +
                "NumAccomodation=" + NumAccomodation +
                ", dniVisitor=" + dniVisitor +
                ", Arrival_date=" + Arrival_date +
                ", Departure_date=" + Departure_date +
                ", Room='" + Room + '\'' +
                '}';
    }
    
    
}
