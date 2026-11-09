package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import com.horcrux.svg.d0;
import p192n.c;
import p331w0.a;
import p331w0.b;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new a(a.f43223d);
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f10, float f11, float f12) {
        return d0.e(f11, f10, f12, f10);
    }

    public static int lerp(int i7, int i10, float f10) {
        return Math.round(f10 * (i10 - i7)) + i7;
    }

    public static float lerp(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : lerp(f10, f11, (f14 - f12) / (f13 - f12));
    }
}
