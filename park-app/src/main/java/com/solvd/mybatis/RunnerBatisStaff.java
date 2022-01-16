package com.solvd.mybatis;

import com.solvd.entities.Staff;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.StaffMapperMyBatis;

import org.apache.ibatis.session.SqlSession;

public class RunnerBatisStaff {

    
    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            for (Staff staff : session.getMapper(StaffMapperMyBatis.class).getAll()) {
                System.out.println(staff + "\n");
            }
            //System.out.println(session.getMapper(StaffMapperMyBatis.class).getAll().iterator().next());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
