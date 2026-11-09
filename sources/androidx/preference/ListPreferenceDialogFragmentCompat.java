package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0833k;

/* JADX INFO: loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17529j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence[] f17530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence[] f17531p;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void i(boolean z3) {
        int i7;
        if (!z3 || (i7 = this.f17529j) < 0) {
            return;
        }
        String string = this.f17531p[i7].toString();
        ListPreference listPreference = (ListPreference) g();
        listPreference.getClass();
        listPreference.x(string);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void j(C0833k c0833k) {
        c0833k.setSingleChoiceItems(this.f17530o, this.f17529j, new g(this, 0));
        c0833k.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        int length;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f17529j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f17530o = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f17531p = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) g();
        if (listPreference.f17523I0 == null || (charSequenceArr = listPreference.f17524J0) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        String str = listPreference.f17525K0;
        if (str == null || charSequenceArr == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!charSequenceArr[length].equals(str)) {
                    length--;
                }
            }
            length = -1;
        }
        this.f17529j = length;
        this.f17530o = listPreference.f17523I0;
        this.f17531p = charSequenceArr;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f17529j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f17530o);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f17531p);
    }
}
