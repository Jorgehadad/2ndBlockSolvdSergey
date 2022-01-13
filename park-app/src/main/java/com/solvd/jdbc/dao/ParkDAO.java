package com.solvd.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.solvd.jdbc.connections.PoolConnection;

import com.solvd.jdbc.entities.Area;
import com.solvd.jdbc.entities.Park;
import com.solvd.jdbc.interfaces.IParksDAO;
import com.solvd.jdbc.service.ParkService;

public class ParkDAO extends AbstractJdbcDAO implements IParksDAO {
        
    private static final Logger LOGGER = Logger.getLogger(ParkDAO.class.getName());
    private static final String SQL_INSERT = "INSERT INTO park (nameP, dateDeclaration) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE park SET dateDeclaration=? WHERE nameP = ?";
    private static final String SQL_DELETE = "DELETE FROM park WHERE nameP = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM park";
    private static final String SQL_GET_BY_NAME = "SELECT * FROM park WHERE nameP = ?";
    private static final String SQL_GET_BY_DATE = "SELECT * FROM park WHERE dateDeclaration = ?";
    private static final String SQL_GET_BY_NAME_AND_DATE = "SELECT * FROM park WHERE nameP = ? AND dateDeclaration = ?";
    private static final String SQL_GET_ALL_AREAS_NAMEP = "SELECT * FROM area WHERE nameP = ?";

    public ParkDAO() {
        super();
    }

    @Override
    public void save(Park park) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, park.getNameP());
            ps.setDate(2, park.getDateDeclaracion());
            System.out.println("Query been executed " + SQL_INSERT);
            ps.executeUpdate();
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    @Override
    public void update(Park park) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(2, park.getNameP());
            ps.setDate(1, park.getDateDeclaracion());
            System.out.println("Query been executed " + SQL_UPDATE);
            ps.executeUpdate();
            System.out.println("The park "+ park.toString() + " has been updated");
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    @Override
    public void delete(Park park) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, park.getNameP());
            System.out.println("Query been executed " + SQL_DELETE);
            ps.executeUpdate();
            System.out.println("The park "+ park.toString() + " has been deleted");
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    public List<Park> getAll() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Park> parks = new ArrayList<>();
        List<Area> areas;

        try {
            conn = PoolConnection.getConnection();
            st = conn.createStatement();
            System.out.println("Query been executed " + SQL_GET_ALL + ";");
            rs = st.executeQuery(SQL_GET_ALL);

            while(rs.next()){
                Park park = new Park();
                park.setNameP(rs.getString("nameP"));
                park.setDateDeclaracion(rs.getDate("dateDeclaration"));
                areas = new ArrayList<>();
                ParkService parkService = new ParkService();
                areas = parkService.getAllAreasByNameP(park.getNameP());
                park.setAreas(areas);
                parks.add(park);
                System.out.println("The park "+ park.toString() + " has been found" + " With this areas: \n" + park.getAreas());
                System.out.println("-----------------------------------------------------");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        return parks;
    }

    public Park getByName(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Park park = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_NAME);
            ps.setString(1, name);
            System.out.println("Query been executed " + SQL_GET_BY_NAME);
            rs = ps.executeQuery();
            if(rs.next()){
                park = new Park();
                park.setNameP(rs.getString("nameP"));
                park.setDateDeclaracion(rs.getDate("dateDeclaration"));
                System.out.println("The park "+ park.toString() + " has been found");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return park;
    }

    public Park getByDate(Date date) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Park park = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_DATE);
            ps.setDate(1, date);
            System.out.println("Query been executed " + SQL_GET_BY_DATE);
            rs = ps.executeQuery();
            if(rs.next()){
                park = new Park();
                park.setNameP(rs.getString("nameP"));
                park.setDateDeclaracion(rs.getDate("dateDeclaration"));
                System.out.println("The park "+ park.toString() + " has been found");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return park;
    }

    public List<Park> getByNameAndDate(String name, Date date) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Park> parks = new ArrayList<>();
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_NAME_AND_DATE);
            ps.setString(1, name);
            ps.setDate(2, date);
            System.out.println("Query been executed " + SQL_GET_BY_NAME_AND_DATE);
            rs = ps.executeQuery();
            while(rs.next()){
                Park park = new Park();
                park.setNameP(rs.getString("nameP"));
                park.setDateDeclaracion(rs.getDate("dateDeclaration"));
                parks.add(park);
                System.out.println("The park "+ park.toString() + " has been found");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return parks;
    }
    
}
