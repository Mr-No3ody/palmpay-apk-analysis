package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public class SchemeRainbow extends DynamicScheme {
    public SchemeRainbow(Hct hct, boolean z3, double d2) {
        super(hct, Variant.RAINBOW, z3, d2, TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d));
    }
}
