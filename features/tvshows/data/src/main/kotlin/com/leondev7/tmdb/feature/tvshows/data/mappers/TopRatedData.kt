package com.leondev7.tmdb.feature.tvshows.data.mappers

import com.leondev7.tmdb.feature.tvshows.data.requests.TopRatedData
import com.leondev7.tmdb.feature.tvshows.domain.model.TopRatedTvShows

fun TopRatedData.toTopRatedTvShows(): TopRatedTvShows = TopRatedTvShows(
    page = page,
    tvShows = results.map {
        it.toTvShow()
    },
    totalPages = total_pages,
    totalResults =total_results
)