package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_submarino.*

class submarino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submarino)
        activitySubmarino.webViewClient = WebViewClient();
        activitySubmarino.settings.javaScriptEnabled = true;
        activitySubmarino.settings.displayZoomControls = true;
        activitySubmarino.loadUrl("https://www.submarino.com.br");
    }
}
