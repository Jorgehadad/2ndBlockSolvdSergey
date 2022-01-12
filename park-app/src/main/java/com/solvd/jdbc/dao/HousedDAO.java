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
import com.solvd.jdbc.entities.Housed;
import com.solvd.jdbc.interfaces.IHousedDAO;

public class HousedDAO extends AbstractJdbcDAO implements IHousedDAO {

    private final static String SQL_INSERT =    "INSERT INTO Housed(`numAccomodation`,`dniVisitor`,`arrivalDate`,`departureDate`,`room`) VALUES(?, ?, ?, ?, ?)";
    private final static String SQL_UPDATE =    "UPDATE Housed SET room = ? WHERE numAccomodation = ? and dniVisitor = ?";
    private final static String SQL_GET_BY_DNI = "SELECT * FROM Housed WHERE dniVisitor = ?";
    private final static String SQL_DELETE =    "DELETE FROM Housed WHERE numAccomodation = ? and dniVisitor = ?";
    private static final String SQL_GET_ALL_HOUSED_PKS = "SELECT * FROM housed WHERE numAccomodation = ? and dniVisitor = ?";
    private static final String SQL_GET_ALL_LIMIT10 = "SELECT * FROM housed LIMIT 10";

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public void HousedDAO(){}

    @Override
    public void save(Housed housed) throws SQLException {
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, housed.getNumAccomodation());
            ps.setInt(2, housed.getDniVisitor());
            ps.setDate(3, housed.getarrivalDate());
            ps.setDate(4, housed.getdepartureDate());
            ps.setString(5, housed.getRoom());
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
    public void update(Housed housed) throws SQLException{
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, housed.getRoom());
            ps.setInt(2, housed.getNumAccomodation());
            ps.setInt(3, housed.getDniVisitor());

            System.out.println("Query been executed " + SQL_UPDATE);
            ps.executeUpdate();
            System.out.println("The housed "+ housed.toString() + " has been updated");
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    @Override
    public void delete(Housed housed) throws SQLException{
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            System.out.println("Query been executed " + SQL_DELETE);

            ps.setInt(1, housed.getNumAccomodation());
            ps.setInt(2, housed.getDniVisitor());
            ps.executeUpdate();
            System.out.println(housed.toString() + " deleted");
        } finally {
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    public List<Housed> getByDni(Integer dni) throws SQLException{
        Housed housed = null;
        List<Housed> houseds = new ArrayList<>();
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_DNI);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                housed = new Housed();
                housed.setNumAccomodation(rs.getInt("numAccomodation"));
                housed.setDniVisitor(rs.getInt("dniVisitor"));
                housed.setarrivalDate(rs.getDate("arrivalDate"));
                housed.setdepartureDate(rs.getDate("departureDate"));
                housed.setRoom(rs.getString("room"));
                houseds.add(housed);
                System.out.println("The housed "+ housed.toString() + " has been found");
            }
        } finally {
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return houseds;
    }

    public List<Housed> getAllByPks(Integer dni, Integer numAc) throws SQLException {
        List<Housed> houseds = new ArrayList<>();
        try {
            conn = PoolConnection.getConnection();
            st = conn.createStatement();
            ps = conn.prepareStatement(SQL_GET_ALL_HOUSED_PKS);
            ps.setInt(1, numAc);
            ps.setInt(2, dni);
            System.out.println("Query been executed " + ps);
            rs = ps.executeQuery();

            while(rs.next()){
                Housed housed = new Housed();
                housed.setNumAccomodation(rs.getInt("numAccomodation"));
                housed.setDniVisitor(rs.getInt("dniVisitor"));
                housed.setarrivalDate(rs.getDate("arrivalDate"));
                housed.setdepartureDate(rs.getDate("departureDate"));
                housed.setRoom(rs.getString("room"));
                houseds.add(housed);
                System.out.println("The housed "+ housed.toString() + " has been found");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        return houseds;
    }

    public List<Housed> getAllLimit10() throws SQLException {
        List<Housed> houseds = new ArrayList<>();
        try {
            conn = PoolConnection.getConnection();
            st = conn.createStatement();
            ps = conn.prepareStatement(SQL_GET_ALL_LIMIT10);
            System.out.println("Query been executed " + ps);
            rs = ps.executeQuery();

            while(rs.next()){
                Housed housed = new Housed();
                housed.setNumAccomodation(rs.getInt("numAccomodation"));
                housed.setDniVisitor(rs.getInt("dniVisitor"));
                housed.setarrivalDate(rs.getDate("arrivalDate"));
                housed.setdepartureDate(rs.getDate("departureDate"));
                housed.setRoom(rs.getString("room"));
                houseds.add(housed);
                System.out.println("The housed "+ housed.toString() + " has been found");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        return houseds;
    }
    
}
