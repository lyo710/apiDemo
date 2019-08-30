package com.valtech.apiDemo.controller;

import com.valtech.apiDemo.service.TrafficLightsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequestMapping("/tlin/vehicle/v1")
public class TrafficLightsInfoController {

    public final static String PAYLOAD_REGEX = "^<spat><isecs><isec><r>\\d+</r><id>\\d+</id></isec></isecs></spat>$";

    @Autowired
    TrafficLightsInfoService trafficLightsInfoService;

    @RequestMapping("/trafficlightsinfo/v1/**")
    public String getTrafficlightsinfo(HttpServletRequest request, HttpServletResponse response, @RequestBody String payload) {

        String message = "Internal Error!";

        if(!payload.matches(PAYLOAD_REGEX)) {
            message = "The POST request body should contains the following payload:\n" +
                    "<spat><isecs><isec><r>49841</r><id>6041</id></isec></isecs></spat>";
            return message;
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new ByteArrayInputStream(payload.getBytes("utf-8"))));
            NodeList nodeList1 = document.getElementsByTagName("r");
            String regionId = nodeList1.item(0).getTextContent();
            NodeList nodeList2 = document.getElementsByTagName("id");
            String intersectionId = nodeList2.item(0).getTextContent();

            String trafficLightsInfoJson = trafficLightsInfoService.getTrafficLightsInfo(regionId,intersectionId);
            return trafficLightsInfoJson;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return message;
    }
}
