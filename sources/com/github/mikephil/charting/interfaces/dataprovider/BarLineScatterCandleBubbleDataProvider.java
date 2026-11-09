package com.github.mikephil.charting.interfaces.dataprovider;

import B4.b;
import B4.e;
import G4.g;

/* JADX INFO: loaded from: classes.dex */
public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {
    b getData();

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    /* bridge */ /* synthetic */ default e getData() {
        getData();
        return null;
    }

    float getHighestVisibleX();

    float getLowestVisibleX();

    g getTransformer(A4.g gVar);

    boolean isInverted(A4.g gVar);
}
