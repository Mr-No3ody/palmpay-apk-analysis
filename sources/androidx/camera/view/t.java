package androidx.camera.view;

import E.AbstractC0198c;
import E.C0211p;
import E.n0;
import E.p0;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ProcessCameraProviderWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.lifecycle.h f15013a;

    public t(androidx.camera.lifecycle.h hVar) {
        this.f15013a = hVar;
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, C0211p c0211p, p0 p0Var) {
        return this.f15013a.c(lifecycleOwner, c0211p, p0Var);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final CameraInfo getCameraInfo(C0211p c0211p) {
        return this.f15013a.getCameraInfo(c0211p);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final boolean hasCamera(C0211p c0211p) {
        return this.f15013a.hasCamera(c0211p);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final ListenableFuture shutdownAsync() {
        ListenableFuture listenableFuture;
        int i7 = 1;
        androidx.camera.lifecycle.h hVar = this.f15013a;
        hVar.getClass();
        androidx.camera.lifecycle.d dVar = new androidx.camera.lifecycle.d(hVar);
        if (p140j8.f.q()) {
            dVar.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            p118hf.a.k(new Handler(Looper.getMainLooper()).post(new RunnableC0903g(16, dVar, countDownLatch)), "Unable to post to main thread");
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e10) {
                throw new P0.c(3, e10);
            }
        }
        androidx.camera.core.c cVar = hVar.f14534f;
        if (cVar != null) {
            cVar.b().getCameraCoordinator().shutdown();
        }
        androidx.camera.core.c cVar2 = hVar.f14534f;
        if (cVar2 != null) {
            synchronized (cVar2.f13717b) {
                try {
                    cVar2.f13720e.removeCallbacksAndMessages("retry_token");
                    int i10 = androidx.camera.camera2.internal.F.i(cVar2.f13727l);
                    if (i10 == 0) {
                        cVar2.f13727l = 5;
                        listenableFuture = androidx.camera.core.impl.utils.futures.l.f14212c;
                    } else {
                        if (i10 == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (i10 == 2 || i10 == 3) {
                            cVar2.f13727l = 5;
                            androidx.camera.core.c.a(cVar2.f13729n);
                            cVar2.f13728m = AbstractC0198c.y(new Dg.a(cVar2, i7));
                        }
                        listenableFuture = cVar2.f13728m;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            listenableFuture = androidx.camera.core.impl.utils.futures.l.f14212c;
        }
        Intrinsics.checkNotNullExpressionValue(listenableFuture, "if (mCameraX != null) mC…mediateFuture<Void>(null)");
        synchronized (hVar.f14529a) {
            hVar.f14530b = null;
            hVar.f14531c = null;
            hVar.f14532d = listenableFuture;
            hVar.f14536h.clear();
            Unit unit = Unit.f38893a;
        }
        hVar.f14534f = null;
        hVar.f14535g = null;
        return listenableFuture;
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final void unbind(n0... n0VarArr) {
        this.f15013a.unbind(n0VarArr);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final void unbindAll() {
        this.f15013a.unbindAll();
    }
}
