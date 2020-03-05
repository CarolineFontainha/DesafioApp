package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_americanas.*
import kotlinx.android.synthetic.main.activity_buscape.*

class americanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)
        activityAmericanas.webViewClient = WebViewClient();
        activityAmericanas.settings.javaScriptEnabled = true;
        activityAmericanas.settings.displayZoomControls = true;
        activityAmericanas.loadUrl("https://www.americanas.com.br");
    }
}
