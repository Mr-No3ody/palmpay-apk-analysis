package androidx.camera.camera2.internal.compat.params;

import E.C0216v;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DynamicRangesCompat$DynamicRangeProfilesCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f13417a;

    public c(Object obj) {
        this.f13417a = (DynamicRangeProfiles) obj;
    }

    public static Set a(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l5 = (Long) it.next();
            long jLongValue = l5.longValue();
            C0216v c0216v = (C0216v) a.f13414a.get(l5);
            p118hf.a.j(c0216v, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(c0216v);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final Set getDynamicRangeCaptureRequestConstraints(C0216v c0216v) {
        Long lA = a.a(c0216v, this.f13417a);
        p118hf.a.g(lA != null, "DynamicRange is not supported: " + c0216v);
        return a(this.f13417a.getProfileCaptureRequestConstraints(lA.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final Set getSupportedDynamicRanges() {
        return a(this.f13417a.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final boolean isExtraLatencyPresent(C0216v c0216v) {
        Long lA = a.a(c0216v, this.f13417a);
        p118hf.a.g(lA != null, "DynamicRange is not supported: " + c0216v);
        return this.f13417a.isExtraLatencyPresent(lA.longValue());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl
    public final DynamicRangeProfiles unwrap() {
        return this.f13417a;
    }
}
