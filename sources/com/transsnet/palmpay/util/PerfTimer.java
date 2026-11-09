package com.transsnet.palmpay.util;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes4.dex */
public class PerfTimer {
    private static final int INITIAL_CAPACITY = 8;
    public static final int T_HIDE_SPLASH = 2;
    public static final int T_ON_CREATE = 0;
    public static final int T_ON_PAUSE = 3;
    public static final int T_ON_RESUME = 1;
    private SparseArray<Long> timeRecord = new SparseArray<>(8);

    public void clear() {
        SparseArray<Long> sparseArray = this.timeRecord;
        if (sparseArray != null) {
            sparseArray.clear();
            this.timeRecord = null;
        }
    }

    public void mark(int i7) {
        SparseArray<Long> sparseArray = this.timeRecord;
        if (sparseArray == null || sparseArray.get(i7) != null) {
            return;
        }
        this.timeRecord.put(i7, Long.valueOf(SystemClock.elapsedRealtimeNanos()));
    }

    public boolean parse(Trace trace) {
        SparseArray<Long> sparseArray = this.timeRecord;
        if (sparseArray != null && trace != null) {
            if (sparseArray.get(3) != null) {
                return false;
            }
            Long l5 = this.timeRecord.get(0);
            if (l5 != null && l5.longValue() > 0) {
                Long l6 = this.timeRecord.get(1);
                if (l6 != null && l6.longValue() > l5.longValue()) {
                    trace.putMetric("resumeTime", (l6.longValue() - l5.longValue()) / 1000000);
                }
                Long l8 = this.timeRecord.get(2);
                if (l8 != null && l8.longValue() > l5.longValue()) {
                    trace.putMetric("splashTime", (l8.longValue() - l5.longValue()) / 1000000);
                }
            }
        }
        return true;
    }
}
