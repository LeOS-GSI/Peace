// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppsSearchQsbTemplateBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView gIcon;

  @NonNull
  public final ImageView micIcon;

  @NonNull
  public final ImageView qsbBackground1;

  @NonNull
  public final ImageView qsbBackground2;

  @NonNull
  public final ImageView qsbBackground3;

  @NonNull
  public final LinearLayout qsbBackgroundContainer;

  @NonNull
  public final FrameLayout qsbIconContainer;

  private AppsSearchQsbTemplateBinding(@NonNull FrameLayout rootView, @NonNull ImageView gIcon,
      @NonNull ImageView micIcon, @NonNull ImageView qsbBackground1,
      @NonNull ImageView qsbBackground2, @NonNull ImageView qsbBackground3,
      @NonNull LinearLayout qsbBackgroundContainer, @NonNull FrameLayout qsbIconContainer) {
    this.rootView = rootView;
    this.gIcon = gIcon;
    this.micIcon = micIcon;
    this.qsbBackground1 = qsbBackground1;
    this.qsbBackground2 = qsbBackground2;
    this.qsbBackground3 = qsbBackground3;
    this.qsbBackgroundContainer = qsbBackgroundContainer;
    this.qsbIconContainer = qsbIconContainer;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppsSearchQsbTemplateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppsSearchQsbTemplateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.apps_search_qsb_template, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppsSearchQsbTemplateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.g_icon;
      ImageView gIcon = ViewBindings.findChildViewById(rootView, id);
      if (gIcon == null) {
        break missingId;
      }

      id = R.id.mic_icon;
      ImageView micIcon = ViewBindings.findChildViewById(rootView, id);
      if (micIcon == null) {
        break missingId;
      }

      id = R.id.qsb_background_1;
      ImageView qsbBackground1 = ViewBindings.findChildViewById(rootView, id);
      if (qsbBackground1 == null) {
        break missingId;
      }

      id = R.id.qsb_background_2;
      ImageView qsbBackground2 = ViewBindings.findChildViewById(rootView, id);
      if (qsbBackground2 == null) {
        break missingId;
      }

      id = R.id.qsb_background_3;
      ImageView qsbBackground3 = ViewBindings.findChildViewById(rootView, id);
      if (qsbBackground3 == null) {
        break missingId;
      }

      id = R.id.qsb_background_container;
      LinearLayout qsbBackgroundContainer = ViewBindings.findChildViewById(rootView, id);
      if (qsbBackgroundContainer == null) {
        break missingId;
      }

      id = R.id.qsb_icon_container;
      FrameLayout qsbIconContainer = ViewBindings.findChildViewById(rootView, id);
      if (qsbIconContainer == null) {
        break missingId;
      }

      return new AppsSearchQsbTemplateBinding((FrameLayout) rootView, gIcon, micIcon,
          qsbBackground1, qsbBackground2, qsbBackground3, qsbBackgroundContainer, qsbIconContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
