package androidx.customview.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public abstract int clampViewPositionHorizontal(View view, int i7, int i10);

    public abstract int clampViewPositionVertical(View view, int i7, int i10);

    public int getOrderedChildIndex(int i7) {
        return i7;
    }

    public int getViewHorizontalDragRange(@NonNull View view) {
        return 0;
    }

    public int getViewVerticalDragRange(@NonNull View view) {
        return 0;
    }

    public void onEdgeDragStarted(int i7, int i10) {
    }

    public boolean onEdgeLock(int i7) {
        return false;
    }

    public void onEdgeTouched(int i7, int i10) {
    }

    public void onViewCaptured(@NonNull View view, int i7) {
    }

    public void onViewDragStateChanged(int i7) {
    }

    public abstract void onViewPositionChanged(View view, int i7, int i10, int i11, int i12);

    public abstract void onViewReleased(View view, float f10, float f11);

    public abstract boolean tryCaptureView(View view, int i7);
}
