package com.palmpay.lib.liveness.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f23925a;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f23925a = new Path();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        canvas.clipPath(this.f23925a);
        try {
            return super.drawChild(canvas, view, j6);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        RectF rectF = new RectF();
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        rectF.right = i7 - getPaddingRight();
        rectF.bottom = i10 - getPaddingBottom();
        float f10 = (rectF.right - rectF.left) / 2.0f;
        this.f23925a.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23925a = new Path();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f23925a = new Path();
    }
}
