package com.example.desafioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buscape.setOnClickListener {
            var intencao = Intent(this,Buscape::class.java)
            startActivity(intencao)
        }
        mercadolivre.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.mercadolivre::class.java)
            startActivity(intencao)
        }
        ebay.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.ebay::class.java)
            startActivity(intencao)
        }
        magazineluiza.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.magazineluiza::class.java)
            startActivity(intencao)
        }
        americanas.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.americanas::class.java)
            startActivity(intencao)
        }
        netshoes.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.netshoes::class.java)
            startActivity(intencao)
        }
        webmotors.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.webmotors::class.java)
            startActivity(intencao)
        }
        submarino.setOnClickListener {
            var intencao = Intent(this,com.example.desafioapp.submarino::class.java)
            startActivity(intencao)
        }
    }


}
