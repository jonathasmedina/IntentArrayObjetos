package com.example.myapplication

import Pessoa
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var itemList = ArrayList<String>() // Lista vazia de string

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList.add("item 1")
        itemList.add("item 2")
        itemList.add("item 3")

        val intent = Intent(this, MainActivity2::class.java)

        intent.putStringArrayListExtra("listaItens", itemList)

//        startActivity(intent)

        //passando intent com arraylist de Objetos
        val pessoas = arrayListOf(
            Pessoa("Ana", 22),
            Pessoa("Carlos", 35)
        )
        pessoas.add(Pessoa("Maria", 25))

        val intent2 = Intent(this, MainActivity2::class.java)
        intent2.putParcelableArrayListExtra("listaPessoas", pessoas)
        startActivity(intent2)
    }
}