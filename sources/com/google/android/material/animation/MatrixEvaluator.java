package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final Matrix tempMatrix = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i7 = 0; i7 < 9; i7++) {
            float[] fArr = this.tempEndValues;
            float f11 = fArr[i7];
            float f12 = this.tempStartValues[i7];
            fArr[i7] = d0.e(f11, f12, f10, f12);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
