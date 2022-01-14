package com.solvd.mybatis;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import com.solvd.entities.Park;
import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.dao.ParkDAO;


import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import jakarta.activation.DataSource;

public class RunnerBatis<SQLSessionFactory> {
        
}
