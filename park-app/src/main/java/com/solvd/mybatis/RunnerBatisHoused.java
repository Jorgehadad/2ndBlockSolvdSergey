package com.solvd.mybatis;

import java.util.Date;

import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.HousedMapperMyBatis;
import org.apache.ibatis.session.SqlSession;

public class RunnerBatisHoused {

    
    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(HousedMapperMyBatis.class).getAllHoused());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
