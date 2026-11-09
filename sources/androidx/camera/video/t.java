package androidx.camera.video;

import E.C0216v;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements VideoCapabilities {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.video.internal.workaround.a f14862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f14864d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f14865e = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public t(CameraInfoInternal cameraInfoInternal) {
        EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        y0 y0Var = androidx.camera.video.internal.compat.quirk.a.f14630a;
        androidx.camera.video.internal.c cVar = new androidx.camera.video.internal.c(new p1.d(cameraInfoInternal, encoderProfilesProvider, y0Var), y0Var);
        for (C0216v c0216v : cameraInfoInternal.getSupportedDynamicRanges()) {
            if (Integer.valueOf(c0216v.f2128a).equals(3) && c0216v.f2129b == 10) {
                cVar = new top.zibin.luban.io.a(cVar);
                break;
            }
        }
        this.f14862b = new androidx.camera.video.internal.workaround.a(cameraInfoInternal, cVar, y0Var);
        for (C0216v c0216v2 : cameraInfoInternal.getSupportedDynamicRanges()) {
            k kVar = new k(new androidx.camera.video.internal.c(this.f14862b, c0216v2));
            if (!new ArrayList(kVar.f14789a.keySet()).isEmpty()) {
                this.f14864d.put(c0216v2, kVar);
            }
        }
        this.f14863c = cameraInfoInternal.isVideoStabilizationSupported();
    }

    public final k a(C0216v dynamicRangeToTest) {
        Object next;
        boolean zContains;
        boolean zB = dynamicRangeToTest.b();
        HashMap map = this.f14864d;
        if (zB) {
            return (k) map.get(dynamicRangeToTest);
        }
        HashMap map2 = this.f14865e;
        if (map2.containsKey(dynamicRangeToTest)) {
            return (k) map2.get(dynamicRangeToTest);
        }
        Set fullySpecifiedDynamicRanges = map.keySet();
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.b()) {
            zContains = fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        } else {
            Iterator it = fullySpecifiedDynamicRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C0216v c0216v = (C0216v) next;
                p118hf.a.k(c0216v.b(), "Fully specified range is not actually fully specified.");
                int i7 = dynamicRangeToTest.f2129b;
                if (i7 == 0 || i7 == c0216v.f2129b) {
                    p118hf.a.k(c0216v.b(), "Fully specified range is not actually fully specified.");
                    int i10 = dynamicRangeToTest.f2128a;
                    if (i10 != 0) {
                        int i11 = c0216v.f2128a;
                        if ((i10 == 2 && i11 != 1) || i10 == i11) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        k kVar = zContains ? new k(new androidx.camera.video.internal.c(this.f14862b, dynamicRangeToTest)) : null;
        map2.put(dynamicRangeToTest, kVar);
        return kVar;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final androidx.camera.video.internal.d findNearestHigherSupportedEncoderProfilesFor(Size size, C0216v c0216v) {
        Object value;
        androidx.camera.video.internal.d dVarA = null;
        k kVarA = a(c0216v);
        if (kVarA == null) {
            return null;
        }
        TreeMap treeMap = kVarA.f14790b;
        Size size2 = androidx.camera.core.internal.utils.d.f14361a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        l lVar = (l) value;
        if (lVar == null) {
            lVar = l.f14799g;
        }
        Objects.toString(lVar);
        Objects.toString(size);
        p140j8.f.G("CapabilitiesByQuality");
        if (lVar == l.f14799g || (dVarA = kVarA.a(lVar)) != null) {
            return dVarA;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final l findNearestHigherSupportedQualityFor(Size size, C0216v c0216v) {
        Object value;
        k kVarA = a(c0216v);
        if (kVarA == null) {
            return l.f14799g;
        }
        TreeMap treeMap = kVarA.f14790b;
        Size size2 = androidx.camera.core.internal.utils.d.f14361a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        l lVar = (l) value;
        return lVar != null ? lVar : l.f14799g;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final androidx.camera.video.internal.d getProfiles(l lVar, C0216v c0216v) {
        k kVarA = a(c0216v);
        if (kVarA == null) {
            return null;
        }
        return kVarA.a(lVar);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final Set getSupportedDynamicRanges() {
        return this.f14864d.keySet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final List getSupportedQualities(C0216v c0216v) {
        k kVarA = a(c0216v);
        return kVarA == null ? new ArrayList() : new ArrayList(kVarA.f14789a.keySet());
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isQualitySupported(l lVar, C0216v c0216v) {
        k kVarA = a(c0216v);
        if (kVarA == null) {
            return false;
        }
        p118hf.a.g(l.f14800h.contains(lVar), "Unknown quality: " + lVar);
        return kVarA.a(lVar) != null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isStabilizationSupported() {
        return this.f14863c;
    }
}
