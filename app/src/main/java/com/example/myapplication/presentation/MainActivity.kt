package com.example.myapplication.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.presentation.adapter.CarAdapter

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular : Button
    lateinit var listaCarros : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupList()
    }

    fun setupView(){
        btnCalcular = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)

    }

    fun setupList(){
        var dados = arrayOf(
            "Teste", "valor", "tomate", "banana"
        )

        val adapter = CarAdapter(dados)

        listaCarros.adapter = adapter
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}