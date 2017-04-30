package com.example.kim.coolweather.gson;

/**
 * Created by Kim on 2017/4/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
