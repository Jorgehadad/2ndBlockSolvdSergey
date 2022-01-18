package com.solvd.mybatis.mapper;

import java.sql.Date;
import java.util.List;

import com.solvd.entities.Park;

import org.apache.ibatis.annotations.*;

public interface ParkMapperMyBatis {
    
    @Select("SELECT * FROM park WHERE nameP = #{nameP}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        @org.apache.ibatis.annotations.Result(property = "dateDeclaracion", column = "dateDeclaration"),
        //Many to one area list
        @org.apache.ibatis.annotations.Result(property = "areas", column = "nameP", javaType = List.class, many = @org.apache.ibatis.annotations.Many(select = "com.solvd.mybatis.mapper.AreaMapperMyBatis.getAllAreasByNameP"))})
    public Park getParkByName(String nameP);

    @Update("UPDATE park SET dateDeclaration = #{dateDeclaration} WHERE nameP = #{nameP}")
    public void updatePark(Park park);

    @Delete("DELETE FROM park WHERE nameP = #{nameP}")
    public void deletePark(String nameP);

    @Select("SELECT * FROM park")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        @org.apache.ibatis.annotations.Result(property = "dateDeclaracion", column = "dateDeclaration"),
        //Many to one area list
        @org.apache.ibatis.annotations.Result(property = "areas", column = "nameP", javaType = List.class, many = @org.apache.ibatis.annotations.Many(select = "com.solvd.mybatis.mapper.AreaMapperMyBatis.getAllAreasByNameP"))})
    public List<Park> getAllParks();
    
    //date
    @Select("SELECT * FROM park WHERE dateDeclaration = #{dateDeclaration}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        @org.apache.ibatis.annotations.Result(property = "dateDeclaracion", column = "dateDeclaration"),
        //Many to one area list
        @org.apache.ibatis.annotations.Result(property = "areas", column = "nameP", javaType = List.class, many = @org.apache.ibatis.annotations.Many(select = "com.solvd.mybatis.mapper.AreaMapperMyBatis.getAllAreasByNameP"))})
    public Park getParkByDate(Date dateDeclaration);

    //insert
    @Insert("INSERT INTO park (nameP, dateDeclaration ) VALUES (#{nameP}, #{dateDeclaration});")
    public void insertPark(Park park);
                    




}
