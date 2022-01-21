package com.solvd.xml.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.entities.Visitor;
import com.solvd.jdbc.interfaces.IAreasDAO;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "visitor")
@XmlAccessorType(XmlAccessType.FIELD)
public class VisitorsServiceXML {
    
        @XmlElement(name = "visitor")
        private List<Visitor> visitors;
    
        public List<Visitor> getVisitors() {
            return visitors;
        }
    
        public void setVisitors(List<Visitor> visitors) {
            this.visitors = visitors;
        }
    
        public void save() throws JAXBException, SQLException {
            JAXBContext context = JAXBContext.newInstance(VisitorsServiceXML.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, new File("visitors.xml"));
        }
    
        public static VisitorsServiceXML load() throws JAXBException {
            JAXBContext context = JAXBContext.newInstance(VisitorsServiceXML.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (VisitorsServiceXML) unmarshaller.unmarshal(new File("visitors.xml"));
        }
    
    
}
