package com.example.loginapplication;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class gmailgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmailgo);

        WebView webView=(WebView)findViewById(R.id.webview1);
        webView.loadUrl("https://mail.google.com/mail/u/0/?tab=km&pli=1#");
    }
}
