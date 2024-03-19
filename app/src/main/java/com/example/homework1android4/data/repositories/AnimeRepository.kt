package com.example.homework1android4.data.repositories

import com.example.homework1android4.R
import com.example.homework1android4.data.model.Anime

class AnimeRepositories {
    val animeList = mutableListOf<Anime>()

    init {
        addAnime()
    }
    private fun addAnime() {
        animeList.add(Anime(R.drawable.adam, "Adam"))
        animeList.add(Anime(R.drawable.alu_kard, "Alu-Kard"))
        animeList.add(Anime(R.drawable.beymax, "Baymax"))
        animeList.add(Anime(R.drawable.budda, "Budda"))
        animeList.add(Anime(R.drawable.dio, "Dio"))
        animeList.add(Anime(R.drawable.dzen, "Dzen"))
        animeList.add(Anime(R.drawable.goku, "Goku"))
        animeList.add(Anime(R.drawable.luibu, "Luibu"))
        animeList.add(Anime(R.drawable.rengoku, "Rengoku"))
        animeList.add(Anime(R.drawable.saytama, "Saytama"))
        animeList.add(Anime(R.drawable.shipudan, "Shipudan"))
        animeList.add(Anime(R.drawable.zoro, "Zoro"))
    }
}