package com.example.hulei.wechatlogin.utils;

/**
 * Created by asus on 2016/1/16.
 */
public interface HttpCallBackListener {

    void onFinish(String response);

    void onError(Exception e);

}
