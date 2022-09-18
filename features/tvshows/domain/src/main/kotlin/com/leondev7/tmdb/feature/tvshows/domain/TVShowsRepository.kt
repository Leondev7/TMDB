package com.leondev7.tmdb.feature.tvshows.domain

interface TVShowsRepository {

    suspend fun getAllTvShows() : Unit
}