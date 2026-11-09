package D4;

import G4.g;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    @Override // D4.a, D4.b, com.github.mikephil.charting.highlight.IHighlighter
    public final c getHighlight(float f10, float f11) {
        ((BarDataProvider) this.f1589a).getBarData();
        g transformer = this.f1589a.getTransformer(A4.g.f55a);
        transformer.getClass();
        G4.c cVarB = G4.c.b(0.0d, 0.0d);
        transformer.a(f11, f10, cVarB);
        b((float) cVarB.f2985c, f11, f10);
        return null;
    }
}
