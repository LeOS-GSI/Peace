// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import com.android.launcher3.dragndrop.LivePreviewWidgetCell;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddItemConfirmationActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LivePreviewWidgetCell widgetCell;

  private AddItemConfirmationActivityBinding(@NonNull LinearLayout rootView,
      @NonNull LivePreviewWidgetCell widgetCell) {
    this.rootView = rootView;
    this.widgetCell = widgetCell;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddItemConfirmationActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddItemConfirmationActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_item_confirmation_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddItemConfirmationActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.widget_cell;
      LivePreviewWidgetCell widgetCell = ViewBindings.findChildViewById(rootView, id);
      if (widgetCell == null) {
        break missingId;
      }

      return new AddItemConfirmationActivityBinding((LinearLayout) rootView, widgetCell);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
