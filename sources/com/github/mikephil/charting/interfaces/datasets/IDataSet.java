package com.github.mikephil.charting.interfaces.datasets;

import A4.d;
import A4.g;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IDataSet<T extends Entry> {
    boolean addEntry(T t);

    void addEntryOrdered(T t);

    void calcMinMax();

    void calcMinMaxY(float f10, float f11);

    void clear();

    boolean contains(T t);

    g getAxisDependency();

    int getColor();

    int getColor(int i7);

    List<Integer> getColors();

    List<T> getEntriesForXValue(float f10);

    int getEntryCount();

    T getEntryForIndex(int i7);

    T getEntryForXValue(float f10, float f11);

    T getEntryForXValue(float f10, float f11, B4.g gVar);

    int getEntryIndex(float f10, float f11, B4.g gVar);

    int getEntryIndex(T t);

    d getForm();

    DashPathEffect getFormLineDashEffect();

    float getFormLineWidth();

    float getFormSize();

    G4.d getIconsOffset();

    int getIndexInEntries(int i7);

    String getLabel();

    IValueFormatter getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int i7);

    float getValueTextSize();

    Typeface getValueTypeface();

    float getXMax();

    float getXMin();

    float getYMax();

    float getYMin();

    boolean isDrawIconsEnabled();

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean needsFormatter();

    boolean removeEntry(int i7);

    boolean removeEntry(T t);

    boolean removeEntryByXValue(float f10);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(g gVar);

    void setDrawIcons(boolean z3);

    void setDrawValues(boolean z3);

    void setHighlightEnabled(boolean z3);

    void setIconsOffset(G4.d dVar);

    void setLabel(String str);

    void setValueFormatter(IValueFormatter iValueFormatter);

    void setValueTextColor(int i7);

    void setValueTextColors(List<Integer> list);

    void setValueTextSize(float f10);

    void setValueTypeface(Typeface typeface);

    void setVisible(boolean z3);
}
