package com.leondev7.tmdb

import androidx.lifecycle.ViewModel
import com.leondev7.tmdb.feature.tvshows.domain.TVShowsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.ktor.client.*
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val tvShowsRepository: TVShowsRepository
) : ViewModel() {

}
