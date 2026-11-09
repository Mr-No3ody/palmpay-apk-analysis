package com.github.mikephil.charting.charts;

import B4.c;
import B4.d;
import B4.e;
import B4.f;
import B4.i;
import B4.l;
import D4.a;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p376z4.b;

/* JADX INFO: loaded from: classes.dex */
public class CombinedChart extends BarLineChartBase<f> implements CombinedDataProvider {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f22420S0;
    public boolean T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f22421U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public b[] f22422V0;

    public CombinedChart(Context context) {
        super(context);
        this.f22420S0 = true;
        this.T0 = false;
        this.f22421U0 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void a() {
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        super.c();
        this.f22422V0 = new b[]{b.f44437a, b.f44438b, b.f44439c, b.f44440d, b.f44441e};
        setHighlighter(new a(this, this));
        setHighlightFullBarEnabled(true);
        F4.f fVar = new F4.f(this.f22398L, this.f22397H);
        fVar.f2575g = new ArrayList(5);
        new ArrayList();
        fVar.f2576h = new WeakReference(this);
        fVar.E();
        this.f22395B = fVar;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public B4.a getBarData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
    public c getBubbleData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider
    public d getCandleData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider
    public f getCombinedData() {
        return null;
    }

    public b[] getDrawOrder() {
        return this.f22422V0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public i getLineData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider
    public l getScatterData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawBarShadowEnabled() {
        return this.f22421U0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawValueAboveBarEnabled() {
        return this.f22420S0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isHighlightFullBarEnabled() {
        return this.T0;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public /* bridge */ /* synthetic */ void setData(e eVar) {
        setData((f) null);
    }

    public void setDrawBarShadow(boolean z3) {
        this.f22421U0 = z3;
    }

    public void setDrawOrder(b[] bVarArr) {
        if (bVarArr == null || bVarArr.length <= 0) {
            return;
        }
        this.f22422V0 = bVarArr;
    }

    public void setDrawValueAboveBar(boolean z3) {
        this.f22420S0 = z3;
    }

    public void setHighlightFullBarEnabled(boolean z3) {
        this.T0 = z3;
    }

    public void setData(f fVar) {
        super.setData(fVar);
        setHighlighter(new a(this, this));
        ((F4.f) this.f22395B).E();
        this.f22395B.D();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22420S0 = true;
        this.T0 = false;
        this.f22421U0 = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22420S0 = true;
        this.T0 = false;
        this.f22421U0 = false;
    }
}
