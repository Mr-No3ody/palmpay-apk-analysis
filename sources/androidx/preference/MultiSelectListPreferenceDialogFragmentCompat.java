package androidx.preference;

import android.os.Bundle;
import androidx.appcompat.app.C0833k;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet f17536j = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence[] f17538p;
    public CharSequence[] t;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void i(boolean z3) {
        if (z3 && this.f17537o) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) g();
            multiSelectListPreference.getClass();
            multiSelectListPreference.x(this.f17536j);
        }
        this.f17537o = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void j(C0833k c0833k) {
        int length = this.t.length;
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            zArr[i7] = this.f17536j.contains(this.t[i7].toString());
        }
        c0833k.setMultiChoiceItems(this.f17538p, zArr, new i(this));
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        HashSet hashSet = this.f17536j;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f17537o = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f17538p = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.t = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) g();
        if (multiSelectListPreference.f17532I0 == null || (charSequenceArr = multiSelectListPreference.f17533J0) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f17534K0);
        this.f17537o = false;
        this.f17538p = multiSelectListPreference.f17532I0;
        this.t = charSequenceArr;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f17536j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f17537o);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f17538p);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.t);
    }
}
