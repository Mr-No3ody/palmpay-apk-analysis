package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1354t extends AbstractC1338c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f21631b;

    public AbstractC1354t(Consumer consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f21631b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public void c() {
        this.f21631b.onCancellation();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public void d(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        this.f21631b.onFailure(t);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public void f(float f10) {
        this.f21631b.onProgressUpdate(f10);
    }
}
