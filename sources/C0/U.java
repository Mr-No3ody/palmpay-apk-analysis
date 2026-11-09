package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f991i;

    public U(boolean z3, boolean z8, int i7, boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.f983a = z3;
        this.f984b = z8;
        this.f985c = i7;
        this.f986d = z10;
        this.f987e = z11;
        this.f988f = i10;
        this.f989g = i11;
        this.f990h = i12;
        this.f991i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return this.f983a == u6.f983a && this.f984b == u6.f984b && this.f985c == u6.f985c && this.f986d == u6.f986d && this.f987e == u6.f987e && this.f988f == u6.f988f && this.f989g == u6.f989g && this.f990h == u6.f990h && this.f991i == u6.f991i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f983a ? 1 : 0) * 31) + (this.f984b ? 1 : 0)) * 31) + this.f985c) * 961) + (this.f986d ? 1 : 0)) * 31) + (this.f987e ? 1 : 0)) * 31) + this.f988f) * 31) + this.f989g) * 31) + this.f990h) * 31) + this.f991i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(U.class.getSimpleName());
        sb2.append("(");
        if (this.f983a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f984b) {
            sb2.append("restoreState ");
        }
        int i7 = this.f991i;
        int i10 = this.f990h;
        int i11 = this.f989g;
        int i12 = this.f988f;
        if (i12 != -1 || i11 != -1 || i10 != -1 || i7 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i7));
            sb2.append(")");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
