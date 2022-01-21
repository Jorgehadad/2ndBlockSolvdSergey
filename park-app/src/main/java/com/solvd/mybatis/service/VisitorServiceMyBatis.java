package com.solvd.mybatis.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Visitor;
import com.solvd.mybatis.mapper.VisitorMapperMyBatis;

public class VisitorServiceMyBatis {
    private static VisitorMapperMyBatis visitorMapper;

    //getAll
    public List<Visitor> getAllVisitors() throws SQLException {
        return visitorMapper.getAll();
    }

    //getVisitorByDni
    public Visitor getVisitorByDni(Integer dni) throws SQLException {
        return visitorMapper.getVisitorByDni(dni);
    }

    //getVisitorByName
    public Visitor getVisitorByName(String name) throws SQLException {
        return visitorMapper.getVisitorByName(name);
    }

    //getVisitorByAddress
    public Visitor getVisitorByAddress(String address) throws SQLException {
        return visitorMapper.getVisitorByAddress(address);
    }

    //getVisitorByProfession
    public Visitor getVisitorByProfession(String profession) throws SQLException {
        return visitorMapper.getVisitorByProfession(profession);
    }

    //insertVisitor
    public void insertVisitor(Visitor visitor) throws SQLException {
        visitorMapper.insertVisitor(visitor);
    }

    //updateVisitor
    public void updateVisitor(Visitor visitor) throws SQLException {
        visitorMapper.updateVisitor(visitor);
    }

    //deleteVisitor
    public void deleteVisitor(Integer dni) throws SQLException {
        visitorMapper.deleteVisitor(dni);
    }
    
    
    
}
