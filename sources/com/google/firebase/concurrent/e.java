package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f22928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f22929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f22932f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j6, long j10, TimeUnit timeUnit, int i7) {
        this.f22927a = i7;
        this.f22928b = delegatingScheduledExecutorService;
        this.f22929c = runnable;
        this.f22930d = j6;
        this.f22931e = j10;
        this.f22932f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f22927a) {
            case 0:
                return this.f22928b.lambda$scheduleAtFixedRate$8(this.f22929c, this.f22930d, this.f22931e, this.f22932f, completer);
            default:
                return this.f22928b.lambda$scheduleWithFixedDelay$11(this.f22929c, this.f22930d, this.f22931e, this.f22932f, completer);
        }
    }
}
