package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.core.ImageCapture$ScreenFlashListener;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0936k implements CallbackToFutureAdapter$Resolver, CameraCharacteristicsProvider, AsyncFunction, ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13572b;

    public /* synthetic */ C0936k(Z z3, androidx.camera.core.impl.S s3) {
        this.f13571a = 4;
        this.f13572b = s3;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        Z z3 = (Z) this.f13572b;
        z3.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return androidx.camera.core.impl.utils.futures.l.f14212c;
        }
        long j6 = z3.f13329g;
        W w3 = new W(0);
        long millis = TimeUnit.NANOSECONDS.toMillis(j6);
        C0917a0 c0917a0 = new C0917a0(w3);
        C0944o c0944o = z3.f13326d;
        c0944o.a(c0917a0);
        RunnableC0934j runnableC0934j = new RunnableC0934j(6, c0944o, c0917a0);
        androidx.camera.core.impl.utils.executor.i iVar = c0944o.f13605c;
        androidx.concurrent.futures.m mVar = c0917a0.f13339b;
        mVar.addListener(runnableC0934j, iVar);
        return AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.c(mVar, z3.f13325c, millis, 1));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(final androidx.concurrent.futures.k kVar) {
        switch (this.f13571a) {
            case 0:
                C0944o c0944o = (C0944o) this.f13572b;
                c0944o.getClass();
                c0944o.f13605c.execute(new RunnableC0934j(1, c0944o, kVar));
                return "updateSessionConfigAsync";
            case 1:
            case 5:
            default:
                ((AtomicReference) this.f13572b).set(new ImageCapture$ScreenFlashListener() { // from class: androidx.camera.camera2.internal.c0
                    @Override // androidx.camera.core.ImageCapture$ScreenFlashListener
                    public final void onCompleted() {
                        p140j8.f.G("Camera2CapturePipeline");
                        kVar.b(null);
                    }
                });
                return "OnScreenFlashUiApplied";
            case 2:
                S s3 = (S) this.f13572b;
                s3.f13259a.f13610h.f(kVar);
                s3.f13260b.f6100b = true;
                return "AePreCapture";
            case 3:
                ((U) this.f13572b).f13270b.f13331i.postCapture();
                kVar.b(null);
                return "invokePostCaptureFuture";
            case 4:
                ((androidx.camera.core.impl.S) this.f13572b).b(new Y(0, kVar));
                return "submitStillCapture";
            case 6:
                ((C0917a0) this.f13572b).f13338a = kVar;
                return "waitFor3AResult";
        }
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public Object get(CameraCharacteristics.Key key) {
        return ((androidx.camera.camera2.internal.compat.l) this.f13572b).a(key);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        l1 l1Var = (l1) this.f13572b;
        l1Var.getClass();
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                l1Var.f13586b.enqueue(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e10) {
            p140j8.f.g("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    public /* synthetic */ C0936k(Object obj, int i7) {
        this.f13571a = i7;
        this.f13572b = obj;
    }
}
