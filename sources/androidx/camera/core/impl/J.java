package androidx.camera.core.impl;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class J implements RetryPolicyInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f13909b;

    public J(long j6) {
        this.f13909b = new K(j6);
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public final RetryPolicy copy(long j6) {
        return new J(j6);
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.f13909b.f13916b.f13947b;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final E.c0 onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        if (this.f13909b.f13916b.onRetryDecisionRequested(executionState).f2002b) {
            return E.c0.f1999e;
        }
        Throwable cause = executionState.getCause();
        if (cause instanceof P) {
            p140j8.f.g("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
            if (((P) cause).f13942a > 0) {
                return E.c0.f2000f;
            }
        }
        return E.c0.f1998d;
    }
}
