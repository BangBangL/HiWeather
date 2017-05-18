package com.jikeshengcan.hailiu.hiweather.util;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

/**
 * Created by hailiu on 2017/5/18.
 * PackageName:com.jikeshengcan.hailiu.hiweather.util
 * Describe：与服务交互的http工具类的简单封装
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
