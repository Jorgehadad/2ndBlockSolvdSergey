package com.solvd.jdbc.jaxb.domparse;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParsePark {
    public static void main(String[] args) {
	try {
	    File inputFile = new File("src/main/resources/XML/parks.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(inputFile);
	    doc.getDocumentElement().normalize();
	    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	    NodeList nList = doc.getElementsByTagName("park");
	    System.out.println("----------------------------");

	    for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);
		System.out.println("\nCurrent Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		    Element eElement = (Element) nNode;
		    System.out.println("Park id : " + eElement.getAttribute("id"));
		    System.out.println("Park name: " + eElement.getElementsByTagName("NameP").item(0).getTextContent());
		    System.out.println("Extension : " + eElement.getElementsByTagName("Extension").item(0).getTextContent());
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
