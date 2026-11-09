package com.github.mikephil.charting.charts;

import B4.a;
import F4.b;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;

/* JADX INFO: loaded from: classes.dex */
public class BarChart extends BarLineChartBase<a> implements BarDataProvider {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f22368S0;
    public boolean T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f22369U0;

    public BarChart(Context context) {
        super(context);
        this.f22368S0 = false;
        this.T0 = true;
        this.f22369U0 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void a() {
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void c() {
        super.c();
        this.f22395B = new b(this, this.f22398L, this.f22397H);
        setHighlighter(new D4.a(this));
        getXAxis().getClass();
        getXAxis().getClass();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public a getBarData() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawBarShadowEnabled() {
        return this.f22369U0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawValueAboveBarEnabled() {
        return this.T0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isHighlightFullBarEnabled() {
        return this.f22368S0;
    }

    public void setDrawBarShadow(boolean z3) {
        this.f22369U0 = z3;
    }

    public void setDrawValueAboveBar(boolean z3) {
        this.T0 = z3;
    }

    public void setFitBars(boolean z3) {
    }

    public void setHighlightFullBarEnabled(boolean z3) {
        this.f22368S0 = z3;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22368S0 = false;
        this.T0 = true;
        this.f22369U0 = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22368S0 = false;
        this.T0 = true;
        this.f22369U0 = false;
    }
}
