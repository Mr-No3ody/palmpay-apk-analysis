package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v extends u {
    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final Set getConcurrentCameraIds() throws a {
        try {
            return ((CameraManager) this.f13402a).getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }
}
