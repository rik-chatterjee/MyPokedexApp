package com.example.mypokedexapp.pokemonDetail

import androidx.lifecycle.ViewModel
import com.example.mypokedexapp.data.remote.response.Pokemon
import com.example.mypokedexapp.repository.PokemonRepository
import com.example.mypokedexapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {
     suspend fun getPokemonInfo(pokemonName : String) : Resource<Pokemon> {
         return repository.getPokemonInfo(pokemonName)
     }
}