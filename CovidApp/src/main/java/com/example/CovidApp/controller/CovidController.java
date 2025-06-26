package com.example.CovidApp.controller;

import com.example.CovidApp.dto.StateCovidInfo;
import com.example.CovidApp.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/covid-data")
public class CovidController
{
    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/statewise/{state}")
    public String getCovidCases(@PathVariable String state)
    {
        StateCovidInfo stateCovidInfo = covidDataService.getCases(state);
        return "Total Cases in "+state+" : "+stateCovidInfo.getCovidCases()+"\n\n"
                +"Zone : "+stateCovidInfo.getZone()+"\n\n";
    }


}
