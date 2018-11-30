package com.example.a_lib;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebLayout extends AppCompatActivity {
    private WebView mWebView;
    private WebSettings mWebSettings;

    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_weblayout);

        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.setWebViewClient((new WebViewClient()));

        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("https://studentkcapam.github.io/ALibWeb/");
    }

}
