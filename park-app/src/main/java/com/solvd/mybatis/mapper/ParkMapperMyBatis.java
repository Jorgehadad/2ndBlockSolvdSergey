package com.solvd.mybatis.mapper;

import com.solvd.entities.Park;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ParkMapperMyBatis {
    
    @Select("SELECT * FROM park WHERE nameP = #{nameP}")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP"),
        @org.apache.ibatis.annotations.Result(property = "dateDeclaracion", column = "dateDeclaration")
                    })
    public Park getParkByName(String nameP);




}
