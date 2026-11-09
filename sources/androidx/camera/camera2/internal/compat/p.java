package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {
    @Override // androidx.camera.camera2.internal.compat.o, androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl
    public final void createCaptureSession(androidx.camera.camera2.internal.compat.params.r rVar) throws a {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) rVar.i();
        sessionConfiguration.getClass();
        try {
            this.f13412a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }
}
