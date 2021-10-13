package com.example.Movieapp.ui

import androidx.lifecycle.ViewModel
import com.example.Movieapp.repository.Repository

class MovieViewModel():ViewModel() {
    private val respository=Repository()
    fun searchCharacter()=respository.getPageList()

}