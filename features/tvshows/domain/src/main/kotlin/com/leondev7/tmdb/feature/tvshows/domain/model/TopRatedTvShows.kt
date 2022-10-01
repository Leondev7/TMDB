package com.leondev7.tmdb.feature.tvshows.domain.model

data class TopRatedTvShows(
    val page: Int,
    val tvShows: List<TvShow>,
    val totalPages: Int,
    val totalResults: Int
)