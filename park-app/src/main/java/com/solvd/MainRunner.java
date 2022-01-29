package com.solvd;

import java.sql.Date;

import com.solvd.entities.*;

import jakarta.activation.DataSource;

public class MainRunner {
    public static void main(String[] args) {
        //Create entities
        Park park = new Park();
        park.setNameP("Park");
        park.setDateDeclaracion(Date.valueOf("2019-01-01"));

        Area area = new Area();
        area.setnameA("Area");
        area.setnameP("Park");
        area.setExtension(100.0);
        
        Housed housed = new Housed();
        housed.setNumAccomodation(1);
        housed.setDniVisitor(1);
        housed.setarrivalDate(Date.valueOf("2019-01-01"));
        housed.setdepartureDate(Date.valueOf("2019-01-01"));
        housed.setRoom("room");

        Visitor visitor = new Visitor();
        visitor.setDNI(1);
        visitor.setName("name");
        visitor.setAddress("Address");
        visitor.setProfession("Profession");

        Staff staff = new Staff();
        staff.setDni(1);
        staff.setName("name");
        staff.setAddress("Address");
        staff.setSalary(100.0);
        staff.setNumSegSoc(1);
        staff.setPhone_fijo(1);
        staff.setPhone_mobile(1);
        
        Investigator investigator = new Investigator();
        investigator.setDNI(1);
        investigator.setTitle("Scientist");
        investigator.isInvestigator();

        Conservation conservation = new Conservation();
        conservation.setDNI(1);
        


        

    }
    
}
