package com.example.myapplication.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CarAdapter(private  val carros : Array<String>) : RecyclerView.Adapter<CarAdapter.ViewHolder>(){

    //cria uma nova View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    //pega a quantidade de carros da lista
    override fun getItemCount(): Int = carros.size

    //pega o conteudo da view e troca pela informacao de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = carros[position]
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView
        init{
            textView = view.findViewById(R.id.tv_preco_value)
        }
    }

}

