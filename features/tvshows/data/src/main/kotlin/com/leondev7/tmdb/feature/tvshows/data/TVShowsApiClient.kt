package com.leondev7.tmdb.feature.tvshows.data

import com.leondev7.tmdb.feature.tvshows.data.requests.TopRatedData
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import javax.inject.Inject
import javax.inject.Named
import kotlin.coroutines.CoroutineContext

const val BASE_URL = "api.themoviedb.org"
const val ENDPOINT_TOP_RATED = "/3/tv/top_rated"
const val ENDPOINT_SIMILAR = "/3/tv/%s/similar"


class TVShowsApiClient @Inject constructor(
    @Named("httpClient")
    val httpClient: HttpClient,
    @Named("apiKey")
    val apiKey: String,
    @Named("backgroundDispatcher")
    val backgroundDispatcher: CoroutineContext,
) {
    suspend fun getTopRatedTvShows(
        scheme: String = "https",
        host: String = BASE_URL,
        port: Int = 443,
        path: String = ENDPOINT_TOP_RATED,
        apiKey: String = this.apiKey,
        pageNumber: Int
    ): TopRatedData {
        return flow<TopRatedData> {
            emit(httpClient.get {
                url(
                    scheme = scheme,
                    host = host,
                    port = port,
                    path = path
                ){
                    parameters.append("api_key", apiKey)
                    parameters.append("page", pageNumber.toString())
                }
            }.body())
        }.flowOn(
            backgroundDispatcher
        ).retry(retries = 3) { error ->
            if (error is RedirectResponseException) {
                val seconds = (2000).toLong()
                delay(seconds)
                return@retry true
            } else {
                return@retry false
            }
        }.single()
    }

    suspend fun getSimilarTvShows(
        scheme: String = "https",
        host: String = BASE_URL,
        port: Int = 443,
        path: String = ENDPOINT_SIMILAR,
        apiKey: String = this.apiKey,
        genreId: Int
    ): TopRatedData {
        return flow<TopRatedData> {
            emit(httpClient.get {
                url(
                    scheme = scheme,
                    host = host,
                    port = port,
                    path = String.format(path, genreId)
                ){
                    parameters.append("api_key", apiKey)
                }
            }.body())
        }.flowOn(
            backgroundDispatcher
        ).retry(retries = 3) { error ->
            if (error is RedirectResponseException) {
                val seconds = (2000).toLong()
                delay(seconds)
                return@retry true
            } else {
                return@retry false
            }
        }.single()
    }
}