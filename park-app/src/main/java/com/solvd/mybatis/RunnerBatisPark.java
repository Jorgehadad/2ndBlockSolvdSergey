package com.solvd.mybatis;

import java.util.Date;

import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.ParkMapperMyBatis;
import org.apache.ibatis.session.SqlSession;


public class RunnerBatisPark {
    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(ParkMapperMyBatis.class).getParkByName("With Summer"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        
}
