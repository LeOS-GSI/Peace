// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.launcher3.R;
import com.android.launcher3.allapps.AllAppsRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;

public final class AllAppsRvLayoutBinding implements ViewBinding {
  @NonNull
  private final AllAppsRecyclerView rootView;

  @NonNull
  public final AllAppsRecyclerView appsListView;

  private AllAppsRvLayoutBinding(@NonNull AllAppsRecyclerView rootView,
      @NonNull AllAppsRecyclerView appsListView) {
    this.rootView = rootView;
    this.appsListView = appsListView;
  }

  @Override
  @NonNull
  public AllAppsRecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static AllAppsRvLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AllAppsRvLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.all_apps_rv_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AllAppsRvLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    AllAppsRecyclerView appsListView = (AllAppsRecyclerView) rootView;

    return new AllAppsRvLayoutBinding((AllAppsRecyclerView) rootView, appsListView);
  }
}
