package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d2, double d10, double d11, double d12) {
        this.low = d2;
        this.normal = d10;
        this.medium = d11;
        this.high = d12;
    }

    public double get(double d2) {
        if (d2 <= -1.0d) {
            return this.low;
        }
        if (d2 < 0.0d) {
            return MathUtils.lerp(this.low, this.normal, (d2 - (-1.0d)) / 1.0d);
        }
        if (d2 < 0.5d) {
            return MathUtils.lerp(this.normal, this.medium, (d2 - 0.0d) / 0.5d);
        }
        return d2 < 1.0d ? MathUtils.lerp(this.medium, this.high, (d2 - 0.5d) / 0.5d) : this.high;
    }
}
