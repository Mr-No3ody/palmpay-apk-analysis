package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0996o0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class P implements CaptureConfig$OptionUnpacker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f13245a = new P();

    @Override // androidx.camera.core.impl.CaptureConfig$OptionUnpacker
    public void unpack(UseCaseConfig useCaseConfig, androidx.camera.core.impl.S s3) {
        androidx.camera.core.impl.T defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig(null);
        C1000q0 c1000q0 = C1000q0.f14125c;
        C0971c c0971c = androidx.camera.core.impl.T.f13963i;
        HashSet hashSet = new HashSet();
        C0992m0 c0992m0B = C0992m0.b();
        ArrayList arrayList = new ArrayList();
        C0996o0 c0996o0A = C0996o0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C1000q0 c1000q0A = C1000q0.a(c0992m0B);
        ArrayList arrayList3 = new ArrayList(arrayList);
        androidx.camera.core.impl.O0 o10 = androidx.camera.core.impl.O0.f13940b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0996o0A.f13941a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i7 = -1;
        new androidx.camera.core.impl.T(arrayList2, c1000q0A, -1, false, arrayList3, false, new androidx.camera.core.impl.O0(arrayMap), null);
        if (defaultCaptureConfig != null) {
            s3.a(defaultCaptureConfig.f13970e);
            c1000q0 = defaultCaptureConfig.f13967b;
            i7 = defaultCaptureConfig.f13968c;
        }
        s3.getClass();
        s3.f13956b = C0992m0.c(c1000q0);
        s3.f13957c = ((Integer) useCaseConfig.retrieveOption(androidx.camera.camera2.impl.b.f13106c, Integer.valueOf(i7))).intValue();
        s3.b(new C0950r0((CameraCaptureSession.CaptureCallback) useCaseConfig.retrieveOption(androidx.camera.camera2.impl.b.f13110g, new O())));
        s3.c(D.e.b(useCaseConfig).build());
    }
}
