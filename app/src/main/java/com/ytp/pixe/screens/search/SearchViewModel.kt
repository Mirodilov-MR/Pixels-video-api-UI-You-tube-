package com.ytp.pixe.screens.search

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.ytp.pixe.pixels.data.video.Video
import com.ytp.pixe.repository.VideoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: VideoRepository,
    private val context: Context
) : ViewModel() {
    private val _videos = MutableLiveData<Flow<PagingData<Video>?>>()
    val videos = _videos
    fun getData() {
        _videos.value = repository.getVideos().cachedIn(viewModelScope)
    }

    fun search(query: String) {
        _videos.value = repository.search(query).cachedIn(viewModelScope)
    }
}