package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class DividerView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f31420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31421b;

    public DividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x.DividerView, 0, 0);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.DividerView_dvDashGap, 5);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.DividerView_dvDashLength, 5);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.DividerView_dvDashThickness, 3);
            int color = typedArrayObtainStyledAttributes.getColor(x.DividerView_dvLineColor, -16777216);
            this.f31421b = typedArrayObtainStyledAttributes.getInt(x.DividerView_dvOrientation, 0);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f31420a = paint;
            paint.setAntiAlias(true);
            paint.setColor(color);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize3);
            if (dimensionPixelSize <= 0 || dimensionPixelSize2 <= 0) {
                return;
            }
            paint.setPathEffect(new DashPathEffect(new float[]{dimensionPixelSize2, dimensionPixelSize}, 0.0f));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.f31421b;
        Paint paint = this.f31420a;
        if (i7 == 0) {
            float height = getHeight() * 0.5f;
            canvas.drawLine(0.0f, height, getWidth(), height, paint);
        } else {
            float width = getWidth() * 0.5f;
            canvas.drawLine(width, 0.0f, width, getHeight(), paint);
        }
    }

    public DividerView(Context context) {
        this(context, null);
    }
}
