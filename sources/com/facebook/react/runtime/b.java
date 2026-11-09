package com.facebook.react.runtime;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21763b;

    public /* synthetic */ b(ReactHostImpl reactHostImpl, int i7) {
        this.f21762a = i7;
        this.f21763b = reactHostImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21762a) {
            case 0:
                return this.f21763b.waitThenCallGetOrCreateReactInstanceTask();
            default:
                return this.f21763b.getOrCreateStartTask();
        }
    }
}
