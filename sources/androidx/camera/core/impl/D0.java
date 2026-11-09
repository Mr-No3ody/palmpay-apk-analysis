package androidx.camera.core.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements SessionConfig$ErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13855a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionConfig$ErrorListener f13856b;

    public D0(SessionConfig$ErrorListener sessionConfig$ErrorListener) {
        this.f13856b = sessionConfig$ErrorListener;
    }

    public final void a() {
        this.f13855a.set(true);
    }

    @Override // androidx.camera.core.impl.SessionConfig$ErrorListener
    public final void onError(H0 h7, F0 f1) {
        if (this.f13855a.get()) {
            return;
        }
        this.f13856b.onError(h7, f1);
    }
}
