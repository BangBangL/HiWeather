package com.jikeshengcan.hailiu.hiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hailiu on 2017/5/18.
 * PackageName:com.jikeshengcan.hailiu.hiweather.db
 * Describe：数据库市
 */

public class City extends DataSupport {
    private int id;
    private String cityName;  //市名
    private int cityCode;  //市的代号
    private int priovinceId;  //当前市所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;

    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;

    }

    public int getPriovinceId() {
        return priovinceId;
    }

    public void setPriovinceId(int priovinceId) {
        this.priovinceId = priovinceId;

    }
}
