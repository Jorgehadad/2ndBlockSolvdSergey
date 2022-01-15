package com.solvd.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Visitor;
import com.solvd.jdbc.dao.VisitorDAO;

public class VisitorServiceJDBC {
    private static VisitorDAO visitorDAO;

    public VisitorServiceJDBC() {
        visitorDAO = new VisitorDAO();
    }

    public void save(Visitor visitor) throws SQLException {
        visitorDAO.save(visitor);
    }

    public void update(Visitor visitor) throws SQLException {
        visitorDAO.update(visitor);
    }

    public void delete(Visitor visitor) throws SQLException {
        visitorDAO.delete(visitor);
    }

    //getAll()
    public List<Visitor> getAll() throws SQLException {
        return visitorDAO.getAll();
    }

    //getByName
    public List<Visitor> getByName(String name) throws SQLException {
        return visitorDAO.getByName(name);
    }
    
    //getByProfession
    public List<Visitor> getByProfession(String profession) throws SQLException {
        return visitorDAO.getByProfession(profession);
    }
    
}
