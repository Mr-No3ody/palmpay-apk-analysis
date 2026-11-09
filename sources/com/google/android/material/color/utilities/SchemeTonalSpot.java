package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public class SchemeTonalSpot extends DynamicScheme {
    public SchemeTonalSpot(Hct hct, boolean z3, double d2) {
        super(hct, Variant.TONAL_SPOT, z3, d2, TonalPalette.fromHueAndChroma(hct.getHue(), 36.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 6.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d));
    }
}
