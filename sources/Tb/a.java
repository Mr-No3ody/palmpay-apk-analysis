package Tb;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9065a;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f9065a) {
            case 0:
                return (charSequence == null || new Regex("[^a-zA-Z0-9_\\-\\.\\@/]+").b(charSequence)) ? "" : charSequence;
            default:
                for (int i13 = i7; i13 < i10; i13++) {
                    if (!Character.isLetterOrDigit(charSequence.charAt(i13))) {
                        return "";
                    }
                }
                int length = 10 - (spanned.length() - (i12 - i11));
                if (length <= 0) {
                    return "";
                }
                if (length >= i10 - i7) {
                    return null;
                }
                return charSequence.subSequence(i7, length + i7);
        }
    }
}
