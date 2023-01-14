package com.daniellms.star_wars_graphql_mvvm_design_patterns.di

import com.apollographql.apollo3.ApolloClient
import com.daniellms.star_wars_graphql_mvvm_design_patterns.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ApolloClientModule {
    @Provides
    fun provideApolloClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl(BuildConfig.BASE_URL_GRAPH_QL).build()
    }
}