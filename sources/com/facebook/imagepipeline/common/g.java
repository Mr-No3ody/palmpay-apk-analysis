package com.facebook.imagepipeline.common;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21433b;

    static {
        new f(null);
    }

    public g(int i7, int i10) {
        this.f21432a = i7;
        this.f21433b = i10;
        if (i7 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f21432a == gVar.f21432a && this.f21433b == gVar.f21433b;
    }

    public final int hashCode() {
        return ((this.f21432a + 31) * 31) + this.f21433b;
    }

    public final String toString() {
        return com.airbnb.lottie.model.layer.d.o(new Object[]{Integer.valueOf(this.f21432a), Integer.valueOf(this.f21433b)}, 2, null, "%dx%d", "format(...)");
    }
}
