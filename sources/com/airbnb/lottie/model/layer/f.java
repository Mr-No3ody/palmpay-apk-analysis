package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    @Override // com.airbnb.lottie.model.layer.a
    public final void d(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        super.getBounds(rectF, matrix, z3);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
