package com.ytp.pixe.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.ytp.pixe.pixels.PixelApi
import com.ytp.pixe.pixels.data.video.Video
import com.ytp.pixe.screens.videos.VideoDataSource
import com.ytp.pixe.utils.PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class VideoRepository @Inject constructor(
    private val pixelApi: PixelApi
) {
    fun getVideos(): Flow<PagingData<Video>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PER_PAGE ),
            pagingSourceFactory = {
                VideoDataSource(query = null, apiService = pixelApi)
            }
        ).flow
    }
    fun search(query: String): Flow<PagingData<Video>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PER_PAGE),
            pagingSourceFactory = {
                VideoDataSource(query = query, apiService = pixelApi)
            }
        ).flow
    }
}