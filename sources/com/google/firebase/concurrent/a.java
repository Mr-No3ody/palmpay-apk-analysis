package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22914c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f22912a = i7;
        this.f22913b = obj;
        this.f22914c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22912a) {
            case 0:
                ((CustomThreadFactory) this.f22913b).lambda$newThread$0((Runnable) this.f22914c);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) this.f22913b, (DelegatingScheduledFuture.Completer) this.f22914c);
                break;
            default:
                ((LimitedConcurrencyExecutor) this.f22913b).lambda$decorate$0((Runnable) this.f22914c);
                break;
        }
    }
}
