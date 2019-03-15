package com.thomasbriggs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class DarkSkyApi {
    private String BaseUrl = "https://api.darksky.net/forecast/";
    private String ApiKey = "e59a5e440958bb90b50bb6587e5d18b7";
    private String Longitude;
    private String Latitude;
    private String Params;

    public DarkSkyApi(String longitude, String latitude, String params) {
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Params = params;

    }

    public DarkSkyApi(String longitude, String latitude) {
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Params = "";

    }

    public String request() throws Exception {

        //Example URL: https://api.darksky.net/forecast/e59a5e440958bb90b50bb6587e5d18b7/37.8267,-122.4233
        URL url = new URL(this.BaseUrl + this.ApiKey + '/' + this.Longitude + ',' + this.Latitude + this.Params);

        BufferedReader reader = new BufferedReader(
        new InputStreamReader(url.openStream()));

        String inputLine = reader.readLine();
        return inputLine;
    }
}