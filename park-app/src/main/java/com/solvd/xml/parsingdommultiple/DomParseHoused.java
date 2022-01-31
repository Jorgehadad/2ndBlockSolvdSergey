package com.solvd.xml.parsingdommultiple;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParseHoused {
    public static void main(String[] args) {
        try {
            File inputFile = new File("park-app/src/main/resources/XML/housed.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("housed");
            System.out.println("----------------------------");
    
            for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\n Current Element :" + nNode.getNodeName());
    
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //"numAccomodation, dniVisitor, arrivalDate, departureDate, room "
                System.out.println("numAccomodation : " + eElement.getElementsByTagName("numAccomodation").item(0).getTextContent());
                System.out.println("dniVisitor : " + eElement.getElementsByTagName("dniVisitor").item(0).getTextContent());
                System.out.println("arrivalDate : " + eElement.getElementsByTagName("arrivalDate").item(0).getTextContent());
                System.out.println("departureDate : " + eElement.getElementsByTagName("departureDate").item(0).getTextContent());
                System.out.println("room : " + eElement.getElementsByTagName("room").item(0).getTextContent());
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    


