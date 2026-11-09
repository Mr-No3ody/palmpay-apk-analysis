package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f10, float f11) {
        return Math.abs(f10) > Math.abs(f11);
    }
}
