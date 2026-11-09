package com.github.mikephil.charting.interfaces.dataprovider;

import B4.a;

/* JADX INFO: loaded from: classes.dex */
public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {
    a getBarData();

    boolean isDrawBarShadowEnabled();

    boolean isDrawValueAboveBarEnabled();

    boolean isHighlightFullBarEnabled();
}
