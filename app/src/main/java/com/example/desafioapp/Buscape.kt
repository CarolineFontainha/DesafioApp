package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*

class Buscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)
        activityBuscape.webViewClient = WebViewClient();
        activityBuscape.settings.javaScriptEnabled = true;
        activityBuscape.settings.displayZoomControls = true;
        activityBuscape.loadUrl("https://www.buscape.com.br");
    }
}
