package com.solvd.mybatis.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Housed;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.IHousedMapperMyBatis;

import org.apache.ibatis.session.SqlSession;

public class HousedServiceMyBatis {
    private static IHousedMapperMyBatis housedMapper;

    public void insertHoused(Housed housed) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            housedMapper.insertHoused(housed);
            session.commit();
        }
    }

    // updateHoused
    public void updateHoused(Housed housed) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            housedMapper.updateHoused(housed);
            session.commit();
        }
    }

    // deleteHoused
    public void deleteHoused(Integer numAccomodation, String dniVisitor) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            housedMapper.deleteHoused(numAccomodation, dniVisitor);
            session.commit();
        }
    }

    // getAllHoused
    public List<Housed> getAllHoused() throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHoused();
        }
    }

    //getHousedByNumAccomodationAndDniVisitor
    public Housed getHousedByNumAccomodationAndDniVisitor(Integer numAccomodation, String dniVisitor) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getHousedByNumAccomodationAndDniVisitor(numAccomodation, dniVisitor);
        }
    }

    //getAllHousedByNumAccomodation
    public List<Housed> getAllHousedByNumAccomodation(Integer numAccomodation) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByNumAccomodation(numAccomodation);
        }
    }

    //getAllHousedByDniVisitor
    public List<Housed> getAllHousedByDniVisitor(String dniVisitor) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByDniVisitor(dniVisitor);
        }
    }

    //getHousedByArrivalDateAndDepartureDate
    public List<Housed> getHousedByArrivalDateAndDepartureDate(String arrivalDate, String departureDate) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getHousedByArrivalDateAndDepartureDate(arrivalDate, departureDate);
        }
    }


    //getHousedByArrivalDate
    public List<Housed> getHousedByArrivalDate(String arrivalDate) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByArrivalDate(arrivalDate);
        }
    }

    //getHousedByDepartureDate
    public List<Housed> getHousedByDepartureDate(String departureDate) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByDepartureDate(departureDate);
        }
    }

    //getHousedByDniVisitor
    public List<Housed> getHousedByDniVisitor(String dniVisitor) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByDniVisitor(dniVisitor);
        }
    }

    //getHousedByNumAccomodation
    public List<Housed> getHousedByNumAccomodation(Integer numAccomodation) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByNumAccomodation(numAccomodation);
        }
    }

    //getAllHousedByRoom();
    public List<Housed> getAllHousedByRoom(String room) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            housedMapper = session.getMapper(IHousedMapperMyBatis.class);
            return housedMapper.getAllHousedByRoom(room);
        }
    }

    
}
