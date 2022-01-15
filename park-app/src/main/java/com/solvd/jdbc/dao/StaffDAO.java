package com.solvd.jdbc.dao;

import java.sql.SQLException;
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

import com.solvd.entities.Housed;
import com.solvd.entities.Staff;
import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.interfaces.IHousedDAO;    

import com.solvd.jdbc.interfaces.IStaffDAO;
;

public class StaffDAO extends AbstractJdbcDAO implements IStaffDAO {

    private final static String SQL_INSERT = "INSERT INTO staff (dni, name, salary, numSegSoc, address, phone_fijo, phone_mobile, nameP) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private final static String SQL_UPDATE = "UPDATE staff SET dni = ?, name = ?, salary = ?, numSegSoc = ?, address = ?, phone_fijo = ?, phone_mobile = ?, nameP = ? WHERE id = ?";
    private final static String SQL_DELETE = "DELETE FROM staff WHERE dni = ?";
    private final static String SQL_GET_ALL = "SELECT * FROM staff";
    private final static String SQL_GET_BY_DNI = "SELECT * FROM staff WHERE dni = ?";
    private final static String SQL_GET_BY_NAME = "SELECT * FROM staff WHERE name = ?";

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public void StaffDAO() {
    }

    @Override
    public void save(Staff staff) throws SQLException {
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, staff.getDNI());
            ps.setString(2, staff.getName());
            ps.setDouble(3, staff.getSalary());
            ps.setInt(4, staff.getNumSegSoc());
            ps.setString(5, staff.getAddress());
            ps.setInt(6, staff.getPhone_fijo());
            ps.setInt(7, staff.getPhone_mobile());
            ps.setString(8, staff.getNameP());
            System.out.println("Query been executed " + SQL_INSERT);
            ps.executeUpdate();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    @Override
    public void update(Staff staff) throws SQLException {
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setInt(1, staff.getDNI());
            ps.setString(2, staff.getName());
            ps.setDouble(3, staff.getSalary());
            ps.setInt(4, staff.getNumSegSoc());
            ps.setString(5, staff.getAddress());
            ps.setInt(6, staff.getPhone_fijo());
            ps.setInt(7, staff.getPhone_mobile());
            ps.setString(8, staff.getNameP());
            System.out.println("Query been executed " + SQL_UPDATE);
            ps.executeUpdate();
            System.out.println("The staff " + staff.toString() + " has been updated");
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    @Override
    public void delete(Staff staff) throws SQLException {
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, staff.getDNI());
            ps.executeUpdate();
            System.out.println("The staff " + staff.toString() + " has been deleted");
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    public List<Staff> getAll() throws SQLException {
        List<Staff> staffs = new ArrayList<Staff>();
        try {
            conn = PoolConnection.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_GET_ALL);
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setDNI(rs.getInt("dni"));
                staff.setName(rs.getString("name"));
                staff.setSalary(rs.getDouble("salary"));
                staff.setNumSegSoc(rs.getInt("numSegSoc"));
                staff.setAddress(rs.getString("address"));
                staff.setPhone_fijo(rs.getInt("phone_fijo"));
                staff.setPhone_mobile(rs.getInt("phone_mobile"));
                staff.setNameP(rs.getString("nameP"));
                staffs.add(staff);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (st != null) {
                st.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return staffs;
    }
    
    public Staff getByDNI(int dni) throws SQLException {
        Staff staff = new Staff();
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_DNI);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                staff.setDNI(rs.getInt("dni"));
                staff.setName(rs.getString("name"));
                staff.setSalary(rs.getDouble("salary"));
                staff.setNumSegSoc(rs.getInt("numSegSoc"));
                staff.setAddress(rs.getString("address"));
                staff.setPhone_fijo(rs.getInt("phone_fijo"));
                staff.setPhone_mobile(rs.getInt("phone_mobile"));
                staff.setNameP(rs.getString("nameP"));
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return staff;
    }

    public Staff getByName(String name) throws SQLException {
        Staff staff = new Staff();
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_NAME);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                staff.setDNI(rs.getInt("dni"));
                staff.setName(rs.getString("name"));
                staff.setSalary(rs.getDouble("salary"));
                staff.setNumSegSoc(rs.getInt("numSegSoc"));
                staff.setAddress(rs.getString("address"));
                staff.setPhone_fijo(rs.getInt("phone_fijo"));
                staff.setPhone_mobile(rs.getInt("phone_mobile"));
                staff.setNameP(rs.getString("nameP"));
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return staff;
    }

    //list byName
    public List<Staff> getAllByName(String name) throws SQLException {
        List<Staff> staffs = new ArrayList<Staff>();
        try {
            conn = PoolConnection.getConnection();
            ps = conn.prepareStatement(SQL_GET_BY_NAME);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setDNI(rs.getInt("dni"));
                staff.setName(rs.getString("name"));
                staff.setSalary(rs.getDouble("salary"));
                staff.setNumSegSoc(rs.getInt("numSegSoc"));
                staff.setAddress(rs.getString("address"));
                staff.setPhone_fijo(rs.getInt("phone_fijo"));
                staff.setPhone_mobile(rs.getInt("phone_mobile"));
                staff.setNameP(rs.getString("nameP"));
                staffs.add(staff);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return staffs;
    }



}
