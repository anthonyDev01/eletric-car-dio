package com.example.myapplication.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.presentation.data.local.CarRepository
import com.example.myapplication.presentation.domain.Carro
import com.example.myapplication.presentation.ui.adapter.CarAdapter

class FavoriteFragment : Fragment(){

    lateinit var listaCarrosFavoritos : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favorite_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)

        setupList()
    }

    private fun getCarOnLocalDb(): List<Carro> {
        val repository = CarRepository(requireContext())
        val carList = repository.gettAll()
        return carList
    }

    fun setupView(view: View){
        view.apply {
            listaCarrosFavoritos = findViewById(R.id.rv_lista_carros_favoritos)
        }

    }

    fun setupList(){
        val cars = getCarOnLocalDb()
        val carroAdapter = CarAdapter(cars)

        listaCarrosFavoritos.apply {
            isVisible = true
            adapter = carroAdapter
        }
        carroAdapter.carItemLister = { carro ->
            // @TODO IMPLEMENTAR O delete no banco
        }
    }
}