package com.solvd.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.solvd.adapter.IAdapterBudget;
import com.solvd.adapter.ISetAmount;

public class Proyect implements IAdapterBudget {
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

    @Override
    public void setAmount(double amount) {
        this.budget = amount;
        
    }

    @Override
    public double getAmount() {
        return this.budget;
    }

    
    
}
