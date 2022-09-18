package com.leondev7.tmdb.feature.tvshows.di

import com.leondev7.tmdb.feature.tvshows.data.TVShowsApiClient
import com.leondev7.tmdb.feature.tvshows.data.di.TVShowsDataModule
import com.leondev7.tmdb.feature.tvshows.domain.TVShowsRepository
import dagger.Subcomponent

@Subcomponent(modules = [TVShowsDataModule::class])
interface TVShowsComponent {
    fun tvShowsApiClient(): TVShowsApiClient

    @Subcomponent.Builder
    interface Builder {
        fun tvShowsModule(module: TVShowsDataModule?): Builder?
        fun build(): TVShowsComponent?
    }
}