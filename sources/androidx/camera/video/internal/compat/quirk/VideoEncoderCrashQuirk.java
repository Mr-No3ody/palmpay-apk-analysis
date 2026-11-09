package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.l;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, l lVar) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && cameraInfoInternal.getLensFacing() == 0 && lVar == l.f14793a;
    }
}
