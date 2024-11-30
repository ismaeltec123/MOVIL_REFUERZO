package com.quispe.ismael.poketinder2024_2_d.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.quispe.ismael.poketinder2024_2_d.data.database.dao.PokemonDao
import com.quispe.ismael.poketinder2024_2_d.data.database.entities.MyPokemonEntity

@Database(entities = [MyPokemonEntity::class], exportSchema = false, version = 1)
abstract class PokemonDatabase: RoomDatabase() {
    abstract fun getPokemonDao(): PokemonDao
}
