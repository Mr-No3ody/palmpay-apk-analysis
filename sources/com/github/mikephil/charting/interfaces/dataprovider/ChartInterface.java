package com.github.mikephil.charting.interfaces.dataprovider;

import B4.e;
import G4.d;
import android.graphics.RectF;
import com.github.mikephil.charting.formatter.IValueFormatter;

/* JADX INFO: loaded from: classes.dex */
public interface ChartInterface {
    d getCenterOfView();

    d getCenterOffsets();

    RectF getContentRect();

    e getData();

    IValueFormatter getDefaultValueFormatter();

    int getHeight();

    float getMaxHighlightDistance();

    int getMaxVisibleCount();

    int getWidth();

    float getXChartMax();

    float getXChartMin();

    float getXRange();

    float getYChartMax();

    float getYChartMin();
}
