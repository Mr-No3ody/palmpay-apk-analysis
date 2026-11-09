package androidx.camera.camera2.internal;

import androidx.camera.core.impl.utils.futures.FutureCallback;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958v0 implements FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0962x0 f13664a;

    public C0958v0(C0962x0 c0962x0) {
        this.f13664a = c0962x0;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        synchronized (this.f13664a.f13670a) {
            try {
                this.f13664a.f13673d.stop();
                int i7 = F.i(this.f13664a.f13678i);
                if ((i7 == 3 || i7 == 5 || i7 == 6) && !(th instanceof CancellationException)) {
                    p140j8.f.G("CaptureSession");
                    this.f13664a.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }
}
