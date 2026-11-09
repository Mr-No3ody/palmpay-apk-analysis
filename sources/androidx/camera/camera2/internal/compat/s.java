package androidx.camera.camera2.internal.compat;

import android.util.ArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManagerCompat$CameraManagerCompatImpl f13482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap f13483b = new ArrayMap(4);

    public s(CameraManagerCompat$CameraManagerCompatImpl cameraManagerCompat$CameraManagerCompatImpl) {
        this.f13482a = cameraManagerCompat$CameraManagerCompatImpl;
    }

    public final l a(String str) {
        l lVar;
        synchronized (this.f13483b) {
            lVar = (l) this.f13483b.get(str);
            if (lVar == null) {
                try {
                    l lVar2 = new l(this.f13482a.getCameraCharacteristics(str), str);
                    this.f13483b.put(str, lVar2);
                    lVar = lVar2;
                } catch (AssertionError e10) {
                    throw new a(e10.getMessage(), e10);
                }
            }
        }
        return lVar;
    }
}
