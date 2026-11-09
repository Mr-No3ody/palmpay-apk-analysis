package com.luck.lib.camerax.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class ReturnButton extends View {
    private int center_X;
    private int center_Y;
    private Paint paint;
    Path path;
    private int size;
    private float strokeWidth;

    public ReturnButton(Context context, int i7) {
        this(context);
        this.size = i7;
        int i10 = i7 / 2;
        this.center_X = i10;
        this.center_Y = i10;
        this.strokeWidth = i7 / 15.0f;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        this.path = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.path;
        float f10 = this.strokeWidth;
        path.moveTo(f10, f10 / 2.0f);
        this.path.lineTo(this.center_X, this.center_Y - (this.strokeWidth / 2.0f));
        Path path2 = this.path;
        float f11 = this.size;
        float f12 = this.strokeWidth;
        path2.lineTo(f11 - f12, f12 / 2.0f);
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11 = this.size;
        setMeasuredDimension(i11, i11 / 2);
    }

    public ReturnButton(Context context) {
        super(context);
    }
}
