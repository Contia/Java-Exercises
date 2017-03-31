package xmlparserexample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.util.Elements;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author contia
 */
public class JDOMparser {   
    private ArrayList<CD> cds;

    public JDOMparser(){
      cds = new ArrayList<>();
    }
    public void startParsing(File input){
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder b = null;
        Document doc = null;
        try {
             b = f.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        try {
            doc = (Document) b.parse(input);
        } catch (SAXException | IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        NodeList list = doc.getElementsByTagName("CD");
        for (int i=0;i<list.getLength();i++){
            Node node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                String title = element.getElementsByTagName("TITLE").item(0).getTextContent();
                String artist = element.getElementsByTagName("ARTIST").item(0).getTextContent();
                String country = element.getElementsByTagName("COUNTRY").item(0).getTextContent();
                String company = element.getElementsByTagName("COMPANY").item(0).getTextContent();
                String price = element.getElementsByTagName("PRICE").item(0).getTextContent();
                String year = element.getElementsByTagName("YEAR").item(0).getTextContent();
                CD cd = new CD(title,artist,year,company,country,price);
                cds.add(cd);
            }
        }
                
    }
    public ArrayList<CD> getCDs(){
        return cds;
    }
}
