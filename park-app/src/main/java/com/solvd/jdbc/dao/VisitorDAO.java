package com.solvd.jdbc.dao;
import java.sql.SQLException;
import java.util.List;

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
import com.solvd.jdbc.entities.Housed;
import com.solvd.jdbc.entities.Park;
import com.solvd.jdbc.interfaces.IParksDAO;

import com.solvd.jdbc.entities.Visitor;
import com.solvd.jdbc.interfaces.IEntityDAO;
import com.solvd.jdbc.interfaces.IVisitorDAO;

public class VisitorDAO extends AbstractJdbcDAO implements IVisitorDAO {

    private static final Logger LOGGER = Logger.getLogger(VisitorDAO.class.getName());
    private static final String SQL_INSERT = "INSERT INTO visitor (`dni`,`name`,`Address`,`Profession`) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE_ADDRESS = "UPDATE visitor SET Address=? WHERE dni = ?";
    private static final String SQL_DELETE = "DELETE FROM visitor WHERE dni = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM visitor LIMIT 10";
    private static final String SQL_GET_BY_NAME = "SELECT * FROM visitor WHERE name = ?";
    private static final String SQL_GET_BY_PROFESSION = "SELECT * FROM visitor WHERE dateDeclaration = ?";
    private static final String SQL_GET_BY_NAME_AND_PROFESSION = "SELECT * FROM visitor WHERE name = ? AND Profession = ?";


    public VisitorDAO() {
        super();
    }

    @Override
    public void save(Visitor visitor) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, visitor.getDNI());
            ps.setString(2, visitor.getName());
            ps.setString(3, visitor.getAddress());
            ps.setString(4, visitor.getProfession());
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
    public void update(Visitor visitor) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE_ADDRESS);
            ps.setInt(2, visitor.getDNI());
            ps.setString(1, visitor.getAddress());
            System.out.println("Query been executed " + SQL_UPDATE_ADDRESS);
            ps.executeUpdate();
            System.out.println("The visitor "+ visitor.toString() + " has been updated");
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    @Override
    public void delete(Visitor visitor) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, visitor.getDNI());
            System.out.println("Query been executed " + SQL_DELETE);
            ps.executeUpdate();
            System.out.println("The visitor "+ visitor.toString() + " has been deleted");
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
        }
    }

    public List<Visitor> getAll() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Visitor> visitors = new ArrayList<>();
        List<Housed> housedListI;

        try {
            conn = PoolConnection.getConnection();
            st = conn.createStatement();
            System.out.println("Query been executed " + SQL_GET_ALL + ";");
            rs = st.executeQuery(SQL_GET_ALL);

            while(rs.next()){
                Visitor visitor = new Visitor();
                visitor.setDNI(rs.getInt("dni"));
                visitor.setName(rs.getString("name"));
                visitor.setAddress(rs.getString("Address"));
                visitor.setProfession(rs.getString("Profession"));
                housedListI = new ArrayList<>();
                HousedDAO housedDAO = new HousedDAO();
                housedListI = housedDAO.getByDni(visitor.getDNI());
                visitor.setHousedList(housedListI);
                visitors.add(visitor);
                System.out.println("The visitor "+ visitor.toString() + " has been found" + " With this housed: \n" + visitor.getHousedList());
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
        return visitors;
    }

    public List<Visitor> getByName(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Visitor> visitors = new ArrayList<>();
        List<Housed> housedListI;

        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_NAME);
            ps.setString(1, name);
            System.out.println("Query been executed " + SQL_GET_BY_NAME + ";");
            rs = ps.executeQuery();

            while(rs.next()){
                Visitor visitor = new Visitor();
                visitor.setDNI(rs.getInt("dni"));
                visitor.setName(rs.getString("name"));
                visitor.setAddress(rs.getString("Address"));
                visitor.setProfession(rs.getString("Profession"));
                housedListI = new ArrayList<>();
                HousedDAO housedDAO = new HousedDAO();
                housedListI = housedDAO.getByDni(visitor.getDNI());
                visitor.setHousedList(housedListI);
                visitors.add(visitor);
                System.out.println("The visitor "+ visitor.toString() + " has been found" + " With this housed: \n" + visitor.getHousedList());
                System.out.println("-----------------------------------------------------");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return visitors;
    }

    public List<Visitor> getByProfession(String profession) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Visitor> visitors = new ArrayList<>();
        List<Housed> housedListI;

        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_PROFESSION);
            ps.setString(1, profession);
            System.out.println("Query been executed " + SQL_GET_BY_PROFESSION + ";");
            rs = ps.executeQuery();

            while(rs.next()){
                Visitor visitor = new Visitor();
                visitor.setDNI(rs.getInt("dni"));
                visitor.setName(rs.getString("name"));
                visitor.setAddress(rs.getString("Address"));
                visitor.setProfession(rs.getString("Profession"));
                housedListI = new ArrayList<>();
                HousedDAO housedDAO = new HousedDAO();
                housedListI = housedDAO.getByDni(visitor.getDNI());
                visitor.setHousedList(housedListI);
                visitors.add(visitor);
                System.out.println("The visitor "+ visitor.toString() + " has been found" + " With this housed: \n" + visitor.getHousedList());
                System.out.println("-----------------------------------------------------");
            }
        } finally{
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }
        return visitors;
    }
    

}
    
