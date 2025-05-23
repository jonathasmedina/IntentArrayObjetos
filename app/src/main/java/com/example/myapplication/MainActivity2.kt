package com.example.myapplication

import Pessoa
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var listview: ListView
    private lateinit var adapter: ArrayAdapter<Pessoa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        listview = findViewById(R.id.listView1)

        //Exemplo 1 - recebendo arraylist de String
            //recebendo arraylist de String
           // val lista = intent.getStringArrayListExtra("listaItens")

        //Exemplo 1.5 - recebendo um objeto parcelable
            //val pessoa = intent.getParcelableExtra<Pessoa>("pessoa")

        //Exemplo 2 - recebendo arraylist de objetos parcelable
            @Suppress("DEPRECATION")
            val listaRecebida = intent.getParcelableArrayListExtra<Pessoa>("listaPessoas")

            //33 pra cima, este projeto = 30
            //val listaRecebida = intent.getParcelableArrayListExtra<Pessoa>("lista", Pessoa::class.java)

      /*  if (listaRecebida != null){
            adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaRecebida)
            listview.adapter = adapter
        }*/
        //outra forma de escrever trecho acima, com let:
        listaRecebida?.let {
            adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, it)
            listview.adapter = adapter
        }

        //let: se a listaRecebida se não for nulo, faça
        //it: é a listaRecebida
    }
}