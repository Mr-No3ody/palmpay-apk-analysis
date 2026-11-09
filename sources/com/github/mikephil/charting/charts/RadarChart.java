package com.github.mikephil.charting.charts;

import A4.f;
import A4.g;
import A4.h;
import D4.e;
import F4.n;
import G4.i;
import G4.j;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public class RadarChart extends PieRadarChartBase<Object> {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f22438A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f22439B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f22440C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f22441D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public h f22442E0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f22443y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f22444z0;

    public RadarChart(Context context) {
        super(context);
        this.f22443y0 = 2.5f;
        this.f22444z0 = 1.5f;
        this.f22438A0 = Color.rgb(122, 122, 122);
        this.f22439B0 = Color.rgb(122, 122, 122);
        this.f22440C0 = 150;
        this.f22441D0 = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        Paint paint;
        super.c();
        this.f22442E0 = new h(g.f55a);
        this.f22443y0 = i.b(1.5f);
        this.f22444z0 = i.b(0.75f);
        n nVar = new n(this.f22398L, this.f22397H);
        new Path();
        new Path();
        Paint paint2 = new Paint(1);
        nVar.f2578e = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        nVar.f2578e.setStrokeWidth(2.0f);
        nVar.f2578e.setColor(Color.rgb(255, 187, 115));
        new Paint(1).setStyle(style);
        new Paint(1);
        this.f22395B = nVar;
        j jVar = this.f22397H;
        Paint paint3 = null;
        if (jVar != null) {
            paint = new Paint(1);
            Paint paint4 = new Paint();
            paint4.setColor(-7829368);
            paint4.setStrokeWidth(1.0f);
            Paint.Style style2 = Paint.Style.STROKE;
            paint4.setStyle(style2);
            paint4.setAlpha(90);
            Paint paint5 = new Paint();
            paint5.setColor(-16777216);
            paint5.setStrokeWidth(1.0f);
            paint5.setStyle(style2);
            new Paint(1).setStyle(style2);
        } else {
            paint = null;
        }
        new Path();
        new RectF();
        new Path();
        new RectF();
        new Path();
        new RectF();
        if (jVar != null) {
            paint.setColor(-16777216);
            paint.setTextSize(i.b(10.0f));
            Paint paint6 = new Paint(1);
            paint6.setColor(-7829368);
            paint6.setStrokeWidth(1.0f);
            paint6.setStyle(Paint.Style.STROKE);
        }
        new Path();
        if (this.f22397H != null) {
            paint3 = new Paint(1);
            Paint paint7 = new Paint();
            paint7.setColor(-7829368);
            paint7.setStrokeWidth(1.0f);
            Paint.Style style3 = Paint.Style.STROKE;
            paint7.setStyle(style3);
            paint7.setAlpha(90);
            Paint paint8 = new Paint();
            paint8.setColor(-16777216);
            paint8.setStrokeWidth(1.0f);
            paint8.setStyle(style3);
            new Paint(1).setStyle(style3);
        }
        new Path();
        new RectF();
        new RectF();
        new Path();
        paint3.setColor(-16777216);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(i.b(10.0f));
        this.f22396C = new e(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int f(float f10) {
        getRotationAngle();
        DisplayMetrics displayMetrics = i.f3002a;
        getSliceAngle();
        throw null;
    }

    public float getFactor() {
        RectF rectF = this.f22397H.f3007b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) / this.f22442E0.f41i;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.f22397H.f3007b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        this.f22407g.getClass();
        f fVar = this.f22407g;
        return fVar.f38f ? fVar.f52j : i.b(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.f22394A.f2580d.getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.f22441D0;
    }

    public float getSliceAngle() {
        throw null;
    }

    public int getWebAlpha() {
        return this.f22440C0;
    }

    public int getWebColor() {
        return this.f22438A0;
    }

    public int getWebColorInner() {
        return this.f22439B0;
    }

    public float getWebLineWidth() {
        return this.f22443y0;
    }

    public float getWebLineWidthInner() {
        return this.f22444z0;
    }

    public h getYAxis() {
        return this.f22442E0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return this.f22442E0.f39g;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return this.f22442E0.f40h;
    }

    public float getYRange() {
        return this.f22442E0.f41i;
    }

    public void setDrawWeb(boolean z3) {
    }

    public void setSkipWebLineCount(int i7) {
        this.f22441D0 = Math.max(0, i7);
    }

    public void setWebAlpha(int i7) {
        this.f22440C0 = i7;
    }

    public void setWebColor(int i7) {
        this.f22438A0 = i7;
    }

    public void setWebColorInner(int i7) {
        this.f22439B0 = i7;
    }

    public void setWebLineWidth(float f10) {
        this.f22443y0 = i.b(f10);
    }

    public void setWebLineWidthInner(float f10) {
        this.f22444z0 = i.b(f10);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22443y0 = 2.5f;
        this.f22444z0 = 1.5f;
        this.f22438A0 = Color.rgb(122, 122, 122);
        this.f22439B0 = Color.rgb(122, 122, 122);
        this.f22440C0 = 150;
        this.f22441D0 = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22443y0 = 2.5f;
        this.f22444z0 = 1.5f;
        this.f22438A0 = Color.rgb(122, 122, 122);
        this.f22439B0 = Color.rgb(122, 122, 122);
        this.f22440C0 = 150;
        this.f22441D0 = 0;
    }
}
