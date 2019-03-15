package com.thomasbriggs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class IpStacksApi {
    private String BaseUrl = "http://api.ipstack.com/";
    private String ApiKey = "017418ecb45684b0270b066730aa5df7";
    private String Params;

    public IpStacksApi(String params) {
        this.Params = params;
    }

    public IpStacksApi() {
        this.Params = "check";
    }

    public String request() throws Exception {

        //Example URL: http://api.ipstack.com/82.7.48.121?access_key=017418ecb45684b0270b066730aa5df7
        URL url = new URL(this.BaseUrl + this.Params + "?access_key=" + this.ApiKey);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine = reader.readLine();
        return inputLine;
    }
}