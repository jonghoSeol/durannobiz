package com.duranno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    WebView webview = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = (WebView)findViewById(R.id.webview);

        WebSettings webSetting = webview.getSettings();
        webSetting.setJavaScriptEnabled(true);

        String str = "hellow git";
        //fffffff
        String strdata = "file:///android_asset/html.html";
        webview.loadUrl(strdata);
    }
}
