package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_webmotors.*

class webmotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webmotors)
        activityWebmotors.webViewClient = WebViewClient();
        activityWebmotors.settings.javaScriptEnabled = true;
        activityWebmotors.settings.displayZoomControls = true;
        activityWebmotors.loadUrl("https://www.webmotors.com.br");
    }
}
