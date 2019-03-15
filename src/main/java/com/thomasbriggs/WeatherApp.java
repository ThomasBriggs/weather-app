package com.thomasbriggs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.Gson;


import com.thomasbriggs.json.LocationData;;

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
        System.out.println(locationData.getIp());
        System.out.println(locationData.getLatitude());
        System.out.println(locationData.getLongitude());
        System.out.println(locationData.getCity());
        System.out.println(locationData.getZip());
        System.out.println(locationData.getLocation().getCapital());
        System.out.println(locationData.getLocation().getCountry_flag_emoji());

        String darkSkyBase = "https://api.darksky.net/forecast/e59a5e440958bb90b50bb6587e5d18b7/";
        URL darkSky = new URL(darkSkyBase+locationData.getLatitude()+","+locationData.getLongitude()+"?units=si");
        BufferedReader reader2 = new BufferedReader(
        new InputStreamReader(darkSky.openStream()));
        
        inputLine = reader2.readLine();
        WeatherData weatherData = gson.fromJson(inputLine, WeatherData.class);
        System.out.println("Weather");
        System.out.println(weatherData.geCurrently().getSummary());
    }
}