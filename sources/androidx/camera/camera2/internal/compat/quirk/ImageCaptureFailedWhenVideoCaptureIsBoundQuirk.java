package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static boolean a() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean c() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    public static boolean e() {
        return Constants.REFERRER_API_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean workaroundByCaptureIntentPreview() {
        return a() || b() || e() || c();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean workaroundBySurfaceProcessing() {
        if (a() || b() || e() || c()) {
            return true;
        }
        String str = Build.MODEL;
        if ("pixel 4 xl".equalsIgnoreCase(str) && Build.VERSION.SDK_INT == 29) {
            return true;
        }
        return ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(str)) || d();
    }
}
