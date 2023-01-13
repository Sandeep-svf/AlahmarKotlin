package com.sam.alahmarkotlin.retrofit

import com.sam.alahmarkotlin.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface api {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}