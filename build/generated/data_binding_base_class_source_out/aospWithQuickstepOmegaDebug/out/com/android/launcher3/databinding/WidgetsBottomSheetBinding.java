// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import com.android.launcher3.widget.WidgetsBottomSheet;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WidgetsBottomSheetBinding implements ViewBinding {
  @NonNull
  private final WidgetsBottomSheet rootView;

  @NonNull
  public final TextView title;

  @NonNull
  public final WidgetsScrollContainerBinding widgets;

  private WidgetsBottomSheetBinding(@NonNull WidgetsBottomSheet rootView, @NonNull TextView title,
      @NonNull WidgetsScrollContainerBinding widgets) {
    this.rootView = rootView;
    this.title = title;
    this.widgets = widgets;
  }

  @Override
  @NonNull
  public WidgetsBottomSheet getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetsBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widgets_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetsBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.widgets;
      View widgets = ViewBindings.findChildViewById(rootView, id);
      if (widgets == null) {
        break missingId;
      }
      WidgetsScrollContainerBinding binding_widgets = WidgetsScrollContainerBinding.bind(widgets);

      return new WidgetsBottomSheetBinding((WidgetsBottomSheet) rootView, title, binding_widgets);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
