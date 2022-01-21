package com.solvd.xml.service;



import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.jdbc.interfaces.IAreasDAO;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "areas")
@XmlAccessorType(XmlAccessType.FIELD)
public class AreaServiceXML implements IAreasDAO {
    private static File FILE = new File("src/main/resources/XML/areas.xml");

    @XmlElement(name = "area")
    private List<Area> areas = null;

    public AreaServiceXML(List<Area> areas) {
        this.areas = areas;
    }

    public AreaServiceXML() {
    }

    @Override
    public void save(Area entity) {
        areas = unmarshall();
        areas.add(entity);
        marshall(this);
    }

    //marshall
    private void marshall(AreaServiceXML areasDAO) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AreaServiceXML.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(areasDAO, FILE);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    //unmarshall
    private List<Area> unmarshall() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AreaServiceXML.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            AreaServiceXML areasDAO = (AreaServiceXML) unmarshaller.unmarshal(FILE);
            return areasDAO.getAreas();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    //getAreas
    public List<Area> getAreas() {
        return areas;
    }

    @Override
    public void update(Area entity) throws SQLException {
        areas = unmarshall();
        for (int i = 0; i < areas.size(); i++) {
            if (areas.get(i).getnameA() == entity.getnameA()) {
                areas.set(i, entity);
            }
        }
        marshall(this);
    }

    @Override
    public void delete(Area entity) throws SQLException {
        areas = unmarshall();
        areas.remove(entity);
        marshall(this);
    }

}
