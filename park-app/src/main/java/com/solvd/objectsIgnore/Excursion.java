package com.solvd.objectsignore;

import java.sql.Date;
import java.sql.Time;

public class Excursion {
    private Integer Cod_Excursion;
    private Date date;
    private Time Hour;
    private String Vehicle;

    public Excursion() {
    }

    public Excursion(Integer cod_Excursion, Date date, Time hour, String vehicle) {
        Cod_Excursion = cod_Excursion;
        this.date = date;
        Hour = hour;
        Vehicle = vehicle;
    }

    public Integer getCod_Excursion() {
        return Cod_Excursion;
    }

    public void setCod_Excursion(Integer cod_Excursion) {
        Cod_Excursion = cod_Excursion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return Hour;
    }

    public void setHour(Time hour) {
        Hour = hour;
    }

    public String getVehicle() {
        return Vehicle;
    }

    public void setVehicle(String vehicle) {
        Vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Excursions{" +
                "Cod_Excursion=" + Cod_Excursion +
                ", date=" + date +
                ", Hour=" + Hour +
                ", Vehicle='" + Vehicle + '\'' +
                '}';
    }
    
}
