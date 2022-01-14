package com.solvd.xml.parsingDOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParseArea {
    public static void main(String[] args) {
	try {
	    File inputFile = new File("src/main/resources/XML/areas.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(inputFile);
	    doc.getDocumentElement().normalize();
	    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	    NodeList nList = doc.getElementsByTagName("area");
	    System.out.println("----------------------------");

	    for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);
		System.out.println("\n Current Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		    Element eElement = (Element) nNode;
		    System.out.println("Area id : " + eElement.getAttribute("id"));
		    System.out.println("Name: " + eElement.getElementsByTagName("nameA").item(0).getTextContent());
		    System.out.println("Park id: " + eElement.getElementsByTagName("nameP").item(0).getTextContent());
		    System.out.println("Extension : " + eElement.getElementsByTagName("extension").item(0).getTextContent());
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
