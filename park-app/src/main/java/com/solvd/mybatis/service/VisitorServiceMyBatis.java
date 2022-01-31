package com.solvd.mybatis.service;

import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Visitor;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.IVisitorMapperMyBatis;

import org.apache.ibatis.session.SqlSession;

public class VisitorServiceMyBatis {
    private static IVisitorMapperMyBatis visitorMapper;

    //getAll
    public List<Visitor> getAllVisitors() throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            return visitorMapper.getAll();
        }
    }

    //getVisitorByDni
    public Visitor getVisitorByDni(Integer dni) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            return visitorMapper.getVisitorByDni(dni);
        }
    }

    //getVisitorByName
    public Visitor getVisitorByName(String name) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            return visitorMapper.getVisitorByName(name);
        }
    }

    //getVisitorByAddress
    public Visitor getVisitorByAddress(String address) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            return visitorMapper.getVisitorByAddress(address);
        }
    }

    //getVisitorByProfession
    public Visitor getVisitorByProfession(String profession) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            return visitorMapper.getVisitorByProfession(profession);
        }
    }

    //insertVisitor
    public void insertVisitor(Visitor visitor) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            visitorMapper.insertVisitor(visitor);
            session.commit();
        }
    }

    //updateVisitor
    public void updateVisitor(Visitor visitor) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            visitorMapper.updateVisitor(visitor);
            session.commit();
        }
    }

    //deleteVisitor
    public void deleteVisitor(Integer dni) throws SQLException {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            visitorMapper = session.getMapper(IVisitorMapperMyBatis.class);
            visitorMapper.deleteVisitor(dni);
            session.commit();
        }
    }
    
    
    
}
