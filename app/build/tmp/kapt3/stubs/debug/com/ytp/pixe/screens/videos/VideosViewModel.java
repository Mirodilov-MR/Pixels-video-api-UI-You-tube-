package com.ytp.pixe.screens.videos;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.ytp.pixe.pixels.data.video.Video;
import com.ytp.pixe.CategoryItem;
import com.ytp.pixe.R;
import com.ytp.pixe.repository.VideoRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/ytp/pixe/screens/videos/VideosViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ytp/pixe/repository/VideoRepository;", "context", "Landroid/content/Context;", "(Lcom/ytp/pixe/repository/VideoRepository;Landroid/content/Context;)V", "_categoryList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ytp/pixe/CategoryItem;", "_videos", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/ytp/pixe/pixels/data/video/Video;", "categoryList", "getCategoryList", "()Landroidx/lifecycle/MutableLiveData;", "videos", "getVideos", "getData", "", "search", "query", "", "app_debug"})
public final class VideosViewModel extends androidx.lifecycle.ViewModel {
    private final com.ytp.pixe.repository.VideoRepository repository = null;
    private final android.content.Context context = null;
    private final androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.ytp.pixe.pixels.data.video.Video>>> _videos = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.ytp.pixe.pixels.data.video.Video>>> videos = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ytp.pixe.CategoryItem>> _categoryList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ytp.pixe.CategoryItem>> categoryList = null;
    
    @javax.inject.Inject
    public VideosViewModel(@org.jetbrains.annotations.NotNull
    com.ytp.pixe.repository.VideoRepository repository, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.ytp.pixe.pixels.data.video.Video>>> getVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ytp.pixe.CategoryItem>> getCategoryList() {
        return null;
    }
    
    public final void getData() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
}