package androidx.camera.camera2.internal.compat.params;

import E.C0216v;
import Pa.AbstractC0524v;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangesCompat$DynamicRangeProfilesCompatImpl f13416a;

    public b(DynamicRangesCompat$DynamicRangeProfilesCompatImpl dynamicRangesCompat$DynamicRangeProfilesCompatImpl) {
        this.f13416a = dynamicRangesCompat$DynamicRangeProfilesCompatImpl;
    }

    public static b a(androidx.camera.camera2.internal.compat.l lVar) {
        DynamicRangeProfiles dynamicRangeProfilesJ;
        int i7 = Build.VERSION.SDK_INT;
        b bVar = null;
        if (i7 >= 33 && (dynamicRangeProfilesJ = AbstractC0524v.j(lVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            p118hf.a.k(i7 >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
            bVar = new b(new c(dynamicRangeProfilesJ));
        }
        return bVar == null ? d.f13418a : bVar;
    }

    public final Set b(C0216v c0216v) {
        return this.f13416a.getDynamicRangeCaptureRequestConstraints(c0216v);
    }

    public final Set c() {
        return this.f13416a.getSupportedDynamicRanges();
    }

    public final DynamicRangeProfiles d() {
        p118hf.a.k(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f13416a.unwrap();
    }
}
