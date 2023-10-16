package com.ytp.pixe.screens.videos;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.ytp.pixe.databinding.ItemVideoBinding;
import com.ytp.pixe.pixels.data.video.Video;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0014\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/ytp/pixe/screens/videos/VideoAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/ytp/pixe/pixels/data/video/Video;", "Lcom/ytp/pixe/screens/videos/VideoAdapter$NoteViewHolder;", "()V", "listener", "Lcom/ytp/pixe/screens/videos/VideoAdapter$VideoListener;", "getListener", "()Lcom/ytp/pixe/screens/videos/VideoAdapter$VideoListener;", "setListener", "(Lcom/ytp/pixe/screens/videos/VideoAdapter$VideoListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NoteDiffUtil", "NoteViewHolder", "VideoListener", "app_debug"})
public final class VideoAdapter extends androidx.paging.PagingDataAdapter<com.ytp.pixe.pixels.data.video.Video, com.ytp.pixe.screens.videos.VideoAdapter.NoteViewHolder> {
    public com.ytp.pixe.screens.videos.VideoAdapter.VideoListener listener;
    
    public VideoAdapter() {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ytp.pixe.screens.videos.VideoAdapter.VideoListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull
    com.ytp.pixe.screens.videos.VideoAdapter.VideoListener p0) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.ytp.pixe.screens.videos.VideoAdapter.NoteViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.ytp.pixe.screens.videos.VideoAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ytp/pixe/screens/videos/VideoAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ytp/pixe/databinding/ItemVideoBinding;", "(Lcom/ytp/pixe/screens/videos/VideoAdapter;Lcom/ytp/pixe/databinding/ItemVideoBinding;)V", "bind", "", "data", "Lcom/ytp/pixe/pixels/data/video/Video;", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.ytp.pixe.databinding.ItemVideoBinding binding = null;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull
        com.ytp.pixe.databinding.ItemVideoBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.ytp.pixe.pixels.data.video.Video data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/ytp/pixe/screens/videos/VideoAdapter$NoteDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ytp/pixe/pixels/data/video/Video;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class NoteDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ytp.pixe.pixels.data.video.Video> {
        
        public NoteDiffUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.ytp.pixe.pixels.data.video.Video oldItem, @org.jetbrains.annotations.NotNull
        com.ytp.pixe.pixels.data.video.Video newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.ytp.pixe.pixels.data.video.Video oldItem, @org.jetbrains.annotations.NotNull
        com.ytp.pixe.pixels.data.video.Video newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ytp/pixe/screens/videos/VideoAdapter$VideoListener;", "", "onClick", "", "video", "Lcom/ytp/pixe/pixels/data/video/Video;", "app_debug"})
    public static abstract interface VideoListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        com.ytp.pixe.pixels.data.video.Video video);
    }
}