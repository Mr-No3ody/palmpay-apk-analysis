package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.C1003s0;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939l0 implements SessionConfig$OptionUnpacker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0939l0 f13584a = new C0939l0();

    @Override // androidx.camera.core.impl.SessionConfig$OptionUnpacker
    public final void unpack(Size size, UseCaseConfig useCaseConfig, androidx.camera.core.impl.C0 c0) {
        int i7 = 2;
        androidx.camera.core.impl.H0 defaultSessionConfig = useCaseConfig.getDefaultSessionConfig(null);
        C1000q0 c1000q0 = C1000q0.f14125c;
        int i10 = androidx.camera.core.impl.H0.a().f13886g.f13968c;
        if (defaultSessionConfig != null) {
            i10 = defaultSessionConfig.f13886g.f13968c;
            List<CameraDevice.StateCallback> list = defaultSessionConfig.f13882c;
            c0.getClass();
            for (CameraDevice.StateCallback stateCallback : list) {
                ArrayList arrayList = c0.f13840c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : defaultSessionConfig.f13883d) {
                ArrayList arrayList2 = c0.f13841d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            c0.f13839b.a(defaultSessionConfig.f13886g.f13970e);
            c1000q0 = defaultSessionConfig.f13886g.f13967b;
        }
        androidx.camera.core.impl.S s3 = c0.f13839b;
        s3.getClass();
        s3.f13956b = C0992m0.c(c1000q0);
        if (useCaseConfig instanceof C1003s0) {
            Rational rational = androidx.camera.camera2.internal.compat.workaround.b.f13487a;
            if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(PreviewPixelHDRnetQuirk.class)) != null && !androidx.camera.camera2.internal.compat.workaround.b.f13487a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                C0992m0 c0992m0B = C0992m0.b();
                c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.TONEMAP_MODE), 2);
                c0.f13839b.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), i7));
            }
        }
        c0.f13839b.f13957c = ((Integer) useCaseConfig.retrieveOption(androidx.camera.camera2.impl.b.f13106c, Integer.valueOf(i10))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) useCaseConfig.retrieveOption(androidx.camera.camera2.impl.b.f13108e, new C0949q0());
        ArrayList arrayList3 = c0.f13840c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) useCaseConfig.retrieveOption(androidx.camera.camera2.impl.b.f13109f, new C0945o0());
        ArrayList arrayList4 = c0.f13841d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        c0.a(new C0950r0((CameraCaptureSession.CaptureCallback) useCaseConfig.retrieveOption(androidx.camera.camera2.impl.b.f13110g, new O())));
        int videoStabilizationMode = useCaseConfig.getVideoStabilizationMode();
        if (videoStabilizationMode != 0) {
            androidx.camera.core.impl.S s8 = c0.f13839b;
            s8.getClass();
            if (videoStabilizationMode != 0) {
                s8.f13956b.insertOption(UseCaseConfig.f13992a0, Integer.valueOf(videoStabilizationMode));
            }
        }
        int previewStabilizationMode = useCaseConfig.getPreviewStabilizationMode();
        if (previewStabilizationMode != 0) {
            androidx.camera.core.impl.S s10 = c0.f13839b;
            s10.getClass();
            if (previewStabilizationMode != 0) {
                s10.f13956b.insertOption(UseCaseConfig.f13991W, Integer.valueOf(previewStabilizationMode));
            }
        }
        C0992m0 c0992m0B2 = C0992m0.b();
        C0971c c0971c = androidx.camera.camera2.impl.b.f13111i;
        c0992m0B2.insertOption(c0971c, (String) useCaseConfig.retrieveOption(c0971c, null));
        C0971c c0971c2 = androidx.camera.camera2.impl.b.f13107d;
        Long l5 = (Long) useCaseConfig.retrieveOption(c0971c2, -1L);
        l5.getClass();
        c0992m0B2.insertOption(c0971c2, l5);
        c0.f13839b.c(c0992m0B2);
        c0.f13839b.c(D.e.b(useCaseConfig).build());
    }
}
