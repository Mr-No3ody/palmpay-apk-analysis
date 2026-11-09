package dh;

import D4.f;
import N8.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f35973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35978g = -1;

    public a(f fVar, String[] strArr, int i7, String str, String str2, String str3) {
        this.f35972a = fVar;
        this.f35973b = (String[]) strArr.clone();
        this.f35974c = i7;
        this.f35975d = str;
        this.f35976e = str2;
        this.f35977f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f35973b, aVar.f35973b) && this.f35974c == aVar.f35974c;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f35973b) * 31) + this.f35974c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionRequest{mHelper=");
        sb2.append(this.f35972a);
        sb2.append(", mPerms=");
        sb2.append(Arrays.toString(this.f35973b));
        sb2.append(", mRequestCode=");
        sb2.append(this.f35974c);
        sb2.append(", mRationale='");
        sb2.append(this.f35975d);
        sb2.append("', mPositiveButtonText='");
        sb2.append(this.f35976e);
        sb2.append("', mNegativeButtonText='");
        sb2.append(this.f35977f);
        sb2.append("', mTheme=");
        return q0.m(sb2, this.f35978g, '}');
    }
}
