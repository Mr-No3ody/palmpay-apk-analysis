package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraStateRegistry$OnConfigureAvailableListener;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class B implements CameraStateRegistry$OnConfigureAvailableListener, FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13117a;

    public /* synthetic */ B(Object obj) {
        this.f13117a = obj;
    }

    @Override // androidx.camera.core.impl.CameraStateRegistry$OnConfigureAvailableListener
    public void onConfigureAvailable() {
        if (((J) this.f13117a).f13166B0 == 9) {
            ((J) this.f13117a).n();
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        b1 b1Var = (b1) this.f13117a;
        b1Var.finishClose();
        P0 p3 = b1Var.f13350b;
        p3.f(b1Var);
        synchronized (p3.f13247b) {
            ((LinkedHashSet) p3.f13250e).remove(b1Var);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }
}
