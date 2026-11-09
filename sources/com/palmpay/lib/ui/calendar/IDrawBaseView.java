package com.palmpay.lib.ui.calendar;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes3.dex */
public interface IDrawBaseView {
    void onDrawScheme(BaseView baseView, Canvas canvas, C1435e c1435e, int i7, int i10);

    boolean onDrawSelected(BaseView baseView, Canvas canvas, C1435e c1435e, int i7, int i10, boolean z3);

    void onDrawText(BaseView baseView, Canvas canvas, C1435e c1435e, int i7, int i10, boolean z3, boolean z8);
}
