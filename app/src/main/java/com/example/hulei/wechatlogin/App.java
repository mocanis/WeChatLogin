package com.example.hulei.wechatlogin;

import android.app.Application;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

/**
 * Created by asus on 2016/1/16.
 */
public class App extends Application {

    public static final String WX_APPID = "wxb53411a37963b886";
    public static final String WX_APPSecret = "d72be30f31c81dcc507d8c08c0d700f8";


    private IWXAPI api;

    @Override
    public void onCreate() {
        super.onCreate();
        api = WXAPIFactory.createWXAPI(this, WX_APPID, true);
        api.registerApp(WX_APPID);
    }
}


