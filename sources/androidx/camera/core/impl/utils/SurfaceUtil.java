package androidx.camera.core.impl.utils;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static org.sufficientlysecure.htmltextview.k a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        org.sufficientlysecure.htmltextview.k kVar = new org.sufficientlysecure.htmltextview.k(3);
        int i7 = iArrNativeGetSurfaceInfo[0];
        int i10 = iArrNativeGetSurfaceInfo[1];
        int i11 = iArrNativeGetSurfaceInfo[2];
        return kVar;
    }

    private static native int[] nativeGetSurfaceInfo(@Nullable Surface surface);
}
