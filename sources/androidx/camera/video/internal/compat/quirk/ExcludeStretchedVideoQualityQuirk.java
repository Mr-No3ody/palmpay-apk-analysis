package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.l;

/* JADX INFO: loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    public static boolean a() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean b() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, l lVar) {
        String str = Build.BRAND;
        return !("Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) ? !((("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || b() || a())))) && lVar == l.f14795c) : !(lVar == l.f14795c || lVar == l.f14796d);
    }
}
