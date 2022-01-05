package com.solvd.jdbc.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLParser {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/main/resources/Parser/DBSchema.xml");
            NodeList parkList = doc.getElementsByTagName("Park");
            for (int i = 0 ; i < parkList.getLength(); i++){
                Node p = parkList.item(i);
                if(p.getNodeType() == Node.ELEMENT_NODE){
                    Element park = (Element) p;
                    String id = park.getAttribute("id");
                    NodeList nameList = park.getChildNodes();
                    for(int k = 0; k < nameList.getLength(); k++){
                        Node n = nameList.item(k);
                        if(n.getNodeType() == Node.ELEMENT_NODE){
                            Element name = (Element) n;
                            String nameType = name.getTagName();
                            String nameValue = name.getTextContent();
                            System.out.println(id + " " + nameType + " " + nameValue);
                        }
                    }
                }
            }
        } catch (ParserConfigurationException ParserError) {
            ParserError.printStackTrace();
        } catch (SAXException SAXError) {
            SAXError.printStackTrace();
        } catch (IOException IOError) {
            IOError.printStackTrace();
       }
    }
}
