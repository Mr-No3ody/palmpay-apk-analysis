package androidx.camera.core.impl;

import E.AbstractC0198c;
import androidx.biometric.RunnableC0903g;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990l0 implements Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.F f14100a = new androidx.lifecycle.F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14101b = new HashMap();

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(Executor executor, Observable.Observer observer) {
        synchronized (this.f14101b) {
            C0986j0 c0986j0 = (C0986j0) this.f14101b.get(observer);
            if (c0986j0 != null) {
                c0986j0.f14091a.set(false);
            }
            C0986j0 c0986j1 = new C0986j0(executor, observer);
            this.f14101b.put(observer, c0986j1);
            org.chromium.support_lib_boundary.util.b.S().execute(new Da.h(this, 20, c0986j0, c0986j1));
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture fetchData() {
        return AbstractC0198c.y(new L(this, 1));
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(Observable.Observer observer) {
        synchronized (this.f14101b) {
            try {
                C0986j0 c0986j0 = (C0986j0) this.f14101b.remove(observer);
                if (c0986j0 != null) {
                    c0986j0.f14091a.set(false);
                    org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(13, this, c0986j0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
