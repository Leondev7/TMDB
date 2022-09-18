package com.leondev7.tmdb

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.ktor.client.*
import javax.inject.Inject

@HiltAndroidApp
class TMDBApp : Application()