package com.valtech.apiDemo.service;

import com.valtech.apiDemo.dao.TrafficLightsInfoDao;
import com.valtech.apiDemo.dto.TrafficLightsInfoDTO;
import com.valtech.apiDemo.model.*;
import org.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrafficLightsInfoService {

    @Autowired
    private TrafficLightsInfoDao trafficLightsInfoDao;

    public String getTrafficLightsInfo(String regionId, String intersectionId) {

//        Id id = new Id(regionId, intersectionId);
//
//        Is is = new Is(false, false, false, false,false);
//
//        S g1s0 = new S(6,130,310,220,12);
//        S g1s1 = new S(3,340,640,490,12);
//
//        S g2s0 = new S(3,350,540,490,13);
//        S g2s1 = new S(6,450,780,630,13);
//
//        S g3s0 = new S(3,160,340,270,13);
//        S g3s1 = new S(6,280,580,430,14);
//
//        S g4s0 = new S(6,100,270,220,11);
//        S g4s1 = new S(3,510,850,680,11);
//
//        List<S> g1List = new ArrayList<>();
//        g1List.add(g1s0);
//        g1List.add(g1s1);
//        St st1 = new St(1, g1List);
//
//        List<S> g2List = new ArrayList<>();
//        g2List.add(g2s0);
//        g2List.add(g2s1);
//        St st2 = new St(2, g2List);
//
//        List<S> g3List = new ArrayList<>();
//        g3List.add(g3s0);
//        g3List.add(g3s1);
//        St st3 = new St(3, g3List);
//
//        List<S> g4List = new ArrayList<>();
//        g4List.add(g4s0);
//        g4List.add(g4s1);
//        St st4 = new St(4, g4List);
//
//        List<St> st  = new ArrayList<>();
//        st.add(st1);
//        st.add(st2);
//        st.add(st3);
//        st.add(st4);
//
//        Sl sl1 = new Sl(id, 1, is, st, new ArrayList<>());
//
//        List<Sl> slList = new ArrayList<>();
//        slList.add(sl1);
//
//        Sp sp = new Sp(slList);
//
//        //    public TrafficLightsInfo(long t, long cr, long sv, long st, long zt, Sp sp) {
//        TrafficLightsInfo trafficLightsInfo  = new TrafficLightsInfo(1,1565190185883l,1565190187579l,1,1,sp);

        TrafficLightsInfoDTO trafficLightsInfoDTO = trafficLightsInfoDao.get(regionId, intersectionId);

        if (trafficLightsInfoDTO != null) {
            return trafficLightsInfoDTO.getInfoJson();
        }
        return "No data found.";
    }

    public void saveTrafficLightsInfo(String regionId, String intersectionId, String spatJson) {
        TrafficLightsInfoDTO trafficLightsInfoDTO = new TrafficLightsInfoDTO(regionId, intersectionId, spatJson);
        trafficLightsInfoDao.save(trafficLightsInfoDTO);
    }

}
