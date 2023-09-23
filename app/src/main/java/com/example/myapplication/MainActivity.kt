package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var preco : EditText
    lateinit var btnCalcular :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()

    }

    fun setupView(){
        btnCalcular = findViewById(R.id.btn_calcular)
        preco = findViewById(R.id.et_preco_kwh)
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            val textoDigitado = preco.text.toString()
            Log.d("textoDigitado", textoDigitado)
        }
    }
}