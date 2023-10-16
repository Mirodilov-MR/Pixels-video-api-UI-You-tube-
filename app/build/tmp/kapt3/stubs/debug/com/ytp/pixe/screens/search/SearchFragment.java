package com.ytp.pixe.screens.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.fragment.app.Fragment;
import com.ytp.pixe.R;
import com.ytp.pixe.databinding.FragmentSearchBinding;
import com.ytp.pixe.pixels.data.video.Video;
import com.ytp.pixe.utils.Constants;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/ytp/pixe/screens/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ytp/pixe/databinding/FragmentSearchBinding;", "videoAdapter", "Lcom/ytp/pixe/screens/search/SearchAdapter;", "getVideoAdapter", "()Lcom/ytp/pixe/screens/search/SearchAdapter;", "videoAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/ytp/pixe/screens/search/SearchViewModel;", "getViewModel", "()Lcom/ytp/pixe/screens/search/SearchViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "", "setObserves", "setViews", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private com.ytp.pixe.databinding.FragmentSearchBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy videoAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.ytp.pixe.screens.search.SearchFragment.Companion Companion = null;
    private static final java.lang.String ARG_CATEGORY_NAME = "category_name";
    
    public SearchFragment() {
        super();
    }
    
    private final com.ytp.pixe.screens.search.SearchViewModel getViewModel() {
        return null;
    }
    
    private final com.ytp.pixe.screens.search.SearchAdapter getVideoAdapter() {
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
    
    private final void setObserves() {
    }
    
    private final void setAdapter() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ytp/pixe/screens/search/SearchFragment$Companion;", "", "()V", "ARG_CATEGORY_NAME", "", "newInstance", "Lcom/ytp/pixe/screens/search/SearchFragment;", "categoryName", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ytp.pixe.screens.search.SearchFragment newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String categoryName) {
            return null;
        }
    }
}