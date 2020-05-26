package com.example.sekizmat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var konuIsimleri =ArrayList<String>()
        konuIsimleri.add("Çarpanlar ve Katlar")
        konuIsimleri.add("Üslü Sayılar")
        konuIsimleri.add("Köklü Sayılar")
        konuIsimleri.add("Veri Analizi")
        konuIsimleri.add("Olasılık")
        konuIsimleri.add("Cebirsel İfadeler")

        var konuNumaralari =ArrayList<Int>()
        konuNumaralari.add(1)
        konuNumaralari.add(2)
        konuNumaralari.add(3)
        konuNumaralari.add(4)
        konuNumaralari.add(5)
        konuNumaralari.add(6)



        val layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        val adapter = ListeAdapter(konuIsimleri, konuNumaralari)
        recyclerView.adapter=adapter


    }
}