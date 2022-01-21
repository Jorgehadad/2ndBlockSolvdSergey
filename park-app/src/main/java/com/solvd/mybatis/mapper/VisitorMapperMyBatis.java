package com.solvd.mybatis.mapper;

import java.sql.Date;
import java.util.List;

import com.solvd.entities.Visitor;

import org.apache.ibatis.annotations.*;

public interface VisitorMapperMyBatis {

    //getAll
    @Select("SELECT * FROM visitor")
    @Results(value = {
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "Address", column = "Address"),
        @org.apache.ibatis.annotations.Result(property = "Profession", column = "Profession"),
        //housed list
        @org.apache.ibatis.annotations.Result(property = "housedList", column = "dni", javaType = List.class, many = @Many(select = "com.solvd.mybatis.mapper.HousedMapperMyBatis.getAllHousedByDniVisitor"))})
    List<Visitor> getAll();
    
    @Select("SELECT * FROM visitor WHERE dni = #{dni}")
    @Results(value = {
        //"dni","name","Address","Profession"
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "Address", column = "Address"),
        @org.apache.ibatis.annotations.Result(property = "Profession", column = "Profession"),
        //housed list
        @org.apache.ibatis.annotations.Result(property = "housedList", column = "dni", javaType = List.class, many = @Many(select = "com.solvd.mybatis.mapper.HousedMapperMyBatis.getAllHousedByDniVisitor"))})
    Visitor getVisitorByDni(Integer dni);
    
    @Select("SELECT * FROM visitor WHERE name = #{name}")
    @Results(value = {
        //"dni","name","Address","Profession"
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "Address", column = "Address"),
        @org.apache.ibatis.annotations.Result(property = "Profession", column = "Profession"),
        //housed list
        @org.apache.ibatis.annotations.Result(property = "housedList", column = "dni", javaType = List.class, many = @Many(select = "com.solvd.mybatis.mapper.HousedMapperMyBatis.getAllHousedByDniVisitor"))})
    Visitor getVisitorByName(String name);

    @Select("SELECT * FROM visitor WHERE Address = #{Address}")
    @Results(value = {
        //"dni","name","Address","Profession"
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "Address", column = "Address"),
        @org.apache.ibatis.annotations.Result(property = "Profession", column = "Profession"),
        //housed list
        @org.apache.ibatis.annotations.Result(property = "housedList", column = "dni", javaType = List.class, many = @Many(select = "com.solvd.mybatis.mapper.HousedMapperMyBatis.getAllHousedByDniVisitor"))})
    Visitor getVisitorByAddress(String Address);

    @Select("SELECT * FROM visitor WHERE Profession = #{Profession}")
    @Results(value = {
        //"dni","name","Address","Profession"
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "Address", column = "Address"),
        @org.apache.ibatis.annotations.Result(property = "Profession", column = "Profession"),
        //housed list
        @org.apache.ibatis.annotations.Result(property = "housedList", column = "dni", javaType = List.class, many = @Many(select = "com.solvd.mybatis.mapper.HousedMapperMyBatis.getAllHousedByDniVisitor"))})
    Visitor getVisitorByProfession(String Profession);

    //insert
    @Insert("INSERT INTO visitor (dni, name, Address, Profession) VALUES (#{dni}, #{name}, #{Address}, #{Profession})")
    void insertVisitor(Visitor visitor);

    //update
    @Update("UPDATE visitor SET dni = #{dni}, name = #{name}, Address = #{Address}, Profession = #{Profession} WHERE dni = #{dni}")
    void updateVisitor(Visitor visitor);

    //delete
    @Delete("DELETE FROM visitor WHERE dni = #{dni}")
    void deleteVisitor(Integer dni);


}
