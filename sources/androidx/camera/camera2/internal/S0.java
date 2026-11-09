package androidx.camera.camera2.internal;

import androidx.camera.core.impl.utils.futures.FutureCallback;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V0 f13263a;

    public S0(V0 v3) {
        this.f13263a = v3;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        p140j8.f.h("ProcessingCaptureSession", "open session failed ", th);
        V0 v3 = this.f13263a;
        v3.close();
        v3.release(false);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }
}
