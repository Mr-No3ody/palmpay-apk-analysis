package androidx.core.view;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
interface DifferentialMotionFlingController$DifferentialVelocityProvider {
    float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7);
}
