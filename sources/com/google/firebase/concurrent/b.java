package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f22916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f22918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22919e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j6, TimeUnit timeUnit, int i7) {
        this.f22915a = i7;
        this.f22916b = delegatingScheduledExecutorService;
        this.f22919e = obj;
        this.f22917c = j6;
        this.f22918d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f22915a) {
            case 0:
                return this.f22916b.lambda$schedule$2((Runnable) this.f22919e, this.f22917c, this.f22918d, completer);
            default:
                return this.f22916b.lambda$schedule$5((Callable) this.f22919e, this.f22917c, this.f22918d, completer);
        }
    }
}
