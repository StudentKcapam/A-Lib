package com.example.a_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Web2 extends AppCompatActivity {
    private EditText mAddressEdit;
    private WebView mWebView;
    private Button mMoveButton;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_web2);

        mAddressEdit = findViewById(R.id.address_edit);
        mWebView = findViewById(R.id.web_view);
        mMoveButton = findViewById(R.id.move_button);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                Toast.makeText(Web2.this, "로딩 끝", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View view){
        String address = mAddressEdit.getText().toString();

        mWebView.loadUrl(address);
    }

}
