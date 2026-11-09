package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public class NativeRoundingFilter {
    static {
        D3.a.r("native-filters");
    }

    @DoNotStrip
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i7, int i10, int i11, int i12);

    @DoNotStrip
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z3);

    @DoNotStrip
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z3);

    @DoNotStrip
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i7, int i10, boolean z3);

    @DoNotStrip
    public static void toCircle(Bitmap bitmap, boolean z3) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z3);
    }

    @DoNotStrip
    public static void toCircleFast(Bitmap bitmap, boolean z3) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z3);
    }
}
