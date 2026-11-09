package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.AbstractC0976e0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.o;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0976e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14509c;

    public l(CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        this.f14508b = "virtual-" + cameraInfoInternal.getCameraId() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.impl.CameraInfoInternal
    public final String getCameraId() {
        return this.f14508b;
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i7) {
        return o.h(this.f14047a.getSensorRotationDegrees(i7) - this.f14509c);
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
