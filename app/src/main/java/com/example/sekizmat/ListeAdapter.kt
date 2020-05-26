package com.example.sekizmat

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.liste.view.*

class ListeAdapter(val konuListesi: ArrayList<String>,val konunumaraListesi:ArrayList<Int>) : RecyclerView.Adapter<ListeAdapter.KonuVH>() {

    class KonuVH(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KonuVH {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.liste,parent,false)
        return KonuVH(view)
    }

    override fun getItemCount(): Int {
        return konuListesi.size
    }

    override fun onBindViewHolder(holder: KonuVH, position: Int) {
        holder.itemView.textView.text=konuListesi[position]

        holder.itemView.setOnClickListener{

            val intent= Intent(holder.itemView.context,AltKonu::class.java)
            intent.putExtra("konuadi",konuListesi[position])
            intent.putExtra("konunumara",konunumaraListesi[position])
            holder.itemView.context.startActivity(intent)
        }
    }
}