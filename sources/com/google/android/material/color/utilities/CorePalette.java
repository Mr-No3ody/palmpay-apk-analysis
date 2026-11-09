package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class CorePalette {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TonalPalette f22497a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public TonalPalette f22498a2;
    public TonalPalette a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TonalPalette f22499n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public TonalPalette f22500n2;

    private CorePalette(int i7, boolean z3) {
        Hct hctFromInt = Hct.fromInt(i7);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z3) {
            this.f22497a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f22498a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f22499n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f22500n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f22497a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f22498a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f22499n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f22500n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i7) {
        return new CorePalette(i7, true);
    }

    public static CorePalette of(int i7) {
        return new CorePalette(i7, false);
    }
}
