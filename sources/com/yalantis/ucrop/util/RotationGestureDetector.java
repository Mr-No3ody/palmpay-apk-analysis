package com.yalantis.ucrop.util;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class RotationGestureDetector {
    private static final int INVALID_POINTER_INDEX = -1;
    private float fX;
    private float fY;
    private float mAngle;
    private boolean mIsFirstTouch;
    private OnRotationGestureListener mListener;
    private int mPointerIndex1 = -1;
    private int mPointerIndex2 = -1;
    private float sX;
    private float sY;

    public interface OnRotationGestureListener {
        boolean onRotation(RotationGestureDetector rotationGestureDetector);
    }

    public static class SimpleOnRotationGestureListener implements OnRotationGestureListener {
        @Override // com.yalantis.ucrop.util.RotationGestureDetector.OnRotationGestureListener
        public boolean onRotation(RotationGestureDetector rotationGestureDetector) {
            return false;
        }
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.mListener = onRotationGestureListener;
    }

    private float calculateAngleBetweenLines(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return calculateAngleDelta((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    private float calculateAngleDelta(float f10, float f11) {
        float f12 = (f11 % 360.0f) - (f10 % 360.0f);
        this.mAngle = f12;
        if (f12 < -180.0f) {
            this.mAngle = f12 + 360.0f;
        } else if (f12 > 180.0f) {
            this.mAngle = f12 - 360.0f;
        }
        return this.mAngle;
    }

    public float getAngle() {
        return this.mAngle;
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        RotationGestureDetector rotationGestureDetector;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.sX = motionEvent.getX();
            this.sY = motionEvent.getY();
            this.mPointerIndex1 = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.mAngle = 0.0f;
            this.mIsFirstTouch = true;
        } else if (actionMasked == 1) {
            this.mPointerIndex1 = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.fX = motionEvent.getX();
                this.fY = motionEvent.getY();
                this.mPointerIndex2 = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.mAngle = 0.0f;
                this.mIsFirstTouch = true;
            } else if (actionMasked == 6) {
                this.mPointerIndex2 = -1;
            }
        } else if (this.mPointerIndex1 != -1 && this.mPointerIndex2 != -1 && motionEvent.getPointerCount() > this.mPointerIndex2) {
            float x3 = motionEvent.getX(this.mPointerIndex1);
            float y8 = motionEvent.getY(this.mPointerIndex1);
            float x7 = motionEvent.getX(this.mPointerIndex2);
            float y10 = motionEvent.getY(this.mPointerIndex2);
            if (this.mIsFirstTouch) {
                this.mAngle = 0.0f;
                this.mIsFirstTouch = false;
                rotationGestureDetector = this;
            } else {
                calculateAngleBetweenLines(this.fX, this.fY, this.sX, this.sY, x7, y10, x3, y8);
                rotationGestureDetector = this;
            }
            OnRotationGestureListener onRotationGestureListener = rotationGestureDetector.mListener;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.onRotation(this);
            }
            rotationGestureDetector.fX = x7;
            rotationGestureDetector.fY = y10;
            rotationGestureDetector.sX = x3;
            rotationGestureDetector.sY = y8;
        }
        return true;
    }
}
