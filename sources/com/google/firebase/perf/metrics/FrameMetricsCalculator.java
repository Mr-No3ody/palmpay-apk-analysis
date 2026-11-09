package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class FrameMetricsCalculator {

    public static class PerfFrameMetrics {
        int frozenFrames;
        int slowFrames;
        int totalFrames;

        public PerfFrameMetrics(int i7, int i10, int i11) {
            this.totalFrames = i7;
            this.slowFrames = i10;
            this.frozenFrames = i11;
        }

        public PerfFrameMetrics deltaFrameMetricsFromSnapshot(PerfFrameMetrics perfFrameMetrics) {
            return new PerfFrameMetrics(this.totalFrames - perfFrameMetrics.getTotalFrames(), this.slowFrames - perfFrameMetrics.getSlowFrames(), this.frozenFrames - perfFrameMetrics.getFrozenFrames());
        }

        public int getFrozenFrames() {
            return this.frozenFrames;
        }

        public int getSlowFrames() {
            return this.slowFrames;
        }

        public int getTotalFrames() {
            return this.totalFrames;
        }
    }

    @NonNull
    public static PerfFrameMetrics calculateFrameMetrics(@Nullable SparseIntArray[] sparseIntArrayArr) {
        int i7;
        int i10;
        SparseIntArray sparseIntArray;
        int i11 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i7 = 0;
            i10 = 0;
        } else {
            int i12 = 0;
            i7 = 0;
            i10 = 0;
            while (i11 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i11);
                int iValueAt = sparseIntArray.valueAt(i11);
                i12 += iValueAt;
                if (iKeyAt > 700) {
                    i10 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i7 += iValueAt;
                }
                i11++;
            }
            i11 = i12;
        }
        return new PerfFrameMetrics(i11, i7, i10);
    }
}
