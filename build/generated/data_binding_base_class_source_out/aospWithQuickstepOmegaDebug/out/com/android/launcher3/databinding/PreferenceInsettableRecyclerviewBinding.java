// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.launcher3.R;
import com.saggitt.omega.views.PreferenceRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;

public final class PreferenceInsettableRecyclerviewBinding implements ViewBinding {
  @NonNull
  private final PreferenceRecyclerView rootView;

  @NonNull
  public final PreferenceRecyclerView list;

  private PreferenceInsettableRecyclerviewBinding(@NonNull PreferenceRecyclerView rootView,
      @NonNull PreferenceRecyclerView list) {
    this.rootView = rootView;
    this.list = list;
  }

  @Override
  @NonNull
  public PreferenceRecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static PreferenceInsettableRecyclerviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PreferenceInsettableRecyclerviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.preference_insettable_recyclerview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PreferenceInsettableRecyclerviewBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    PreferenceRecyclerView list = (PreferenceRecyclerView) rootView;

    return new PreferenceInsettableRecyclerviewBinding((PreferenceRecyclerView) rootView, list);
  }
}
