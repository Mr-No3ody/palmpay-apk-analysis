package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface DrawingContent extends Content {
    void draw(Canvas canvas, Matrix matrix, int i7, @Nullable com.airbnb.lottie.utils.a aVar);

    void getBounds(RectF rectF, Matrix matrix, boolean z3);
}
