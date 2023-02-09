package com.daniellms.star_wars_graphql_mvvm_design_patterns.di

import com.daniellms.star_wars_graphql_mvvm_design_patterns.data.repository.film.FilmRepository
import com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.viewmodel.FilmsViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ViewModelModule {

    @Provides
    fun provideFilmViewModel(filmRepository: FilmRepository): FilmsViewModel {
        return FilmsViewModel(filmRepository)
    }
}