package com.thomasbriggs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public final class WeatherApp {
    WeatherApp() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception
    {
        URL ipStacks = new URL("http://api.ipstack.com/check?access_key=017418ecb45684b0270b066730aa5df7");
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(ipStacks.openStream()));

        String inputLine = reader.readLine();
        String json = inputLine;


        Gson gson = new Gson();
        LocationData locationData = gson.fromJson(json, LocationData.class);
        System.out.println("Location:");
        System.out.println(locationData.ip);
        System.out.println(locationData.latitude);
        System.out.println(locationData.longitude);
        System.out.println(locationData.city);
        System.out.println(locationData.zip);
        System.out.println(locationData.location.capital);
        System.out.println(locationData.location.country_flag_emoji);

        String darkSkyBase = "https://api.darksky.net/forecast/e59a5e440958bb90b50bb6587e5d18b7/";
        URL darkSky = new URL(darkSkyBase+locationData.latitude+","+locationData.longitude+"?units=si");
        BufferedReader reader2 = new BufferedReader(
        new InputStreamReader(darkSky.openStream()));
        
        inputLine = reader2.readLine();
        WeatherData weatherData = gson.fromJson(inputLine, WeatherData.class);
        System.out.println("Weather");
        System.out.println(weatherData.geCurrently().getSummary());
    }
}

class LocationData
{
    String ip;
    String latitude;
    String longitude;
    String zip;
    String city;
    Location location;
}

class Location
{
    String capital;
    String country_flag_emoji;
}

class WeatherData
{
    private Currently currently;

    public Currently geCurrently (){
        return this.currently;
    }
}

class Currently
{
    private String summary;
    String precipProbability;
    String visibility;
    String windGust;
    String precipIntensity;
    String icon;
    String cloudCover;
    String windBearing;
    String apparentTemperature;
    String pressure;
    String dewPoint;
    String ozone;
    String nearestStormBearing;
    String nearestStormDistance;
    String temperature;
    String humidity;
    String time;
    String windSpeed;
    String uvIndex;

    public String getSummary ()
    {
        return this.summary;
    }
}
