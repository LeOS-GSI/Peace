// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DrawerTabFlowerpotRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AppCompatImageView categoryIcon;

  @NonNull
  public final AppCompatTextView categoryTitle;

  @NonNull
  public final AppCompatTextView currentCategory;

  @NonNull
  public final LinearLayoutCompat selectCategory;

  private DrawerTabFlowerpotRowBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AppCompatImageView categoryIcon, @NonNull AppCompatTextView categoryTitle,
      @NonNull AppCompatTextView currentCategory, @NonNull LinearLayoutCompat selectCategory) {
    this.rootView = rootView;
    this.categoryIcon = categoryIcon;
    this.categoryTitle = categoryTitle;
    this.currentCategory = currentCategory;
    this.selectCategory = selectCategory;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerTabFlowerpotRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerTabFlowerpotRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer_tab_flowerpot_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerTabFlowerpotRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_icon;
      AppCompatImageView categoryIcon = ViewBindings.findChildViewById(rootView, id);
      if (categoryIcon == null) {
        break missingId;
      }

      id = R.id.category_title;
      AppCompatTextView categoryTitle = ViewBindings.findChildViewById(rootView, id);
      if (categoryTitle == null) {
        break missingId;
      }

      id = R.id.current_category;
      AppCompatTextView currentCategory = ViewBindings.findChildViewById(rootView, id);
      if (currentCategory == null) {
        break missingId;
      }

      LinearLayoutCompat selectCategory = (LinearLayoutCompat) rootView;

      return new DrawerTabFlowerpotRowBinding((LinearLayoutCompat) rootView, categoryIcon,
          categoryTitle, currentCategory, selectCategory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
