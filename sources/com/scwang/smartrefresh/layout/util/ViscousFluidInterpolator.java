package com.scwang.smartrefresh.layout.util;

import android.view.animation.Interpolator;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes3.dex */
public class ViscousFluidInterpolator implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f25193b;

    static {
        float fA = 1.0f / a(1.0f);
        f25192a = fA;
        f25193b = 1.0f - (a(1.0f) * fA);
    }

    public static float a(float f10) {
        float f11 = f10 * 8.0f;
        return f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : d0.e(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        float fA = a(f10) * f25192a;
        return fA > 0.0f ? fA + f25193b : fA;
    }
}
