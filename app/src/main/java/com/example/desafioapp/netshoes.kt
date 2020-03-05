package com.example.desafioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_netshoes.*

class netshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)
        activityNetshoes.webViewClient = WebViewClient();
        activityNetshoes.settings.javaScriptEnabled = true;
        activityNetshoes.settings.displayZoomControls = true;
        activityNetshoes.loadUrl("https://www.netshoes.com.br");
    }
}
