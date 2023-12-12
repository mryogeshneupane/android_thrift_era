// Generated by view binder compiler. Do not edit!
package com.example.kelineyt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kelineyt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAccountOptionsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatButton buttonLoginAccountOptions;

  @NonNull
  public final AppCompatButton buttonRegisterAccountOptions;

  @NonNull
  public final ImageView themeImage;

  @NonNull
  public final TextView tvQuality;

  @NonNull
  public final TextView welcomeToThrift;

  private FragmentAccountOptionsBinding(@NonNull FrameLayout rootView,
      @NonNull AppCompatButton buttonLoginAccountOptions,
      @NonNull AppCompatButton buttonRegisterAccountOptions, @NonNull ImageView themeImage,
      @NonNull TextView tvQuality, @NonNull TextView welcomeToThrift) {
    this.rootView = rootView;
    this.buttonLoginAccountOptions = buttonLoginAccountOptions;
    this.buttonRegisterAccountOptions = buttonRegisterAccountOptions;
    this.themeImage = themeImage;
    this.tvQuality = tvQuality;
    this.welcomeToThrift = welcomeToThrift;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAccountOptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAccountOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_account_options, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAccountOptionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLoginAccountOptions;
      AppCompatButton buttonLoginAccountOptions = ViewBindings.findChildViewById(rootView, id);
      if (buttonLoginAccountOptions == null) {
        break missingId;
      }

      id = R.id.buttonRegisterAccountOptions;
      AppCompatButton buttonRegisterAccountOptions = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegisterAccountOptions == null) {
        break missingId;
      }

      id = R.id.themeImage;
      ImageView themeImage = ViewBindings.findChildViewById(rootView, id);
      if (themeImage == null) {
        break missingId;
      }

      id = R.id.tvQuality;
      TextView tvQuality = ViewBindings.findChildViewById(rootView, id);
      if (tvQuality == null) {
        break missingId;
      }

      id = R.id.welcomeToThrift;
      TextView welcomeToThrift = ViewBindings.findChildViewById(rootView, id);
      if (welcomeToThrift == null) {
        break missingId;
      }

      return new FragmentAccountOptionsBinding((FrameLayout) rootView, buttonLoginAccountOptions,
          buttonRegisterAccountOptions, themeImage, tvQuality, welcomeToThrift);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
