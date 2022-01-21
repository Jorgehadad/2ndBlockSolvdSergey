package com.solvd.xml.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.entities.Staff;
import com.solvd.jdbc.interfaces.IAreasDAO;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "staff")
@XmlAccessorType(XmlAccessType.FIELD)
public class StaffServiceXML {
    
        @XmlElement(name = "staff")
        private List<Staff> staff;
    
        public List<Staff> getStaff() {
            return staff;
        }
    
        public void setStaff(List<Staff> staff) {
            this.staff = staff;
        }
    
        public void save() throws JAXBException, SQLException {
            JAXBContext context = JAXBContext.newInstance(StaffServiceXML.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, new File("staff.xml"));
        }
    
        public static StaffServiceXML load() throws JAXBException {
            JAXBContext context = JAXBContext.newInstance(StaffServiceXML.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (StaffServiceXML) unmarshaller.unmarshal(new File("staff.xml"));
        }
    
    
}
