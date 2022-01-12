package com.solvd.jdbc.entities;

import java.sql.Date;

public class Proyect {
    private String ProyectName;
    private Double budget; 
    private Date StartDate;
    private Date EndDate;

    public Proyect() {
    }

    public Proyect(String ProyectName, Double budget, Date StartDate, Date EndDate) {
        this.ProyectName = ProyectName;
        this.budget = budget;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public String getProyectName() {
        return ProyectName;
    }

    public void setProyectName(String ProyectName) {
        this.ProyectName = ProyectName;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    @Override
    public String toString() {
        return "Proyect{" + "ProyectName=" + ProyectName + ", budget=" + budget + ", StartDate=" + StartDate + ", EndDate=" + EndDate + '}';
    }

    
    
}
