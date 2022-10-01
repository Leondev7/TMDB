package com.leondev7.tmdb.feature.tvshows.presentation

import androidx.lifecycle.ViewModel
import com.leondev7.tmdb.feature.tvshows.domain.TVShowsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class TVShowsUIState(
    val loading : Boolean = false
)

@HiltViewModel
class TVShowsViewModel @Inject constructor(
    val tvShowsRepository: TVShowsRepository
): ViewModel() {

    private val _uiState = MutableStateFlow(TVShowsUIState())
    val uiState = _uiState.asStateFlow()
}