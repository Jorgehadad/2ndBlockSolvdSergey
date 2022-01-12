package com.solvd.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.jdbc.dao.AreaDAO;
import com.solvd.jdbc.entities.Area;

public class AreaService {
    private static AreaDAO areaDAO;

    public AreaService() {
        areaDAO = new AreaDAO();
    }

    public void save(Area area) throws SQLException {
        areaDAO.save(area);
    }

    public void update(Area area) throws SQLException {
        areaDAO.update(area);
    }

    public void delete(Area area) throws SQLException {
        areaDAO.delete(area);
    }

    //getByNameP
    public Area getByNameP(String NameP) throws SQLException {
        return areaDAO.getByNameP(NameP);
    }

    //getAllByNameP
    public List<Area> getAllByNameP(String NameP) throws SQLException {
        return areaDAO.getAllByNameP(NameP);
    }
}
