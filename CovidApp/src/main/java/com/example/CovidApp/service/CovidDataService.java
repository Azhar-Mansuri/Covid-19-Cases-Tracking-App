package com.example.CovidApp.service;

import com.example.CovidApp.dto.StateCovidInfo;
import com.example.CovidApp.utility.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class CovidDataService {

    @Autowired
    private RestTemplate restTemplate;


    public StateCovidInfo getCases(String state)
    {

        String zone;
        Map<String, Object> response = restTemplate.getForObject(Util.Covid_Data_Url,Map.class);
        Map<String, Object> data = (Map<String, Object>) response.get("data");
        List<Map<String, Object>> resgionalList = (List<Map<String, Object>>) data.get("regional");

        for(Map<String, Object> region : resgionalList)
        {
            String stateName = (String) region.get("loc");
            if(stateName.equalsIgnoreCase(state))
            {
                int covidCases = (int)region.get("totalConfirmed");
                if (covidCases <= 10000) zone = "Low Risk 🟢";
                else if (covidCases <= 100000) zone = "Moderate Risk 🟡";
                else if (covidCases <= 500000) zone = "High Risk 🟠";
                else zone = "Critical Zone 🔴";


                return new StateCovidInfo(zone,covidCases);
            }
        }
        return new StateCovidInfo("Not Found ❌", 0);
    }

}
