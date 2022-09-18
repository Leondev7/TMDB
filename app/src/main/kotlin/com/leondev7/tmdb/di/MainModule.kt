package com.leondev7.tmdb.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Named
import kotlin.coroutines.CoroutineContext

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Named("backgroundDispatcher")
    fun provideBackgroundDispatcher(): CoroutineContext = Dispatchers.IO
}