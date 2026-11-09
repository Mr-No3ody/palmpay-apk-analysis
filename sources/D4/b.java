package D4;

import A4.g;
import com.github.mikephil.charting.highlight.IHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements IHighlighter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineScatterCandleBubbleDataProvider f1589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1590b = new ArrayList();

    public b(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider) {
        this.f1589a = barLineScatterCandleBubbleDataProvider;
    }

    public static float d(List list, float f10, g gVar) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((c) list.get(i7)).getClass();
        }
        return Float.MAX_VALUE;
    }

    public void a() {
        this.f1589a.getData();
    }

    public final c b(float f10, float f11, float f12) {
        List listC = c();
        if (listC.isEmpty()) {
            return null;
        }
        d(listC, f12, g.f55a);
        d(listC, f12, g.f56b);
        this.f1589a.getMaxHighlightDistance();
        for (int i7 = 0; i7 < listC.size(); i7++) {
            ((c) listC.get(i7)).getClass();
        }
        return null;
    }

    public List c() {
        ArrayList arrayList = this.f1590b;
        arrayList.clear();
        a();
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public c getHighlight(float f10, float f11) {
        G4.g transformer = this.f1589a.getTransformer(g.f55a);
        transformer.getClass();
        G4.c cVarB = G4.c.b(0.0d, 0.0d);
        transformer.a(f10, f11, cVarB);
        float f12 = (float) cVarB.f2984b;
        G4.c.f2983d.c(cVarB);
        b(f12, f10, f11);
        return null;
    }
}
