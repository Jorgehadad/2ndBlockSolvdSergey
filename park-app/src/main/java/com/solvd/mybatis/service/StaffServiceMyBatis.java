package com.solvd.mybatis.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Staff;
import com.solvd.mybatis.connection.ConnectionBuilder;

import org.apache.ibatis.session.SqlSession;

public class StaffServiceMyBatis {
    private static StaffServiceMyBatis staffMapper;

    public static StaffServiceMyBatis getInstance() {
        if (staffMapper == null) {
            staffMapper = new StaffServiceMyBatis();
        }
        return staffMapper;
    }

    public void insertStaff(Staff staff) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            staffMapper.insertStaff(staff);
            session.commit();
        }
    }

    // updateStaff
    public void updateStaff(Staff staff) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            staffMapper.updateStaff(staff);
            session.commit();
        }
    }

    // deleteStaff
    public void deleteStaff(String dni) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            staffMapper.deleteStaff(dni);
            session.commit();
        }
    }

    // getAllStaff
    public List<Staff> getAllStaff() throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            return staffMapper.getAllStaff();
        }
    }

    // getStaffByDni
    public Staff getStaffByDni(String dni) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            return staffMapper.getStaffByDni(dni);
        }
    }

    // getStaffByName
    public Staff getStaffByName(String name) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            return staffMapper.getStaffByName(name);
        }
    }

    // getStaffBySurname
    public Staff getStaffBySurname(String surname) throws SQLException {
        try( SqlSession session = new ConnectionBuilder().buildConnection() ){
            staffMapper = session.getMapper(StaffServiceMyBatis.class);
            return staffMapper.getStaffBySurname(surname);
        }
    }
    
    
}
