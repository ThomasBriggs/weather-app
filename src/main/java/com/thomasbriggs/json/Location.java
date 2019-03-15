package com.thomasbriggs.json;

public class Location
{
    private String capital;
    private String country_flag_emoji;

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @return the country_flag_emoji
     */
    public String getCountry_flag_emoji() {
        return country_flag_emoji;
    }

    /**
     * @param country_flag_emoji the country_flag_emoji to set
     */
    public void setCountry_flag_emoji(String country_flag_emoji) {
        this.country_flag_emoji = country_flag_emoji;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }
}