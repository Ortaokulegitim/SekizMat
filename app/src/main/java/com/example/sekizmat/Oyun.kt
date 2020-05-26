package com.example.sekizmat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alt_konu.*
import kotlinx.android.synthetic.main.activity_oyun.*

class Oyun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun)

        val intent =intent
        val gelenaltKonu = intent.getStringExtra("altkonuadi")
        textView3.text=gelenaltKonu

    }
}