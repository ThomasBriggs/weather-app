package com.thomasbriggs;

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
    private String precipProbability;
    private String visibility;
    private String windGust;
    private String precipIntensity;
    private String icon;
    private String cloudCover;
    private String windBearing;
    private String apparentTemperature;
    private String pressure;
    private String dewPoint;
    private String ozone;
    private String nearestStormBearing;
    private String nearestStormDistance;
    private String temperature;
    private String humidity;
    private String time;
    private String windSpeed;
    private String uvIndex;

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @return the uvIndex
     */
    public String getUvIndex() {
        return uvIndex;
    }

    /**
     * @param uvIndex the uvIndex to set
     */
    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    /**
     * @return the windSpeed
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed the windSpeed to set
     */
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the nearestStormDistance
     */
    public String getNearestStormDistance() {
        return nearestStormDistance;
    }

    /**
     * @param nearestStormDistance the nearestStormDistance to set
     */
    public void setNearestStormDistance(String nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    /**
     * @return the nearestStormBearing
     */
    public String getNearestStormBearing() {
        return nearestStormBearing;
    }

    /**
     * @param nearestStormBearing the nearestStormBearing to set
     */
    public void setNearestStormBearing(String nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    /**
     * @return the ozone
     */
    public String getOzone() {
        return ozone;
    }

    /**
     * @param ozone the ozone to set
     */
    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    /**
     * @return the dewPoint
     */
    public String getDewPoint() {
        return dewPoint;
    }

    /**
     * @param dewPoint the dewPoint to set
     */
    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * @return the pressure
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the apparentTemperature
     */
    public String getApparentTemperature() {
        return apparentTemperature;
    }

    /**
     * @param apparentTemperature the apparentTemperature to set
     */
    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    /**
     * @return the windBearing
     */
    public String getWindBearing() {
        return windBearing;
    }

    /**
     * @param windBearing the windBearing to set
     */
    public void setWindBearing(String windBearing) {
        this.windBearing = windBearing;
    }

    /**
     * @return the cloudCover
     */
    public String getCloudCover() {
        return cloudCover;
    }

    /**
     * @param cloudCover the cloudCover to set
     */
    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the precipIntensity
     */
    public String getPrecipIntensity() {
        return precipIntensity;
    }

    /**
     * @param precipIntensity the precipIntensity to set
     */
    public void setPrecipIntensity(String precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    /**
     * @return the windGust
     */
    public String getWindGust() {
        return windGust;
    }

    /**
     * @param windGust the windGust to set
     */
    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    /**
     * @return the visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * @return the precipProbability
     */
    public String getPrecipProbability() {
        return precipProbability;
    }

    /**
     * @param precipProbability the precipProbability to set
     */
    public void setPrecipProbability(String precipProbability) {
        this.precipProbability = precipProbability;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }


}