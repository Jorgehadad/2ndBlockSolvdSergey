package com.solvd.jdbc.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.entities.Park;
import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.interfaces.IAreasDAO;

import com.solvd.jdbc.dao.ParkDAO;

public class ParkService {
    private static final String SQL_GET_ALL_AREAS_NAMEP = "SELECT * FROM area WHERE nameP = ?";
    private static ParkDAO parkDAO;

    public ParkService() {
        parkDAO = new ParkDAO();
    }

    public void save(Park park) throws SQLException {
        parkDAO.save(park);
    }

    public void update(Park park) throws SQLException {
        parkDAO.update(park);
    }

    public void delete(Park park) throws SQLException {
        parkDAO.delete(park);
    }

    public List<Park> getAll() throws SQLException {
        return parkDAO.getAll();
    }

    public Park getByName(String name) throws SQLException {
        return parkDAO.getByName(name);
    }

    public Park getByDate(Date date) throws SQLException {
        return parkDAO.getByDate(date);
    }

    public List<Park> getByNameAndDate(String name, Date date) throws SQLException {
        return parkDAO.getByNameAndDate(name, date);
    }
    
    public List<Area> getAllAreasByNameP(String myNameP) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<Area> areas = new ArrayList<>();
        try {
            conn = PoolConnection.getConnection();
            st = conn.createStatement();
            ps = conn.prepareStatement(SQL_GET_ALL_AREAS_NAMEP);
            ps.setNString(1, myNameP);
            System.out.println("Query been executed " + ps);
            rs = ps.executeQuery();

            while(rs.next()){
                Area area = new Area();
                area.setnameA(rs.getString("NameA"));
                area.setnameP(rs.getString("nameP"));
                area.setExtension(rs.getDouble("Extension"));
                areas.add(area);
                System.out.println("The area "+ area.toString() + " has been found");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        return areas;
    }
    
}
