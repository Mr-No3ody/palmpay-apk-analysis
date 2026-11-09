package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
public final class FakeTimeLimiter implements TimeLimiter {
    @Override // com.google.common.util.concurrent.TimeLimiter
    @ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j6, TimeUnit timeUnit) throws ExecutionException {
        return (T) callWithTimeout(callable, j6, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j6, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        try {
            return callable.call();
        } catch (Error e10) {
            throw new ExecutionError(e10);
        } catch (RuntimeException e11) {
            throw new UncheckedExecutionException(e11);
        } catch (Exception e12) {
            throw new ExecutionException(e12);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j6, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        return t;
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j6, TimeUnit timeUnit) {
        runWithTimeout(runnable, j6, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j6, TimeUnit timeUnit) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        try {
            runnable.run();
        } catch (Error e10) {
            throw new ExecutionError(e10);
        } catch (RuntimeException e11) {
            throw new UncheckedExecutionException(e11);
        } catch (Throwable th) {
            throw new UncheckedExecutionException(th);
        }
    }
}
