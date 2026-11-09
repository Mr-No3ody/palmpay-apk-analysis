package androidx.preference;

import android.text.TextUtils;

/* JADX INFO: renamed from: androidx.preference.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1218c implements Preference.SummaryProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1218c f17628a;

    @Override // androidx.preference.Preference.SummaryProvider
    public final CharSequence provideSummary(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (!TextUtils.isEmpty(editTextPreference.f17519I0)) {
            return editTextPreference.f17519I0;
        }
        return editTextPreference.f17551a.getString(z.not_set);
    }
}
