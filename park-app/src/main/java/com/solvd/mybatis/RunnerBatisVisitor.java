package com.solvd.mybatis;

import com.solvd.entities.Visitor;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.VisitorMapperMyBatis;

import org.apache.ibatis.session.SqlSession;

public class RunnerBatisVisitor {
        
    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            for (Visitor visitor : session.getMapper(VisitorMapperMyBatis.class).getAll()) {
                System.out.println(visitor + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
