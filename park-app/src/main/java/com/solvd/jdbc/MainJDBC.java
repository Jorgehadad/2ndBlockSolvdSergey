package com.solvd.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.solvd.entities.Area;
import com.solvd.jdbc.connections.PoolConnection;
import com.solvd.jdbc.dao.AreaDAO;


public class MainJDBC {


    public static void main(String[] args) throws SQLException {


        Connection conn = null;
        try {
            conn = PoolConnection.getConnection();
            System.out.println(conn + "Connection successful");
        }
        catch(SQLException ex){
            System.out.println(conn + "Connection failed");
        }

        Area area = new Area();
        Area area2 = new Area();


        area.setnameA("Area 24");
        area.setnameP("With Summer");
        area.setExtension(100.0);

        area2.setnameA("Area 22");
        area2.setnameP("Without Summer");
        area2.setExtension(200.0);

        AreaDAO areaDAO = new AreaDAO();
        AreaDAO areaDAO2 = new AreaDAO();
        //areasService.save(area);
        //areasService.getByNameP(area.getnameA());
        areaDAO.getAllByNameP(area.getnameP());
        areaDAO2.save(area2);
        //areasService.update(area);
        //areasService.delete(area);


    }
}
