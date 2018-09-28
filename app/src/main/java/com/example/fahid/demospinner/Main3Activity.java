package com.example.fahid.demospinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main3Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        webView= (WebView) findViewById(R.id.web);
        webView.loadUrl("https://facebook.com");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new browser());


    }
    public class browser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
          view.loadUrl(url);

            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
