package com.solvd.xml.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Park;
import com.solvd.jdbc.dao.ParkDAO;
import com.solvd.jdbc.interfaces.IParksDAO;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "park")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParksService implements IParksDAO {

    @Override
    public void save(Park entity) throws SQLException {
                
    }

    @Override
    public void update(Park entity) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Park entity) throws SQLException {
        // TODO Auto-generated method stub
        
    }


}
