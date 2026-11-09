package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f22938b;

    public /* synthetic */ h(Runnable runnable, int i7) {
        this.f22937a = i7;
        this.f22938b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f22937a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$1(this.f22938b);
            default:
                return PausableExecutorServiceImpl.lambda$submit$1(this.f22938b);
        }
    }
}
