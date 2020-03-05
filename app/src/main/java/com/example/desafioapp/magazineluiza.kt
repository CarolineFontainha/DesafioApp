package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_magazineluiza.*

class magazineluiza : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magazineluiza)
        activityMagazineluiza.webViewClient = WebViewClient();
        activityMagazineluiza.settings.javaScriptEnabled = true;
        activityMagazineluiza.settings.displayZoomControls = true;
        activityMagazineluiza.loadUrl("https://www.magazineluiza.com.br");
    }
}
