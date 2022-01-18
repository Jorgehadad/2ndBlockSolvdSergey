package com.solvd.mybatis;

import java.sql.Date;

import com.solvd.entities.Park;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.ParkMapperMyBatis;
import org.apache.ibatis.session.SqlSession;


public class RunnerBatisPark {
    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(ParkMapperMyBatis.class).getParkByName("With Summer"));

            //update
            Park park = new Park();
            park.setDateDeclaracion(Date.valueOf("2022-01-01"));
            park.setNameP("With Summer");
            //session.getMapper(ParkMapperMyBatis.class).updatePark(park);
            //new SQL DATE


            //insert
            park.setNameP("With Winter");
            park.setDateDeclaracion(Date.valueOf("2022-01-01"));
            //session.getMapper(ParkMapperMyBatis.class).insertPark(park);

            session.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        
}
