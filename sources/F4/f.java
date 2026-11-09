package F4;

import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f2575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f2576h;

    @Override // F4.g
    public final void D() {
        Iterator it = this.f2575g.iterator();
        while (it.hasNext()) {
            ((g) it.next()).D();
        }
    }

    public final void E() {
        this.f2575g.clear();
        CombinedChart combinedChart = (CombinedChart) this.f2576h.get();
        if (combinedChart == null) {
            return;
        }
        for (p376z4.b bVar : combinedChart.getDrawOrder()) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                combinedChart.getBarData();
            } else if (iOrdinal == 1) {
                combinedChart.getBubbleData();
            } else if (iOrdinal == 2) {
                combinedChart.getLineData();
            } else if (iOrdinal == 3) {
                combinedChart.getCandleData();
            } else if (iOrdinal == 4) {
                combinedChart.getScatterData();
            }
        }
    }
}
