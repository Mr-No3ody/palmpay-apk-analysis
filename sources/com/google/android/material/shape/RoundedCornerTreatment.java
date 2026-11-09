package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        shapePath.reset(0.0f, f13, 180.0f, 180.0f - f10);
        float f14 = f13 * 2.0f;
        shapePath.addArc(0.0f, 0.0f, f14, f14, 180.0f, f10);
    }

    @Deprecated
    public RoundedCornerTreatment(float f10) {
        this.radius = f10;
    }
}
