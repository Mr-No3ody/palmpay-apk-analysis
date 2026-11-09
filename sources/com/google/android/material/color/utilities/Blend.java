package com.google.android.material.color.utilities;

import N8.q0;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i7, int i10, double d2) {
        Cam16 cam16FromInt = Cam16.fromInt(i7);
        Cam16 cam16FromInt2 = Cam16.fromInt(i10);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(q0.a(cam16FromInt2.getJstar(), jstar, d2, jstar), q0.a(cam16FromInt2.getAstar(), astar, d2, astar), q0.a(cam16FromInt2.getBstar(), bstar, d2, bstar)).toInt();
    }

    public static int harmonize(int i7, int i10) {
        Hct hctFromInt = Hct.fromInt(i7);
        Hct hctFromInt2 = Hct.fromInt(i10);
        double dMin = Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()) * dMin) + hctFromInt.getHue()), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i7, int i10, double d2) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i7, i10, d2)).getHue(), Cam16.fromInt(i7).getChroma(), ColorUtils.lstarFromArgb(i7)).toInt();
    }
}
