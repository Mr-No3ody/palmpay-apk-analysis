package com.google.firebase.perf.application;

import Na.a;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.C1042k;
import androidx.core.app.WindowOnFrameMetricsAvailableListenerC1041j;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FrameMetricsRecorder {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Activity activity;
    private final Map<Fragment, FrameMetricsCalculator.PerfFrameMetrics> fragmentSnapshotMap;
    private final C1042k frameMetricsAggregator;
    private boolean isRecording;

    public FrameMetricsRecorder(Activity activity) {
        this(activity, new C1042k(), new HashMap());
    }

    public static boolean isFrameMetricsRecordingSupported() {
        return true;
    }

    private Optional<FrameMetricsCalculator.PerfFrameMetrics> snapshot() {
        if (!this.isRecording) {
            logger.debug("No recording has been started.");
            return Optional.absent();
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) this.frameMetricsAggregator.f15978a.f6288c;
        if (sparseIntArrayArr[0] != null) {
            return Optional.of(FrameMetricsCalculator.calculateFrameMetrics(sparseIntArrayArr));
        }
        logger.debug("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return Optional.absent();
    }

    public void start() {
        if (this.isRecording) {
            logger.debug("FrameMetricsAggregator is already recording %s", this.activity.getClass().getSimpleName());
            return;
        }
        C1042k c1042k = this.frameMetricsAggregator;
        Activity activity = this.activity;
        a aVar = c1042k.f15978a;
        aVar.getClass();
        if (a.f6284e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            a.f6284e = handlerThread;
            handlerThread.start();
            a.f6285f = new Handler(a.f6284e.getLooper());
        }
        for (int i7 = 0; i7 <= 8; i7++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) aVar.f6288c;
            if (sparseIntArrayArr[i7] == null) {
                if (((1 << i7) & aVar.f6286a) != 0) {
                    sparseIntArrayArr[i7] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC1041j) aVar.f6289d, a.f6285f);
        ((ArrayList) aVar.f6287b).add(new WeakReference(activity));
        this.isRecording = true;
    }

    public void startFragment(Fragment fragment) {
        if (!this.isRecording) {
            logger.debug("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.fragmentSnapshotMap.containsKey(fragment)) {
            logger.debug("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        if (optionalSnapshot.isAvailable()) {
            this.fragmentSnapshotMap.put(fragment, optionalSnapshot.get());
        } else {
            logger.debug("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stop() {
        if (!this.isRecording) {
            logger.debug("Cannot stop because no recording was started");
            return Optional.absent();
        }
        if (!this.fragmentSnapshotMap.isEmpty()) {
            logger.debug("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.fragmentSnapshotMap.clear();
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        try {
            this.frameMetricsAggregator.a(this.activity);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            logger.warn("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            optionalSnapshot = Optional.absent();
        }
        a aVar = this.frameMetricsAggregator.f15978a;
        Object obj = aVar.f6288c;
        aVar.f6288c = new SparseIntArray[9];
        this.isRecording = false;
        return optionalSnapshot;
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stopFragment(Fragment fragment) {
        if (!this.isRecording) {
            logger.debug("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return Optional.absent();
        }
        if (!this.fragmentSnapshotMap.containsKey(fragment)) {
            logger.debug("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return Optional.absent();
        }
        FrameMetricsCalculator.PerfFrameMetrics perfFrameMetricsRemove = this.fragmentSnapshotMap.remove(fragment);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        if (optionalSnapshot.isAvailable()) {
            return Optional.of(optionalSnapshot.get().deltaFrameMetricsFromSnapshot(perfFrameMetricsRemove));
        }
        logger.debug("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return Optional.absent();
    }

    @VisibleForTesting
    public FrameMetricsRecorder(Activity activity, C1042k c1042k, Map<Fragment, FrameMetricsCalculator.PerfFrameMetrics> map) {
        this.isRecording = false;
        this.activity = activity;
        this.frameMetricsAggregator = c1042k;
        this.fragmentSnapshotMap = map;
    }
}
