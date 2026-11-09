package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class RateLimiter {

    @CheckForNull
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    public static abstract class SleepingStopwatch {
        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final Stopwatch stopwatch = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                public long readMicros() {
                    return this.stopwatch.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                public void sleepMicrosUninterruptibly(long j6) {
                    if (j6 > 0) {
                        Uninterruptibles.sleepUninterruptibly(j6, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }

        public abstract long readMicros();

        public abstract void sleepMicrosUninterruptibly(long j6);
    }

    public RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    private boolean canAcquire(long j6, long j10) {
        return queryEarliestAvailable(j6) - j10 <= j6;
    }

    private static void checkPermits(int i7) {
        Preconditions.checkArgument(i7 > 0, "Requested permits (%s) must be positive", i7);
    }

    public static RateLimiter create(double d2) {
        return create(d2, SleepingStopwatch.createFromSystemTimer());
    }

    private Object mutex() {
        Object obj;
        Object obj2 = this.mutexDoNotUseDirectly;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.mutexDoNotUseDirectly;
                if (obj == null) {
                    obj = new Object();
                    this.mutexDoNotUseDirectly = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    public abstract double doGetRate();

    public abstract void doSetRate(double d2, long j6);

    public final double getRate() {
        double dDoGetRate;
        synchronized (mutex()) {
            dDoGetRate = doGetRate();
        }
        return dDoGetRate;
    }

    public abstract long queryEarliestAvailable(long j6);

    public final long reserve(int i7) {
        long jReserveAndGetWaitLength;
        checkPermits(i7);
        synchronized (mutex()) {
            jReserveAndGetWaitLength = reserveAndGetWaitLength(i7, this.stopwatch.readMicros());
        }
        return jReserveAndGetWaitLength;
    }

    public final long reserveAndGetWaitLength(int i7, long j6) {
        return Math.max(reserveEarliestAvailable(i7, j6) - j6, 0L);
    }

    public abstract long reserveEarliestAvailable(int i7, long j6);

    public final void setRate(double d2) {
        Preconditions.checkArgument(d2 > 0.0d && !Double.isNaN(d2), "rate must be positive");
        synchronized (mutex()) {
            doSetRate(d2, this.stopwatch.readMicros());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long j6, TimeUnit timeUnit) {
        return tryAcquire(1, j6, timeUnit);
    }

    @VisibleForTesting
    public static RateLimiter create(double d2, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d2);
        return smoothBursty;
    }

    @CanIgnoreReturnValue
    public double acquire(int i7) {
        long jReserve = reserve(i7);
        this.stopwatch.sleepMicrosUninterruptibly(jReserve);
        return (jReserve * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i7) {
        return tryAcquire(i7, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public static RateLimiter create(double d2, long j6, TimeUnit timeUnit) {
        Preconditions.checkArgument(j6 >= 0, "warmupPeriod must not be negative: %s", j6);
        return create(d2, j6, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    public boolean tryAcquire(int i7, long j6, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j6), 0L);
        checkPermits(i7);
        synchronized (mutex()) {
            try {
                long micros = this.stopwatch.readMicros();
                if (!canAcquire(micros, jMax)) {
                    return false;
                }
                this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i7, micros));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public static RateLimiter create(double d2, long j6, TimeUnit timeUnit, double d10, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j6, timeUnit, d10);
        smoothWarmingUp.setRate(d2);
        return smoothWarmingUp;
    }
}
