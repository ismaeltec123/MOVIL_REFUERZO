package com.quispe.ismael.poketinder2024_2_d.data.model

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<PokemonResponse>
)
