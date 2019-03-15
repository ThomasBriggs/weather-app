package com.thomasbriggs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class IpStacksApi {
    private String BaseUrl;
    private String ApiKey;
    private String Params;

    public IpStacksApi(String params) {
        this.BaseUrl = "http://api.ipstack.com/";
        this.ApiKey = "?access_key=017418ecb45684b0270b066730aa5df7";
        this.Params = params;
    }

    public IpStacksApi() {
        this.BaseUrl = "http://api.ipstack.com/";
        this.ApiKey = "?access_key=017418ecb45684b0270b066730aa5df7";
        this.Params = "check";
    }

    public String request() throws Exception {

        URL url = new URL(this.BaseUrl + this.Params + this.ApiKey);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine = reader.readLine();
        return inputLine;
    }
}