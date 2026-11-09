package com.facebook.imagepipeline.producers;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC1341f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Future f21463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkFetcher.Callback f21464b;

    public B(Future future, NetworkFetcher.Callback callback) {
        this.f21463a = future;
        this.f21464b = callback;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContextCallbacks
    public final void onCancellationRequested() {
        if (this.f21463a.cancel(false)) {
            this.f21464b.onCancellation();
        }
    }
}
