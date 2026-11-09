package com.rmondjone.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public class OverCameraView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f24702a;

    public OverCameraView(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setFoucuing(boolean z3) {
    }

    public OverCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverCameraView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Paint paint = new Paint();
        this.f24702a = paint;
        paint.setColor(-16711936);
        this.f24702a.setStyle(Paint.Style.STROKE);
        this.f24702a.setStrokeWidth(3.0f);
    }
}
