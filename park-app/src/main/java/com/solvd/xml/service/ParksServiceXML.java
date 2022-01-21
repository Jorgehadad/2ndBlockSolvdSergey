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
public class ParksServiceXML implements IParksDAO {
    public static File FILE = new File("src/main/resources/XML/parks.xml");

    @XmlElement(name = "park")
    private List<Park> parks = null;

    public ParksServiceXML(List<Park> parks) {
        this.parks = parks;
    }

    public ParksServiceXML() {
    }

    @Override
    public void save(Park entity) {
        parks = unmarshall();
        parks.add(entity);
        marshall(this);
    }

    //marshall
    private void marshall(ParksServiceXML parksDAO) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ParksServiceXML.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(parksDAO, FILE);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    //unmarshall
    private List<Park> unmarshall() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ParksServiceXML.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ParksServiceXML parksDAO = (ParksServiceXML) unmarshaller.unmarshal(FILE);
            return parksDAO.getParks();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    //getParks
    public List<Park> getParks() {
        return parks;
    }

    @Override
    public void delete(Park entity) throws SQLException {
        parks = unmarshall();
        parks.remove(entity);
        marshall(this);
    }

    @Override
    public void update(Park entity) throws SQLException {
        parks = unmarshall();
        for (int i = 0; i < parks.size(); i++) {
            if (parks.get(i).getNameP() == entity.getNameP()) {
                parks.set(i, entity);
            }
        }
        marshall(this);
    }
    


}
