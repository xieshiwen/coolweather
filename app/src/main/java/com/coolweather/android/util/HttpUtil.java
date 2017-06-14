package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by TR-XSW on 2017/6/14.
 */

public class HttpUtil  {
    //和服务器进行交互,发起一条HTTP请求只需调用sendOkhttpRequest 并传入请求地址 并主持一个回调来处理服务器的相应
    public static void sendOkhttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new  Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
