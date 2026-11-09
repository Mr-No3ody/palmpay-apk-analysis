package com.github.mikephil.charting.charts;

import B4.l;
import F4.e;
import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;

/* JADX INFO: loaded from: classes.dex */
public class ScatterChart extends BarLineChartBase<l> implements ScatterDataProvider {
    public ScatterChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        super.c();
        this.f22395B = new e(this.f22398L, this.f22397H, 1);
        getXAxis().getClass();
        getXAxis().getClass();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider
    public l getScatterData() {
        return null;
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
