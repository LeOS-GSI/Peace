// Generated by view binder compiler. Do not edit!
package com.android.launcher3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.launcher3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AboutLicenseBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final WebView webviewLicense;

  private AboutLicenseBinding(@NonNull View rootView, @NonNull WebView webviewLicense) {
    this.rootView = rootView;
    this.webviewLicense = webviewLicense;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static AboutLicenseBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.about_license, parent);
    return bind(parent);
  }

  @NonNull
  public static AboutLicenseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.webview_license;
      WebView webviewLicense = ViewBindings.findChildViewById(rootView, id);
      if (webviewLicense == null) {
        break missingId;
      }

      return new AboutLicenseBinding(rootView, webviewLicense);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
