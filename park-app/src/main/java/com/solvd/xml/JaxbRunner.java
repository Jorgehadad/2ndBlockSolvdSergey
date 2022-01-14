package com.solvd.xml;


import com.solvd.entities.Area;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JaxbRunner {
    
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Area.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        
        Area areas;
        areas = (Area) jaxbUnmarshaller.unmarshal
                (JaxbRunner.class.getClassLoader().
                        getResourceAsStream("XML/areas.xml"));
        System.out.println(areas);
        
    }

}
