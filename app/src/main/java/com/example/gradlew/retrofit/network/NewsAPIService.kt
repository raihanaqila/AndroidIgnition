package com.example.gradlew.retrofit.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

val BASE_URL="https://newsapi.org/v2/"

val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {

    @GET("top-headlines?country=us&apiKey=8545a8cb50b4454c8dd2c195e892e94a")
    suspend fun getTopHeadline(): String

    @GET("everything?q=tesla&from=2022-10-10&sortBy=publishedAt&apiKey=8545a8cb50b4454c8dd2c195e892e94a")
    suspend fun getEverything(): String
}

object NewsApi {
    val retrofitService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}