package com.daniellms.star_wars_graphql_mvvm_design_patterns.data.api

import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetFilmsQuery

interface FilmsStarWarsGraphQL {
    suspend fun getFilms(): GetFilmsQuery.Data?
}