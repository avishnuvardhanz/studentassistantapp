package com.example.loginapplication;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class youtubegoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubegoto);

        WebView webView=(WebView)findViewById(R.id.webview);
         webView.loadUrl("https://www.youtube.com/");

    }
}
