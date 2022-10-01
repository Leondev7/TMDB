package com.leondev7.tmdb.feature.tvshows.data

import com.leondev7.tmdb.feature.tvshows.data.mappers.toTvShow
import javax.inject.Inject
import com.leondev7.tmdb.feature.tvshows.domain.TVShowsRepository
import com.leondev7.tmdb.feature.tvshows.domain.model.TvShow

class TVShowsRepositoryImpl @Inject constructor(
    val apiClient: TVShowsApiClient
) : TVShowsRepository {

    override suspend fun getTopRatedTvShows(page: Int): Array<TvShow> {
        return apiClient.getTopRatedTvShows(pageNumber = page).results.map { it.toTvShow() }.toTypedArray()
    }

    override suspend fun getSimilarTvShows(genreId: Int): Array<TvShow> {
        return apiClient.getSimilarTvShows(genreId = genreId).results.map { it.toTvShow() }.toTypedArray()
    }
}