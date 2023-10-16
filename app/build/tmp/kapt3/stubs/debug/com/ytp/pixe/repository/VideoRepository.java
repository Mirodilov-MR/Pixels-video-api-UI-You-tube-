package com.ytp.pixe.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.ytp.pixe.pixels.PixelApi;
import com.ytp.pixe.pixels.data.video.Video;
import com.ytp.pixe.screens.videos.VideoDataSource;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ytp/pixe/repository/VideoRepository;", "", "pixelApi", "Lcom/ytp/pixe/pixels/PixelApi;", "(Lcom/ytp/pixe/pixels/PixelApi;)V", "getVideos", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/ytp/pixe/pixels/data/video/Video;", "search", "query", "", "app_debug"})
public final class VideoRepository {
    private final com.ytp.pixe.pixels.PixelApi pixelApi = null;
    
    @javax.inject.Inject
    public VideoRepository(@org.jetbrains.annotations.NotNull
    com.ytp.pixe.pixels.PixelApi pixelApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.ytp.pixe.pixels.data.video.Video>> getVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.ytp.pixe.pixels.data.video.Video>> search(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
}