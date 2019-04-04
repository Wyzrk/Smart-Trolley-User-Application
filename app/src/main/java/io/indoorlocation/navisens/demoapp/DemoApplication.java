package io.indoorlocation.navisens.demoapp;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;

public class DemoApplication extends Application {

    static final String MAPBOX_ACCESS_TOKEN = "pk.Get your access token from Mapbox website";
    static final String MAPWIZE_STYLE_URL_BASE = "http://outdoor.mapwize.io/styles/mapwize/style.json?key=";
    static final String NAVISENS_API_KEY = "Get your API Key from Navisens website";
    static final String MAPWIZE_ACCESS_KEY = "Get your access key from Mapwize website";

    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, MAPWIZE_ACCESS_KEY);
    }

}