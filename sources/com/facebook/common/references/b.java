package com.facebook.common.references;

import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CloseableReference {
    @Override // com.facebook.common.references.CloseableReference
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CloseableReference clone() {
        e.f(g());
        return new b(this.f21219b, this.f21220c, this.f21221d != null ? new Throwable() : null);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f21218a) {
                    super.finalize();
                    return;
                }
                Object objA = this.f21219b.a();
                p229p2.a.x("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f21219b)), objA == null ? null : objA.getClass().getName());
                CloseableReference.LeakHandler leakHandler = this.f21220c;
                if (leakHandler != null) {
                    leakHandler.reportLeak(this.f21219b, this.f21221d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
