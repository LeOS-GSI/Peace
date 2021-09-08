// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.internal.PreferenceImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppGroupsAdapterAddBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final PreferenceImageView icon;

  @NonNull
  public final LinearLayout iconFrame;

  @NonNull
  public final TextView title;

  private AppGroupsAdapterAddBinding(@NonNull LinearLayout rootView,
      @NonNull PreferenceImageView icon, @NonNull LinearLayout iconFrame, @NonNull TextView title) {
    this.rootView = rootView;
    this.icon = icon;
    this.iconFrame = iconFrame;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppGroupsAdapterAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppGroupsAdapterAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.app_groups_adapter_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppGroupsAdapterAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = android.R.id.icon;
      PreferenceImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.icon_frame;
      LinearLayout iconFrame = ViewBindings.findChildViewById(rootView, id);
      if (iconFrame == null) {
        break missingId;
      }

      id = android.R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new AppGroupsAdapterAddBinding((LinearLayout) rootView, icon, iconFrame, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
