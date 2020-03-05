package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_mercadolivre.*

class mercadolivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercadolivre)
        activityMercadolivre.webViewClient = WebViewClient();
        activityMercadolivre.settings.javaScriptEnabled = true;
        activityMercadolivre.settings.displayZoomControls = true;
        activityMercadolivre.loadUrl("https://www.mercadolivre.com.br");
    }
}
