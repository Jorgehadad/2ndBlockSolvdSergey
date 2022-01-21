package com.solvd.mybatis.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Staff;

public class StaffMapperMyBatis {
    private static StaffMapperMyBatis staffMapper;

    public static StaffMapperMyBatis getInstance() {
        if (staffMapper == null) {
            staffMapper = new StaffMapperMyBatis();
        }
        return staffMapper;
    }

    public void insertStaff(Staff staff) throws SQLException {
        staffMapper.insertStaff(staff);
    }

    // updateStaff
    public void updateStaff(Staff staff) throws SQLException {
        staffMapper.updateStaff(staff);
    }

    // deleteStaff
    public void deleteStaff(String dni) throws SQLException {
        staffMapper.deleteStaff(dni);
    }

    // getAllStaff
    public List<Staff> getAllStaff() throws SQLException {
        return staffMapper.getAllStaff();
    }

    // getStaffByDni
    public Staff getStaffByDni(String dni) throws SQLException {
        return staffMapper.getStaffByDni(dni);
    }

    // getStaffByName
    public Staff getStaffByName(String name) throws SQLException {
        return staffMapper.getStaffByName(name);
    }

    // getStaffBySurname
    public Staff getStaffBySurname(String surname) throws SQLException {
        return staffMapper.getStaffBySurname(surname);
    }
    
    
}
