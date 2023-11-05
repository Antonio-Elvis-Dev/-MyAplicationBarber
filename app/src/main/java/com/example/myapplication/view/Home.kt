package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.ServicosAdapter
import com.example.myapplication.databinding.ActivityHomeBinding
import com.example.myapplication.model.Servicos

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var servicosAdapter: ServicosAdapter
    private  val listaServicos: MutableList<Servicos> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val nome = intent.extras?.getString("nome")
        binding.txtNomeUsuario.text = "Bem-Vindo(a), $nome"

        val recyclerViewServicos = binding.recyclerViewServicos
        recyclerViewServicos.layoutManager = GridLayoutManager(this,2)
        servicosAdapter = ServicosAdapter(this,listaServicos)
        recyclerViewServicos.setHasFixedSize(true)

        recyclerViewServicos.adapter = servicosAdapter
        getServicos()
    }

    private fun getServicos(){
        val servico1 = Servicos(R.drawable.img1,"Corte de Cabelo")
        listaServicos.add(servico1)

        val servico2 = Servicos(R.drawable.img2, "Corte de Cabelo")
        listaServicos.add(servico2)

        val servico3 = Servicos(R.drawable.img3, "Corte de Cabelo")
        listaServicos.add(servico3)

        val servico4 = Servicos(R.drawable.img4, "Corte de Cabelo")
        listaServicos.add(servico4)


        val servico5 = Servicos(R.drawable.img4, "Corte de Cabelo")
        listaServicos.add(servico5)


        val servico6 = Servicos(R.drawable.img4, "Corte de Cabelo")
        listaServicos.add(servico6)



    }
}