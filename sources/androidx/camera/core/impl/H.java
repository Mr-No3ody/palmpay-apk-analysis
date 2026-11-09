package androidx.camera.core.impl;

import E.C0212q;
import android.os.SystemClock;
import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class H implements RetryPolicy.ExecutionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f13878d;

    public H(long j6, int i7, Exception exc) {
        this.f13877c = SystemClock.elapsedRealtime() - j6;
        this.f13876b = i7;
        if (exc instanceof P) {
            this.f13875a = 2;
            this.f13878d = exc;
            return;
        }
        if (!(exc instanceof E.T)) {
            this.f13875a = 0;
            this.f13878d = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f13878d = exc;
        if (exc instanceof C0212q) {
            this.f13875a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f13875a = 1;
        } else {
            this.f13875a = 0;
        }
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final Throwable getCause() {
        return this.f13878d;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final long getExecutedTimeInMillis() {
        return this.f13877c;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final int getNumOfAttempts() {
        return this.f13876b;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public final int getStatus() {
        return this.f13875a;
    }
}
