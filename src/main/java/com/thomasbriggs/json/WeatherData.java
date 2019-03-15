package com.thomasbriggs.json;

public class WeatherData
{
    private Currently currently;

    /**
     * @return the currently
     */
    public Currently getCurrently() {
        return currently;
    }

    /**
     * @param currently the currently to set
     */
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }
}