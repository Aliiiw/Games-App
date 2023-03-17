package com.example.mygameapp.data.network

import com.example.mygameapp.data.model.Game
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GameService @Inject constructor(private val gameApiInterface: GameApiInterface) {

    suspend fun getAllGames(): List<Game> {
        return withContext(Dispatchers.IO) {
            val games = gameApiInterface.getAllGames()
            games.body() ?: emptyList()
        }
    }
}