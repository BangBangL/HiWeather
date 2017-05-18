package com.jikeshengcan.hailiu.hiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hailiu on 2017/5/18.
 * PackageName:com.jikeshengcan.hailiu.hiweather.db
 * Describe：数据库县
 */

public class County extends DataSupport {
    private int id;
    private String countyName;  //县名
    private String weatherId;  //天气id
    private int cityId;  //当前市所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcityName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;

    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;

    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;

    }
}
