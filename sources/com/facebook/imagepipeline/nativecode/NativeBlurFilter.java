package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public class NativeBlurFilter {
    static {
        D3.a.r("native-filters");
    }

    public static void a(Bitmap bitmap, int i7, int i10) {
        bitmap.getClass();
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 > 0)) {
            throw new IllegalArgumentException();
        }
        nativeIterativeBoxBlur(bitmap, i7, i10);
    }

    @DoNotStrip
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i7, int i10);
}
