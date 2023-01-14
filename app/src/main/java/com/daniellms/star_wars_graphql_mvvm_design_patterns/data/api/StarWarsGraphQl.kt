package com.daniellms.star_wars_graphql_mvvm_design_patterns.data.api

import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetFilmsQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetPlanetByIdQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetPlanetsQuery

interface StarWarsGraphQl {
    suspend fun getFilms(): GetFilmsQuery.Data

    suspend fun getPlanets(): GetPlanetsQuery.Data

    suspend fun getPlanetById(): GetPlanetByIdQuery.Data
}