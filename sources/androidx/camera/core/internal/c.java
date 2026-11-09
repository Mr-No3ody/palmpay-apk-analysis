package androidx.camera.core.internal;

import android.graphics.Matrix;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.O0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ImageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureResult f14315a;

    public c(CameraCaptureResult cameraCaptureResult) {
        this.f14315a = cameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return 0;
    }

    @Override // androidx.camera.core.ImageInfo
    public final Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }

    @Override // androidx.camera.core.ImageInfo
    public final O0 getTagBundle() {
        return this.f14315a.getTagBundle();
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.f14315a.getTimestamp();
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(androidx.camera.core.impl.utils.i iVar) {
        this.f14315a.populateExifData(iVar);
    }
}
