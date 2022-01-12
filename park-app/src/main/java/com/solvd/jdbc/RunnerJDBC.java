package com.solvd.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.dao.HousedDAO;
import com.solvd.jdbc.dao.ParkDAO;
import com.solvd.jdbc.dao.VisitorDAO;
import com.solvd.jdbc.entities.Housed;
import com.solvd.jdbc.entities.Park;
import com.solvd.jdbc.entities.Visitor;
import com.solvd.jdbc.service.ParkService;

public class RunnerJDBC {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");

        Connection conn = null;
        try {
            conn = PoolConnection.getConnection();
            System.out.println(conn + "Connection successful");
        }
        catch(SQLException ex){
            System.out.println(conn + "Connection failed");
        }

//------------------------------------------------------------------------//
        
        Park park = new Park();
        park.setNameP("With Summer2");
        park.setDateDeclaracion(java.sql.Date.valueOf("2021-01-01"));
        
        ParkService parkService = new ParkService(); 
        //parkService.save(park);
        parkService.getAll();
        //parkService.getByNameA(area.getNameA());
        //parkService.update(area);
        //parkService.delete(area);
        
 //------------------------------------------------------------------------//
        /*
        Housed housed = new Housed();
        housed.setNumAccomodation(1);
        housed.setDniVisitor(1);
        housed.setarrivalDate(java.sql.Date.valueOf("2021-01-01"));
        housed.setdepartureDate(java.sql.Date.valueOf("2021-01-01"));
        housed.setRoom("1");

        HousedDAO housedDAO = new HousedDAO();
        //housedDAO.save(housed); //foreing key problems safe update
        housedDAO.getAllLimit10();
        */
 //------------------------------------------------------------------------//
        /*
        Visitor visitor = new Visitor();
        visitor.setDNI(1);
        visitor.setName("Vasya");
        visitor.setAddress("Street 1");
        visitor.setProfession("Student");

        VisitorDAO visitorDAO = new VisitorDAO();
        //visitorDAO.save(visitor);
        visitorDAO.getAll();
        */
//------------------------------------------------------------------------//
        


    }
    
}
