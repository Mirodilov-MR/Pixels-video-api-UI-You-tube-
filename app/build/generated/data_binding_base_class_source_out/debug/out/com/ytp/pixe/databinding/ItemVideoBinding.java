// Generated by data binding compiler. Do not edit!
package com.ytp.pixe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ytp.pixe.R;
import com.ytp.pixe.pixels.data.video.Video;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemVideoBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final CircleImageView channelProfileImg;

  @NonNull
  public final ImageView item;

  @NonNull
  public final ImageView share;

  @NonNull
  public final TextView videoDateAndViews;

  @NonNull
  public final TextView videoName;

  @Bindable
  protected Video mVideo;

  protected ItemVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, CircleImageView channelProfileImg, ImageView item, ImageView share,
      TextView videoDateAndViews, TextView videoName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.channelProfileImg = channelProfileImg;
    this.item = item;
    this.share = share;
    this.videoDateAndViews = videoDateAndViews;
    this.videoName = videoName;
  }

  public abstract void setVideo(@Nullable Video video);

  @Nullable
  public Video getVideo() {
    return mVideo;
  }

  @NonNull
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemVideoBinding>inflateInternal(inflater, R.layout.item_video, root, attachToRoot, component);
  }

  @NonNull
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemVideoBinding>inflateInternal(inflater, R.layout.item_video, null, false, component);
  }

  public static ItemVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemVideoBinding)bind(component, view, R.layout.item_video);
  }
}
