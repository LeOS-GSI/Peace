// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DrawerTabEditBottomSheetBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AppCompatButton cancel;

  @NonNull
  public final LinearLayoutCompat customizationContainer;

  @NonNull
  public final AppCompatButton save;

  private DrawerTabEditBottomSheetBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AppCompatButton cancel, @NonNull LinearLayoutCompat customizationContainer,
      @NonNull AppCompatButton save) {
    this.rootView = rootView;
    this.cancel = cancel;
    this.customizationContainer = customizationContainer;
    this.save = save;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerTabEditBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerTabEditBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer_tab_edit_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerTabEditBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel;
      AppCompatButton cancel = ViewBindings.findChildViewById(rootView, id);
      if (cancel == null) {
        break missingId;
      }

      LinearLayoutCompat customizationContainer = (LinearLayoutCompat) rootView;

      id = R.id.save;
      AppCompatButton save = ViewBindings.findChildViewById(rootView, id);
      if (save == null) {
        break missingId;
      }

      return new DrawerTabEditBottomSheetBinding((LinearLayoutCompat) rootView, cancel,
          customizationContainer, save);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
