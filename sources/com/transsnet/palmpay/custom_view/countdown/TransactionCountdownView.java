package com.transsnet.palmpay.custom_view.countdown;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionCountdownView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31214A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f31215B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextPaint f31216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f31217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f31218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f31222g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31224j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f31225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31226p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f31227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f31228w;

    public TransactionCountdownView(Context context) {
        super(context);
        this.f31219d = -65536;
        this.f31220e = -65536;
        this.f31221f = 0.0f;
        this.f31222g = 0.0f;
        this.f31223i = 0.0f;
        this.f31224j = 0.0f;
        this.f31225o = 0.0f;
        this.f31226p = 0.0f;
        this.t = 0.0f;
        this.f31227v = 0.0f;
        this.f31228w = 1;
        this.f31214A = 0;
        a(null, 0);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.TransactionCountdownView, i7, 0);
        this.f31219d = typedArrayObtainStyledAttributes.getColor(x.TransactionCountdownView_colorPrimary, this.f31219d);
        this.f31220e = typedArrayObtainStyledAttributes.getColor(x.TransactionCountdownView_colorSecondary, this.f31220e);
        this.f31221f = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_circleRadius1, this.f31221f);
        this.f31222g = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_circleRadius2, this.f31222g);
        this.f31223i = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_circleRadius3, this.f31223i);
        this.f31224j = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_circleRadius4, this.f31224j);
        this.f31225o = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_circleStrokeWidth, this.f31225o);
        this.f31226p = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_lineStrokeWidth, this.f31226p);
        this.t = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_pointStrokeWidth, this.t);
        this.f31227v = typedArrayObtainStyledAttributes.getDimension(x.TransactionCountdownView_countDownTextSize, this.f31227v);
        this.f31228w = typedArrayObtainStyledAttributes.getInteger(x.TransactionCountdownView_maxCountdown, this.f31228w);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f31216a = textPaint;
        textPaint.setFlags(1);
        this.f31216a.setTextAlign(Paint.Align.LEFT);
        this.f31216a.setTextSize(this.f31227v);
        this.f31216a.setColor(this.f31219d);
        Paint.FontMetricsInt fontMetricsInt = this.f31216a.getFontMetricsInt();
        this.f31215B = (-(fontMetricsInt.bottom + fontMetricsInt.top)) / 2;
        Paint paint = new Paint();
        this.f31217b = paint;
        paint.setFlags(1);
        this.f31217b.setColor(this.f31219d);
        Paint paint2 = this.f31217b;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f31218c = paint3;
        paint3.setFlags(1);
        this.f31218c.setColor(this.f31219d);
        this.f31218c.setStyle(style);
        this.f31218c.setStrokeWidth(this.f31226p);
    }

    public int getCurrentCountDown() {
        return this.f31214A;
    }

    public int getMaxCountdown() {
        return this.f31228w;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        canvas.save();
        canvas.translate(measuredWidth / 2, measuredHeight / 2);
        this.f31217b.setStrokeWidth(this.f31225o);
        canvas.drawCircle(0.0f, 0.0f, this.f31221f, this.f31217b);
        this.f31217b.setStrokeWidth(this.t);
        canvas.save();
        int i7 = 0;
        for (int i10 = 0; i10 < 72; i10++) {
            canvas.drawPoint(0.0f, this.f31222g, this.f31217b);
            canvas.rotate(5.0f, 0.0f, 0.0f);
        }
        canvas.restore();
        canvas.save();
        int i11 = (this.f31214A * 108) / this.f31228w;
        canvas.rotate(180.0f);
        while (i7 < 108) {
            this.f31218c.setColor(i7 < i11 ? this.f31219d : this.f31220e);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, this.f31223i, 0.0f, this.f31224j, this.f31218c);
            canvas2.rotate(360.0f / 108, 0.0f, 0.0f);
            i7++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        canvas3.restore();
        canvas3.drawText(String.valueOf(this.f31214A), (-this.f31216a.measureText(String.valueOf(this.f31214A))) / 2.0f, this.f31215B, this.f31216a);
        canvas3.restore();
    }

    public void setCurrentCountDown(int i7) {
        this.f31214A = i7;
        invalidate();
    }

    public void setMaxCountdown(int i7) {
        this.f31228w = i7;
    }

    public TransactionCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31219d = -65536;
        this.f31220e = -65536;
        this.f31221f = 0.0f;
        this.f31222g = 0.0f;
        this.f31223i = 0.0f;
        this.f31224j = 0.0f;
        this.f31225o = 0.0f;
        this.f31226p = 0.0f;
        this.t = 0.0f;
        this.f31227v = 0.0f;
        this.f31228w = 1;
        this.f31214A = 0;
        a(attributeSet, 0);
    }

    public TransactionCountdownView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31219d = -65536;
        this.f31220e = -65536;
        this.f31221f = 0.0f;
        this.f31222g = 0.0f;
        this.f31223i = 0.0f;
        this.f31224j = 0.0f;
        this.f31225o = 0.0f;
        this.f31226p = 0.0f;
        this.t = 0.0f;
        this.f31227v = 0.0f;
        this.f31228w = 1;
        this.f31214A = 0;
        a(attributeSet, i7);
    }
}
