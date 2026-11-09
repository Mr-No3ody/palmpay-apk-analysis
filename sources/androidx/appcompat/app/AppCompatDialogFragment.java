package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new K(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    @RestrictTo({p192n.c.f39802c})
    public void setupDialog(@NonNull Dialog dialog, int i7) {
        if (!(dialog instanceof K)) {
            super.setupDialog(dialog, i7);
            return;
        }
        K k2 = (K) dialog;
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        k2.supportRequestWindowFeature(1);
    }
}
