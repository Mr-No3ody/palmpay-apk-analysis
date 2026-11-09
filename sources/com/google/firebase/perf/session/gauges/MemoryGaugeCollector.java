package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = -1;
    private static final int UNSET_MEMORY_METRIC_COLLECTION_RATE = -1;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;

    @Nullable
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    @SuppressLint({"ThreadPoolCreation"})
    public MemoryGaugeCollector() {
        this(ShadowExecutors.newOptimizedSingleThreadScheduledExecutor("\u200bcom.google.firebase.perf.session.gauges.MemoryGaugeCollector"), Runtime.getRuntime());
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    public static boolean isInvalidCollectionFrequency(long j6) {
        return j6 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleMemoryMetricCollectionOnce$1(Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleMemoryMetricCollectionWithRate$0(Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    private synchronized void scheduleMemoryMetricCollectionOnce(Timer timer) {
        try {
            this.memoryMetricCollectorExecutor.schedule(new c(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.warn("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void scheduleMemoryMetricCollectionWithRate(long j6, Timer timer) {
        this.memoryMetricCollectionRateMs = j6;
        try {
            this.memoryMetricCollectorJob = this.memoryMetricCollectorExecutor.scheduleAtFixedRate(new c(this, timer, 0), 0L, j6, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.warn("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    @Nullable
    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(getCurrentUsedAppJavaHeapMemoryKb()).build();
    }

    public void collectOnce(Timer timer) {
        scheduleMemoryMetricCollectionOnce(timer);
    }

    public void startCollecting(long j6, Timer timer) {
        if (isInvalidCollectionFrequency(j6)) {
            return;
        }
        if (this.memoryMetricCollectorJob == null) {
            scheduleMemoryMetricCollectionWithRate(j6, timer);
        } else if (this.memoryMetricCollectionRateMs != j6) {
            stopCollecting();
            scheduleMemoryMetricCollectionWithRate(j6, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
    }

    @VisibleForTesting
    public MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
        this.memoryMetricCollectorExecutor = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.runtime = runtime;
    }
}
