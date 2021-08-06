package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {

    private int id;
    private String countryName;//县的名字
    private String weatherId;//县对应的天气id
    private int cityId;//当前县所属市的id值

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }



}
