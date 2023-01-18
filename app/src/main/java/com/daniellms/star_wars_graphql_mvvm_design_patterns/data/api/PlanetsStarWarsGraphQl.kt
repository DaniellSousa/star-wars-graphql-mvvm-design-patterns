package com.daniellms.star_wars_graphql_mvvm_design_patterns.data.api

import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetFilmsQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetPlanetByIdQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetPlanetsQuery

interface PlanetsStarWarsGraphQl {
    suspend fun getPlanets(): GetPlanetsQuery.Data?

    suspend fun getPlanetById(idPlanet: String): GetPlanetByIdQuery.Data?
}