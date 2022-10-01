package com.leondev7.tmdb.feature.tvshows.data.mappers

import com.leondev7.tmdb.feature.tvshows.data.requests.Results
import com.leondev7.tmdb.feature.tvshows.domain.model.TvShow

fun Results.toTvShow(): TvShow = TvShow(
    backdropPath = backdrop_path,
    firstAirDate =first_air_date,
    genreIds =genre_ids,
    id = id,
    name = name,
    originCountry = origin_country,
    originalLanguage = original_language,
    originalName = original_name,
    overview = overview,
    popularity = popularity,
    posterPath = poster_path,
    voteAverage = vote_average,
    voteCount =vote_count
)