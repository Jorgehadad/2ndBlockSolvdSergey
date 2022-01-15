package com.solvd.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Housed;
import com.solvd.entities.Park;
import com.solvd.entities.Visitor;
import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.dao.HousedDAO;
import com.solvd.jdbc.dao.ParkDAO;
import com.solvd.jdbc.dao.VisitorDAO;
import com.solvd.jdbc.service.ParkServiceJDBC;

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
        /*
        Park park = new Park();
        park.setNameP("With Summer2");
        park.setDateDeclaracion(java.sql.Date.valueOf("2021-01-01"));
        
        ParkService parkService = new ParkService(); 
        //parkService.save(park);
         // **********************print all parks********************** //
        List<Park> parks = parkService.getAll();
        for (Park park1 : parks) {
            System.out.println(park1);
        }

        // **********************print park by name********************** //
        Park park2 = parkService.getByName("With Summer");
        System.out.println(park2);

        // **********************print park by date********************** //
        Park park3 = parkService.getByDate(java.sql.Date.valueOf("2021-01-01"));
        System.out.println(park3);

        // **********************print park by name and date********************** //
        List<Park> parks2 = parkService.getByNameAndDate("With Summer", java.sql.Date.valueOf("2021-01-01"));
        for (Park park4 : parks2) {
            System.out.println(park4);
        }

        // **********************update new park********************** //
        Park park5 = parkService.getByName("With Summer");
        park5.setNameP("With Summer2");
        parkService.update(park5);
        System.out.println(park5);

        // **********************delete park********************** //
        Park park6 = parkService.getByName("With Summer2");
        parkService.delete(park6);
        System.out.println(park6);

        //parkService.getByNameA(area.getNameA());
        //parkService.update(area);
        //parkService.delete(area);
        
        */
 //------------------------------------------------------------------------//
        /*       
        +++++++++++++++ NOT IMPLEMENTED SERVICES YET +++++++++++++++++

        Housed housed = new Housed();
        housed.setNumAccomodation(1);
        housed.setDniVisitor(1);
        housed.setarrivalDate(java.sql.Date.valueOf("2021-01-01"));
        housed.setdepartureDate(java.sql.Date.valueOf("2021-01-01"));
        housed.setRoom("1");

        HousedDAO housedDAO = new HousedDAO();
        //housedDAO.save(housed); //foreing key problems safe update

        // ********************** printing 10 housed ********************** //

        List houseList = housedDAO.getAllLimit10();

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
