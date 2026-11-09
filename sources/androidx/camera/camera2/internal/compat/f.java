package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.StateCallback f13398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f13399b;

    public f(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f13399b = executor;
        this.f13398a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f13399b.execute(new e(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f13399b.execute(new e(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f13399b.execute(new e(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f13399b.execute(new e(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f13399b.execute(new e(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f13399b.execute(new e(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f13399b.execute(new Da.h(this, 18, cameraCaptureSession, surface));
    }
}
