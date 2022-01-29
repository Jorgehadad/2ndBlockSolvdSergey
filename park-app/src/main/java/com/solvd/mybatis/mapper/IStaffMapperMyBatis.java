package com.solvd.mybatis.mapper;

import java.util.List;

import com.solvd.entities.Staff;

import org.apache.ibatis.annotations.*;

public interface IStaffMapperMyBatis {

    /*
    private Integer dni;
    private String name;
    private Double salary;
    private Integer numSegSoc;
    private String address;
    private Integer phone_fijo;
    private Integer phone_mobile;
    private String nameP;
    */
    @Select("SELECT * FROM staff")
    @Results({
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "salary", column = "salary"),
        @org.apache.ibatis.annotations.Result(property = "numSegSoc", column = "numSegSoc"),
        @org.apache.ibatis.annotations.Result(property = "address", column = "address"),
        @org.apache.ibatis.annotations.Result(property = "phone_fijo", column = "phone_fijo"),
        @org.apache.ibatis.annotations.Result(property = "phone_mobile", column = "phone_mobile"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP")
    })
    List<Staff> getAll();

    @Select("SELECT * FROM staff WHERE dni = #{dni}")
    @Results({
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "salary", column = "salary"),
        @org.apache.ibatis.annotations.Result(property = "numSegSoc", column = "numSegSoc"),
        @org.apache.ibatis.annotations.Result(property = "address", column = "address"),
        @org.apache.ibatis.annotations.Result(property = "phone_fijo", column = "phone_fijo"),
        @org.apache.ibatis.annotations.Result(property = "phone_mobile", column = "phone_mobile"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP")
    })
    Staff getByDni(Integer dni);

    @Select("SELECT * FROM staff WHERE nameP = #{nameP}")
    @Results({
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "salary", column = "salary"),
        @org.apache.ibatis.annotations.Result(property = "numSegSoc", column = "numSegSoc"),
        @org.apache.ibatis.annotations.Result(property = "address", column = "address"),
        @org.apache.ibatis.annotations.Result(property = "phone_fijo", column = "phone_fijo"),
        @org.apache.ibatis.annotations.Result(property = "phone_mobile", column = "phone_mobile"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP")
    })
    Staff getByNameP(String nameP);

    @Select("SELECT * FROM staff WHERE name = #{name}")
    @Results({
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "salary", column = "salary"),
        @org.apache.ibatis.annotations.Result(property = "numSegSoc", column = "numSegSoc"),
        @org.apache.ibatis.annotations.Result(property = "address", column = "address"),
        @org.apache.ibatis.annotations.Result(property = "phone_fijo", column = "phone_fijo"),
        @org.apache.ibatis.annotations.Result(property = "phone_mobile", column = "phone_mobile"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP")
    })
    Staff getByName(String name);

    @Select("SELECT * FROM staff WHERE salary = #{salary}")
    @Results({
        @org.apache.ibatis.annotations.Result(property = "dni", column = "dni"),
        @org.apache.ibatis.annotations.Result(property = "name", column = "name"),
        @org.apache.ibatis.annotations.Result(property = "salary", column = "salary"),
        @org.apache.ibatis.annotations.Result(property = "numSegSoc", column = "numSegSoc"),
        @org.apache.ibatis.annotations.Result(property = "address", column = "address"),
        @org.apache.ibatis.annotations.Result(property = "phone_fijo", column = "phone_fijo"),
        @org.apache.ibatis.annotations.Result(property = "phone_mobile", column = "phone_mobile"),
        @org.apache.ibatis.annotations.Result(property = "nameP", column = "nameP")
    })
    Staff getBySalary(Double salary);

    //insert
    @Insert("INSERT INTO staff (dni, name, salary, numSegSoc, address, phone_fijo, phone_mobile, nameP) VALUES (#{dni}, #{name}, #{salary}, #{numSegSoc}, #{address}, #{phone_fijo}, #{phone_mobile}, #{nameP})")
    void insert(Staff staff);

    //update
    @Update("UPDATE staff SET dni = #{dni}, name = #{name}, salary = #{salary}, numSegSoc = #{numSegSoc}, address = #{address}, phone_fijo = #{phone_fijo}, phone_mobile = #{phone_mobile}, nameP = #{nameP} WHERE dni = #{dni}")
    void update(Staff staff);

    //delete
    @Delete("DELETE FROM staff WHERE dni = #{dni}")
    void delete(Integer dni);

    
        


    
}
