package com.ytp.pixe.screens.videos

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.ytp.pixe.pixels.data.video.Video
import com.ytp.pixe.CategoryItem
import com.ytp.pixe.R
import com.ytp.pixe.repository.VideoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class VideosViewModel @Inject constructor(
    private val repository: VideoRepository,
    private val context: Context
) : ViewModel() {
    private val _videos = MutableLiveData<Flow<PagingData<Video>?>>()
    val videos = _videos
    private val _categoryList = MutableLiveData<List<CategoryItem>>()
    val categoryList = _categoryList
    init {
        getData()
        _categoryList.value = listOf(
            CategoryItem(context.getString(R.string.category_all)),
            CategoryItem(context.getString(R.string.category_game)),
            CategoryItem(context.getString(R.string.category_music)),
            CategoryItem(context.getString(R.string.category_movie)),
            CategoryItem(context.getString(R.string.category_sports)),
            CategoryItem(context.getString(R.string.category_funny)),
            CategoryItem(context.getString(R.string.category_tvShows)),
            CategoryItem(context.getString(R.string.category_trailer)),
            CategoryItem(context.getString(R.string.category_programming))
        )
    }
    fun getData() {
        _videos.value = repository.getVideos().cachedIn(viewModelScope)
    }
    fun search(query: String) {
        _videos.value = repository.search(query).cachedIn(viewModelScope)
    }
}
