package com.example.mygameapp.data.network

import com.example.mygameapp.data.model.Game
import retrofit2.http.GET
import com.example.mygameapp.utils.Constants.Companion.All_GAMES_POINT
import retrofit2.Response

interface GameApiInterface {

    @GET(All_GAMES_POINT)
    suspend fun getAllGames(): Response<List<Game>>
}