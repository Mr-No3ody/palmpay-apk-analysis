package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
interface DifferentialMotionFlingController$FlingVelocityThresholdCalculator {
    void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i7);
}
