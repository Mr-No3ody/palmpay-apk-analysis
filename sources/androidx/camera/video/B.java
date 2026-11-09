package androidx.camera.video;

import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Observable;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Observable.Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CameraControlInternal f14540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14541b;

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        p140j8.f.G("VideoCapture");
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(Object obj) {
        p118hf.a.k(p140j8.f.q(), "SourceStreamRequirementObserver can be updated from main thread only");
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.f14541b == zEquals) {
            return;
        }
        this.f14541b = zEquals;
        CameraControlInternal cameraControlInternal = this.f14540a;
        if (cameraControlInternal == null) {
            p140j8.f.G("VideoCapture");
        } else if (zEquals) {
            cameraControlInternal.incrementVideoUsage();
        } else {
            cameraControlInternal.decrementVideoUsage();
        }
    }
}
