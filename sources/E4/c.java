package E4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.listener.OnChartGestureListener;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f2234a = b.f2223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2235b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetector f2236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Chart f2237d;

    public c(Chart chart) {
        this.f2237d = chart;
        this.f2236c = new GestureDetector(chart.getContext(), this);
    }

    public final void a(MotionEvent motionEvent) {
        OnChartGestureListener onChartGestureListener = this.f2237d.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartGestureEnd(motionEvent, this.f2234a);
        }
    }
}
