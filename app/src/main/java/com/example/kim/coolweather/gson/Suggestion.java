package com.example.kim.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kim on 2017/4/29.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWarsh carWash;
    public  Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWarsh{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
