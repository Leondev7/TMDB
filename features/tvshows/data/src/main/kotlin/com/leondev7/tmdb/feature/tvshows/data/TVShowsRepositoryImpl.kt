package com.leondev7.tmdb.feature.tvshows.data

import javax.inject.Inject
import com.leondev7.tmdb.feature.tvshows.domain.TVShowsRepository

class TVShowsRepositoryImpl @Inject constructor(
    val tvShowsApiClient: TVShowsApiClient
) : TVShowsRepository {
    override suspend fun getAllTvShows() {
        Unit
    }


}