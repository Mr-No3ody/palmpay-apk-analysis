package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f17521j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f17522o;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void h(View view) {
        super.h(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f17521j = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f17521j.setText(this.f17522o);
        EditText editText2 = this.f17521j;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) g()).getClass();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void i(boolean z3) {
        if (z3) {
            String string = this.f17521j.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) g();
            editTextPreference.getClass();
            editTextPreference.x(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f17522o = ((EditTextPreference) g()).f17519I0;
        } else {
            this.f17522o = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f17522o);
    }
}
