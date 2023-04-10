package com.example.mypokedexapp.data.remote

import com.example.mypokedexapp.data.remote.response.Pokemon
import com.example.mypokedexapp.data.remote.response.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit : Int,
        @Query("offset") offset : Int,
    ):PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name:String
    ):Pokemon
}