package com.solvd.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.solvd.jdbc.entities.Area;


public class DBConnection {
    private static final Logger LOG = Logger.getLogger(Area.class.getName());

    public Connection connection() {
	Connection connection = null;

	try {
	    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/solvd", "Admin", "Admin");
	} catch (SQLException e) {
	    LOG.log(Level.WARNING, e.getMessage());
	}
	return connection;
    }

    public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/solvd", "Adnmin", "Admin");
		} catch (SQLException e) {
			LOG.log(Level.WARNING, e.getMessage());
		}
		return connection;
    }
}
