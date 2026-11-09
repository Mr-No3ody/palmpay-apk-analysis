package androidx.core.graphics;

import N8.q0;
import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f16057e = new e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16061d;

    public e(int i7, int i10, int i11, int i12) {
        this.f16058a = i7;
        this.f16059b = i10;
        this.f16060c = i11;
        this.f16061d = i12;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f16058a, eVar2.f16058a), Math.max(eVar.f16059b, eVar2.f16059b), Math.max(eVar.f16060c, eVar2.f16060c), Math.max(eVar.f16061d, eVar2.f16061d));
    }

    public static e b(int i7, int i10, int i11, int i12) {
        return (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f16057e : new e(i7, i10, i11, i12);
    }

    public static e c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.c(this.f16058a, this.f16059b, this.f16060c, this.f16061d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16061d == eVar.f16061d && this.f16058a == eVar.f16058a && this.f16060c == eVar.f16060c && this.f16059b == eVar.f16059b;
    }

    public final int hashCode() {
        return (((((this.f16058a * 31) + this.f16059b) * 31) + this.f16060c) * 31) + this.f16061d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f16058a);
        sb2.append(", top=");
        sb2.append(this.f16059b);
        sb2.append(", right=");
        sb2.append(this.f16060c);
        sb2.append(", bottom=");
        return q0.m(sb2, this.f16061d, '}');
    }
}
