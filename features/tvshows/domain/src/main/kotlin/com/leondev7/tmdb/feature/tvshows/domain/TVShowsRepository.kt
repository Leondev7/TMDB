package com.leondev7.tmdb.feature.tvshows.domain

import com.leondev7.tmdb.feature.tvshows.domain.model.TvShow

interface TVShowsRepository {

    suspend fun getTopRatedTvShows(page: Int): Array<TvShow>

    suspend fun getSimilarTvShows(genreId: Int): Array<TvShow>
}