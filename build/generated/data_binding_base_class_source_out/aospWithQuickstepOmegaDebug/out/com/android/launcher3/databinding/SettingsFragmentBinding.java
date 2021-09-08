// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.launcher3.InsettableFrameLayout;
import com.android.launcher3.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class SettingsFragmentBinding implements ViewBinding {
  @NonNull
  private final InsettableFrameLayout rootView;

  @NonNull
  public final InsettableFrameLayout listContainer;

  private SettingsFragmentBinding(@NonNull InsettableFrameLayout rootView,
      @NonNull InsettableFrameLayout listContainer) {
    this.rootView = rootView;
    this.listContainer = listContainer;
  }

  @Override
  @NonNull
  public InsettableFrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.settings_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingsFragmentBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    InsettableFrameLayout listContainer = (InsettableFrameLayout) rootView;

    return new SettingsFragmentBinding((InsettableFrameLayout) rootView, listContainer);
  }
}
