package com.solvd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JDBCConnection {

    public static void main (String[] args) throws SQLException{
        Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/solvd", "Admin", "Admin" );
        
        System.out.println(connection);
        Statement statement = connection.createStatement();
        /*boolean res = statement.execute("SELECT * FROM Parks");
        System.out.println("Result" + res);
        List<Parks> parks = new ArrayList<Parks>();
        if (res) {
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                Parks park = new Parks();
                park.setNameP(resultSet.getString("NameP"));
                park.setDate_Declaracion(resultSet.getDate("Date_Declaracion"));
                parks.add(park);
            }
        } else {
            System.out.println("Fail");
        }
        parks.forEach(System.out::println);*/

        /*boolean res = statement.execute("INSERT INTO Parks (NameP, Date_Declaracion) VALUES ('Park1', '2018-01-01')");*/

        /*try {
            boolean res = statement.execute("INSERT INTO Parks (NameP, Date_Declaracion) VALUES ('ParkNew', '2018-01-01')");
            System.out.println("Result" + res);
        } finally {
            connection.close();
        }

         */

    }

    //public static void addPark(Connection con, String NameP, String Date_Declaracion) throws SQLException {
        /*Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/solvd", "Admin", "Admin" );
        Statement statement = connection.createStatement();
        boolean res = statement.execute("INSERT INTO Parks (NameP, Date_Declaracion) VALUES ('" + park.getNameP() + "', '" + park.getDate_Declaracion() + "')");
        System.out.println("Result" + res);
        connection.close();   */
        
        /*PreparedStatement statement = con.prepareStatement("INSERT INTO Parks (NameP, Date_Declaracion) VALUES (?, ?)");
        statement.setString(1, NameP);
        statement.setString(2, Date_Declaracion);
        try {
            statement.executeUpdate();
        } finally {
            con.close();
        }
    }
        */
}
