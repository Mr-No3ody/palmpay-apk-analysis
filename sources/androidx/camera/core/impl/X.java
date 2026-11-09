package androidx.camera.core.impl;

import androidx.biometric.RunnableC0903g;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Observable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f13999b = new X(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.futures.l f14000a;

    public X(Object obj) {
        this.f14000a = androidx.camera.core.impl.utils.futures.j.d(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(Executor executor, Observable.Observer observer) {
        this.f14000a.addListener(new RunnableC0903g(11, this, observer), executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture fetchData() {
        return this.f14000a;
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(Observable.Observer observer) {
    }
}
