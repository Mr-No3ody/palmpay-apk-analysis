package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    public static final class KeyColor {
        private static final double MAX_CHROMA_VALUE = 200.0d;
        private final Map<Integer, Double> chromaCache = new HashMap();
        private final double hue;
        private final double requestedChroma;

        public KeyColor(double d2, double d10) {
            this.hue = d2;
            this.requestedChroma = d10;
        }

        private double maxChroma(int i7) {
            if (this.chromaCache.get(Integer.valueOf(i7)) == null) {
                this.chromaCache.put(Integer.valueOf(i7), Double.valueOf(Hct.from(this.hue, MAX_CHROMA_VALUE, i7).getChroma()));
            }
            return this.chromaCache.get(Integer.valueOf(i7)).doubleValue();
        }

        public Hct create() {
            int i7 = 100;
            int i10 = 0;
            while (i10 < i7) {
                int i11 = (i10 + i7) / 2;
                int i12 = i11 + 1;
                boolean z3 = maxChroma(i11) < maxChroma(i12);
                if (maxChroma(i11) >= this.requestedChroma - 0.01d) {
                    if (Math.abs(i10 - 50) < Math.abs(i7 - 50)) {
                        i7 = i11;
                    } else {
                        if (i10 == i11) {
                            return Hct.from(this.hue, this.requestedChroma, i10);
                        }
                        i10 = i11;
                    }
                } else if (z3) {
                    i10 = i12;
                } else {
                    i7 = i11;
                }
            }
            return Hct.from(this.hue, this.requestedChroma, i10);
        }
    }

    private TonalPalette(double d2, double d10, Hct hct) {
        this.hue = d2;
        this.chroma = d10;
        this.keyColor = hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d2, double d10) {
        return new TonalPalette(d2, d10, new KeyColor(d2, d10).create());
    }

    public static TonalPalette fromInt(int i7) {
        return fromHct(Hct.fromInt(i7));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d2) {
        return Hct.from(this.hue, this.chroma, d2);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i7) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i7));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.hue, this.chroma, i7).toInt());
            this.cache.put(Integer.valueOf(i7), numValueOf);
        }
        return numValueOf.intValue();
    }
}
