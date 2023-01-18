package com.daniellms.star_wars_graphql_mvvm_design_patterns.data.repository.planet

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetPlanetByIdQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetPlanetsQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.data.api.PlanetsStarWarsGraphQl

class PlanetRepository constructor(private val apolloClient: ApolloClient): PlanetsStarWarsGraphQl {
    override suspend fun getPlanets(): GetPlanetsQuery.Data? {
        return apolloClient.query(GetPlanetsQuery()).execute().data
    }

    override suspend fun getPlanetById(idPlanet: String): GetPlanetByIdQuery.Data? {
        val idOptional= makeIdOptionalForGraphQLApi(idPlanet)
        return apolloClient.query(GetPlanetByIdQuery(idOptional)).execute().data
    }

    private fun makeIdOptionalForGraphQLApi(id: String): Optional<String?> {
        return Optional.present(id)
    }

}