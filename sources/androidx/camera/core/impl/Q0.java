package androidx.camera.core.impl;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements RetryPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RetryPolicy f13948c;

    public Q0(long j6, RetryPolicy retryPolicy) {
        p118hf.a.g(j6 >= 0, "Timeout must be non-negative.");
        this.f13947b = j6;
        this.f13948c = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.f13947b;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final E.c0 onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        E.c0 c0VarOnRetryDecisionRequested = this.f13948c.onRetryDecisionRequested(executionState);
        long j6 = this.f13947b;
        return (j6 <= 0 || executionState.getExecutedTimeInMillis() < j6 - c0VarOnRetryDecisionRequested.f2001a) ? c0VarOnRetryDecisionRequested : E.c0.f1998d;
    }
}
