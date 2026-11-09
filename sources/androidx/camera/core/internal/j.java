package androidx.camera.core.internal;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f14355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14356d;

    public j(CameraInfoInternal cameraInfoInternal, Rational rational) {
        this.f14353a = cameraInfoInternal.getSensorRotationDegrees();
        this.f14354b = cameraInfoInternal.getLensFacing();
        this.f14355c = rational;
        boolean z3 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z3 = false;
        }
        this.f14356d = z3;
    }

    public final Size a(ImageOutputConfig imageOutputConfig) {
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        Size targetResolution = imageOutputConfig.getTargetResolution(null);
        if (targetResolution != null) {
            int iV = com.facebook.imagepipeline.nativecode.b.v(com.facebook.imagepipeline.nativecode.b.V(targetRotation), this.f14353a, 1 == this.f14354b);
            if (iV == 90 || iV == 270) {
                return new Size(targetResolution.getHeight(), targetResolution.getWidth());
            }
        }
        return targetResolution;
    }
}
