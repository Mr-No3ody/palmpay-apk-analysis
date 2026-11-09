package com.horcrux.svg;

/* JADX INFO: renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1405b implements CustomFilterFunction {
    @Override // com.horcrux.svg.CustomFilterFunction
    public final float[] execute(float[] fArr, float[] fArr2) {
        int i7 = FeBlendView.f23269f;
        float f10 = fArr[0];
        float f11 = 1.0f - f10;
        float f12 = fArr2[0];
        float f13 = 1.0f - f12;
        float f14 = fArr[1] * f10;
        float f15 = fArr2[1];
        float f16 = (f14 * f15 * f12) + (f15 * f12 * f11) + (f13 * f14);
        float f17 = fArr[2] * f10;
        float f18 = fArr2[2];
        float f19 = fArr[3] * f10;
        float f20 = fArr2[3];
        return new float[]{1.0f - (f13 * f11), f16, (f17 * f18 * f12) + (f18 * f12 * f11) + (f13 * f17), (f19 * f20 * f12) + (f20 * f12 * f11) + (f13 * f19)};
    }
}
