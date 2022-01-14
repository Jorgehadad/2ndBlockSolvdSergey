package com.solvd.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.interfaces.IAreasDAO;

public class AreaDAO extends AbstractJdbcDAO implements IAreasDAO {

    private final static String SQL_INSERT =    "INSERT INTO Area(NameA, NameP, Extension) VALUES(?, ?, ?)";
    private final static String SQL_UPDATE =    "UPDATE Area SET NameA=?, NameP=?, Extension=? WHERE id = ?";
    private final static String SQL_GET_BY_NAMEP = "SELECT * FROM Area WHERE NameP = ?";
    private final static String SQL_DELETE =    "DELETE FROM Area WHERE NameA = ?";
    private static final String SQL_GET_ALL_AREAS_NAMEP = "SELECT * FROM area WHERE nameP = ?";

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public void AreaDAO(){}

    @Override
    public void save(Area area) throws SQLException {
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, area.getnameA());
            ps.setString(2, area.getnameP());
            ps.setDouble(3, area.getExtension());
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
    public void update(Area area) throws SQLException{
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, area.getnameA());
            ps.setString(2, area.getnameP());
            ps.setDouble(3, area.getExtension());

            System.out.println("Query been executed " + SQL_UPDATE);
            ps.executeUpdate();
            System.out.println("The area "+ area.toString() + " has been updated");
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    @Override
    public void delete(Area area) throws SQLException{
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            System.out.println("Query been executed " + SQL_DELETE);

            ps.setNString(1, area.getnameA());
            ps.executeUpdate();
            System.out.println(area.toString() + " deleted");
        } finally {
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    public Area getByNameP(String NameP) throws SQLException{
        Area area = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_NAMEP);
            ps.setNString(1, NameP);
            rs = ps.executeQuery();
            while(rs.next()){
                area = new Area();
                area.setnameA(rs.getString("NameA"));
                area.setnameA(rs.getString("NameP"));
                area.setExtension(rs.getDouble("Extension"));
            }
        } finally {
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return area;
    }

    public List<Area> getAllByNameP(String myNameP) throws SQLException {
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
