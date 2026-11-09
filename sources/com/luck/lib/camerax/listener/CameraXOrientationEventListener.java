package com.luck.lib.camerax.listener;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes3.dex */
public class CameraXOrientationEventListener extends OrientationEventListener {
    private OnOrientationChangedListener changedListener;
    private int mRotation;

    public interface OnOrientationChangedListener {
        void onOrientationChanged(int i7);
    }

    public CameraXOrientationEventListener(Context context, OnOrientationChangedListener onOrientationChangedListener) {
        super(context);
        this.mRotation = 0;
        this.changedListener = onOrientationChangedListener;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i7) {
        int i10;
        if (i7 == -1) {
            return;
        }
        if (i7 > 80 && i7 < 100) {
            i10 = 3;
        } else if (i7 <= 170 || i7 >= 190) {
            i10 = (i7 <= 260 || i7 >= 280) ? 0 : 1;
        } else {
            i10 = 2;
        }
        if (this.mRotation != i10) {
            this.mRotation = i10;
            OnOrientationChangedListener onOrientationChangedListener = this.changedListener;
            if (onOrientationChangedListener != null) {
                onOrientationChangedListener.onOrientationChanged(i10);
            }
        }
    }

    public void star() {
        enable();
    }

    public void stop() {
        disable();
    }
}
