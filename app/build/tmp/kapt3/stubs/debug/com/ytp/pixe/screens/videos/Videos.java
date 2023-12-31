package com.ytp.pixe.screens.videos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ytp.pixe.CategoryAdapter;
import com.ytp.pixe.CategoryItem;
import com.ytp.pixe.R;
import com.ytp.pixe.databinding.VideosBinding;
import com.ytp.pixe.pixels.data.video.Video;
import com.ytp.pixe.utils.Constants;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/ytp/pixe/screens/videos/Videos;", "Landroidx/fragment/app/Fragment;", "Lcom/ytp/pixe/CategoryAdapter$CategoryClickListener;", "()V", "binding", "Lcom/ytp/pixe/databinding/VideosBinding;", "videoAdapter", "Lcom/ytp/pixe/screens/videos/VideoAdapter;", "getVideoAdapter", "()Lcom/ytp/pixe/screens/videos/VideoAdapter;", "videoAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/ytp/pixe/screens/videos/VideosViewModel;", "getViewModel", "()Lcom/ytp/pixe/screens/videos/VideosViewModel;", "viewModel$delegate", "onCategoryClick", "", "categoryItem", "Lcom/ytp/pixe/CategoryItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setObserves", "setViews", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class Videos extends androidx.fragment.app.Fragment implements com.ytp.pixe.CategoryAdapter.CategoryClickListener {
    private com.ytp.pixe.databinding.VideosBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy videoAdapter$delegate = null;
    
    public Videos() {
        super();
    }
    
    private final com.ytp.pixe.screens.videos.VideosViewModel getViewModel() {
        return null;
    }
    
    private final com.ytp.pixe.screens.videos.VideoAdapter getVideoAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setViews() {
    }
    
    @java.lang.Override
    public void onCategoryClick(@org.jetbrains.annotations.NotNull
    com.ytp.pixe.CategoryItem categoryItem) {
    }
    
    private final void setObserves() {
    }
    
    private final void setAdapter() {
    }
}