package com.valtech.apiDemo.dto;

public class TrafficLightsInfoDTO {
    private String regionId;
    private String intersectionId;
    private String infoJson;

    public TrafficLightsInfoDTO(String regionId, String intersectionId, String infoJson) {
        this.regionId = regionId;
        this.intersectionId = intersectionId;
        this.infoJson = infoJson;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
    }

    public String getInfoJson() {
        return infoJson;
    }

    public void setInfoJson(String infoJson) {
        this.infoJson = infoJson;
    }
}
