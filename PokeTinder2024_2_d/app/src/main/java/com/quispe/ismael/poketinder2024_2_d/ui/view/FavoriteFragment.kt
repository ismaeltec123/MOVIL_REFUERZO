package com.quispe.ismael.poketinder2024_2_d.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.quispe.ismael.poketinder2024_2_d.data.database.entities.MyPokemonEntity
import com.quispe.ismael.poketinder2024_2_d.databinding.FragmentFavoriteBinding
import com.quispe.ismael.poketinder2024_2_d.ui.adapter.MyPokemonsAdapater
import com.quispe.ismael.poketinder2024_2_d.ui.adapter.PokemonAdapter
import com.quispe.ismael.poketinder2024_2_d.ui.viewmodel.FavoriteViewModel

class FavoriteFragment : Fragment() {

    private val favoriteViewModel: FavoriteViewModel by viewModels()

    private lateinit var binding: FragmentFavoriteBinding

    private var listMyPokemon = mutableListOf<MyPokemonEntity>()

    private val adapter by lazy { MyPokemonsAdapater(listMyPokemon) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPokemons.adapter = adapter

        favoriteViewModel.getMyPokemons(requireContext())

        favoriteViewModel.myPokemonList.observe(this) {
            listMyPokemon.addAll(it)
        }

        binding.floatingActionDelete.setOnClickListener {
            favoriteViewModel.deleteAllPokemon(requireContext())
        }
    }
}
