package androidx.camera.core.impl;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class K implements RetryPolicyInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q0 f13916b;

    public K(long j6) {
        this.f13916b = new Q0(j6, new I(j6));
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public final RetryPolicy copy(long j6) {
        return new K(j6);
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.f13916b.f13947b;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final E.c0 onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return this.f13916b.onRetryDecisionRequested(executionState);
    }
}
