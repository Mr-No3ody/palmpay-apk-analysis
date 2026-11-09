package com.github.mikephil.charting.charts;

import A4.e;
import A4.f;
import A4.h;
import B4.b;
import E4.a;
import F4.o;
import F4.q;
import G4.c;
import G4.d;
import G4.g;
import G4.i;
import G4.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.camera.camera2.internal.F;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.listener.OnDrawListener;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RtlHardcoded"})
public abstract class BarLineChartBase<T extends b> extends Chart<T> implements BarLineScatterCandleBubbleDataProvider {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f22370A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f22371B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Paint f22372C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public Paint f22373D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public float f22374E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f22375F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public OnDrawListener f22376G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public h f22377H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public h f22378I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public q f22379J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public q f22380K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public g f22381L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public g f22382M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public o f22383N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final RectF f22384O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final c f22385P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final c f22386Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final float[] f22387R0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f22388u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f22389v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f22390w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f22391x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f22392y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f22393z0;

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22388u0 = 100;
        this.f22389v0 = false;
        this.f22390w0 = true;
        this.f22391x0 = true;
        this.f22392y0 = true;
        this.f22393z0 = true;
        this.f22370A0 = true;
        this.f22371B0 = true;
        this.f22374E0 = 15.0f;
        this.f22375F0 = false;
        this.f22384O0 = new RectF();
        new Matrix();
        new Matrix();
        this.f22385P0 = c.b(0.0d, 0.0d);
        this.f22386Q0 = c.b(0.0d, 0.0d);
        this.f22387R0 = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void c() {
        super.c();
        this.f22377H0 = new h(A4.g.f55a);
        this.f22378I0 = new h(A4.g.f56b);
        this.f22381L0 = new g(this.f22397H);
        this.f22382M0 = new g(this.f22397H);
        this.f22379J0 = new q(this.f22397H, this.f22377H0, this.f22381L0);
        this.f22380K0 = new q(this.f22397H, this.f22378I0, this.f22382M0);
        this.f22383N0 = new o(this.f22397H, this.f22407g, this.f22381L0);
        setHighlighter(new D4.b(this));
        Matrix matrix = this.f22397H.f3006a;
        a aVar = new a(this);
        aVar.f2214e = new Matrix();
        aVar.f2215f = new Matrix();
        aVar.f2216g = d.b(0.0f, 0.0f);
        aVar.f2217i = d.b(0.0f, 0.0f);
        aVar.f2218j = 1.0f;
        aVar.f2219o = 1.0f;
        aVar.f2220p = 1.0f;
        aVar.f2221v = 0L;
        aVar.f2222w = d.b(0.0f, 0.0f);
        aVar.f2211A = d.b(0.0f, 0.0f);
        aVar.f2214e = matrix;
        aVar.f2212B = i.b(3.0f);
        aVar.f2213C = i.b(3.5f);
        this.t = aVar;
        Paint paint = new Paint();
        this.f22372C0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22372C0.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f22373D0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f22373D0.setColor(-16777216);
        this.f22373D0.setStrokeWidth(i.b(1.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        E4.c cVar = this.t;
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            d dVar = aVar.f2211A;
            if (dVar.f2987b == 0.0f && dVar.f2988c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = dVar.f2987b;
            Chart chart = aVar.f2237d;
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            dVar.f2987b = barLineChartBase.getDragDecelerationFrictionCoef() * f10;
            float dragDecelerationFrictionCoef = barLineChartBase.getDragDecelerationFrictionCoef() * dVar.f2988c;
            dVar.f2988c = dragDecelerationFrictionCoef;
            float f11 = (jCurrentAnimationTimeMillis - aVar.f2221v) / 1000.0f;
            float f12 = dVar.f2987b * f11;
            float f13 = dragDecelerationFrictionCoef * f11;
            d dVar2 = aVar.f2222w;
            float f14 = dVar2.f2987b + f12;
            dVar2.f2987b = f14;
            float f15 = dVar2.f2988c + f13;
            dVar2.f2988c = f15;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f14, f15, 0);
            boolean z3 = barLineChartBase.f22392y0;
            d dVar3 = aVar.f2216g;
            aVar.b(motionEventObtain, z3 ? dVar2.f2987b - dVar3.f2987b : 0.0f, barLineChartBase.f22393z0 ? dVar2.f2988c - dVar3.f2988c : 0.0f);
            motionEventObtain.recycle();
            j viewPortHandler = barLineChartBase.getViewPortHandler();
            Matrix matrix = aVar.f2214e;
            viewPortHandler.c(matrix, chart, false);
            aVar.f2214e = matrix;
            aVar.f2221v = jCurrentAnimationTimeMillis;
            if (Math.abs(dVar.f2987b) >= 0.01d || Math.abs(dVar.f2988c) >= 0.01d) {
                DisplayMetrics displayMetrics = i.f3002a;
                chart.postInvalidateOnAnimation();
                return;
            }
            barLineChartBase.f();
            barLineChartBase.postInvalidate();
            d dVar4 = aVar.f2211A;
            dVar4.f2987b = 0.0f;
            dVar4.f2988c = 0.0f;
        }
    }

    public void e(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        e eVar = this.f22411o;
        if (eVar != null) {
            eVar.getClass();
            int i7 = F.i(this.f22411o.f48f);
            if (i7 == 0) {
                int i10 = F.i(this.f22411o.f47e);
                if (i10 == 0) {
                    float f10 = rectF.top;
                    e eVar2 = this.f22411o;
                    rectF.top = Math.min(eVar2.f51i, this.f22397H.f3009d * eVar2.f49g) + this.f22411o.f43b + f10;
                    return;
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    float f11 = rectF.bottom;
                    e eVar3 = this.f22411o;
                    rectF.bottom = Math.min(eVar3.f51i, this.f22397H.f3009d * eVar3.f49g) + this.f22411o.f43b + f11;
                    return;
                }
            }
            if (i7 != 1) {
                return;
            }
            int i11 = F.i(this.f22411o.f46d);
            if (i11 == 0) {
                float f12 = rectF.left;
                e eVar4 = this.f22411o;
                rectF.left = Math.min(eVar4.f50h, this.f22397H.f3008c * eVar4.f49g) + this.f22411o.f42a + f12;
                return;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                float f13 = rectF.right;
                e eVar5 = this.f22411o;
                rectF.right = Math.min(eVar5.f50h, this.f22397H.f3008c * eVar5.f49g) + this.f22411o.f42a + f13;
                return;
            }
            int i12 = F.i(this.f22411o.f47e);
            if (i12 == 0) {
                float f14 = rectF.top;
                e eVar6 = this.f22411o;
                rectF.top = Math.min(eVar6.f51i, this.f22397H.f3009d * eVar6.f49g) + this.f22411o.f43b + f14;
            } else {
                if (i12 != 2) {
                    return;
                }
                float f15 = rectF.bottom;
                e eVar7 = this.f22411o;
                rectF.bottom = Math.min(eVar7.f51i, this.f22397H.f3009d * eVar7.f49g) + this.f22411o.f43b + f15;
            }
        }
    }

    public void f() {
        RectF rectF = this.f22384O0;
        e(rectF);
        float fC = rectF.left + 0.0f;
        float f10 = rectF.top + 0.0f;
        float fC2 = rectF.right + 0.0f;
        float f11 = rectF.bottom + 0.0f;
        if (this.f22377H0.d()) {
            fC += this.f22377H0.c(this.f22379J0.f2571d);
        }
        if (this.f22378I0.d()) {
            fC2 += this.f22378I0.c(this.f22380K0.f2571d);
        }
        this.f22407g.getClass();
        f fVar = this.f22407g;
        if (fVar.f38f) {
            float f12 = fVar.f53k + fVar.f43b;
            int i7 = fVar.f54l;
            if (i7 == 2) {
                f11 += f12;
            } else if (i7 == 1) {
                f10 += f12;
            } else if (i7 == 3) {
                f11 += f12;
                f10 += f12;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f10;
        float extraRightOffset = getExtraRightOffset() + fC2;
        float extraBottomOffset = getExtraBottomOffset() + f11;
        float extraLeftOffset = getExtraLeftOffset() + fC;
        float fB = i.b(this.f22374E0);
        this.f22397H.d(Math.max(fB, extraLeftOffset), Math.max(fB, extraTopOffset), Math.max(fB, extraRightOffset), Math.max(fB, extraBottomOffset));
        if (this.f22401a) {
            this.f22397H.f3007b.toString();
        }
        g gVar = this.f22382M0;
        this.f22378I0.getClass();
        gVar.c();
        g gVar2 = this.f22381L0;
        this.f22377H0.getClass();
        gVar2.c();
        g();
    }

    public void g() {
        if (this.f22401a) {
            f fVar = this.f22407g;
            float f10 = fVar.f40h;
            float f11 = fVar.f39g;
            float f12 = fVar.f41i;
        }
        g gVar = this.f22382M0;
        f fVar2 = this.f22407g;
        float f13 = fVar2.f40h;
        float f14 = fVar2.f41i;
        h hVar = this.f22378I0;
        gVar.d(f13, f14, hVar.f41i, hVar.f40h);
        g gVar2 = this.f22381L0;
        f fVar3 = this.f22407g;
        float f15 = fVar3.f40h;
        float f16 = fVar3.f41i;
        h hVar2 = this.f22377H0;
        gVar2.d(f15, f16, hVar2.f41i, hVar2.f40h);
    }

    public final h getAxis(A4.g gVar) {
        return gVar == A4.g.f55a ? this.f22377H0 : this.f22378I0;
    }

    public h getAxisLeft() {
        return this.f22377H0;
    }

    public h getAxisRight() {
        return this.f22378I0;
    }

    @Override // com.github.mikephil.charting.charts.Chart, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public /* bridge */ /* synthetic */ b getData() {
        super.getData();
        return null;
    }

    public OnDrawListener getDrawListener() {
        return this.f22376G0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        g transformer = getTransformer(A4.g.f55a);
        RectF rectF = this.f22397H.f3007b;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        c cVar = this.f22386Q0;
        transformer.a(f10, f11, cVar);
        return (float) Math.min(this.f22407g.f39g, cVar.f2984b);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        g transformer = getTransformer(A4.g.f55a);
        RectF rectF = this.f22397H.f3007b;
        float f10 = rectF.left;
        float f11 = rectF.bottom;
        c cVar = this.f22385P0;
        transformer.a(f10, f11, cVar);
        return (float) Math.max(this.f22407g.f40h, cVar.f2984b);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.f22388u0;
    }

    public float getMinOffset() {
        return this.f22374E0;
    }

    public q getRendererLeftYAxis() {
        return this.f22379J0;
    }

    public q getRendererRightYAxis() {
        return this.f22380K0;
    }

    public o getRendererXAxis() {
        return this.f22383N0;
    }

    @Override // android.view.View
    public float getScaleX() {
        j jVar = this.f22397H;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f3014i;
    }

    @Override // android.view.View
    public float getScaleY() {
        j jVar = this.f22397H;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f3015j;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public final g getTransformer(A4.g gVar) {
        return gVar == A4.g.f55a ? this.f22381L0 : this.f22382M0;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return Math.max(this.f22377H0.f39g, this.f22378I0.f39g);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return Math.min(this.f22377H0.f40h, this.f22378I0.f40h);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public final boolean isInverted(A4.g gVar) {
        getAxis(gVar).getClass();
        return false;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        float[] fArr = this.f22387R0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z3 = this.f22375F0;
        A4.g gVar = A4.g.f55a;
        if (z3) {
            RectF rectF = this.f22397H.f3007b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            getTransformer(gVar).b(fArr);
        }
        super.onSizeChanged(i7, i10, i11, i12);
        if (!this.f22375F0) {
            j jVar = this.f22397H;
            jVar.c(jVar.f3006a, this, true);
            return;
        }
        g transformer = getTransformer(gVar);
        transformer.f2997a.mapPoints(fArr);
        transformer.f2999c.f3006a.mapPoints(fArr);
        transformer.f2998b.mapPoints(fArr);
        j jVar2 = this.f22397H;
        Matrix matrix = jVar2.f3019n;
        matrix.reset();
        matrix.set(jVar2.f3006a);
        float f10 = fArr[0];
        RectF rectF2 = jVar2.f3007b;
        matrix.postTranslate(-(f10 - rectF2.left), -(fArr[1] - rectF2.top));
        jVar2.c(matrix, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public void setAutoScaleMinMaxEnabled(boolean z3) {
    }

    public void setBorderColor(int i7) {
        this.f22373D0.setColor(i7);
    }

    public void setBorderWidth(float f10) {
        this.f22373D0.setStrokeWidth(i.b(f10));
    }

    public void setClipDataToContent(boolean z3) {
    }

    public void setClipValuesToContent(boolean z3) {
    }

    public void setDoubleTapToZoomEnabled(boolean z3) {
        this.f22390w0 = z3;
    }

    public void setDragEnabled(boolean z3) {
        this.f22392y0 = z3;
        this.f22393z0 = z3;
    }

    public void setDragOffsetX(float f10) {
        j jVar = this.f22397H;
        jVar.getClass();
        jVar.f3017l = i.b(f10);
    }

    public void setDragOffsetY(float f10) {
        j jVar = this.f22397H;
        jVar.getClass();
        jVar.f3018m = i.b(f10);
    }

    public void setDragXEnabled(boolean z3) {
        this.f22392y0 = z3;
    }

    public void setDragYEnabled(boolean z3) {
        this.f22393z0 = z3;
    }

    public void setDrawBorders(boolean z3) {
    }

    public void setDrawGridBackground(boolean z3) {
    }

    public void setGridBackgroundColor(int i7) {
        this.f22372C0.setColor(i7);
    }

    public void setHighlightPerDragEnabled(boolean z3) {
        this.f22391x0 = z3;
    }

    public void setKeepPositionOnRotation(boolean z3) {
        this.f22375F0 = z3;
    }

    public void setMaxVisibleValueCount(int i7) {
        this.f22388u0 = i7;
    }

    public void setMinOffset(float f10) {
        this.f22374E0 = f10;
    }

    public void setOnDrawListener(OnDrawListener onDrawListener) {
        this.f22376G0 = onDrawListener;
    }

    public void setPinchZoom(boolean z3) {
        this.f22389v0 = z3;
    }

    public void setRendererLeftYAxis(q qVar) {
        this.f22379J0 = qVar;
    }

    public void setRendererRightYAxis(q qVar) {
        this.f22380K0 = qVar;
    }

    public void setScaleEnabled(boolean z3) {
        this.f22370A0 = z3;
        this.f22371B0 = z3;
    }

    public void setScaleXEnabled(boolean z3) {
        this.f22370A0 = z3;
    }

    public void setScaleYEnabled(boolean z3) {
        this.f22371B0 = z3;
    }

    public void setVisibleXRangeMaximum(float f10) {
        float f11 = this.f22407g.f41i / f10;
        j jVar = this.f22397H;
        jVar.getClass();
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        jVar.f3012g = f11;
        jVar.a(jVar.f3006a, jVar.f3007b);
    }

    public void setVisibleXRangeMinimum(float f10) {
        float f11 = this.f22407g.f41i / f10;
        j jVar = this.f22397H;
        jVar.getClass();
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        jVar.f3013h = f11;
        jVar.a(jVar.f3006a, jVar.f3007b);
    }

    public void setXAxisRenderer(o oVar) {
        this.f22383N0 = oVar;
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22388u0 = 100;
        this.f22389v0 = false;
        this.f22390w0 = true;
        this.f22391x0 = true;
        this.f22392y0 = true;
        this.f22393z0 = true;
        this.f22370A0 = true;
        this.f22371B0 = true;
        this.f22374E0 = 15.0f;
        this.f22375F0 = false;
        this.f22384O0 = new RectF();
        new Matrix();
        new Matrix();
        this.f22385P0 = c.b(0.0d, 0.0d);
        this.f22386Q0 = c.b(0.0d, 0.0d);
        this.f22387R0 = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.f22388u0 = 100;
        this.f22389v0 = false;
        this.f22390w0 = true;
        this.f22391x0 = true;
        this.f22392y0 = true;
        this.f22393z0 = true;
        this.f22370A0 = true;
        this.f22371B0 = true;
        this.f22374E0 = 15.0f;
        this.f22375F0 = false;
        this.f22384O0 = new RectF();
        new Matrix();
        new Matrix();
        this.f22385P0 = c.b(0.0d, 0.0d);
        this.f22386Q0 = c.b(0.0d, 0.0d);
        this.f22387R0 = new float[2];
    }
}
