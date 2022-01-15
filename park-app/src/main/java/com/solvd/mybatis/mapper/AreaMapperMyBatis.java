package com.solvd.mybatis.mapper;

import com.solvd.entities.Area;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface AreaMapperMyBatis {
    
    @Select("SELECT * FROM area WHERE nameA = #{nameA}")

    Area getAreaByName(String nameA);
    
}
