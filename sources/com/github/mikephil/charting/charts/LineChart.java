package com.github.mikephil.charting.charts;

import B4.i;
import F4.g;
import F4.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LineChart extends BarLineChartBase<i> implements LineDataProvider {
    public LineChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void c() {
        super.c();
        j jVar = new j(this.f22398L, this.f22397H);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        new Path();
        new Path();
        new Path();
        new HashMap();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.f22395B = jVar;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public i getLineData() {
        return null;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g gVar = this.f22395B;
        if (gVar != null && (gVar instanceof j)) {
            j jVar = (j) gVar;
            Canvas canvas = jVar.f2582h;
            if (canvas != null) {
                canvas.setBitmap(null);
                jVar.f2582h = null;
            }
            WeakReference weakReference = jVar.f2581g;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                jVar.f2581g.clear();
                jVar.f2581g = null;
            }
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
