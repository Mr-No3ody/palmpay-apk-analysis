package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
public class RotationLayout extends FrameLayout {
    private int mRotation;

    public RotationLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.mRotation;
        if (i7 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i7 == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i7 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11 = this.mRotation;
        if (i11 != 1 && i11 != 3) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(i7, i10);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i7) {
        this.mRotation = ((i7 + MessageEvent.EVENT_CL_REPAYMENT_FAILED) % MessageEvent.EVENT_CL_REPAYMENT_FAILED) / 90;
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
