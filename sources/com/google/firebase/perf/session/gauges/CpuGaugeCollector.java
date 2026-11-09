package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class CpuGaugeCollector {
    private static final int CSTIME_POSITION_IN_PROC_PID_STAT = 16;
    private static final int CUTIME_POSITION_IN_PROC_PID_STAT = 15;
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = -1;
    private static final int INVALID_SC_PER_CPU_CLOCK_TICK = -1;
    private static final int STIME_POSITION_IN_PROC_PID_STAT = 14;
    private static final int UNSET_CPU_METRIC_COLLECTION_RATE = -1;
    private static final int UTIME_POSITION_IN_PROC_PID_STAT = 13;
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs;
    private final ScheduledExecutorService cpuMetricCollectorExecutor;

    @Nullable
    private ScheduledFuture cpuMetricCollectorJob;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings;
    private final String procFileName;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final long MICROSECONDS_PER_SECOND = TimeUnit.SECONDS.toMicros(1);

    @SuppressLint({"ThreadPoolCreation"})
    public CpuGaugeCollector() {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = ShadowExecutors.newOptimizedSingleThreadScheduledExecutor("\u200bcom.google.firebase.perf.session.gauges.CpuGaugeCollector");
        this.procFileName = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
        this.clockTicksPerSecond = getClockTicksPerSecond();
    }

    private long convertClockTicksToMicroseconds(long j6) {
        return Math.round((j6 / this.clockTicksPerSecond) * MICROSECONDS_PER_SECOND);
    }

    private long getClockTicksPerSecond() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean isInvalidCollectionFrequency(long j6) {
        return j6 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCpuMetricCollectionOnce$1(Timer timer) {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCpuMetricCollectionWithRate$0(Timer timer) {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    private synchronized void scheduleCpuMetricCollectionOnce(Timer timer) {
        try {
            this.cpuMetricCollectorExecutor.schedule(new a(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.warn("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void scheduleCpuMetricCollectionWithRate(long j6, Timer timer) {
        this.cpuMetricCollectionRateMs = j6;
        try {
            this.cpuMetricCollectorJob = this.cpuMetricCollectorExecutor.scheduleAtFixedRate(new a(this, timer, 0), 0L, j6, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.warn("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    @Nullable
    private CpuMetricReading syncCollectCpuMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.procFileName));
            try {
                long currentTimestampMicros = timer.getCurrentTimestampMicros();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                CpuMetricReading cpuMetricReadingBuild = CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).setUserTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return cpuMetricReadingBuild;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            logger.warn("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void collectOnce(Timer timer) {
        scheduleCpuMetricCollectionOnce(timer);
    }

    public void startCollecting(long j6, Timer timer) {
        long j10 = this.clockTicksPerSecond;
        if (j10 == -1 || j10 == 0 || isInvalidCollectionFrequency(j6)) {
            return;
        }
        if (this.cpuMetricCollectorJob == null) {
            scheduleCpuMetricCollectionWithRate(j6, timer);
        } else if (this.cpuMetricCollectionRateMs != j6) {
            stopCollecting();
            scheduleCpuMetricCollectionWithRate(j6, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
    }

    @VisibleForTesting
    public CpuGaugeCollector(ScheduledExecutorService scheduledExecutorService, String str, long j6) {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = scheduledExecutorService;
        this.procFileName = str;
        this.clockTicksPerSecond = j6;
    }
}
