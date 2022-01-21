package com.solvd.mybatis.mapper;

import java.util.List;

import com.solvd.entities.Housed;

import org.apache.ibatis.annotations.*;

public interface HousedMapperMyBatis {

    @Select("SELECT * FROM housed WHERE numAccomodation = #{numAccomodation} and dniVisitor = #{dniVisitor}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    Housed getHousedByNumAccomodationAndDniVisitor(int numAccomodation, String dniVisitor);

    @Select("SELECT * FROM housed WHERE numAccomodation = #{numAccomodation}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getAllHousedByNumAccomodation(int numAccomodation);

    @Select("SELECT * FROM housed WHERE dniVisitor = #{dniVisitor}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getAllHousedByDniVisitor(String dniVisitor);

    @Select("SELECT * FROM housed WHERE arrivalDate = #{arrivalDate} and departureDate = #{departureDate}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getHousedByArrivalDateAndDepartureDate(String arrivalDate, String departureDate);

    @Select("SELECT * FROM housed WHERE arrivalDate = #{arrivalDate}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getAllHousedByArrivalDate(String arrivalDate);

    @Select("SELECT * FROM housed WHERE departureDate = #{departureDate}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getAllHousedByDepartureDate(String departureDate);

    @Select("SELECT * FROM housed WHERE room = #{room}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getAllHousedByRoom(String room);

    @Select("SELECT * FROM housed")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "numAccomodation", column = "numAccomodation"),
        @org.apache.ibatis.annotations.Result(property = "dniVisitor", column = "dniVisitor"),
        @org.apache.ibatis.annotations.Result(property = "arrivalDate", column = "arrivalDate"),
        @org.apache.ibatis.annotations.Result(property = "departureDate", column = "departureDate"),
        @org.apache.ibatis.annotations.Result(property = "room", column = "room")
    })
    List<Housed> getAllHoused();

    @Insert("INSERT INTO housed (numAccomodation, dniVisitor, arrivalDate, departureDate, room) VALUES (#{numAccomodation}, #{dniVisitor}, #{arrivalDate}, #{departureDate}, #{room})")
    void insertHoused(Housed housed);

    @Update("UPDATE housed SET numAccomodation = #{numAccomodation}, dniVisitor = #{dniVisitor}, arrivalDate = #{arrivalDate}, departureDate = #{departureDate}, room = #{room} WHERE numAccomodation = #{numAccomodation} and dniVisitor = #{dniVisitor} and arrivalDate = #{arrivalDate} and departureDate = #{departureDate} and room = #{room}")
    void updateHoused(Housed housed);

    @Delete("DELETE FROM housed WHERE numAccomodation = #{numAccomodation} and dniVisitor = #{dniVisitor}")
    void deleteHoused(Integer numAccomodation, String dniVisitor);    
    
}
