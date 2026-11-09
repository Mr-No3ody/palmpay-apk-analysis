package com.github.mikephil.charting.charts;

import A4.f;
import D4.e;
import F4.g;
import F4.m;
import G4.d;
import G4.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class PieChart extends PieRadarChartBase<Object> {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final float[] f22424A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public CharSequence f22425B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final d f22426C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public float f22427D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public float f22428E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public float f22429F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public float f22430G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public float f22431H0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final RectF f22432y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final float[] f22433z0;

    public PieChart(Context context) {
        super(context);
        this.f22432y0 = new RectF();
        this.f22433z0 = new float[1];
        this.f22424A0 = new float[1];
        this.f22425B0 = "";
        this.f22426C0 = d.b(0.0f, 0.0f);
        this.f22427D0 = 50.0f;
        this.f22428E0 = 55.0f;
        this.f22429F0 = 100.0f;
        this.f22430G0 = 360.0f;
        this.f22431H0 = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        super.c();
        m mVar = new m(this.f22398L, this.f22397H);
        new RectF();
        new RectF();
        new RectF();
        new RectF();
        new Path();
        new RectF();
        new Path();
        new Path();
        new RectF();
        Paint paint = new Paint(1);
        mVar.f2583g = paint;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        mVar.f2584h = paint2;
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        mVar.f2585i = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextSize(i.b(12.0f));
        mVar.f2579f.setTextSize(i.b(13.0f));
        mVar.f2579f.setColor(-1);
        Paint paint3 = mVar.f2579f;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        Paint paint4 = new Paint(1);
        mVar.f2586j = paint4;
        paint4.setColor(-1);
        paint4.setTextAlign(align);
        paint4.setTextSize(i.b(13.0f));
        new Paint(1).setStyle(Paint.Style.STROKE);
        this.f22395B = mVar;
        this.f22407g = null;
        this.f22396C = new e(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int f(float f10) {
        float rotationAngle = f10 - getRotationAngle();
        DisplayMetrics displayMetrics = i.f3002a;
        while (rotationAngle < 0.0f) {
            rotationAngle += 360.0f;
        }
        float f11 = rotationAngle % 360.0f;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f22424A0;
            if (i7 >= fArr.length) {
                return -1;
            }
            if (fArr[i7] > f11) {
                return i7;
            }
            i7++;
        }
    }

    public float[] getAbsoluteAngles() {
        return this.f22424A0;
    }

    public d getCenterCircleBox() {
        RectF rectF = this.f22432y0;
        return d.b(rectF.centerX(), rectF.centerY());
    }

    public CharSequence getCenterText() {
        return this.f22425B0;
    }

    public d getCenterTextOffset() {
        d dVar = this.f22426C0;
        return d.b(dVar.f2987b, dVar.f2988c);
    }

    public float getCenterTextRadiusPercent() {
        return this.f22429F0;
    }

    public RectF getCircleBox() {
        return this.f22432y0;
    }

    public float[] getDrawAngles() {
        return this.f22433z0;
    }

    public float getHoleRadius() {
        return this.f22427D0;
    }

    public float getMaxAngle() {
        return this.f22430G0;
    }

    public float getMinAngleForSlices() {
        return this.f22431H0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.f22432y0;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.f22394A.f2580d.getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.f22428E0;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public f getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g gVar = this.f22395B;
        if (gVar != null && (gVar instanceof m)) {
            m mVar = (m) gVar;
            Canvas canvas = mVar.f2588l;
            if (canvas != null) {
                canvas.setBitmap(null);
                mVar.f2588l = null;
            }
            WeakReference weakReference = mVar.f2587k;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                mVar.f2587k.clear();
                mVar.f2587k = null;
            }
        }
        super.onDetachedFromWindow();
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f22425B0 = "";
        } else {
            this.f22425B0 = charSequence;
        }
    }

    public void setCenterTextColor(int i7) {
        ((m) this.f22395B).f2585i.setColor(i7);
    }

    public void setCenterTextRadiusPercent(float f10) {
        this.f22429F0 = f10;
    }

    public void setCenterTextSize(float f10) {
        ((m) this.f22395B).f2585i.setTextSize(i.b(f10));
    }

    public void setCenterTextSizePixels(float f10) {
        ((m) this.f22395B).f2585i.setTextSize(f10);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((m) this.f22395B).f2585i.setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z3) {
    }

    public void setDrawEntryLabels(boolean z3) {
    }

    public void setDrawHoleEnabled(boolean z3) {
    }

    public void setDrawRoundedSlices(boolean z3) {
    }

    @Deprecated
    public void setDrawSliceText(boolean z3) {
    }

    public void setDrawSlicesUnderHole(boolean z3) {
    }

    public void setEntryLabelColor(int i7) {
        ((m) this.f22395B).f2586j.setColor(i7);
    }

    public void setEntryLabelTextSize(float f10) {
        ((m) this.f22395B).f2586j.setTextSize(i.b(f10));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((m) this.f22395B).f2586j.setTypeface(typeface);
    }

    public void setHoleColor(int i7) {
        ((m) this.f22395B).f2583g.setColor(i7);
    }

    public void setHoleRadius(float f10) {
        this.f22427D0 = f10;
    }

    public void setMaxAngle(float f10) {
        if (f10 > 360.0f) {
            f10 = 360.0f;
        }
        if (f10 < 90.0f) {
            f10 = 90.0f;
        }
        this.f22430G0 = f10;
    }

    public void setMinAngleForSlices(float f10) {
        float f11 = this.f22430G0;
        if (f10 > f11 / 2.0f) {
            f10 = f11 / 2.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f22431H0 = f10;
    }

    public void setTransparentCircleAlpha(int i7) {
        ((m) this.f22395B).f2584h.setAlpha(i7);
    }

    public void setTransparentCircleColor(int i7) {
        Paint paint = ((m) this.f22395B).f2584h;
        int alpha = paint.getAlpha();
        paint.setColor(i7);
        paint.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f10) {
        this.f22428E0 = f10;
    }

    public void setUsePercentValues(boolean z3) {
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22432y0 = new RectF();
        this.f22433z0 = new float[1];
        this.f22424A0 = new float[1];
        this.f22425B0 = "";
        this.f22426C0 = d.b(0.0f, 0.0f);
        this.f22427D0 = 50.0f;
        this.f22428E0 = 55.0f;
        this.f22429F0 = 100.0f;
        this.f22430G0 = 360.0f;
        this.f22431H0 = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22432y0 = new RectF();
        this.f22433z0 = new float[1];
        this.f22424A0 = new float[1];
        this.f22425B0 = "";
        this.f22426C0 = d.b(0.0f, 0.0f);
        this.f22427D0 = 50.0f;
        this.f22428E0 = 55.0f;
        this.f22429F0 = 100.0f;
        this.f22430G0 = 360.0f;
        this.f22431H0 = 0.0f;
    }
}
