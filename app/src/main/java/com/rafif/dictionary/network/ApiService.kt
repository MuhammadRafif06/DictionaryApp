package com.rafif.dictionary.network

import com.rafif.dictionary.data.ResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("en/{word}")
    fun getUser(@Path("word") word: String): Call<ArrayList<ResponseItem>>
}