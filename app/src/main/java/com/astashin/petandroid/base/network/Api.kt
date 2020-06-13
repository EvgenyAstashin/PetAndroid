package com.astashin.petandroid.base.network

import com.astashin.petandroid.base.model.Comic
import com.astashin.petandroid.base.model.Data
import com.astashin.petandroid.base.model.Character
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("v1/public/comics")
    fun loadComics(@Query("dateRange") dateRange: String, @Query("offset") offset: Int, @Query("limit") limit: Int): ApiResponse<Data<Comic>>

    @GET("v1/public/comics/{comicId}/characters")
    fun loadCharacters(@Path("comicId") comicId: Int, @Query("limit") limit: Int): ApiResponse<Data<Character>>
}