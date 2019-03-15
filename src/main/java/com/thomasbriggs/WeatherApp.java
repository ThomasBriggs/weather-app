package com.thomasbriggs;

import com.google.gson.Gson;

import com.thomasbriggs.json.*;

/**
 * Hello world!
 */
public final class WeatherApp {
    WeatherApp() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {

        IpStacksApi ipStacksApi = new IpStacksApi();

        Gson gson = new Gson();
        LocationData locationData = gson.fromJson(ipStacksApi.request(), LocationData.class);
        System.out.println("Location:");
        System.out.println(locationData.getIp());
        System.out.println(locationData.getLatitude());
        System.out.println(locationData.getLongitude());
        System.out.println(locationData.getCity());
        System.out.println(locationData.getZip());
        System.out.println(locationData.getLocation().getCapital());
        System.out.println(locationData.getLocation().getCountry_flag_emoji());

        DarkSkyApi darkSkyApi = new DarkSkyApi(locationData.getLongitude(), locationData.getLatitude());

        WeatherData weatherData = gson.fromJson(darkSkyApi.request(), WeatherData.class);
        System.out.println("Weather");
        System.out.println(weatherData.getCurrently().getSummary());
    }
}