// Generated by view binder compiler. Do not edit!
package com.example.kelineyt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kelineyt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddressRvItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton buttonAddress;

  private AddressRvItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton buttonAddress) {
    this.rootView = rootView;
    this.buttonAddress = buttonAddress;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddressRvItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddressRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.address_rv_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddressRvItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAddress;
      AppCompatButton buttonAddress = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddress == null) {
        break missingId;
      }

      return new AddressRvItemBinding((ConstraintLayout) rootView, buttonAddress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}