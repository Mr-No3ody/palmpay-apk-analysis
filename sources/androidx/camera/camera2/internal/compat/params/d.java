package androidx.camera.camera2.internal.compat.params;

import E.C0216v;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DynamicRangesCompat$DynamicRangeProfilesCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13418a = new b(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f13419b = Collections.singleton(C0216v.f2122d);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final Set getDynamicRangeCaptureRequestConstraints(C0216v c0216v) {
        p118hf.a.g(C0216v.f2122d.equals(c0216v), "DynamicRange is not supported: " + c0216v);
        return f13419b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final Set getSupportedDynamicRanges() {
        return f13419b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final boolean isExtraLatencyPresent(C0216v c0216v) {
        p118hf.a.g(C0216v.f2122d.equals(c0216v), "DynamicRange is not supported: " + c0216v);
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final DynamicRangeProfiles unwrap() {
        return null;
    }
}
