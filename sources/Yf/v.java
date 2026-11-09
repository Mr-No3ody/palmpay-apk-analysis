package Yf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f11447b = new t(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f11448c = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11449a;

    public static final Throwable a(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.f11446a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Intrinsics.c(this.f11449a, ((v) obj).f11449a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11449a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f11449a;
        if (obj instanceof s) {
            return ((s) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
