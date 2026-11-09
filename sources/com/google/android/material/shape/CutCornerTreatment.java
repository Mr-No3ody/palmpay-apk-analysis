package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        shapePath.reset(0.0f, f13, 180.0f, 180.0f - f10);
        double d2 = f13;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f10)) * d2), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d2));
    }

    @Deprecated
    public CutCornerTreatment(float f10) {
        this.size = f10;
    }
}
