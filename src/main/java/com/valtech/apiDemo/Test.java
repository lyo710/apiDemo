package com.valtech.apiDemo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String msg = "<spat><isecs><isec><r>49841</r><id>6041</id></isec></isecs></spat>";

        System.out.println("1111");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            Document document = builder.parse(new InputSource(new ByteArrayInputStream(msg.getBytes("utf-8"))));
            NodeList nodeList1 = document.getElementsByTagName("r");
            System.out.println(nodeList1.item(0).getTextContent());
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
