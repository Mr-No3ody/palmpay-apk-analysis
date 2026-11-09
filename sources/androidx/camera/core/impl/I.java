package androidx.camera.core.impl;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class I implements RetryPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13888b;

    public I(long j6) {
        this.f13888b = j6;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.f13888b;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final E.c0 onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return executionState.getStatus() == 1 ? E.c0.f1998d : E.c0.f1999e;
    }
}
