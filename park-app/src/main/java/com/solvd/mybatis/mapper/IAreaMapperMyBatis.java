package com.solvd.mybatis.mapper;

import java.util.List;

import com.solvd.entities.Area;

import org.apache.ibatis.annotations.*;

public interface IAreaMapperMyBatis {
    
    @Select("SELECT * FROM area WHERE nameA = #{nameA}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameA", column = "nameA"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        @org.apache.ibatis.annotations.Result(property = "extension", column = "extension")})
    Area getAreaByName(String nameA);

    @Select("SELECT * FROM area WHERE nameP = #{nameP}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameA", column = "nameA"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        //extension
        @org.apache.ibatis.annotations.Result(property = "extension", column = "extension")})
    List<Area> getAllAreasByNameP(String nameP);
    
    //insert
    @Insert("INSERT INTO area (nameA, nameP, extension ) VALUES (#{nameA}, #{nameP}, #{extension});")
    public void insertArea(Area area);

    @Update("UPDATE area SET nameA = #{nameA}, nameP = #{nameP}, extension = #{extension} WHERE nameA = #{nameA}")
    public void updateArea(Area area);

    @Delete("DELETE FROM area WHERE nameA = #{nameA}")
    public void deleteArea(String nameA);

    @Select("SELECT * FROM area")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameA", column = "nameA"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        //extension
        @org.apache.ibatis.annotations.Result(property = "extension", column = "extension")})
    List<Area> getAllAreas();
}
