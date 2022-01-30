package com.solvd.mybatis;

import java.sql.Date;

import com.solvd.entities.Park;
import com.solvd.entities.Staff;
import com.solvd.entities.Visitor;
import com.solvd.mybatis.connection.ConnectionBuilder;
import com.solvd.mybatis.mapper.IAreaMapperMyBatis;
import com.solvd.mybatis.mapper.IHousedMapperMyBatis;
import com.solvd.mybatis.mapper.IParkMapperMyBatis;
import com.solvd.mybatis.mapper.IStaffMapperMyBatis;
import com.solvd.mybatis.mapper.IVisitorMapperMyBatis;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;


public class RunnerMyBatis {

    public static void main(String[] args) {
        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(IParkMapperMyBatis.class).getParkByName("With Summer"));

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

            //session.commit();
            //session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // --------------------------------------------------
        
        /*try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(IAreaMapperMyBatis.class).getAreaByName("Area 21"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        // --------------------------------------------------

        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            System.out.println(session.getMapper(IHousedMapperMyBatis.class).getAllHoused());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // --------------------------------------------------


        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            for (Staff staff : session.getMapper(IStaffMapperMyBatis.class).getAll()) {
                System.out.println(staff + "\n");
            }
            //System.out.println(session.getMapper(StaffMapperMyBatis.class).getAll().iterator().next());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // --------------------------------------------------

        try (SqlSession session = new ConnectionBuilder().buildConnection()) {
            for (Visitor visitor : session.getMapper(IVisitorMapperMyBatis.class).getAll()) {
                System.out.println(visitor + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
    
}
