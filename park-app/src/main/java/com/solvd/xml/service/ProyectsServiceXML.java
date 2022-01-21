package com.solvd.xml.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.entities.Proyect;
import com.solvd.jdbc.interfaces.IAreasDAO;

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
public class ProyectsServiceXML {

    @XmlElement(name = "proyect")
    private List<Proyect> proyects;

    public List<Proyect> getProyects() {
        return proyects;
    }

    public void setProyects(List<Proyect> proyects) {
        this.proyects = proyects;
    }

    public void save() throws JAXBException, SQLException {
        JAXBContext context = JAXBContext.newInstance(ProyectsServiceXML.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(this, new File("proyects.xml"));
    }

    public static ProyectsServiceXML load() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ProyectsServiceXML.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (ProyectsServiceXML) unmarshaller.unmarshal(new File("proyects.xml"));
    }
    
}
