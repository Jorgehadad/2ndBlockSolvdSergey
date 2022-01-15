package com.solvd.mybatis;

import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.AreaMapperMyBatis;


import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import jakarta.activation.DataSource;

public class RunnerBatisArea {
    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(AreaMapperMyBatis.class).getAreaByName("Area 21"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}
