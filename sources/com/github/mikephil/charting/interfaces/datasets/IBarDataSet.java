package com.github.mikephil.charting.interfaces.datasets;

import G4.a;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IBarDataSet extends IBarLineScatterCandleBubbleDataSet<BarEntry> {
    int getBarBorderColor();

    float getBarBorderWidth();

    int getBarShadowColor();

    a getFill(int i7);

    List<a> getFills();

    int getHighLightAlpha();

    String[] getStackLabels();

    int getStackSize();

    boolean isStacked();
}
