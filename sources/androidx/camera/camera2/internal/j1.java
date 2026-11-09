package androidx.camera.camera2.internal;

import E.C0206k;
import Pa.C0505b;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13570f;

    public j1(C0944o c0944o, androidx.camera.camera2.internal.compat.l lVar, androidx.camera.core.impl.utils.executor.i iVar, int i7) {
        switch (i7) {
            case 1:
                this.f13567c = false;
                this.f13565a = c0944o;
                this.f13568d = new C0505b(lVar);
                this.f13566b = iVar;
                break;
            default:
                this.f13567c = false;
                i1 i1Var = new i1(this);
                this.f13565a = c0944o;
                this.f13566b = iVar;
                ZoomControl$ZoomImpl zoomControl$ZoomImplB = b(lVar);
                this.f13570f = zoomControl$ZoomImplB;
                k1 k1Var = new k1(zoomControl$ZoomImplB.getMaxZoom(), zoomControl$ZoomImplB.getMinZoom());
                this.f13568d = k1Var;
                k1Var.b(1.0f);
                this.f13569e = new androidx.lifecycle.F(androidx.camera.core.internal.b.a(k1Var));
                c0944o.a(i1Var);
                break;
        }
    }

    public static ZoomControl$ZoomImpl b(androidx.camera.camera2.internal.compat.l lVar) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) lVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                p140j8.f.G("ZoomControl");
                range = null;
            }
            if (range != null) {
                return new C0918b(lVar);
            }
        }
        return new C0964y0(lVar);
    }

    public void a() {
        androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f13569e;
        if (kVar != null) {
            kVar.d(new C0206k("Cancelled by another setExposureCompensationIndex()"));
            this.f13569e = null;
        }
        A0 a3 = (A0) this.f13570f;
        if (a3 != null) {
            this.f13565a.i(a3);
            this.f13570f = null;
        }
    }

    public void c(androidx.concurrent.futures.k kVar, androidx.camera.core.internal.b bVar) {
        androidx.camera.core.internal.b bVarA;
        if (this.f13567c) {
            ((ZoomControl$ZoomImpl) this.f13570f).setZoomRatio(bVar.f14311a, kVar);
            this.f13565a.k();
            return;
        }
        synchronized (((k1) this.f13568d)) {
            ((k1) this.f13568d).b(1.0f);
            bVarA = androidx.camera.core.internal.b.a((k1) this.f13568d);
        }
        d(bVarA);
        kVar.d(new C0206k("Camera is not active."));
    }

    public void d(androidx.camera.core.internal.b bVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        androidx.lifecycle.F f10 = (androidx.lifecycle.F) this.f13569e;
        if (looperMyLooper == mainLooper) {
            f10.k(bVar);
        } else {
            f10.i(bVar);
        }
    }
}
