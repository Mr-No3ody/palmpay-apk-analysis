package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1195e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f17445b;

    public C1195e(Method method, int i7) {
        this.f17444a = i7;
        this.f17445b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1195e)) {
            return false;
        }
        C1195e c1195e = (C1195e) obj;
        return this.f17444a == c1195e.f17444a && this.f17445b.getName().equals(c1195e.f17445b.getName());
    }

    public final int hashCode() {
        return this.f17445b.getName().hashCode() + (this.f17444a * 31);
    }
}
