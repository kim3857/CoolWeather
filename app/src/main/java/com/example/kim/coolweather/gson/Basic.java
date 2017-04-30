package com.example.kim.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kim on 2017/4/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weaherId;
    public  Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
