package com.solvd.xml;

import java.io.IOException;



import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DomRunner {

    public static void main (String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
        Document dom = documentBuilder.parse("park-app/src/main/resources/XML/areas.xml");
        dom.getDocumentElement().normalize();

        for (int i = 0; i < dom.getElementsByTagName("nameA").getLength(); i++) {
            System.out.println(dom.getElementsByTagName("nameA").item(i).getTextContent());
        }
    }
    
}
