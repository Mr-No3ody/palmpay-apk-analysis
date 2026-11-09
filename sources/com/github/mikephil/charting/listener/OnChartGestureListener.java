package com.github.mikephil.charting.listener;

import E4.b;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public interface OnChartGestureListener {
    void onChartDoubleTapped(MotionEvent motionEvent);

    void onChartFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    void onChartGestureEnd(MotionEvent motionEvent, b bVar);

    void onChartGestureStart(MotionEvent motionEvent, b bVar);

    void onChartLongPressed(MotionEvent motionEvent);

    void onChartScale(MotionEvent motionEvent, float f10, float f11);

    void onChartSingleTapped(MotionEvent motionEvent);

    void onChartTranslate(MotionEvent motionEvent, float f10, float f11);
}
