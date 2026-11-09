package androidx.preference;

import android.text.TextUtils;

/* JADX INFO: renamed from: androidx.preference.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1221f implements Preference.SummaryProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1221f f17630a;

    @Override // androidx.preference.Preference.SummaryProvider
    public final CharSequence provideSummary(Preference preference) {
        int length;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        CharSequence[] charSequenceArr3;
        CharSequence[] charSequenceArr4;
        ListPreference listPreference = (ListPreference) preference;
        String str = listPreference.f17525K0;
        int i7 = -1;
        if (str == null || (charSequenceArr4 = listPreference.f17524J0) == null) {
            length = -1;
            break;
        }
        length = charSequenceArr4.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            if (charSequenceArr4[length].equals(str)) {
                break;
            }
            length--;
        }
        if (TextUtils.isEmpty((length < 0 || (charSequenceArr3 = listPreference.f17523I0) == null) ? null : charSequenceArr3[length])) {
            return listPreference.f17551a.getString(z.not_set);
        }
        String str2 = listPreference.f17525K0;
        if (str2 != null && (charSequenceArr2 = listPreference.f17524J0) != null) {
            for (int length2 = charSequenceArr2.length - 1; length2 >= 0; length2--) {
                if (charSequenceArr2[length2].equals(str2)) {
                    i7 = length2;
                    break;
                }
            }
        }
        if (i7 < 0 || (charSequenceArr = listPreference.f17523I0) == null) {
            return null;
        }
        return charSequenceArr[i7];
    }
}
