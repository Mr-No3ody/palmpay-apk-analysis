package com.github.xiaofeidev.shadow.shadow;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public interface ShadowDraw {
    void onDraw(Canvas canvas);

    void onMeasure();

    void onSizeChanged(int i7, int i10, int i11, int i12);
}
