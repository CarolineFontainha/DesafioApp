package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_ebay.*

class ebay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)
        activityEbay.webViewClient = WebViewClient();
        activityEbay.settings.javaScriptEnabled = true;
        activityEbay.settings.displayZoomControls = true;
        activityEbay.loadUrl("https://www.ebay.com");
    }
}
