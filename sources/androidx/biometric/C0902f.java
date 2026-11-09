package androidx.biometric;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.biometric.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f13073b;

    public C0902f(int i7, CharSequence charSequence) {
        this.f13072a = i7;
        this.f13073b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0902f)) {
            return false;
        }
        C0902f c0902f = (C0902f) obj;
        if (this.f13072a != c0902f.f13072a) {
            return false;
        }
        CharSequence charSequence = this.f13073b;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = c0902f.f13073b;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f13072a);
        CharSequence charSequence = this.f13073b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
