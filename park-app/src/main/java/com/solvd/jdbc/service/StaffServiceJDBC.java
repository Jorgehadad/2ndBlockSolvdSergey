package com.solvd.jdbc.service;

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

import com.solvd.jdbc.connections.PoolConnection;

import com.solvd.entities.Staff;
import com.solvd.jdbc.dao.StaffDAO;

public class StaffServiceJDBC {
    private static StaffDAO staffDAO;

    public StaffServiceJDBC() {
        staffDAO = new StaffDAO();
    }

    public void save(Staff staff) throws SQLException {
        staffDAO.save(staff);
    }

    public void update(Staff staff) throws SQLException {
        staffDAO.update(staff);
    }

    public void delete(Staff staff) throws SQLException {
        staffDAO.delete(staff);
    }

    //getByDNI
    public Staff getByDNI(int DNI) throws SQLException {
        return staffDAO.getByDNI(DNI);
    }

    //getByName
    public Staff getByName(String name) throws SQLException {
        return staffDAO.getByName(name);
    }

    // getAll()
    public List<Staff> getAll() throws SQLException {
        return staffDAO.getAll();
    }

    //getAllByName
    public List<Staff> getAllByName(String name) throws SQLException {
        return staffDAO.getAllByName(name);
    }

    
    
    
    
}
