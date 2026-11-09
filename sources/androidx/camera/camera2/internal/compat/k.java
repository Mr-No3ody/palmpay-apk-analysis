package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n {
    @Override // androidx.camera.camera2.internal.compat.n, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public final Set getPhysicalCameraIds() {
        try {
            return ((CameraCharacteristics) this.f13411a).getPhysicalCameraIds();
        } catch (Exception e10) {
            p140j8.f.h("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e10);
            return Collections.EMPTY_SET;
        }
    }
}
