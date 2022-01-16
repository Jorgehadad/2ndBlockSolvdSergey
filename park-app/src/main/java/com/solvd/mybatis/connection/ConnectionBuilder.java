package com.solvd.mybatis.connection;

import javax.sql.DataSource;

import com.solvd.mybatis.mapper.*;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class ConnectionBuilder {

    public SqlSession buildConnection() { 
        DataSource dataSource = new PooledDataSource("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/solvd?serverTimezone=UTC", "Admin", "Admin");

        Environment environment = new Environment("development", new JdbcTransactionFactory(), dataSource);

        Configuration configuration = new Configuration(environment);
        configuration.addMapper(ParkMapperMyBatis.class);
        configuration.addMapper(AreaMapperMyBatis.class);
        configuration.addMapper(VisitorMapperMyBatis.class);
        configuration.addMapper(StaffMapperMyBatis.class);
        configuration.addMapper(HousedMapperMyBatis.class);
        //always add mappers to configuration

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(configuration);

        return factory.openSession();
    }
    
}
