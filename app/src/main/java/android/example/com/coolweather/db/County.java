package android.example.com.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    public int id;
    public String countyName;
    public int countyCode;
    public  int cityId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
