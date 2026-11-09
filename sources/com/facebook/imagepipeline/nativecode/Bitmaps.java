package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public class Bitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21443a = 0;

    static {
        List list = a.f21452a;
        D3.a.r("imagepipeline");
    }

    @DoNotStrip
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        e.a(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        e.a(Boolean.valueOf(bitmap.isMutable()));
        e.a(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        e.a(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @DoNotStrip
    private static native void nativeCopyBitmap(Bitmap bitmap, int i7, Bitmap bitmap2, int i10, int i11);
}
