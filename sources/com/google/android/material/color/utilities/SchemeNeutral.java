package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public class SchemeNeutral extends DynamicScheme {
    public SchemeNeutral(Hct hct, boolean z3, double d2) {
        super(hct, Variant.NEUTRAL, z3, d2, TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d));
    }
}
