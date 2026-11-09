package com.github.mikephil.charting.components;

import D4.c;
import G4.d;
import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes.dex */
public interface IMarker {
    void draw(Canvas canvas, float f10, float f11);

    d getOffset();

    d getOffsetForDrawingAtPoint(float f10, float f11);

    void refreshContent(Entry entry, c cVar);
}
