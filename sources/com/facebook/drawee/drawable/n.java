package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements ScalingUtils$ScaleType {
    @Override // com.facebook.drawee.drawable.ScalingUtils$ScaleType
    public Matrix getTransform(Matrix matrix, Rect rect, int i7, int i10, float f10, float f11) {
        getTransformImpl(matrix, rect, i7, i10, f10, f11, rect.width() / i7, rect.height() / i10);
        return matrix;
    }

    public abstract void getTransformImpl(Matrix matrix, Rect rect, int i7, int i10, float f10, float f11, float f12, float f13);
}
