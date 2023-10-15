package com.example.myapplication.presentation.data

import com.example.myapplication.presentation.domain.Carro
import retrofit2.Call
import retrofit2.http.GET


interface CarsApi {
    @GET("cars.json")
    fun getAllCars() : Call<List<Carro>>
}