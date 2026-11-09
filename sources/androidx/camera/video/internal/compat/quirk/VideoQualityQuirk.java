package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirk;
import androidx.camera.video.l;

/* JADX INFO: loaded from: classes.dex */
public interface VideoQualityQuirk extends Quirk {
    boolean isProblematicVideoQuality(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull l lVar);
}
