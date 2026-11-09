package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f22940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22941c;

    public /* synthetic */ i(Object obj, int i7, Runnable runnable) {
        this.f22939a = i7;
        this.f22940b = runnable;
        this.f22941c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f22939a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$0(this.f22940b, this.f22941c);
            default:
                return PausableExecutorServiceImpl.lambda$submit$0(this.f22940b, this.f22941c);
        }
    }
}
