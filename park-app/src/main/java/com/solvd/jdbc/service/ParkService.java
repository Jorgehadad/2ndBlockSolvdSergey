package com.solvd.jdbc.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.solvd.jdbc.dao.ParkDAO;
import com.solvd.jdbc.entities.Park;

public class ParkService {
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
    
    
}
