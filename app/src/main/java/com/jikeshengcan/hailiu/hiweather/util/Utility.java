package com.jikeshengcan.hailiu.hiweather.util;

import android.text.TextUtils;

import com.jikeshengcan.hailiu.hiweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hailiu on 2017/5/18.
 * PackageName:com.jikeshengcan.hailiu.hiweather.util
 * Describe：解析后台返回给我们的json数组省市县
 */

public class Utility {
    /**
     * 解析处理服务器给我们返回的省级数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allprovince = new JSONArray(response);
                for (int i = 0; i < allprovince.length(); i++) {
                    JSONObject provinceObject = allprovince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
     return false;
    }
    /**
     * 解析处理服务器给我们返回的市级数据
     * @param response
     * @return
     */
    public static boolean handleCityResponse(String response, int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject provinceObject = allCities.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
