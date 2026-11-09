package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.math.LongMath;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class SmoothRateLimiter extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    public static final class SmoothBursty extends SmoothRateLimiter {
        final double maxBurstSeconds;

        public SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d2) {
            super(sleepingStopwatch);
            this.maxBurstSeconds = d2;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d2, double d10) {
            double d11 = this.maxPermits;
            double d12 = this.maxBurstSeconds * d2;
            this.maxPermits = d12;
            if (d11 == Double.POSITIVE_INFINITY) {
                this.storedPermits = d12;
            } else {
                this.storedPermits = d11 != 0.0d ? (this.storedPermits * d12) / d11 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d2, double d10) {
            return 0L;
        }
    }

    public static final class SmoothWarmingUp extends SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        public SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j6, TimeUnit timeUnit, double d2) {
            super(sleepingStopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(j6);
            this.coldFactor = d2;
        }

        private double permitsToTime(double d2) {
            return (d2 * this.slope) + this.stableIntervalMicros;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d2, double d10) {
            double d11 = this.maxPermits;
            double d12 = this.coldFactor * d10;
            long j6 = this.warmupPeriodMicros;
            double d13 = (j6 * 0.5d) / d10;
            this.thresholdPermits = d13;
            double d14 = ((j6 * 2.0d) / (d10 + d12)) + d13;
            this.maxPermits = d14;
            this.slope = (d12 - d10) / (d14 - d13);
            if (d11 == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d11 != 0.0d) {
                d14 = (this.storedPermits * d14) / d11;
            }
            this.storedPermits = d14;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d2, double d10) {
            long jPermitsToTime;
            double d11 = d2 - this.thresholdPermits;
            if (d11 > 0.0d) {
                double dMin = Math.min(d11, d10);
                jPermitsToTime = (long) (((permitsToTime(d11) + permitsToTime(d11 - dMin)) * dMin) / 2.0d);
                d10 -= dMin;
            } else {
                jPermitsToTime = 0;
            }
            return jPermitsToTime + ((long) (this.stableIntervalMicros * d10));
        }
    }

    public abstract double coolDownIntervalMicros();

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
        return TimeUnit.SECONDS.toMicros(1L) / this.stableIntervalMicros;
    }

    public abstract void doSetRate(double d2, double d10);

    @Override // com.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double d2, long j6) {
        resync(j6);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d2;
        this.stableIntervalMicros = micros;
        doSetRate(d2, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable(long j6) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int i7, long j6) {
        resync(j6);
        long j10 = this.nextFreeTicketMicros;
        double d2 = i7;
        double dMin = Math.min(d2, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, dMin) + ((long) ((d2 - dMin) * this.stableIntervalMicros)));
        this.storedPermits -= dMin;
        return j10;
    }

    public void resync(long j6) {
        long j10 = this.nextFreeTicketMicros;
        if (j6 > j10) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((j6 - j10) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j6;
        }
    }

    public abstract long storedPermitsToWaitTime(double d2, double d10);

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }
}
