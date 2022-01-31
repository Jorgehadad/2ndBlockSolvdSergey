package com.solvd.xml.parsingdommultiple;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParseVisitors {
    //Like DomParseAreas, but for visitors
    public static void main(String[] args) {
        try {
            File inputFile = new File("park-app/src/main/resources/XML/visitors.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("visitor");
            System.out.println("----------------------------");
    
            for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\n Current Element :" + nNode.getNodeName());
    
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //"dni","name","Address","Profession"
                System.out.println("dni : " + eElement.getElementsByTagName("dni").item(0).getTextContent());
                System.out.println("name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Address : " + eElement.getElementsByTagName("Address").item(0).getTextContent());
                System.out.println("Profession : " + eElement.getElementsByTagName("Profession").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    
}
