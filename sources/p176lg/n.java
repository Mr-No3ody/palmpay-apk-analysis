package p176lg;

import kotlin.jvm.internal.Intrinsics;
import p191mg.r;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39389b;

    public n(String body, boolean z3) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f39388a = z3;
        this.f39389b = body.toString();
    }

    @Override // p176lg.w
    public final String a() {
        return this.f39389b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f39388a == nVar.f39388a && Intrinsics.c(this.f39389b, nVar.f39389b);
    }

    public final int hashCode() {
        return this.f39389b.hashCode() + (Boolean.hashCode(this.f39388a) * 31);
    }

    @Override // p176lg.w
    public final String toString() {
        boolean z3 = this.f39388a;
        String str = this.f39389b;
        if (!z3) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        r.a(str, sb2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
