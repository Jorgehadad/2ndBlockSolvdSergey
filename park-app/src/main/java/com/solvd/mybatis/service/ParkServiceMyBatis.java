package com.solvd.mybatis.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Park;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.IParkMapperMyBatis;

import org.apache.ibatis.session.SqlSession;

public class ParkServiceMyBatis {
    private static IParkMapperMyBatis parkMapper;
    
    public void insertPark(Park park) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            parkMapper = session.getMapper(IParkMapperMyBatis.class);
            parkMapper.insertPark(park);
            session.commit();
        }
    }

    //getParkByName
    public Park getParkByName(String nameP) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            parkMapper = session.getMapper(IParkMapperMyBatis.class);
            return parkMapper.getParkByName(nameP);
        }
    }

    //updatePark
    public void updatePark(Park park) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            parkMapper = session.getMapper(IParkMapperMyBatis.class);
            parkMapper.updatePark(park);
            session.commit();
        }
    }

    //deletePark
    public void deletePark(String nameP) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            parkMapper = session.getMapper(IParkMapperMyBatis.class);
            parkMapper.deletePark(nameP);
            session.commit();
        }
    }

    //getAllParks
    public List<Park> getAllParks() throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            parkMapper = session.getMapper(IParkMapperMyBatis.class);
            return parkMapper.getAllParks();
        }
    }

    //getParkByDate
    public Park getParkByDate(Date date) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            parkMapper = session.getMapper(IParkMapperMyBatis.class);
            return parkMapper.getParkByDate(date);
        }
    }
}
