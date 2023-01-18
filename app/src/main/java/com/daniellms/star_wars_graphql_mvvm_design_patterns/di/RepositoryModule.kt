package com.daniellms.star_wars_graphql_mvvm_design_patterns.di

import com.apollographql.apollo3.ApolloClient
import com.daniellms.star_wars_graphql_mvvm_design_patterns.data.repository.film.FilmRepository
import com.daniellms.star_wars_graphql_mvvm_design_patterns.data.repository.planet.PlanetRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Provides
    fun provideFilmsRepository(apolloClient: ApolloClient): FilmRepository {
        return FilmRepository(apolloClient)
    }

    @Provides
    fun providePlanetsRepository(apolloClient: ApolloClient): PlanetRepository {
        return PlanetRepository(apolloClient)
    }
}