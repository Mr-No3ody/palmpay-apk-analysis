package com.github.mikephil.charting.interfaces.datasets;

import B4.j;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IFillFormatter;

/* JADX INFO: loaded from: classes.dex */
public interface ILineDataSet extends ILineRadarDataSet<Entry> {
    int getCircleColor(int i7);

    int getCircleColorCount();

    int getCircleHoleColor();

    float getCircleHoleRadius();

    float getCircleRadius();

    float getCubicIntensity();

    DashPathEffect getDashPathEffect();

    IFillFormatter getFillFormatter();

    j getMode();

    boolean isDashedLineEnabled();

    boolean isDrawCircleHoleEnabled();

    boolean isDrawCirclesEnabled();

    @Deprecated
    boolean isDrawCubicEnabled();

    @Deprecated
    boolean isDrawSteppedEnabled();
}
