// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.LauncherRootView;
import com.android.launcher3.R;
import com.android.quickstep.fallback.FallbackRecentsView;
import com.android.quickstep.fallback.RecentsDragLayer;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FallbackRecentsActivityBinding implements ViewBinding {
  @NonNull
  private final LauncherRootView rootView;

  @NonNull
  public final RecentsDragLayer dragLayer;

  @NonNull
  public final OverviewActionsContainerBinding overviewActionsView;

  @NonNull
  public final FallbackRecentsView overviewPanel;

  private FallbackRecentsActivityBinding(@NonNull LauncherRootView rootView,
      @NonNull RecentsDragLayer dragLayer,
      @NonNull OverviewActionsContainerBinding overviewActionsView,
      @NonNull FallbackRecentsView overviewPanel) {
    this.rootView = rootView;
    this.dragLayer = dragLayer;
    this.overviewActionsView = overviewActionsView;
    this.overviewPanel = overviewPanel;
  }

  @Override
  @NonNull
  public LauncherRootView getRoot() {
    return rootView;
  }

  @NonNull
  public static FallbackRecentsActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FallbackRecentsActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fallback_recents_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FallbackRecentsActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.drag_layer;
      RecentsDragLayer dragLayer = ViewBindings.findChildViewById(rootView, id);
      if (dragLayer == null) {
        break missingId;
      }

      id = R.id.overview_actions_view;
      View overviewActionsView = ViewBindings.findChildViewById(rootView, id);
      if (overviewActionsView == null) {
        break missingId;
      }
      OverviewActionsContainerBinding binding_overviewActionsView = OverviewActionsContainerBinding.bind(overviewActionsView);

      id = R.id.overview_panel;
      FallbackRecentsView overviewPanel = ViewBindings.findChildViewById(rootView, id);
      if (overviewPanel == null) {
        break missingId;
      }

      return new FallbackRecentsActivityBinding((LauncherRootView) rootView, dragLayer,
          binding_overviewActionsView, overviewPanel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
