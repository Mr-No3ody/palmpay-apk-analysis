package androidx.biometric;

import E.AbstractC0198c;
import E.C0203h;
import E.m0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0986j0;
import androidx.camera.core.impl.C0988k0;
import androidx.camera.core.impl.C0990l0;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.X;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.core.util.Consumer;
import com.google.api.Service;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1605b;

/* JADX INFO: renamed from: androidx.biometric.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0903g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13076c;

    public /* synthetic */ RunnableC0903g(int i7, Object obj, Object obj2) {
        this.f13074a = i7;
        this.f13075b = obj;
        this.f13076c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        Encoder encoder;
        int i7 = 2;
        switch (this.f13074a) {
            case 0:
                A a3 = ((BiometricFragment) this.f13075b).f13058a;
                if (a3.f13045e == null) {
                    a3.f13045e = new x(9);
                }
                a3.f13045e.R((C0915t) this.f13076c);
                return;
            case 1:
                ((androidx.camera.core.imagecapture.t) this.f13075b).f13803g.onFinalResult((ImageProxy) this.f13076c);
                return;
            case 2:
                ((androidx.camera.core.imagecapture.t) this.f13075b).f13803g.onFinalResult((E.O) this.f13076c);
                return;
            case 3:
                ((androidx.camera.core.imagecapture.t) this.f13075b).f13803g.onPostviewBitmapAvailable((Bitmap) this.f13076c);
                return;
            case 4:
                ((androidx.camera.core.imagecapture.t) this.f13075b).f13803g.onProcessFailure((E.Q) this.f13076c);
                return;
            case 5:
                ((androidx.camera.core.imagecapture.x) this.f13075b).f13825e.remove((androidx.camera.core.imagecapture.v) this.f13076c);
                return;
            case 6:
                androidx.camera.video.internal.c cVar = ((androidx.camera.core.imagecapture.h) ((androidx.camera.core.imagecapture.y) this.f13075b)).f13758c;
                Objects.requireNonNull(cVar);
                ImageProxy image = (ImageProxy) this.f13076c;
                Objects.requireNonNull(image);
                SelfieCaptureActivity selfieCaptureActivity = (SelfieCaptureActivity) cVar.f14621b;
                Intrinsics.checkNotNullParameter(image, "image");
                try {
                    Bitmap bitmap = image.toBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
                    Bitmap bitmapY = AbstractC0198c.Y(image.getImageInfo().getRotationDegrees(), bitmap);
                    image.close();
                    int i10 = selfieCaptureActivity.f23868j;
                    File file = (File) cVar.f14623d;
                    if (2 == i10) {
                        r6.a aVar = p232p6.p.f41237d;
                        AbstractC0198c.U(bitmapY, file, aVar != null ? aVar.f41581m : null);
                    } else {
                        r6.a aVar2 = p232p6.p.f41237d;
                        AbstractC0198c.T(bitmapY, file, aVar2 != null ? aVar2.f41581m : null);
                    }
                    ((C1605b) cVar.f14622c).invoke(file);
                    return;
                } catch (Exception e10) {
                    int i11 = p292t6.a.f42345a;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    p292t6.a.b(message);
                    SelfieCaptureActivity.e(selfieCaptureActivity);
                    return;
                }
            case 7:
                androidx.camera.core.imagecapture.y yVar = (androidx.camera.core.imagecapture.y) this.f13075b;
                yVar.getClass();
                ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback = ((androidx.camera.core.imagecapture.h) yVar).f13759d;
                if (imageCapture$OnImageSavedCallback != null) {
                    imageCapture$OnImageSavedCallback.onPostviewBitmapAvailable((Bitmap) this.f13076c);
                    return;
                }
                return;
            case 8:
                androidx.camera.core.imagecapture.y yVar2 = (androidx.camera.core.imagecapture.y) this.f13075b;
                yVar2.getClass();
                ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback2 = ((androidx.camera.core.imagecapture.h) yVar2).f13759d;
                Objects.requireNonNull(imageCapture$OnImageSavedCallback2);
                E.O o10 = (E.O) this.f13076c;
                Objects.requireNonNull(o10);
                imageCapture$OnImageSavedCallback2.onImageSaved(o10);
                return;
            case 9:
                androidx.camera.core.imagecapture.y yVar3 = (androidx.camera.core.imagecapture.y) this.f13075b;
                yVar3.getClass();
                androidx.camera.core.imagecapture.h hVar = (androidx.camera.core.imagecapture.h) yVar3;
                androidx.camera.video.internal.c cVar2 = hVar.f13758c;
                boolean z3 = cVar2 != null;
                ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback3 = hVar.f13759d;
                boolean z8 = imageCapture$OnImageSavedCallback3 != null;
                E.Q exception = (E.Q) this.f13076c;
                if (!z3 || z8) {
                    if (!z8 || z3) {
                        throw new IllegalStateException("One and only one callback is allowed.");
                    }
                    Objects.requireNonNull(imageCapture$OnImageSavedCallback3);
                    imageCapture$OnImageSavedCallback3.onError(exception);
                    return;
                }
                Objects.requireNonNull(cVar2);
                Intrinsics.checkNotNullParameter(exception, "exception");
                int i12 = p292t6.a.f42345a;
                String message2 = exception.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                p292t6.a.b(message2);
                SelfieCaptureActivity.e((SelfieCaptureActivity) cVar2.f14621b);
                return;
            case 10:
                N2.a aVar3 = (N2.a) this.f13075b;
                CameraInternal cameraInternal = (CameraInternal) this.f13076c;
                synchronized (aVar3.f6064a) {
                    try {
                        ((HashSet) aVar3.f6066c).remove(cameraInternal);
                        if (((HashSet) aVar3.f6066c).isEmpty()) {
                            ((androidx.concurrent.futures.k) aVar3.f6068e).getClass();
                            ((androidx.concurrent.futures.k) aVar3.f6068e).b(null);
                            aVar3.f6068e = null;
                            aVar3.f6067d = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 11:
                Observable.Observer observer = (Observable.Observer) this.f13076c;
                try {
                    observer.onNewData(((X) this.f13075b).f14000a.f14214b);
                    return;
                } catch (InterruptedException | ExecutionException e11) {
                    observer.onError(e11);
                    return;
                }
            case 12:
                AbstractC0970b0 abstractC0970b0 = (AbstractC0970b0) this.f13075b;
                String str = (String) this.f13076c;
                abstractC0970b0.getClass();
                try {
                    abstractC0970b0.f14025e.get();
                    AbstractC0970b0.f14020n.decrementAndGet();
                    AbstractC0970b0.f14019m.get();
                    abstractC0970b0.e();
                    return;
                } catch (Exception e12) {
                    p140j8.f.g("DeferrableSurface", "Unexpected surface termination for " + abstractC0970b0 + "\nStack Trace:\n" + str);
                    synchronized (abstractC0970b0.f14021a) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC0970b0, Boolean.valueOf(abstractC0970b0.f14023c), Integer.valueOf(abstractC0970b0.f14022b)), e12);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            case 13:
                ((C0990l0) this.f13075b).f14100a.j((C0986j0) this.f13076c);
                return;
            case 14:
                C0988k0 c0988k0 = (C0988k0) ((C0990l0) this.f13075b).f14100a.d();
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f13076c;
                if (c0988k0 == null) {
                    kVar.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    kVar.b(c0988k0.f14099a);
                    return;
                }
            case 15:
                C0986j0 c0986j0 = (C0986j0) this.f13075b;
                if (c0986j0.f14091a.get()) {
                    C0988k0 c0988k1 = (C0988k0) this.f13076c;
                    c0988k1.getClass();
                    c0986j0.f14092b.onNewData(c0988k1.f14099a);
                    return;
                }
                return;
            case 16:
                androidx.camera.lifecycle.d dVar = (androidx.camera.lifecycle.d) this.f13075b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f13076c;
                try {
                    dVar.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 17:
                ((androidx.concurrent.futures.k) this.f13075b).b(null);
                ((androidx.concurrent.futures.m) this.f13076c).cancel(true);
                return;
            case 18:
                androidx.camera.core.processing.f fVar = (androidx.camera.core.processing.f) this.f13075b;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f13076c;
                Surface surface = surfaceOutput.getSurface(fVar.f14390c, new G.d(i7, fVar, surfaceOutput));
                fVar.f14388a.g(surface);
                fVar.f14395h.put(surfaceOutput, surface);
                return;
            case 19:
                final androidx.camera.core.processing.f fVar2 = (androidx.camera.core.processing.f) this.f13075b;
                fVar2.f14396i++;
                androidx.camera.core.processing.h hVar2 = fVar2.f14388a;
                H.j.d(hVar2.f14400a, true);
                H.j.c(hVar2.f14402c);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(hVar2.f14412m);
                final m0 m0Var = (m0) this.f13076c;
                surfaceTexture.setDefaultBufferSize(m0Var.f2056b.getWidth(), m0Var.f2056b.getHeight());
                final Surface surface2 = new Surface(surfaceTexture);
                U8.a aVar4 = new U8.a(10, fVar2, m0Var);
                androidx.camera.core.impl.utils.executor.d dVar2 = fVar2.f14390c;
                m0Var.c(dVar2, aVar4);
                m0Var.b(surface2, dVar2, new Consumer() { // from class: androidx.camera.core.processing.d
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        f fVar3 = fVar2;
                        m0 m0Var2 = m0Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface3 = surface2;
                        fVar3.getClass();
                        synchronized (m0Var2.f2055a) {
                            m0Var2.f2068n = null;
                            m0Var2.f2069o = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface3.release();
                        fVar3.f14396i--;
                        fVar3.a();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(fVar2, fVar2.f14391d);
                return;
            case 20:
                ((androidx.camera.core.processing.f) this.f13075b).f14398k.add((androidx.camera.core.processing.a) this.f13076c);
                return;
            case 21:
                androidx.camera.core.processing.n nVar = (androidx.camera.core.processing.n) this.f13075b;
                nVar.getClass();
                ((Consumer) ((AtomicReference) this.f13076c).get()).accept(new C0203h(nVar));
                return;
            case 22:
                androidx.camera.video.s sVar = (androidx.camera.video.s) this.f13075b;
                androidx.camera.video.F f10 = sVar.f14860y;
                androidx.camera.video.F f11 = (androidx.camera.video.F) this.f13076c;
                sVar.f14860y = f11;
                if (f10 == f11) {
                    Objects.toString(f11);
                    p140j8.f.G("Recorder");
                    return;
                }
                Objects.toString(f11);
                p140j8.f.G("Recorder");
                if (f11 != androidx.camera.video.F.f14572c) {
                    if (f11 != androidx.camera.video.F.f14571b || (scheduledFuture = sVar.f14861z) == null || !scheduledFuture.cancel(false) || (encoder = sVar.f14855s) == null) {
                        return;
                    }
                    androidx.camera.video.s.d(encoder);
                    return;
                }
                if (sVar.f14853q == null) {
                    androidx.camera.video.q qVar = sVar.f14835C;
                    if (qVar != null) {
                        if (!qVar.f14812d) {
                            qVar.f14812d = true;
                            ScheduledFuture scheduledFuture2 = qVar.f14814f;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(false);
                                qVar.f14814f = null;
                            }
                        }
                        sVar.f14835C = null;
                    }
                    sVar.f();
                    return;
                }
                return;
            case 23:
                ((androidx.camera.core.impl.utils.executor.i) this.f13075b).execute((Runnable) this.f13076c);
                return;
            case 24:
                androidx.camera.video.C c6 = (androidx.camera.video.C) this.f13075b;
                if (((androidx.camera.core.processing.l) this.f13076c) == c6.f14544o) {
                    c6.G();
                    return;
                }
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                androidx.camera.video.x xVar = (androidx.camera.video.x) this.f13075b;
                xVar.getClass();
                C0 c0 = (C0) this.f13076c;
                c0.f13839b.f13959e.remove(xVar);
                c0.f13842e.remove(xVar);
                return;
            case 26:
                ((androidx.camera.video.E) this.f13075b).f14564h.onSurfaceUpdate((Surface) this.f13076c);
                return;
            case 27:
                ((androidx.camera.video.internal.encoder.v) this.f13075b).f14746m.remove((androidx.camera.video.internal.encoder.w) this.f13076c);
                return;
            case 28:
                androidx.camera.video.internal.encoder.t tVar = (androidx.camera.video.internal.encoder.t) this.f13076c;
                Objects.requireNonNull(tVar);
                ((androidx.camera.core.impl.utils.executor.i) this.f13075b).execute(new W8.o(tVar, 25));
                return;
            default:
                ((androidx.camera.video.internal.encoder.v) this.f13075b).f14745l.remove((androidx.concurrent.futures.k) this.f13076c);
                return;
        }
    }
}
