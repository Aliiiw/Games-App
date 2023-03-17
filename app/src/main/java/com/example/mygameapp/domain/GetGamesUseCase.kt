package com.example.mygameapp.domain

import com.example.mygameapp.domain.item.GameItem
import com.example.mygameapp.repository.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {
    suspend operator fun invoke(): List<GameItem> {
        return gameRepository.getGames().shuffled()
    }
}