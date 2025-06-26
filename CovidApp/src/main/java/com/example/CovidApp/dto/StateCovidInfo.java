package com.example.CovidApp.dto;

public class StateCovidInfo
{
    private final String zone;
    private final int covidCases;

    public StateCovidInfo(String zone, int covidCases) {
        this.zone = zone;
        this.covidCases = covidCases;
    }

    public  String getZone() {
        return zone;
    }

    public int getCovidCases() {
        return covidCases;
    }

}
