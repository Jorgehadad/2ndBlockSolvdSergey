package com.solvd.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.dao.ParkDAO;
import com.solvd.jdbc.entities.Park;

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

        Park park = new Park();
        park.setNameP("With Summer2");
        park.setDateDeclaracion(java.sql.Date.valueOf("2021-01-01"));
        
        ParkDAO ParkDAO = new ParkDAO(); 
        //ParkDAO.save(park);
        ParkDAO.getAll();
        //ParksService.getByNameA(area.getNameA());
        //ParksService.update(area);
        //ParksService.delete(area);
        

    }
    
}
