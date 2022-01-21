package com.solvd.mybatis.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.mybatis.mapper.AreaMapperMyBatis;

public class AreaServiceMyBatis {
    private static AreaMapperMyBatis areaMapper;

    public void insertArea(Area area) throws SQLException {
        areaMapper.insertArea(area);
    }

    public void updateArea(Area area) throws SQLException {
        areaMapper.updateArea(area);
    }

    public void deleteArea(String nameA) throws SQLException {
        areaMapper.deleteArea(nameA);
    }

    public Area getAreaByName(String nameA) throws SQLException {
        return areaMapper.getAreaByName(nameA);
    }

    public List<Area> getAllAreas() throws SQLException {
        return areaMapper.getAllAreas();
    }

    //getAllAreasByNameP
    public List<Area> getAllAreasByNameP(String nameP) throws SQLException {
        return areaMapper.getAllAreasByNameP(nameP);
    }


    
}
