package com.google.firebase.perf.transport;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class RateLimiter {
    private final ConfigResolver configResolver;
    private final double fragmentBucketId;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final double samplingBucketId;
    private RateLimiterImpl traceLimiter;

    public static class RateLimiterImpl {
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private double tokenCount;
        private static final AndroidLogger logger = AndroidLogger.getInstance();
        private static final long MICROS_IN_A_SECOND = TimeUnit.SECONDS.toMicros(1);

        public RateLimiterImpl(Rate rate, long j6, Clock clock, ConfigResolver configResolver, @ResourceType String str, boolean z3) {
            this.clock = clock;
            this.capacity = j6;
            this.rate = rate;
            this.tokenCount = j6;
            this.lastTimeTokenReplenished = clock.getTime();
            setRateByReadingRemoteConfigValues(configResolver, str, z3);
            this.isLogcatEnabled = z3;
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountBackground() : configResolver.getNetworkEventCountBackground();
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountForeground() : configResolver.getNetworkEventCountForeground();
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z3) {
            long flimitSec = getFlimitSec(configResolver, str);
            long flimitEvents = getFlimitEvents(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(flimitEvents, flimitSec, timeUnit);
            this.foregroundRate = rate;
            this.foregroundCapacity = flimitEvents;
            if (z3) {
                logger.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(flimitEvents));
            }
            long blimitSec = getBlimitSec(configResolver, str);
            long blimitEvents = getBlimitEvents(configResolver, str);
            Rate rate2 = new Rate(blimitEvents, blimitSec, timeUnit);
            this.backgroundRate = rate2;
            this.backgroundCapacity = blimitEvents;
            if (z3) {
                logger.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(blimitEvents));
            }
        }

        public synchronized void changeRate(boolean z3) {
            try {
                this.rate = z3 ? this.foregroundRate : this.backgroundRate;
                this.capacity = z3 ? this.foregroundCapacity : this.backgroundCapacity;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean check(@NonNull PerfMetric perfMetric) {
            try {
                Timer time = this.clock.getTime();
                double durationMicros = (this.lastTimeTokenReplenished.getDurationMicros(time) * this.rate.getTokensPerSeconds()) / MICROS_IN_A_SECOND;
                if (durationMicros > 0.0d) {
                    this.tokenCount = Math.min(this.tokenCount + durationMicros, this.capacity);
                    this.lastTimeTokenReplenished = time;
                }
                double d2 = this.tokenCount;
                if (d2 >= 1.0d) {
                    this.tokenCount = d2 - 1.0d;
                    return true;
                }
                if (this.isLogcatEnabled) {
                    logger.warn("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }

        @VisibleForTesting
        public long getBackgroundCapacity() {
            return this.backgroundCapacity;
        }

        @VisibleForTesting
        public Rate getBackgroundRate() {
            return this.backgroundRate;
        }

        @VisibleForTesting
        public long getForegroundCapacity() {
            return this.foregroundCapacity;
        }

        @VisibleForTesting
        public Rate getForegroundRate() {
            return this.foregroundRate;
        }

        @VisibleForTesting
        public Rate getRate() {
            return this.rate;
        }

        @VisibleForTesting
        public void setRate(Rate rate) {
            this.rate = rate;
        }
    }

    public RateLimiter(@NonNull Context context, Rate rate, long j6) {
        this(rate, j6, new Clock(), getSamplingBucketId(), getSamplingBucketId(), ConfigResolver.getInstance());
        this.isLogcatEnabled = Utils.isDebugLoggingEnabled(context);
    }

    @VisibleForTesting
    public static double getSamplingBucketId() {
        return new Random().nextDouble();
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
        return list.size() > 0 && list.get(0).getSessionVerbosityCount() > 0 && list.get(0).getSessionVerbosity(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean isDeviceAllowedToSendFragmentScreenTraces() {
        return this.fragmentBucketId < this.configResolver.getFragmentSamplingRate();
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        return this.samplingBucketId < this.configResolver.getNetworkRequestSamplingRate();
    }

    private boolean isDeviceAllowedToSendTraces() {
        return this.samplingBucketId < this.configResolver.getTraceSamplingRate();
    }

    public void changeRate(boolean z3) {
        this.traceLimiter.changeRate(z3);
        this.networkLimiter.changeRate(z3);
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendFragmentScreenTraces() {
        return isDeviceAllowedToSendFragmentScreenTraces();
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendNetworkEvents() {
        return isDeviceAllowedToSendNetworkEvents();
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendTraces() {
        return isDeviceAllowedToSendTraces();
    }

    public boolean isEventRateLimited(PerfMetric perfMetric) {
        if (!isRateLimitApplicable(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return !this.networkLimiter.check(perfMetric);
        }
        if (perfMetric.hasTraceMetric()) {
            return !this.traceLimiter.check(perfMetric);
        }
        return true;
    }

    public boolean isEventSampled(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !isDeviceAllowedToSendTraces() && !hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (!isFragmentScreenTrace(perfMetric) || isDeviceAllowedToSendFragmentScreenTraces() || hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return !perfMetric.hasNetworkRequestMetric() || isDeviceAllowedToSendNetworkEvents() || hasVerboseSessions(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
        }
        return false;
    }

    public boolean isFragmentScreenTrace(PerfMetric perfMetric) {
        return perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY);
    }

    public boolean isRateLimitApplicable(@NonNull PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    public RateLimiter(Rate rate, long j6, Clock clock, double d2, double d10, ConfigResolver configResolver) {
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean z3 = false;
        this.isLogcatEnabled = false;
        Utils.checkArgument(0.0d <= d2 && d2 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d10 && d10 < 1.0d) {
            z3 = true;
        }
        Utils.checkArgument(z3, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.samplingBucketId = d2;
        this.fragmentBucketId = d10;
        this.configResolver = configResolver;
        this.traceLimiter = new RateLimiterImpl(rate, j6, clock, configResolver, ResourceType.TRACE, this.isLogcatEnabled);
        this.networkLimiter = new RateLimiterImpl(rate, j6, clock, configResolver, ResourceType.NETWORK, this.isLogcatEnabled);
    }
}
