package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.ImageCapture$ScreenFlashListener;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ImageCapture$ScreenFlash {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f14348e = new h(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageCapture$ScreenFlash f14349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14350b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageCapture$ScreenFlashListener f14352d;

    public i(ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
        this.f14349a = imageCapture$ScreenFlash;
    }

    public final void a() {
        Unit unit;
        synchronized (this.f14350b) {
            try {
                if (this.f14351c) {
                    ImageCapture$ScreenFlash imageCapture$ScreenFlash = this.f14349a;
                    if (imageCapture$ScreenFlash != null) {
                        imageCapture$ScreenFlash.clear();
                        unit = Unit.f38893a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        p140j8.f.g("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    p140j8.f.G("ScreenFlashWrapper");
                }
                this.f14351c = false;
                Unit unit2 = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void apply(long j6, ImageCapture$ScreenFlashListener screenFlashListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.f14350b) {
            this.f14351c = true;
            this.f14352d = screenFlashListener;
            Unit unit2 = Unit.f38893a;
        }
        ImageCapture$ScreenFlash imageCapture$ScreenFlash = this.f14349a;
        if (imageCapture$ScreenFlash != null) {
            imageCapture$ScreenFlash.apply(j6, new ImageCapture$ScreenFlashListener() { // from class: androidx.camera.core.internal.g
                @Override // androidx.camera.core.ImageCapture$ScreenFlashListener
                public final void onCompleted() {
                    i this$0 = this.f14347a;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    synchronized (this$0.f14350b) {
                        try {
                            if (this$0.f14352d == null) {
                                p140j8.f.G("ScreenFlashWrapper");
                            }
                            this$0.b();
                            Unit unit3 = Unit.f38893a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            p140j8.f.g("ScreenFlashWrapper", "apply: screenFlash is null!");
            b();
        }
    }

    public final void b() {
        synchronized (this.f14350b) {
            try {
                ImageCapture$ScreenFlashListener imageCapture$ScreenFlashListener = this.f14352d;
                if (imageCapture$ScreenFlashListener != null) {
                    imageCapture$ScreenFlashListener.onCompleted();
                }
                this.f14352d = null;
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void clear() {
        a();
    }
}
