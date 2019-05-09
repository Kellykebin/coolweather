package android.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public int weatherId;

    public  Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
