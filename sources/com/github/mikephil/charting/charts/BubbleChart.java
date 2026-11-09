package com.github.mikephil.charting.charts;

import B4.c;
import F4.d;
import G4.i;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider;

/* JADX INFO: loaded from: classes.dex */
public class BubbleChart extends BarLineChartBase<c> implements BubbleDataProvider {
    public BubbleChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        super.c();
        d dVar = new d(this.f22398L, this.f22397H);
        dVar.f2577d.setStyle(Paint.Style.FILL);
        dVar.f2578e.setStyle(Paint.Style.STROKE);
        dVar.f2578e.setStrokeWidth(i.b(1.5f));
        this.f22395B = dVar;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
    public c getBubbleData() {
        return null;
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
