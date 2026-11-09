package com.github.mikephil.charting.renderer.scatter;

import G4.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;

/* JADX INFO: loaded from: classes.dex */
public interface IShapeRenderer {
    void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, j jVar, float f10, float f11, Paint paint);
}
