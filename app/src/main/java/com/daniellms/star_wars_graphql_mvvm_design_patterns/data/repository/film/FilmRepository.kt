package com.daniellms.star_wars_graphql_mvvm_design_patterns.data.repository.film

import com.apollographql.apollo3.ApolloClient
import com.daniellms.star_wars_graphql_mvvm_design_patterns.GetFilmsQuery
import com.daniellms.star_wars_graphql_mvvm_design_patterns.data.api.FilmsStarWarsGraphQL

class FilmRepository constructor(private val apolloClient: ApolloClient): FilmsStarWarsGraphQL {
    override suspend fun getFilms(): GetFilmsQuery.Data? {
        return apolloClient.query(GetFilmsQuery()).execute().data
    }

}