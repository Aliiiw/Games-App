package com.example.mygameapp.domain.item

import com.example.mygameapp.data.model.Game

data class GameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String
)

fun Game.toGameItem() = GameItem(id, title, thumbnail, short_description)