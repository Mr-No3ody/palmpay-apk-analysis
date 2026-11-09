package io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscription f37728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37729b;

    public v(long j6, Subscription subscription) {
        this.f37728a = subscription;
        this.f37729b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37728a.request(this.f37729b);
    }
}
