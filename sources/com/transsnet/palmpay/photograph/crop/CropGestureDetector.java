package com.transsnet.palmpay.photograph.crop;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public interface CropGestureDetector {
    boolean isDragging();

    boolean isScaling();

    boolean onTouchEvent(MotionEvent motionEvent);

    void setOnGestureListener(OnGestureListener onGestureListener);
}
