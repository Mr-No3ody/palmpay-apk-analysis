package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.UseCaseConfig;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L0 f13227b;

    static {
        new p045d3.g(3);
        f13227b = new L0();
    }

    @Override // androidx.camera.camera2.internal.P, androidx.camera.core.impl.CaptureConfig$OptionUnpacker
    public final void unpack(UseCaseConfig useCaseConfig, androidx.camera.core.impl.S s3) {
        super.unpack(useCaseConfig, s3);
        if (!(useCaseConfig instanceof C0982h0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C0982h0 c0982h0 = (C0982h0) useCaseConfig;
        C0992m0 c0992m0B = C0992m0.b();
        C0971c c0971c = C0982h0.f14069b;
        if (c0982h0.containsOption(c0971c)) {
            int iIntValue = ((Integer) c0982h0.retrieveOption(c0971c)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(key2), Boolean.FALSE);
                }
            }
        }
        s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
    }
}
