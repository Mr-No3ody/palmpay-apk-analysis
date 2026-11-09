package androidx.camera.camera2.internal;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public final class L extends androidx.lifecycle.D {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.F f13225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f13226n;

    public L(Object obj) {
        this.f13226n = obj;
    }

    @Override // androidx.lifecycle.B
    public final Object d() {
        androidx.lifecycle.F f10 = this.f13225m;
        return f10 == null ? this.f13226n : f10.d();
    }

    public final void m(androidx.lifecycle.F f10) {
        androidx.lifecycle.C c6;
        androidx.lifecycle.F f11 = this.f13225m;
        if (f11 != null && (c6 = (androidx.lifecycle.C) this.f17342l.c(f11)) != null) {
            c6.f17338a.j(c6);
        }
        this.f13225m = f10;
        l(f10, new Observer() { // from class: androidx.camera.camera2.internal.K
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f13201a.k(obj);
            }
        });
    }
}
