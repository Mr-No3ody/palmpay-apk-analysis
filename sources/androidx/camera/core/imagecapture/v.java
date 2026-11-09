package androidx.camera.core.imagecapture;

import E.AbstractC0198c;
import E.O;
import E.Q;
import android.graphics.Bitmap;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.ImageProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class v implements TakePictureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f13810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f13811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.concurrent.futures.m f13812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.concurrent.futures.m f13813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.concurrent.futures.k f13814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.concurrent.futures.k f13815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13816g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13817h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableFuture f13818i;

    public v(y yVar, x xVar) {
        this.f13810a = yVar;
        this.f13811b = xVar;
        final int i7 = 0;
        this.f13812c = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.core.imagecapture.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f13809b;

            {
                this.f13809b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
                switch (i7) {
                    case 0:
                        this.f13809b.f13814e = kVar;
                        return "CaptureCompleteFuture";
                    default:
                        this.f13809b.f13815f = kVar;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i10 = 1;
        this.f13813d = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.core.imagecapture.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f13809b;

            {
                this.f13809b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
                switch (i10) {
                    case 0:
                        this.f13809b.f13814e = kVar;
                        return "CaptureCompleteFuture";
                    default:
                        this.f13809b.f13815f = kVar;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        p118hf.a.k(!this.f13813d.f15066b.isDone(), "The callback can only complete once.");
        this.f13815f.b(null);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final boolean isAborted() {
        return this.f13816g;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onCaptureFailure(Q q10) {
        boolean z3;
        p140j8.f.b();
        if (this.f13816g) {
            return;
        }
        y yVar = this.f13810a;
        p140j8.f.b();
        int i7 = yVar.f13827a;
        if (i7 > 0) {
            z3 = true;
            yVar.f13827a = i7 - 1;
        } else {
            z3 = false;
        }
        if (!z3) {
            p140j8.f.b();
            ((h) yVar).f13757b.execute(new RunnableC0903g(9, yVar, q10));
        }
        a();
        this.f13814e.d(q10);
        if (z3) {
            this.f13811b.retryRequest(yVar);
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onCaptureProcessProgressed(int i7) {
        p140j8.f.b();
        if (this.f13816g) {
            return;
        }
        y yVar = this.f13810a;
        ((h) yVar).f13757b.execute(new B3.a(yVar, i7, 8));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onCaptureStarted() {
        p140j8.f.b();
        if (this.f13816g || this.f13817h) {
            return;
        }
        this.f13817h = true;
        ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback = ((h) this.f13810a).f13759d;
        if (imageCapture$OnImageSavedCallback != null) {
            imageCapture$OnImageSavedCallback.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onFinalResult(O o10) {
        p140j8.f.b();
        if (this.f13816g) {
            return;
        }
        p118hf.a.k(this.f13812c.f15066b.isDone(), "onImageCaptured() must be called before onFinalResult()");
        a();
        y yVar = this.f13810a;
        ((h) yVar).f13757b.execute(new RunnableC0903g(8, yVar, o10));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onImageCaptured() {
        p140j8.f.b();
        if (this.f13816g) {
            return;
        }
        if (!this.f13817h) {
            onCaptureStarted();
        }
        this.f13814e.b(null);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onPostviewBitmapAvailable(Bitmap bitmap) {
        p140j8.f.b();
        if (this.f13816g) {
            return;
        }
        y yVar = this.f13810a;
        ((h) yVar).f13757b.execute(new RunnableC0903g(7, yVar, bitmap));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onProcessFailure(Q q10) {
        p140j8.f.b();
        if (this.f13816g) {
            return;
        }
        p118hf.a.k(this.f13812c.f15066b.isDone(), "onImageCaptured() must be called before onFinalResult()");
        a();
        p140j8.f.b();
        y yVar = this.f13810a;
        ((h) yVar).f13757b.execute(new RunnableC0903g(9, yVar, q10));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public final void onFinalResult(ImageProxy imageProxy) {
        p140j8.f.b();
        if (this.f13816g) {
            imageProxy.close();
            return;
        }
        p118hf.a.k(this.f13812c.f15066b.isDone(), "onImageCaptured() must be called before onFinalResult()");
        a();
        y yVar = this.f13810a;
        ((h) yVar).f13757b.execute(new RunnableC0903g(6, yVar, imageProxy));
    }
}
