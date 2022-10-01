@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalLifecycleComposeApi::class)

package com.leondev7.tmdb.feature.tvshows.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun TVShowsScreen(
    modifier: Modifier = Modifier,
    viewModel: TVShowsViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(
        content = {
            TVShowsContent()
        }
    )

}

@Composable
fun TVShowsContent(
  modifier : Modifier = Modifier
) = Column(
    modifier = modifier
        .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 16.dp)
        .fillMaxWidth()
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .weight(1f),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

    }

}
