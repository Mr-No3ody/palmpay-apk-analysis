package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC0999q;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950r0 extends AbstractC0999q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f13643a;

    public C0950r0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f13643a = captureCallback;
    }
}
