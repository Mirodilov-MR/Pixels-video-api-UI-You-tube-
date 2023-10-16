package com.ytp.pixe.pixels

import com.ytp.pixe.pixels.data.video.PopularVideos
import com.ytp.pixe.pixels.data.video.VideoSearch
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PixelApi {

    @GET("videos/popular")
    @Headers("Authorization:$KEY")
    suspend fun getVideos(
        @Query("per_page") per_page: Int?,
        @Query("page") page: Int?,
    ): Response<PopularVideos>

    @GET("videos/search")
    @Headers("Authorization:$KEY")
    suspend fun searchVideo(
        @Query("query") query: String,
        @Query("per_page") per_page: Int?,
    ): Response<VideoSearch>
}