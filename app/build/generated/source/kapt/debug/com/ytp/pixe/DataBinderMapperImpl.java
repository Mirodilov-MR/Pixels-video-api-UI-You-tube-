package com.ytp.pixe;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ytp.pixe.databinding.AppBarBindingImpl;
import com.ytp.pixe.databinding.CollectionsBindingImpl;
import com.ytp.pixe.databinding.FragmentSearchBindingImpl;
import com.ytp.pixe.databinding.ItemLoadStateBindingImpl;
import com.ytp.pixe.databinding.ItemVideoBindingImpl;
import com.ytp.pixe.databinding.VideosBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_APPBAR = 1;

  private static final int LAYOUT_COLLECTIONS = 2;

  private static final int LAYOUT_FRAGMENTSEARCH = 3;

  private static final int LAYOUT_ITEMLOADSTATE = 4;

  private static final int LAYOUT_ITEMVIDEO = 5;

  private static final int LAYOUT_VIDEOS = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ytp.pixe.R.layout.app_bar, LAYOUT_APPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ytp.pixe.R.layout.collections, LAYOUT_COLLECTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ytp.pixe.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ytp.pixe.R.layout.item_load_state, LAYOUT_ITEMLOADSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ytp.pixe.R.layout.item_video, LAYOUT_ITEMVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ytp.pixe.R.layout.videos, LAYOUT_VIDEOS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_APPBAR: {
          if ("layout/app_bar_0".equals(tag)) {
            return new AppBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_COLLECTIONS: {
          if ("layout/collections_0".equals(tag)) {
            return new CollectionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for collections is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLOADSTATE: {
          if ("layout/item_load_state_0".equals(tag)) {
            return new ItemLoadStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_load_state is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIDEO: {
          if ("layout/item_video_0".equals(tag)) {
            return new ItemVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_video is invalid. Received: " + tag);
        }
        case  LAYOUT_VIDEOS: {
          if ("layout/videos_0".equals(tag)) {
            return new VideosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for videos is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "video");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/app_bar_0", com.ytp.pixe.R.layout.app_bar);
      sKeys.put("layout/collections_0", com.ytp.pixe.R.layout.collections);
      sKeys.put("layout/fragment_search_0", com.ytp.pixe.R.layout.fragment_search);
      sKeys.put("layout/item_load_state_0", com.ytp.pixe.R.layout.item_load_state);
      sKeys.put("layout/item_video_0", com.ytp.pixe.R.layout.item_video);
      sKeys.put("layout/videos_0", com.ytp.pixe.R.layout.videos);
    }
  }
}
