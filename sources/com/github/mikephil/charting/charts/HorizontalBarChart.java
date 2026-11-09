package com.github.mikephil.charting.charts;

import A4.e;
import A4.f;
import D4.d;
import F4.p;
import F4.r;
import G4.b;
import G4.c;
import G4.g;
import G4.h;
import G4.i;
import G4.j;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import androidx.camera.camera2.internal.F;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarChart extends BarChart {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final RectF f22423V0;

    public HorizontalBarChart(Context context) {
        super(context);
        this.f22423V0 = new RectF();
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public final void a() {
        if (this.f22401a) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        }
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        this.f22397H = new b();
        super.c();
        this.f22381L0 = new h(this.f22397H);
        this.f22382M0 = new h(this.f22397H);
        F4.h hVar = new F4.h(this, this.f22398L, this.f22397H);
        new RectF();
        hVar.f2579f.setTextAlign(Paint.Align.LEFT);
        this.f22395B = hVar;
        setHighlighter(new d(this));
        this.f22379J0 = new r(this.f22397H, this.f22377H0, this.f22381L0);
        this.f22380K0 = new r(this.f22397H, this.f22378I0, this.f22382M0);
        p pVar = new p(this.f22397H, this.f22407g, this.f22381L0);
        new Path();
        this.f22383N0 = pVar;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void e(RectF rectF) {
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
                    this.f22377H0.getClass();
                    A4.h hVar = this.f22377H0;
                    if (hVar.f38f) {
                        rectF.top = hVar.b(this.f22379J0.f2571d) + rectF.top;
                        return;
                    }
                    return;
                }
                if (i10 != 2) {
                    return;
                }
                float f11 = rectF.bottom;
                e eVar3 = this.f22411o;
                rectF.bottom = Math.min(eVar3.f51i, this.f22397H.f3009d * eVar3.f49g) + this.f22411o.f43b + f11;
                this.f22378I0.getClass();
                A4.h hVar2 = this.f22378I0;
                if (hVar2.f38f) {
                    rectF.bottom = hVar2.b(this.f22380K0.f2571d) + rectF.bottom;
                    return;
                }
                return;
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

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void f() {
        RectF rectF = this.f22423V0;
        e(rectF);
        float f10 = rectF.left + 0.0f;
        float fB = rectF.top + 0.0f;
        float f11 = rectF.right + 0.0f;
        float fB2 = rectF.bottom + 0.0f;
        if (this.f22377H0.d()) {
            fB += this.f22377H0.b(this.f22379J0.f2571d);
        }
        if (this.f22378I0.d()) {
            fB2 += this.f22378I0.b(this.f22380K0.f2571d);
        }
        f fVar = this.f22407g;
        float f12 = fVar.f52j;
        int i7 = fVar.f54l;
        if (i7 == 2) {
            f10 += f12;
        } else if (i7 == 1) {
            f11 += f12;
        } else if (i7 == 3) {
            f10 += f12;
            f11 += f12;
        }
        float extraTopOffset = getExtraTopOffset() + fB;
        float extraRightOffset = getExtraRightOffset() + f11;
        float extraBottomOffset = getExtraBottomOffset() + fB2;
        float extraLeftOffset = getExtraLeftOffset() + f10;
        float fB3 = i.b(this.f22374E0);
        this.f22397H.d(Math.max(fB3, extraLeftOffset), Math.max(fB3, extraTopOffset), Math.max(fB3, extraRightOffset), Math.max(fB3, extraBottomOffset));
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

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void g() {
        g gVar = this.f22382M0;
        A4.h hVar = this.f22378I0;
        float f10 = hVar.f40h;
        float f11 = hVar.f41i;
        f fVar = this.f22407g;
        gVar.d(f10, f11, fVar.f41i, fVar.f40h);
        g gVar2 = this.f22381L0;
        A4.h hVar2 = this.f22377H0;
        float f12 = hVar2.f40h;
        float f13 = hVar2.f41i;
        f fVar2 = this.f22407g;
        gVar2.d(f12, f13, fVar2.f41i, fVar2.f40h);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        g transformer = getTransformer(A4.g.f55a);
        RectF rectF = this.f22397H.f3007b;
        float f10 = rectF.left;
        float f11 = rectF.top;
        c cVar = this.f22386Q0;
        transformer.a(f10, f11, cVar);
        return (float) Math.min(this.f22407g.f39g, cVar.f2985c);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        g transformer = getTransformer(A4.g.f55a);
        RectF rectF = this.f22397H.f3007b;
        float f10 = rectF.left;
        float f11 = rectF.bottom;
        c cVar = this.f22385P0;
        transformer.a(f10, f11, cVar);
        return (float) Math.max(this.f22407g.f40h, cVar.f2985c);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f10) {
        float f11 = this.f22407g.f41i / f10;
        j jVar = this.f22397H;
        jVar.getClass();
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        jVar.f3010e = f11;
        jVar.a(jVar.f3006a, jVar.f3007b);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f10) {
        float f11 = this.f22407g.f41i / f10;
        j jVar = this.f22397H;
        jVar.getClass();
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        jVar.f3011f = f11;
        jVar.a(jVar.f3006a, jVar.f3007b);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22423V0 = new RectF();
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22423V0 = new RectF();
    }
}
