package com.adjust.sdk.sig;

import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f19530a = new m2(x2.f19527b);

    @Override // com.adjust.sdk.sig.r1
    public final l2 a() {
        return this.f19530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return x2.f19526a.hashCode();
    }

    @Override // com.adjust.sdk.sig.r1
    public final void a(v2 v2Var, Object obj) {
        if (obj != null) {
            v2Var.a(x2.f19526a, obj);
            return;
        }
        o1 o1Var = v2Var.f19513a.f19522a;
        o1Var.a(o1Var.f19492b, 4);
        BuildConfig.TRAVIS.getChars(0, 4, o1Var.f19491a, o1Var.f19492b);
        o1Var.f19492b += 4;
    }
}
