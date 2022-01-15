package com.solvd.mybatis.mapper;

import java.util.List;

import com.solvd.entities.Area;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface AreaMapperMyBatis {
    
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
    
}
