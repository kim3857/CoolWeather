package com.example.kim.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kim on 2017/4/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
