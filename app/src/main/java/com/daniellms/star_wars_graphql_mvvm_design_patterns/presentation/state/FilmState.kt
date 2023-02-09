package com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.state

import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetFilmsQuery

sealed class FilmState {
    data class SuccessGetFilms(val listFilms: List<GetFilmsQuery.Film?>?): FilmState()
    data class ErrorGetFilms(val exception: Exception): FilmState()
}