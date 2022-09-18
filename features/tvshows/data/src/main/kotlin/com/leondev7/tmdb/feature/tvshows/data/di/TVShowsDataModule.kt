package com.leondev7.tmdb.feature.tvshows.data.di

import com.leondev7.tmdb.feature.tvshows.data.TVShowsApiClient
import dagger.Module
import dagger.Provides
import io.ktor.client.*
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext


@Module
object TVShowsDataModule {

    @Provides
    @Singleton
    fun providesTVShowsApiClient(
        httpClient: HttpClient,
        apiKey: String = "",
        backgroundDispatcher: CoroutineContext = Dispatchers.IO
    ): TVShowsApiClient = TVShowsApiClient(
        httpClient = httpClient,
        apiKey = apiKey,
        backgroundDispatcher = backgroundDispatcher
    )
}
