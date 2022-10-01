package com.leondev7.tmdb.feature.tvshows.di

import com.leondev7.tmdb.feature.tvshows.data.TVShowsApiClient
import com.leondev7.tmdb.feature.tvshows.data.TVShowsRepositoryImpl
import com.leondev7.tmdb.feature.tvshows.domain.TVShowsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module(subcomponents = [TVShowsComponent::class])
@InstallIn(SingletonComponent::class)
class TVShowsModule{

    @Provides
    @Singleton
    fun providesTVShowsRepository(
        tvShowsApiClient: TVShowsApiClient
    ): TVShowsRepository = TVShowsRepositoryImpl(
        apiClient = tvShowsApiClient
    )
}
