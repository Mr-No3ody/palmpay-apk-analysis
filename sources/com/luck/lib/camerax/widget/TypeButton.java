package com.luck.lib.camerax.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class TypeButton extends View {
    public static final int TYPE_CANCEL = 1;
    public static final int TYPE_CONFIRM = 2;
    private float button_radius;
    private int button_size;
    private int button_type;
    private float center_X;
    private float center_Y;
    private float index;
    private Paint mPaint;
    private Path path;
    private RectF rectF;
    private float strokeWidth;

    public TypeButton(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.button_type == 1) {
            this.mPaint.setAntiAlias(true);
            this.mPaint.setColor(-287515428);
            Paint paint = this.mPaint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawCircle(this.center_X, this.center_Y, this.button_radius, this.mPaint);
            this.mPaint.setColor(-16777216);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(this.strokeWidth);
            Path path = this.path;
            float f10 = this.center_X;
            float f11 = this.index;
            path.moveTo(f10 - (f11 / 7.0f), this.center_Y + f11);
            Path path2 = this.path;
            float f12 = this.center_X;
            float f13 = this.index;
            path2.lineTo(f12 + f13, this.center_Y + f13);
            this.path.arcTo(this.rectF, 90.0f, -180.0f);
            Path path3 = this.path;
            float f14 = this.center_X;
            float f15 = this.index;
            path3.lineTo(f14 - f15, this.center_Y - f15);
            canvas.drawPath(this.path, this.mPaint);
            this.mPaint.setStyle(style);
            this.path.reset();
            Path path4 = this.path;
            float f16 = this.center_X;
            float f17 = this.index;
            path4.moveTo(f16 - f17, (float) (((double) this.center_Y) - (((double) f17) * 1.5d)));
            Path path5 = this.path;
            float f18 = this.center_X;
            float f19 = this.index;
            path5.lineTo(f18 - f19, (float) (((double) this.center_Y) - (((double) f19) / 2.3d)));
            Path path6 = this.path;
            double d2 = this.center_X;
            float f20 = this.index;
            path6.lineTo((float) (d2 - (((double) f20) * 1.6d)), this.center_Y - f20);
            this.path.close();
            canvas.drawPath(this.path, this.mPaint);
        }
        if (this.button_type == 2) {
            this.mPaint.setAntiAlias(true);
            this.mPaint.setColor(-1);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.center_X, this.center_Y, this.button_radius, this.mPaint);
            this.mPaint.setAntiAlias(true);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setColor(-16724992);
            this.mPaint.setStrokeWidth(this.strokeWidth);
            this.path.moveTo(this.center_X - (this.button_size / 6.0f), this.center_Y);
            Path path7 = this.path;
            float f21 = this.center_X;
            int i7 = this.button_size;
            path7.lineTo(f21 - (i7 / 21.2f), (i7 / 7.7f) + this.center_Y);
            Path path8 = this.path;
            float f22 = this.center_X;
            int i10 = this.button_size;
            path8.lineTo((i10 / 4.0f) + f22, this.center_Y - (i10 / 8.5f));
            Path path9 = this.path;
            float f23 = this.center_X;
            int i11 = this.button_size;
            path9.lineTo(f23 - (i11 / 21.2f), (i11 / 9.4f) + this.center_Y);
            this.path.close();
            canvas.drawPath(this.path, this.mPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int i11 = this.button_size;
        setMeasuredDimension(i11, i11);
    }

    public TypeButton(Context context, int i7, int i10) {
        super(context);
        this.button_type = i7;
        this.button_size = i10;
        float f10 = i10;
        float f11 = f10 / 2.0f;
        this.button_radius = f11;
        this.center_X = f11;
        this.center_Y = f11;
        this.mPaint = new Paint();
        this.path = new Path();
        this.strokeWidth = f10 / 50.0f;
        this.index = this.button_size / 12.0f;
        float f12 = this.center_X;
        float f13 = this.center_Y;
        float f14 = this.index;
        this.rectF = new RectF(f12, f13 - f14, (2.0f * f14) + f12, f13 + f14);
    }
}
