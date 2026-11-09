package androidx.camera.core.impl;

import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Observable.Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f14140a;

    public u0(Consumer consumer) {
        this.f14140a = consumer;
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        p140j8.f.h("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(Object obj) {
        this.f14140a.accept(obj);
    }
}
