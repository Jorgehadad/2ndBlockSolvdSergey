package com.solvd.jdbc.connections;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PoolConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/solvd?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "Admin";
    private static final String JDBC_PASS = "Admin";
    private static BasicDataSource dataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASS);
            dataSource.setInitialSize(50);
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static void close(PreparedStatement ps){
        try {
            ps.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static void close(java.sql.Connection conn){
        try {
            conn.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
