package androidx.camera.core.impl;

/* JADX INFO: renamed from: androidx.camera.core.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979g extends AbstractC0978f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14058a;

    public C0979g(Object obj) {
        this.f14058a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0978f0)) {
            return false;
        }
        return this.f14058a.equals(((C0979g) ((AbstractC0978f0) obj)).f14058a);
    }

    public final int hashCode() {
        return this.f14058a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f14058a + "}";
    }
}
