package com.leondev7.tmdb.core.network.di

import com.leondev7.tmdb.core.network.httpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Named("httpClient")
    fun provideHttpClient(): HttpClient = httpClient

    @Provides
    @Named("apiKey")
    fun provideApiKey(): String = ""

}