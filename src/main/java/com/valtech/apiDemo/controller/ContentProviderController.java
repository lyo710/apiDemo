package com.valtech.apiDemo.controller;

import com.valtech.apiDemo.service.TrafficLightsInfoService;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class ContentProviderController {

    @Autowired
    TrafficLightsInfoService trafficLightsInfoService;

    @RequestMapping("/updateRTII")
    public String updateRTII(@RequestBody String payload) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new ByteArrayInputStream(payload.getBytes("utf-8"))));
            NodeList pSPATList = document.getElementsByTagName("pSPAT");

            if (pSPATList.getLength() > 0) {

                for (int i=0; i< pSPATList.getLength(); i++) {
                    Node pSPATNode = pSPATList.item(i);
                    NodeList pSPATProps = pSPATNode.getChildNodes();
                    String regionId = null;
                    String intersectionId = null;
                    String spatJson = null;
                    for (int j=0; j<pSPATProps.getLength(); j++) {
                        Node pSPATProp = pSPATProps.item(j);
                        if (pSPATProp.getNodeName().equals("RegionID")) {
                            regionId = pSPATProp.getTextContent();
                            System.out.println("RegionID = " + pSPATProp.getTextContent());
                        } else if (pSPATProp.getNodeName().equals("IntersectionId")) {
                            intersectionId = pSPATProp.getTextContent();
                            System.out.println("IntersectionId = " + pSPATProp.getTextContent());
                        } else if (pSPATProp.getNodeName().equals("SPAT")) {
                            spatJson = pSPATProp.getTextContent();
                            System.out.println("SPAT = " + pSPATProp.getTextContent());
                        }
                    }
                    trafficLightsInfoService.saveTrafficLightsInfo(regionId, intersectionId, spatJson);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Internal error!";
        }

        return "Data cached!";
    }
}
