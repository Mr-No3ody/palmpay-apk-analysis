package Tb;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9069b;

    public /* synthetic */ c(int i7, int i10) {
        this.f9068a = i10;
        this.f9069b = i7;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i7, int i10, Spanned dest, int i11, int i12) {
        switch (this.f9068a) {
            case 0:
                int length = this.f9069b - (dest.length() - (i12 - i11));
                if (length <= 0) {
                    return "";
                }
                if (length >= i10 - i7) {
                    return null;
                }
                return source.subSequence(i7, length + i7);
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(dest, "dest");
                int length2 = this.f9069b - (dest.length() - (i12 - i11));
                if (length2 <= 0) {
                    return "";
                }
                if (length2 >= i10 - i7) {
                    return null;
                }
                return source.subSequence(i7, length2 + i7);
        }
    }
}
