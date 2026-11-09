package androidx.camera.view;

import E.AbstractC0198c;
import E.C0206k;
import E.C0219y;
import androidx.camera.core.impl.utils.futures.FutureCallback;

/* JADX INFO: renamed from: androidx.camera.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1023d implements FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14920a;

    public androidx.concurrent.futures.m a(Object obj) {
        p140j8.f.b();
        return AbstractC0198c.y(new U8.a(14, this, obj));
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        if (th instanceof C0206k) {
            p140j8.f.G("CameraController");
        } else {
            p140j8.f.G("CameraController");
            ((AbstractC1024e) this.f14920a).f14945w.i(4);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        C0219y c0219y = (C0219y) obj;
        if (c0219y == null) {
            return;
        }
        p140j8.f.G("CameraController");
        ((AbstractC1024e) this.f14920a).f14945w.i(Integer.valueOf(c0219y.f2138a ? 2 : 3));
    }
}
