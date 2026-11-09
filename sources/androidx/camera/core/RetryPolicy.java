package androidx.camera.core;

import E.c0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.K;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalRetryPolicy
public interface RetryPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f13709a = new J(getDefaultRetryTimeoutInMillis());

    @ExperimentalRetryPolicy
    public interface ExecutionState {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({p192n.c.f39801b})
        public @interface Status {
        }

        @Nullable
        Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    static {
        new K(getDefaultRetryTimeoutInMillis());
    }

    static long getDefaultRetryTimeoutInMillis() {
        return 6000L;
    }

    default long getTimeoutInMillis() {
        return 0L;
    }

    @NonNull
    c0 onRetryDecisionRequested(@NonNull ExecutionState executionState);
}
