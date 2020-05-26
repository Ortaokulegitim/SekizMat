package com.example.sekizmat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_alt_konu.*
import kotlinx.android.synthetic.main.activity_main.*

class AltKonu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alt_konu)

        val intent=intent
        val gelenKonu = intent.getStringExtra("konuadi")
        val gelenNumara=intent.getIntExtra("konunumara",0)
        textView2.text=gelenKonu
        var altkonuIsimleri =ArrayList<String>()
        if(gelenNumara==1){


            altkonuIsimleri.add("Sayıları Çarpanlarına Ayırma")
            altkonuIsimleri.add("EBOB EKOK")
            altkonuIsimleri.add("Aralarında Asal")

        }
        else if(gelenNumara==2){

            altkonuIsimleri.add("Değer Bulma")
            altkonuIsimleri.add("Üslü İfadelerde Çarpma")
            altkonuIsimleri.add("Üslü İfadelerde Bölme")
            altkonuIsimleri.add("Üssün Üssünü Bulma")
            altkonuIsimleri.add("Çözümleme")
            altkonuIsimleri.add("10'un Kuvveti Şeklinde Yazma")
            altkonuIsimleri.add("Bilimsel Gösterim")

        }
        else if(gelenNumara==3){

            altkonuIsimleri.add("Kareköklü Sayının Aralığını Bulma")
            altkonuIsimleri.add("Karekök İçine ve Dışına Alma")
            altkonuIsimleri.add("Kareköklerde Çarpma ve Bölme")
            altkonuIsimleri.add("Kareköklerde Toplama ve Çıkarma")
            altkonuIsimleri.add("Ondalık Karekökler")
            altkonuIsimleri.add("Karekökle Çarpınca Doğal Sayı Yapma")
            altkonuIsimleri.add("Gerçek Sayılar")

        }
        else if(gelenNumara==4){

            altkonuIsimleri.add("Grafik Yorumlama")

        }
        else if(gelenNumara==5){

            altkonuIsimleri.add("Olası Durumlar")
            altkonuIsimleri.add("Bait olayların Olasılıkları")

        }
        else if(gelenNumara==6){

            altkonuIsimleri.add("Basit Cebirsel İfadeler")
            altkonuIsimleri.add("Cebirsel İfadelerde Çarpma")
            altkonuIsimleri.add("Özdeşlikler")
            altkonuIsimleri.add("Çarpanlara Ayırma")

        }



        val layoutManager= LinearLayoutManager(this)
        recyclerView2.layoutManager=layoutManager

        val adapter = AltListeAdapter(altkonuIsimleri)
        recyclerView2.adapter=adapter

    }
}