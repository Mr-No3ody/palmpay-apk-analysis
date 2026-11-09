package androidx.camera.camera2.internal;

import E.C0206k;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.F f13506b = new androidx.lifecycle.F(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.concurrent.futures.k f13510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13511g;

    public e1(C0944o c0944o, androidx.camera.camera2.internal.compat.l lVar, androidx.camera.core.impl.utils.executor.i iVar) {
        this.f13505a = c0944o;
        this.f13508d = iVar;
        this.f13507c = p002a.a.p(new C0936k(lVar, 1));
        c0944o.a(new Camera2CameraControlImpl$CaptureResultListener() { // from class: androidx.camera.camera2.internal.d1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                e1 e1Var = this.f13502a;
                if (e1Var.f13510f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == e1Var.f13511g) {
                        e1Var.f13510f.b(null);
                        e1Var.f13510f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(androidx.lifecycle.F f10, Integer num) {
        if (p140j8.f.q()) {
            f10.k(num);
        } else {
            f10.i(num);
        }
    }

    public final void a(androidx.concurrent.futures.k kVar, boolean z3) {
        if (!this.f13507c) {
            if (kVar != null) {
                kVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z8 = this.f13509e;
        androidx.lifecycle.F f10 = this.f13506b;
        if (!z8) {
            b(f10, 0);
            if (kVar != null) {
                kVar.d(new C0206k("Camera is not active."));
                return;
            }
            return;
        }
        this.f13511g = z3;
        this.f13505a.c(z3);
        b(f10, Integer.valueOf(z3 ? 1 : 0));
        androidx.concurrent.futures.k kVar2 = this.f13510f;
        if (kVar2 != null) {
            kVar2.d(new C0206k("There is a new enableTorch being set"));
        }
        this.f13510f = kVar;
    }
}
