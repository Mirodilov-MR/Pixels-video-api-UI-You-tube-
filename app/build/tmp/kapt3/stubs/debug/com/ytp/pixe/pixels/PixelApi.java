package com.ytp.pixe.pixels;

import com.ytp.pixe.pixels.data.video.PopularVideos;
import com.ytp.pixe.pixels.data.video.VideoSearch;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/ytp/pixe/pixels/PixelApi;", "", "getVideos", "Lretrofit2/Response;", "Lcom/ytp/pixe/pixels/data/video/PopularVideos;", "per_page", "", "page", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchVideo", "Lcom/ytp/pixe/pixels/data/video/VideoSearch;", "query", "", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PixelApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.Headers(value = {"Authorization:M6igXuUE4FiwdPbe68mnygSGaeUfPL3x3Suy5kf5WGkFFPaS0pbLOsI5"})
    @retrofit2.http.GET(value = "videos/popular")
    public abstract java.lang.Object getVideos(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ytp.pixe.pixels.data.video.PopularVideos>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.Headers(value = {"Authorization:M6igXuUE4FiwdPbe68mnygSGaeUfPL3x3Suy5kf5WGkFFPaS0pbLOsI5"})
    @retrofit2.http.GET(value = "videos/search")
    public abstract java.lang.Object searchVideo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ytp.pixe.pixels.data.video.VideoSearch>> continuation);
}