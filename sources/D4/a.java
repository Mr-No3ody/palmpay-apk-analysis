package D4;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1588c = 1;

    public /* synthetic */ a(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider) {
        super(barLineScatterCandleBubbleDataProvider);
    }

    @Override // D4.b
    public void a() {
        switch (this.f1588c) {
            case 0:
                ((BarDataProvider) this.f1589a).getBarData();
                break;
            default:
                super.a();
                break;
        }
    }

    @Override // D4.b
    public List c() {
        switch (this.f1588c) {
            case 1:
                this.f1590b.clear();
                ((CombinedDataProvider) this.f1589a).getCombinedData();
                throw null;
            default:
                return super.c();
        }
    }

    @Override // D4.b, com.github.mikephil.charting.highlight.IHighlighter
    public c getHighlight(float f10, float f11) {
        switch (this.f1588c) {
            case 0:
                super.getHighlight(f10, f11);
                return null;
            default:
                return super.getHighlight(f10, f11);
        }
    }

    public a(CombinedChart combinedChart, CombinedChart combinedChart2) {
        super(combinedChart);
        combinedChart2.getBarData();
    }
}
