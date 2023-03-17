package com.example.mygameapp.repository

import com.example.mygameapp.data.network.GameService
import com.example.mygameapp.domain.item.GameItem
import com.example.mygameapp.domain.item.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {
    suspend fun getGames(): List<GameItem> {
        return gameService.getAllGames().map { game ->
            game.toGameItem()
        }
    }
}