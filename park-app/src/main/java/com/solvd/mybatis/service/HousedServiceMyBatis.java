package com.solvd.mybatis.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Housed;
import com.solvd.mybatis.mapper.IHousedMapperMyBatis;

public class HousedServiceMyBatis {
    private static IHousedMapperMyBatis housedMapper;

    public void insertHoused(Housed housed) throws SQLException {
        housedMapper.insertHoused(housed);
    }

    // updateHoused
    public void updateHoused(Housed housed) throws SQLException {
        housedMapper.updateHoused(housed);
    }

    // deleteHoused
    public void deleteHoused(Integer numAccomodation, String dniVisitor) throws SQLException {
        housedMapper.deleteHoused(numAccomodation, dniVisitor);
    }

    // getAllHoused
    public List<Housed> getAllHoused() throws SQLException {
        return housedMapper.getAllHoused();
    }

    //getHousedByNumAccomodationAndDniVisitor
    public Housed getHousedByNumAccomodationAndDniVisitor(Integer numAccomodation, String dniVisitor) throws SQLException {
        return housedMapper.getHousedByNumAccomodationAndDniVisitor(numAccomodation, dniVisitor);
    }

    //getAllHousedByNumAccomodation
    public List<Housed> getAllHousedByNumAccomodation(Integer numAccomodation) throws SQLException {
        return housedMapper.getAllHousedByNumAccomodation(numAccomodation);
    }

    //getAllHousedByDniVisitor
    public List<Housed> getAllHousedByDniVisitor(String dniVisitor) throws SQLException {
        return housedMapper.getAllHousedByDniVisitor(dniVisitor);
    }

    //getHousedByArrivalDateAndDepartureDate
    public List<Housed> getHousedByArrivalDateAndDepartureDate(String arrivalDate, String departureDate) throws SQLException {
        return housedMapper.getHousedByArrivalDateAndDepartureDate(arrivalDate, departureDate);
    }

    //getHousedByArrivalDate
    public List<Housed> getHousedByArrivalDate(String arrivalDate) throws SQLException {
        return housedMapper.getAllHousedByArrivalDate(arrivalDate);
    }

    //getHousedByDepartureDate
    public List<Housed> getHousedByDepartureDate(String departureDate) throws SQLException {
        return housedMapper.getAllHousedByDepartureDate(departureDate);
    }

    //getHousedByDniVisitor
    public List<Housed> getHousedByDniVisitor(String dniVisitor) throws SQLException {
        return housedMapper.getAllHousedByDniVisitor(dniVisitor);
    }

    //getHousedByNumAccomodation
    public List<Housed> getHousedByNumAccomodation(Integer numAccomodation) throws SQLException {
        return housedMapper.getAllHousedByNumAccomodation(numAccomodation);
    }

    //getAllHousedByRoom();
    public List<Housed> getAllHousedByRoom(String room) {
        return housedMapper.getAllHousedByRoom(room);
    }

    
}
