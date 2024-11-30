package com.quispe.ismael.poketinder2024_2_d.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quispe.ismael.poketinder2024_2_d.data.database.entities.MyPokemonEntity
import com.quispe.ismael.poketinder2024_2_d.databinding.ItemPokemonSavedBinding
import com.quispe.ismael.poketinder2024_2_d.ui.view.MyPokemonsHolder

class MyPokemonsAdapater(val list: List<MyPokemonEntity>): RecyclerView.Adapter<MyPokemonsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPokemonsHolder {
        val view = ItemPokemonSavedBinding.inflate(LayoutInflater.from(parent.context),parent ,false)
        return MyPokemonsHolder(view.root)
    }

    override fun onBindViewHolder(holder: MyPokemonsHolder, position: Int) {
        val pokemon = list[position]
        holder.bind(pokemon)
    }

    override fun getItemCount(): Int = list.size
}
