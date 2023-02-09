package com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.daniellms.star_wars_graphql_mvvm_design_patterns.data.repository.film.FilmRepository
import com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.state.FilmState
import kotlinx.coroutines.launch

class FilmsViewModel constructor(private val filmRepository: FilmRepository): ViewModel() {

    private val _mutableLiveDataFilmState = MutableLiveData<FilmState>()
    val mutableLiveDataFilmState: LiveData<FilmState> get() = _mutableLiveDataFilmState

    fun getFilms() = viewModelScope.launch {
        try {
            val response = filmRepository.getFilms()
            response?.let { itResponseFilmsData ->
                _mutableLiveDataFilmState.value = FilmState.SuccessGetFilms(itResponseFilmsData.allFilms?.films)
            }
        } catch (exception: Exception) {
            _mutableLiveDataFilmState.value = FilmState.ErrorGetFilms(exception)
        }

    }
}