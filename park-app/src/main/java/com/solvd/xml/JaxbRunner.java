package com.solvd.xml;


import com.solvd.entities.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JaxbRunner {
    
    public static void main(String[] args) throws JAXBException {
        /*JAXBContext jaxbContext = JAXBContext.newInstance(Area.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        
        Area areas;
        areas = (Area) jaxbUnmarshaller.unmarshal(JaxbRunner.class.getClassLoader().getResourceAsStream("XML/areas.xml"));
        System.out.println(areas);

        JAXBContext jaxbContext2 = JAXBContext.newInstance(Park.class);
        Unmarshaller jaxbUnmarshaller2 = jaxbContext2.createUnmarshaller();

        Park parks;
        parks = (Park) jaxbUnmarshaller2.unmarshal(JaxbRunner.class.getClassLoader().getResourceAsStream("XML/parks.xml"));
        System.out.println(parks);
        */

        JAXBContext jaxbContext3 = JAXBContext.newInstance(Staff.class);
        Unmarshaller jaxbUnmarshaller3 = jaxbContext3.createUnmarshaller();

        Staff staff;
        staff = (Staff) jaxbUnmarshaller3.unmarshal(JaxbRunner.class.getClassLoader().getResourceAsStream("XML/staffUnique.xml"));
        System.out.println(staff);
    }

}
