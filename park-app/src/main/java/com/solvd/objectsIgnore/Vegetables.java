package com.solvd.objectsignore;

import java.sql.Date;

public class Vegetables {
    private String scientific_name;
    private Integer Flowering;
    private Date start_date;
    private Date end_date;

    public Vegetables() {
    }

    public Vegetables(String scientific_name, Integer flowering, Date start_date, Date end_date) {
        this.scientific_name = scientific_name;
        Flowering = flowering;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public Integer getFlowering() {
        return Flowering;
    }

    public void setFlowering(Integer flowering) {
        Flowering = flowering;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "scientific_name='" + scientific_name + '\'' +
                ", flowering=" + Flowering +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }
    
}
