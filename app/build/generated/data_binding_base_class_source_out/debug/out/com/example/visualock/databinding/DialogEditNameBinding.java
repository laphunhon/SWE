// Generated by view binder compiler. Do not edit!
package com.example.visualock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.visualock.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogEditNameBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final TextView dialogTitle;

  @NonNull
  public final EditText etNewName;

  private DialogEditNameBinding(@NonNull LinearLayout rootView, @NonNull Button btnCancel,
      @NonNull Button btnSave, @NonNull TextView dialogTitle, @NonNull EditText etNewName) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnSave = btnSave;
    this.dialogTitle = dialogTitle;
    this.etNewName = etNewName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogEditNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogEditNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_edit_name, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogEditNameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.dialogTitle;
      TextView dialogTitle = ViewBindings.findChildViewById(rootView, id);
      if (dialogTitle == null) {
        break missingId;
      }

      id = R.id.et_new_name;
      EditText etNewName = ViewBindings.findChildViewById(rootView, id);
      if (etNewName == null) {
        break missingId;
      }

      return new DialogEditNameBinding((LinearLayout) rootView, btnCancel, btnSave, dialogTitle,
          etNewName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
