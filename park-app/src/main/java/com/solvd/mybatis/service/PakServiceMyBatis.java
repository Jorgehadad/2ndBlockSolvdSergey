package com.solvd.mybatis.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Park;
import com.solvd.mybatis.mapper.ParkMapperMyBatis;

public class PakServiceMyBatis {
    private static ParkMapperMyBatis parkMapper;
    
    public void insertPark(Park park) throws SQLException {
        parkMapper.insertPark(park);
    }

    //getParkByName
    public Park getParkByName(String nameP) throws SQLException {
        return parkMapper.getParkByName(nameP);
    }

    //updatePark
    public void updatePark(Park park) throws SQLException {
        parkMapper.updatePark(park);
    }

    //deletePark
    public void deletePark(String nameP) throws SQLException {
        parkMapper.deletePark(nameP);
    }

    //getAllParks
    public List<Park> getAllParks() throws SQLException {
        return parkMapper.getAllParks();
    }

    //getParkByDate
    public Park getParkByDate(Date date) throws SQLException {
        return parkMapper.getParkByDate(date);
    }
}
