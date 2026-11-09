package androidx.preference;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat f17633a;

    public i(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.f17633a = multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i7, boolean z3) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.f17633a;
        if (z3) {
            multiSelectListPreferenceDialogFragmentCompat.f17537o = multiSelectListPreferenceDialogFragmentCompat.f17536j.add(multiSelectListPreferenceDialogFragmentCompat.t[i7].toString()) | multiSelectListPreferenceDialogFragmentCompat.f17537o;
        } else {
            multiSelectListPreferenceDialogFragmentCompat.f17537o = multiSelectListPreferenceDialogFragmentCompat.f17536j.remove(multiSelectListPreferenceDialogFragmentCompat.t[i7].toString()) | multiSelectListPreferenceDialogFragmentCompat.f17537o;
        }
    }
}
