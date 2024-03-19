package com.example.homework1android4.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homework1android4.data.model.Anime
import com.example.homework1android4.data.repositories.AnimeRepositories

class AnimeViewModel:ViewModel() {
    private val repositories = AnimeRepositories()
    private val _animeLiveData = MutableLiveData<List<Anime>>()
    val animeLiveData:LiveData<List<Anime>> = _animeLiveData

    init {
        _animeLiveData.value = repositories.animeList
    }

}