package androidx.preference;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17645c;

    public o(Preference preference) {
        this.f17645c = preference.getClass().getName();
        this.f17643a = preference.f17567t0;
        this.f17644b = preference.f17568u0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f17643a == oVar.f17643a && this.f17644b == oVar.f17644b && TextUtils.equals(this.f17645c, oVar.f17645c);
    }

    public final int hashCode() {
        return this.f17645c.hashCode() + ((((527 + this.f17643a) * 31) + this.f17644b) * 31);
    }
}
