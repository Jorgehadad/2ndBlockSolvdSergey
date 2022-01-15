package com.solvd.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Housed;
import com.solvd.jdbc.dao.HousedDAO;

public class HousedServiceJDBC {
    private static HousedDAO housedDAO;

    public HousedServiceJDBC() {
        housedDAO = new HousedDAO();
    }

    public void save(Housed housed) throws SQLException {
        housedDAO.save(housed);
    }

    public void update(Housed housed) throws SQLException {
        housedDAO.update(housed);
    }

    public void delete(Housed housed) throws SQLException {
        housedDAO.delete(housed);
    }
    
    //get by dni
    public List<Housed> getByDni(Integer dni) throws SQLException {
        return housedDAO.getByDni(dni);
    }

    //getAllByPks
    public List<Housed> getAllByPks(Integer numAccomodation, Integer dniVisitor) throws SQLException {
        return housedDAO.getAllByPks(numAccomodation, dniVisitor);
    }

    //getAllLimit10()
    public List<Housed> getAllLimit10() throws SQLException {
        return housedDAO.getAllLimit10();
    }

    
    
}
