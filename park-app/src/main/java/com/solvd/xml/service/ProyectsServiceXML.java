package com.solvd.xml.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.entities.Proyect;
import com.solvd.jdbc.interfaces.IAreasDAO;
import com.solvd.jdbc.interfaces.IProjectsDAO;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "proyects")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProyectsServiceXML implements IProjectsDAO {

    private static File FILE = new File("src/main/resources/XML/proyects.xml");

    @XmlElement(name = "proyect")
    private List<Proyect> proyects = null;

    public ProyectsServiceXML(List<Proyect> proyects) {
        this.proyects = proyects;
    }

    public ProyectsServiceXML() {
    }

    @Override
    public void save(Proyect entity) {
        proyects = unmarshall();
        proyects.add(entity);
        marshall(this);
    }

    // marshall
    private void marshall(ProyectsServiceXML proyectsDAO) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ProyectsServiceXML.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(proyectsDAO, FILE);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // unmarshall
    private List<Proyect> unmarshall() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ProyectsServiceXML.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ProyectsServiceXML proyectsDAO = (ProyectsServiceXML) unmarshaller.unmarshal(FILE);
            return proyectsDAO.getProyects();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    //getProyects
    public List<Proyect> getProyects() {
        return proyects;
    }

    @Override
    public void update(Proyect entity) {
        proyects = unmarshall();
        for (int i = 0; i < proyects.size(); i++) {
            if (proyects.get(i).getProyectName() == entity.getProyectName()) {
                proyects.set(i, entity);
            }
        }
        marshall(this);
    }

    @Override
    public void delete(Proyect entity) {
        proyects = unmarshall();
        proyects.remove(entity);
        marshall(this);
    }


    
}
