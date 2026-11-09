package com.github.mikephil.charting.charts;

import B4.e;
import E4.c;
import G4.d;
import G4.i;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class PieRadarChartBase<T extends e> extends Chart<T> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f22434u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f22435v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f22436w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f22437x0;

    public PieRadarChartBase(Context context) {
        super(context);
        this.f22434u0 = 270.0f;
        this.f22435v0 = 270.0f;
        this.f22436w0 = true;
        this.f22437x0 = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void c() {
        super.c();
        E4.e eVar = new E4.e(this);
        eVar.f2240e = d.b(0.0f, 0.0f);
        eVar.f2241f = 0.0f;
        eVar.f2242g = new ArrayList();
        eVar.f2243i = 0L;
        eVar.f2244j = 0.0f;
        this.t = eVar;
    }

    @Override // android.view.View
    public final void computeScroll() {
        c cVar = this.t;
        if (cVar instanceof E4.e) {
            E4.e eVar = (E4.e) cVar;
            if (eVar.f2244j == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = eVar.f2244j;
            Chart chart = eVar.f2237d;
            PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) chart;
            eVar.f2244j = pieRadarChartBase.getDragDecelerationFrictionCoef() * f10;
            pieRadarChartBase.setRotationAngle((eVar.f2244j * ((jCurrentAnimationTimeMillis - eVar.f2243i) / 1000.0f)) + pieRadarChartBase.getRotationAngle());
            eVar.f2243i = jCurrentAnimationTimeMillis;
            if (Math.abs(eVar.f2244j) < 0.001d) {
                eVar.f2244j = 0.0f;
            } else {
                DisplayMetrics displayMetrics = i.f3002a;
                chart.postInvalidateOnAnimation();
            }
        }
    }

    public final float e(float f10, float f11) {
        d centerOffsets = getCenterOffsets();
        double d2 = f10 - centerOffsets.f2987b;
        double d10 = f11 - centerOffsets.f2988c;
        float degrees = (float) Math.toDegrees(Math.acos(d10 / Math.sqrt((d10 * d10) + (d2 * d2))));
        if (f10 > centerOffsets.f2987b) {
            degrees = 360.0f - degrees;
        }
        float f12 = degrees + 90.0f;
        if (f12 > 360.0f) {
            f12 -= 360.0f;
        }
        d.c(centerOffsets);
        return f12;
    }

    public abstract int f(float f10);

    public float getDiameter() {
        RectF rectF = this.f22397H.f3007b;
        rectF.left = getExtraLeftOffset() + rectF.left;
        rectF.top = getExtraTopOffset() + rectF.top;
        rectF.right -= getExtraRightOffset();
        rectF.bottom -= getExtraBottomOffset();
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        throw null;
    }

    public float getMinOffset() {
        return this.f22437x0;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.f22435v0;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.f22434u0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        return (!this.f22408i || (cVar = this.t) == null) ? super.onTouchEvent(motionEvent) : cVar.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f10) {
        this.f22437x0 = f10;
    }

    public void setRotationAngle(float f10) {
        this.f22435v0 = f10;
        DisplayMetrics displayMetrics = i.f3002a;
        while (f10 < 0.0f) {
            f10 += 360.0f;
        }
        this.f22434u0 = f10 % 360.0f;
    }

    public void setRotationEnabled(boolean z3) {
        this.f22436w0 = z3;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22434u0 = 270.0f;
        this.f22435v0 = 270.0f;
        this.f22436w0 = true;
        this.f22437x0 = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22434u0 = 270.0f;
        this.f22435v0 = 270.0f;
        this.f22436w0 = true;
        this.f22437x0 = 0.0f;
    }
}
