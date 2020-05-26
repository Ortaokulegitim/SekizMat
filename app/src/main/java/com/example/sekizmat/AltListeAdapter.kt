package com.example.sekizmat

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.liste.view.*

class AltListeAdapter(val altkonuListesi: ArrayList<String>) : RecyclerView.Adapter<AltListeAdapter.AltKonuVH>() {

    class AltKonuVH(view: View) :RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AltKonuVH {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.liste,parent,false)
        return  AltKonuVH(view)
    }

    override fun getItemCount(): Int {
        return altkonuListesi.size
    }

    override fun onBindViewHolder(holder: AltKonuVH, position: Int) {
        holder.itemView.textView.text=altkonuListesi[position]

        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,Oyun::class.java)
            intent.putExtra("altkonuadi",altkonuListesi[position])
            holder.itemView.context.startActivity(intent)
        }
    }
}