// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.R;
import com.google.android.apps.nexuslauncher.superg.QsbBlockerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class QsbBlockerViewBinding implements ViewBinding {
  @NonNull
  private final QsbBlockerView rootView;

  @NonNull
  public final BubbleTextView dummyBubbleTextView;

  private QsbBlockerViewBinding(@NonNull QsbBlockerView rootView,
      @NonNull BubbleTextView dummyBubbleTextView) {
    this.rootView = rootView;
    this.dummyBubbleTextView = dummyBubbleTextView;
  }

  @Override
  @NonNull
  public QsbBlockerView getRoot() {
    return rootView;
  }

  @NonNull
  public static QsbBlockerViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QsbBlockerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.qsb_blocker_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QsbBlockerViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dummyBubbleTextView;
      BubbleTextView dummyBubbleTextView = ViewBindings.findChildViewById(rootView, id);
      if (dummyBubbleTextView == null) {
        break missingId;
      }

      return new QsbBlockerViewBinding((QsbBlockerView) rootView, dummyBubbleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
